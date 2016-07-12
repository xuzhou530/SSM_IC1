package cn.wiesler.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 时光机器 on 2016/7/12.
 * 全局异常处理器
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{

    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
        //解析出异常类型
        CustomException customException = null;
        if(e instanceof CustomException){
            //如果该异常类型 是 系统自定义的异常，直接取出异常信息，在错误页面展示
            customException = (CustomException) e;
        }else{
            //如果该异常类型 不是 系统自定义的异常，构造一个自定义的异常类型（信息为“未知错误！”）
            customException = new CustomException("未知错误！");
        }

        //错误信息
        String message = customException.getMessage();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", message);
        //指向错误页面
        modelAndView.setViewName("error");

        return modelAndView;
    }
}
