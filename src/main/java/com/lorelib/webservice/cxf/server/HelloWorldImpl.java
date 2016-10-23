package com.lorelib.webservice.cxf.server;

import javax.jws.WebService;

/**
 * Created by listening on 2016/10/12.
 */
@WebService(endpointInterface = "com.lorelib.webservice.cxf.server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String msg) {
        return "Hello " + msg + "!";
    }
}
