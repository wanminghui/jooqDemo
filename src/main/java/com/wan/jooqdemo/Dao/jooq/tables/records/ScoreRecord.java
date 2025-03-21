/*
 * This file is generated by jOOQ.
 */
package com.wan.jooqdemo.Dao.jooq.tables.records;


import com.wan.jooqdemo.Dao.jooq.tables.Score;

import javax.annotation.processing.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ScoreRecord extends TableRecordImpl<ScoreRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1295558156;

    /**
     * Setter for <code>userinfo.score.sid</code>.
     */
    public void setSid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>userinfo.score.sid</code>.
     */
    public Integer getSid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>userinfo.score.sname</code>.
     */
    public void setSname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>userinfo.score.sname</code>.
     */
    @Size(max = 20)
    public String getSname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>userinfo.score.scores</code>.
     */
    public void setScores(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>userinfo.score.scores</code>.
     */
    public Integer getScores() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Score.SCORE.SID;
    }

    @Override
    public Field<String> field2() {
        return Score.SCORE.SNAME;
    }

    @Override
    public Field<Integer> field3() {
        return Score.SCORE.SCORES;
    }

    @Override
    public Integer component1() {
        return getSid();
    }

    @Override
    public String component2() {
        return getSname();
    }

    @Override
    public Integer component3() {
        return getScores();
    }

    @Override
    public Integer value1() {
        return getSid();
    }

    @Override
    public String value2() {
        return getSname();
    }

    @Override
    public Integer value3() {
        return getScores();
    }

    @Override
    public ScoreRecord value1(Integer value) {
        setSid(value);
        return this;
    }

    @Override
    public ScoreRecord value2(String value) {
        setSname(value);
        return this;
    }

    @Override
    public ScoreRecord value3(Integer value) {
        setScores(value);
        return this;
    }

    @Override
    public ScoreRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScoreRecord
     */
    public ScoreRecord() {
        super(Score.SCORE);
    }

    /**
     * Create a detached, initialised ScoreRecord
     */
    public ScoreRecord(Integer sid, String sname, Integer scores) {
        super(Score.SCORE);

        set(0, sid);
        set(1, sname);
        set(2, scores);
    }
}
