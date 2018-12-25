package com.media.common.exception;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class MediaException extends RuntimeException {

    private static final long serialVersionUID = -7606440522812191612L;

    public MediaException() {
    }

    public MediaException(String s) {
        super(s);
    }

    public MediaException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public MediaException(Throwable throwable) {
        super(throwable);
    }
}
