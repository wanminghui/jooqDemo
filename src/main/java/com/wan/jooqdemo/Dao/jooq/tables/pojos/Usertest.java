/*
 * This file is generated by jOOQ.
 */
package com.wan.jooqdemo.Dao.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Usertest implements Serializable {

    private static final long serialVersionUID = 1291037663;

    private Byte   uid;
    private String userinfomessage;

    public Usertest() {}

    public Usertest(Usertest value) {
        this.uid = value.uid;
        this.userinfomessage = value.userinfomessage;
    }

    public Usertest(
        Byte   uid,
        String userinfomessage
    ) {
        this.uid = uid;
        this.userinfomessage = userinfomessage;
    }

    public Byte getUid() {
        return this.uid;
    }

    public void setUid(Byte uid) {
        this.uid = uid;
    }

    @Size(max = 65535)
    public String getUserinfomessage() {
        return this.userinfomessage;
    }

    public void setUserinfomessage(String userinfomessage) {
        this.userinfomessage = userinfomessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Usertest (");

        sb.append(uid);
        sb.append(", ").append(userinfomessage);

        sb.append(")");
        return sb.toString();
    }
}
