package com.jason.logenchance.converter;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import com.jason.logenchance.util.JsonUtils;

/**
 * @author jjlu521016@gmail.com
 */
public class StackTraceConverter extends ThrowableProxyConverter {
    public StackTraceConverter() {
    }

    @Override public String convert(ILoggingEvent event) {

        // 获取异常信息
        IThrowableProxy throwableProxy = event.getThrowableProxy();
        // 如果没有异信息
        if (throwableProxy == null) {
            //返回字符串 ： "\"\""
            return JsonUtils.serialize("");
        }
        // 如果有异常信息
        String ex = super.convert(event);

        // json化
        return JsonUtils.serialize(ex);
    }
}
