/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.bk.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 *
 * @author cuongpham
 */
public class MyObjectMapper {
    private static ObjectMapper instance = null;

    public static ObjectMapper get() {
        if (instance == null) {
            synchronized (MyObjectMapper.class) {
                if (instance != null)
                    return instance;

                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

                instance = objectMapper;
            }
        }
        return instance;
    }
    
}
