package com.jason.logenchance.util;

import com.alibaba.fastjson.JSON;

/**
 * @author jjlu521016@gmail.com
 */
public class JsonUtils {

    /**
     * 将对象序列化为JSON字符串
     *
     * @param object
     * @return JSON字符串
     */
    public static String serialize(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * 将JSON字符串反序列化为对象
     *
     * @param json
     * @param clazz
     * @return JSON字符串
     */
    public static <T> T deserialize(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }
}
