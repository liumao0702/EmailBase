package com.email.base.web;

import com.email.base.service.IAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Administrator on 2015/7/21.
 */
public abstract class BaseController {
    @Autowired
    @Qualifier("admin")
    protected IAdmin admin;

}
