package com.qf.liangcang.bean;

import java.util.List;

/**
 * @author WDZ
 */
public class TableData<T> {
    private int code=0;
    private String msg;
    private long count;
    private List<T> data;

    public TableData() {
    }

    public TableData(long count, List<T> data) {
        this.count = count;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
