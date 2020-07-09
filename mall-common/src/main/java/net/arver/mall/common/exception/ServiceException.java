package net.arver.mall.common.exception;

public class ServiceException extends RuntimeException {

    private String msg;

    public ServiceException(final String msg) {
        super(msg);
        this.msg = msg;
    }

    public ServiceException(final String msg, final Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }
}
