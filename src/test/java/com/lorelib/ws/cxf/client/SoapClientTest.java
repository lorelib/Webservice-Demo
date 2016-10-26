package com.lorelib.ws.cxf.client;

import com.lorelib.webservice.cxf.api.HelloWorld;
import com.lorelib.webservice.cxf.model.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by listening on 2016/10/13.
 */
public class SoapClientTest {
    private static ApplicationContext ctx;

    @BeforeClass
    public static void setUpBeforeClass() {
        ctx = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @Test
    public void testHello() {
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        User user = new User(1, "luomm", 20);
        String result = helloWorld.sayHello(user);
        System.out.println("结果：" + result);
    }
}
