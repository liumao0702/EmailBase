package com.email.base.service.impl;

import com.email.base.service.IAdmin;
import com.email.base.util.EmailClient;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/7/21.
 */
@Component(value ="admin")
public class AdminImpl implements IAdmin {

    public boolean login(String name,String passwd){
        boolean ret =  EmailClient.getInstance().authenticator(name,passwd);
        return ret;
    }
}
