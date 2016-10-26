package com.lorelib.webservice.cxf.server;

import com.lorelib.webservice.cxf.api.HelloWorld;

import javax.jws.WebService;

/**
 * Created by listening on 2016/10/12.
 */
@WebService(endpointInterface = "com.lorelib.webservice.cxf.api.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String msg) {
        return "Hello " + msg + "!";
    }
}
