package com.lorelib.webservice.cxf.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by listening on 2016/10/26.
 */
@XmlType(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "user")
public class User implements Serializable {
    @XmlElement(name = "ida")
    //@XmlAttribute(name = "id")
    private int id;
    private String username;
    private int age;

    public User() {}

    public User(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
