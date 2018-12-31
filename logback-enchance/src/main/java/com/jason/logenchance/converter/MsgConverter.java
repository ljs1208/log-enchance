package com.jason.logenchance.converter;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.jason.logenchance.util.JsonUtils;

/**
 * @author jjlu521016@gmail.com
 */
public class MsgConverter extends ClassicConverter {
    public MsgConverter() {
    }

    @Override
    public String convert(ILoggingEvent event) {

        return JsonUtils.serialize(event.getFormattedMessage());

    }
}