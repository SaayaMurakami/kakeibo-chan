package com.kakeibochan.app.web.register;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.lastaflute.core.security.PrimaryCipher;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.app.web.base.login.FrontLoginAssist;
import com.kakeibochan.dbflute.exbhv.AccountItemBhv;
import com.kakeibochan.dbflute.exbhv.AssetBhv;
import com.kakeibochan.dbflute.exbhv.MemberBhv;
import com.kakeibochan.dbflute.exentity.AccountItem;
import com.kakeibochan.dbflute.exentity.Asset;
import com.kakeibochan.dbflute.exentity.Member;
import com.kakeibochan.mylasta.action.FrontMessages;

@AllowAnyoneAccess
public class RegisterAction extends FrontBaseAction {

    @Resource
    private MemberBhv memberBhv;

    @Resource
    private AccountItemBhv accountItemBhv;

    @Resource
    private AssetBhv assetBhv;

    @Resource
    private FrontLoginAssist loginAssist;

    @Resource
    private PrimaryCipher primaryCipher;

    @Execute
    public HtmlResponse index() {
        return asHtml(path_Register_RegisterHtml);
    }

    @Execute
    public HtmlResponse goBackIndex(RegisterForm form) {
        validate(form, messages -> {}, () -> {
            return asHtml(path_Register_RegisterHtml);
        });
        return asHtml(path_Register_RegisterHtml);
    }

    @Execute
    public HtmlResponse confirm(RegisterForm form) {
        validate(form, messages -> moreValidate(form, messages), () -> {
            return asHtml(path_Register_RegisterHtml);
        });

        saveToken();
        return asHtml(path_Register_ConfirmHtml).renderWith(data -> {
            int passwordLength = form.password.length();
            String maskPassword = "";
            for (int i = 0; i < passwordLength; i++) {
                maskPassword += "*";
            }
            data.register("maskPassword", maskPassword);
        });

    }

    @Execute
    public HtmlResponse doComplete(RegisterForm form) {
        validate(form, messages -> moreValidate(form, messages), () -> {
            return asHtml(path_Register_RegisterHtml);
        });

        verifyToken(() -> {
            return asHtml(path_Register_RegisterHtml);
        });

        String encriptedPassword = primaryCipher.oneway(form.password);

        //ユーザー登録処理を行う
        Member member = new Member();
        member.setMailAddress(form.mailAddress);
        member.setPassword(encriptedPassword);
        member.setName(form.userName);
        memberBhv.insert(member);

        AccountItem foodExpense = new AccountItem();
        foodExpense.setMemberId(member.getMemberId());
        foodExpense.setCategoryType_Spend();
        foodExpense.setAccountTitle("食費");
        foodExpense.setDelFlg_False();
        accountItemBhv.insert(foodExpense);

        AccountItem transportationExpenses = new AccountItem();
        transportationExpenses.setMemberId(member.getMemberId());
        transportationExpenses.setCategoryType_Spend();
        transportationExpenses.setAccountTitle("交通費");
        transportationExpenses.setDelFlg_False();
        accountItemBhv.insert(transportationExpenses);

        AccountItem communicationCost = new AccountItem();
        communicationCost.setMemberId(member.getMemberId());
        communicationCost.setCategoryType_Spend();
        communicationCost.setAccountTitle("通信費");
        communicationCost.setDelFlg_False();
        accountItemBhv.insert(communicationCost);

        AccountItem utilityFee = new AccountItem();
        utilityFee.setMemberId(member.getMemberId());
        utilityFee.setCategoryType_Spend();
        utilityFee.setAccountTitle("光熱費");
        utilityFee.setDelFlg_False();
        accountItemBhv.insert(utilityFee);

        AccountItem rent = new AccountItem();
        rent.setMemberId(member.getMemberId());
        rent.setCategoryType_Spend();
        rent.setAccountTitle("家賃");
        rent.setDelFlg_False();
        accountItemBhv.insert(rent);

        AccountItem salary = new AccountItem();
        salary.setMemberId(member.getMemberId());
        salary.setCategoryType_Income();
        salary.setAccountTitle("給料");
        salary.setDelFlg_False();
        accountItemBhv.insert(salary);

        AccountItem extraordinaryIncome = new AccountItem();
        extraordinaryIncome.setMemberId(member.getMemberId());
        extraordinaryIncome.setCategoryType_Income();
        extraordinaryIncome.setAccountTitle("臨時収入");
        extraordinaryIncome.setDelFlg_False();
        accountItemBhv.insert(extraordinaryIncome);

        AccountItem move = new AccountItem();
        move.setMemberId(member.getMemberId());
        move.setCategoryType_Move();
        move.setAccountTitle("振替");
        move.setDelFlg_False();
        accountItemBhv.insert(move);

        Asset bankAccount = new Asset();
        bankAccount.setMemberId(member.getMemberId());
        bankAccount.setAssetName("銀行口座");
        bankAccount.setDelFlg_False();
        bankAccount.setBalance(0);
        assetBhv.insert(bankAccount);

        Asset wallet = new Asset();
        wallet.setMemberId(member.getMemberId());
        wallet.setAssetName("財布");
        wallet.setDelFlg_False();
        wallet.setBalance(0);
        assetBhv.insert(wallet);

        //ログインする
        UserPasswordCredential credential = new UserPasswordCredential(form.mailAddress, form.password);
        loginAssist.login(credential, op -> {});

        return redirectWith(RegisterAction.class, moreUrl("complete"));
    }

    @Execute
    public HtmlResponse complete() {
        return asHtml(path_Register_CompleteHtml);
    }

    private void moreValidate(RegisterForm form, FrontMessages messages) {
        if (form.mailAddress != null) {
            OptionalEntity<Member> member = memberBhv.selectEntity(cb -> {
                cb.query().setMailAddress_Equal(form.mailAddress);
            });
            if (member.isPresent()) {
                messages.addErrorsSignupAccountAlreadyExists("mailAddress");
            }
        }
    }
}
