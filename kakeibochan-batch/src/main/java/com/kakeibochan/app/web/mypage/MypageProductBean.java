package com.kakeibochan.app.web.mypage;

import org.lastaflute.web.validation.Required;

/**
 * @author jflute
 */
public class MypageProductBean {

    @Required
    public String productName;
    @Required
    public Integer regularPrice;

}
