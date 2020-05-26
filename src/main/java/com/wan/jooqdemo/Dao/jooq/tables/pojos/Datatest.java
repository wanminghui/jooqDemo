/*
 * This file is generated by jOOQ.
 */
package com.wan.jooqdemo.Dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;


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
public class Datatest implements Serializable {

    private static final long serialVersionUID = -1000254702;

    private Integer       userid;
    private LocalDateTime starttime;
    private LocalDateTime endtime;

    public Datatest() {}

    public Datatest(Datatest value) {
        this.userid = value.userid;
        this.starttime = value.starttime;
        this.endtime = value.endtime;
    }

    public Datatest(
        Integer       userid,
        LocalDateTime starttime,
        LocalDateTime endtime
    ) {
        this.userid = userid;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public LocalDateTime getStarttime() {
        return this.starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    public LocalDateTime getEndtime() {
        return this.endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Datatest (");

        sb.append(userid);
        sb.append(", ").append(starttime);
        sb.append(", ").append(endtime);

        sb.append(")");
        return sb.toString();
    }
}
