package cn.wiesler.exception;

/**
 * Created by 时光机器 on 2016/7/12.
 * 自定义异常类
 */
public class CustomException extends Exception{
    //异常信息
    public String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomException(String message){
        super(message);
        this.message = message;
    }
}
