package com.lorelib.ws.cxf.client;

import org.apache.commons.lang3.ArrayUtils;

import javax.xml.soap.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class SOAPTest {
    private static String xml = "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><env:Header><gateway:HeadType><gateway:versionNo>1</gateway:versionNo></gateway:HeadType></env:Header><env:Body><gateway:NoAS400><gateway:field name=\"msg\">luomm</gateway:field></gateway:NoAS400></env:Body></env:Envelope>";

    public static void main(String[] args) {
        String url = "http://localhost:8093/services/HelloWorld?wsdl?userInfo";
        if (ArrayUtils.isNotEmpty(args)) url = args[0];

        try (ByteArrayInputStream bis = new ByteArrayInputStream(xml.getBytes("UTF-8"));
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

            MessageFactory msgFactory = MessageFactory.newInstance();
            SOAPMessage message = msgFactory.createMessage(new MimeHeaders(), bis);
            message.setProperty("javax.xml.soap.character-set-encoding", "GBK");

            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            final SOAPConnection connection = factory.createConnection();
            SOAPMessage retMessage = connection.call(message, url);

            retMessage.writeTo(bos);
            String msg = new String(new String(bos.toByteArray()).getBytes(), "UTF-8");
            msg = msg.replaceAll("\n", "");
            System.out.println("响应结果：" + msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
