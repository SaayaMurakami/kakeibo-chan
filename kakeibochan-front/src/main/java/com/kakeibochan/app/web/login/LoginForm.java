package com.kakeibochan.app.web.login;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;
import org.lastaflute.web.validation.Required;

public class LoginForm {

    @Required
    @Email
    public String mailAddress;

    @Required
    @Length(min = 6, max = 20)
    public String password;

}