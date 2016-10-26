package com.lorelib.webservice.cxf.api;

import com.lorelib.webservice.cxf.model.User;

import javax.jws.WebService;

/**
 * Created by listening on 2016/10/12.
 */
@WebService
public interface HelloWorld {
    String sayHello(User user);
}
