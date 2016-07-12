package cn.wiesler.interceptor;

import org.omg.PortableInterceptor.Interceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 时光机器 on 2016/7/12.
 */
public class HandlerInterceptorDemo implements HandlerInterceptor {
    //进入Handler方法之前执行
    //用户身份认证、身份授权
    //比如身份认证，如果认证通过表示当前用户没有登录，需要此方法拦截不再向下执行
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        System.out.println("preHandle");

        //return false表示拦截，不向下执行
        return true;
    }
    //进入Handler方法之后，返回ModelAndView之前执行
    //应用场景从ModelAndView出发：将公共的模型数据（比如菜单导航）在这里传到视图，也可以在这里统一指定视图
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }
    //执行Handler完成执行此方法
    //应用场景：统一异常处理，统一日志处理
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
    }
}
