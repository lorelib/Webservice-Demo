package com.lorelib.webservice.cxf.client;

import javax.jws.WebService;

/**
 * Created by listening on 2016/10/12.
 */
@WebService
public interface HelloWorld {
    String sayHello(String msg);
}
