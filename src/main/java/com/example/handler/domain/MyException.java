package com.example.handler.domain;

import javax.xml.ws.soap.Addressing;

/**
 * @Description: java类作用描述
 * @Author: yang.zengchun
 * @CreateDate: 2019-02-26 10:53
 * @UpdateUser: yang.zengchun
 * @UpdateDate: 2019-02-26 10:53
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class MyException extends  RuntimeException {

    private  String  code;
    private  String  msg;


    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
