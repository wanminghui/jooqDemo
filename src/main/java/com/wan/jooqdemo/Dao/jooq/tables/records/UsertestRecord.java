/*
 * This file is generated by jOOQ.
 */
package com.wan.jooqdemo.Dao.jooq.tables.records;


import com.wan.jooqdemo.Dao.jooq.tables.Usertest;

import javax.annotation.processing.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class UsertestRecord extends TableRecordImpl<UsertestRecord> implements Record2<Byte, String> {

    private static final long serialVersionUID = 893268301;

    /**
     * Setter for <code>userinfo.usertest.uid</code>.
     */
    public void setUid(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>userinfo.usertest.uid</code>.
     */
    public Byte getUid() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>userinfo.usertest.userinfomessage</code>.
     */
    public void setUserinfomessage(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>userinfo.usertest.userinfomessage</code>.
     */
    @Size(max = 65535)
    public String getUserinfomessage() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Byte, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Byte, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Byte> field1() {
        return Usertest.USERTEST.UID;
    }

    @Override
    public Field<String> field2() {
        return Usertest.USERTEST.USERINFOMESSAGE;
    }

    @Override
    public Byte component1() {
        return getUid();
    }

    @Override
    public String component2() {
        return getUserinfomessage();
    }

    @Override
    public Byte value1() {
        return getUid();
    }

    @Override
    public String value2() {
        return getUserinfomessage();
    }

    @Override
    public UsertestRecord value1(Byte value) {
        setUid(value);
        return this;
    }

    @Override
    public UsertestRecord value2(String value) {
        setUserinfomessage(value);
        return this;
    }

    @Override
    public UsertestRecord values(Byte value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsertestRecord
     */
    public UsertestRecord() {
        super(Usertest.USERTEST);
    }

    /**
     * Create a detached, initialised UsertestRecord
     */
    public UsertestRecord(Byte uid, String userinfomessage) {
        super(Usertest.USERTEST);

        set(0, uid);
        set(1, userinfomessage);
    }
}
