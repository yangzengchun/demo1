package com.example.handler.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangzengchun
 * @Title: EXHandler
 * @ProjectName handler
 * @Description: TODO
 * @date 2019-02-2610:33
 */

@RestControllerAdvice
public class EXHandler {
    private static final Logger LOG = LoggerFactory.getLogger(EXHandler.class);


    //捕获全局异常,处理所有不可知的异常
    @ExceptionHandler(value=Exception.class)
    //@ResponseBody
    Object handleException(Exception e, HttpServletRequest request){
        LOG.error("url {}, msg {}",request.getRequestURL(), e.getMessage());
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }
}
