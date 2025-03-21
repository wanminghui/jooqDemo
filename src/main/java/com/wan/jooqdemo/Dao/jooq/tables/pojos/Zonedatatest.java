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
public class Zonedatatest implements Serializable {

    private static final long serialVersionUID = -1787691513;

    private Integer       id;
    private LocalDateTime zonestarttime;
    private LocalDateTime zoneendtime;

    public Zonedatatest() {}

    public Zonedatatest(Zonedatatest value) {
        this.id = value.id;
        this.zonestarttime = value.zonestarttime;
        this.zoneendtime = value.zoneendtime;
    }

    public Zonedatatest(
        Integer       id,
        LocalDateTime zonestarttime,
        LocalDateTime zoneendtime
    ) {
        this.id = id;
        this.zonestarttime = zonestarttime;
        this.zoneendtime = zoneendtime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getZonestarttime() {
        return this.zonestarttime;
    }

    public void setZonestarttime(LocalDateTime zonestarttime) {
        this.zonestarttime = zonestarttime;
    }

    public LocalDateTime getZoneendtime() {
        return this.zoneendtime;
    }

    public void setZoneendtime(LocalDateTime zoneendtime) {
        this.zoneendtime = zoneendtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Zonedatatest (");

        sb.append(id);
        sb.append(", ").append(zonestarttime);
        sb.append(", ").append(zoneendtime);

        sb.append(")");
        return sb.toString();
    }
}
