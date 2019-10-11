package com.lgak.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 设定应用来源
 */
//@Component
public class MyRequestOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        // 可以设置在header上
        String origin = httpServletRequest.getParameter("origin");
        if (StringUtils.isEmpty(origin)){
            throw new IllegalArgumentException("origin必填");
        }

        // 根据某个应用传过来的参数判断是哪个应用，从而设置sentinel的应用来源
        return origin;
    }
}
