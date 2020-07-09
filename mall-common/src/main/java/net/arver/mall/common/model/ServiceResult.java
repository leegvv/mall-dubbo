package net.arver.mall.common.model;

public class ServiceResult<T> {

    public ServiceResult(){}

    public ServiceResult(final T data) {
        this.data = data;
    }

    public ServiceResult(final boolean isSucceed, final String msg) {
        this.isSucceed = isSucceed;
        this.msg = msg;
    }

    private T data;

    private boolean isSucceed = true;

    private int code;

    private String msg;

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public boolean isSucceed() {
        return isSucceed;
    }

    public void setSucceed(final boolean succeed) {
        isSucceed = succeed;
    }

    public int getCode() {
        return code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }
}
