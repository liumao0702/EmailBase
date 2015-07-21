//package com.email.base;
//
//import javax.mail.*;
//import java.security.Security;
//import java.util.Properties;
//
///**
// * Created by Administrator on 2015/7/20.
// */
//public class EmailClientDemo {
//
//    public void authenticator(){
//        try{
////            String smtpServer = "smtp.qq.com";
////            SimpleAuthenticator auth = new SimpleAuthenticator("122019543@qq.com","200061001Amao");
////            Properties props = new Properties();
////            props.setProperty("mail.transport.protocol", "smtp");
////            props.setProperty("mail.smtp.auth", "true");
////            props.setProperty("mail.host", smtpServer);
////
////            Session session = Session.getInstance(props,auth);
////            Store store = session.getStore();
////            store.connect();
//            String host = "imap.qq.com";
//            String port = "993";
//            int ret = 0;
//            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
//
//            final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
//
//            Properties props = System.getProperties();
//            props.setProperty("mail.imap.socketFactory.class", SSL_FACTORY);
////  props.setProperty("mail.imap.socketFactory.fallback", "false");
////     props.setProperty("mail.imap.port", port);
//            props.setProperty("mail.imap.socketFactory.port", port);
//
//
//            props.setProperty("mail.store.protocol","imap");
//            props.setProperty("mail.imap.host", host);
//            props.setProperty("mail.imap.port", port);
//            props.setProperty("mail.imap.auth.login.disable", "true");
//            Session session = Session.getDefaultInstance(props,null);
//            session.setDebug(false);
//            Store store = session.getStore("imap");
//            store.connect(host,"122019543","123");
//        }catch (Exception e){
//            System.out.print("登陆失败"+e);
//            return;
//        }
//        System.out.print("登陆成功");
//    }
//
//    public static void main(String[] args) throws Exception{
//        EmailClientDemo e = new EmailClientDemo();
//        e.authenticator();
//    }
//
//}
