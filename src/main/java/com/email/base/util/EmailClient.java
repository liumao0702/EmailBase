package com.email.base.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Session;
import javax.mail.Store;
import java.security.Security;
import java.util.Properties;
/**
 * Created by Administrator on 2015/7/21.
 */
public class EmailClient {
    private static Logger logger = LoggerFactory.getLogger(EmailClient.class);

    private static EmailClient EC;
    private EmailClient(){
    }
    //单例 懒汉模式
    public static EmailClient getInstance(){
        if(EC == null){
            EC = new EmailClient();
        }
        return EC;
    }
    //认证
    public boolean authenticator(String name,String passwd){
        logger.warn("########### authenticator start #############");
        try{
            String host = "imap.qq.com";
            String port = "993";
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
            Properties props = System.getProperties();
            props.setProperty("mail.imap.socketFactory.class", SSL_FACTORY);
            props.setProperty("mail.imap.socketFactory.port", port);
            props.setProperty("mail.store.protocol","imap");
            props.setProperty("mail.imap.host", host);
            props.setProperty("mail.imap.port", port);
            props.setProperty("mail.imap.auth.login.disable", "true");
            Session session = Session.getDefaultInstance(props,null);
            session.setDebug(false);
            Store store = session.getStore("imap");
            store.connect(host,name,passwd);
        }catch (Exception e){
            logger.info("########### login failure #############");
            logger.info("########### authenticator end #############");
            return false;
        }
        logger.info("########### login success #############");
        logger.info("########### authenticator end #############");
        return true;
    }
}
