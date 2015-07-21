//package com.email.base;
//
//import javax.mail.Authenticator;
//import javax.mail.PasswordAuthentication;
//
///**
// * Created by Administrator on 2015/7/21.
// */
//public class SimpleAuthenticator extends Authenticator {
//    private String user;
//    private String pwd;
//
//    public SimpleAuthenticator(String user, String pwd) {
//        this.user = user;
//        this.pwd = pwd;
//    }
//
//    @Override
//    protected PasswordAuthentication getPasswordAuthentication() {
//        return new PasswordAuthentication(user, pwd);
//    }
//}
