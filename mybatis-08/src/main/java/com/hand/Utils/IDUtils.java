package com.hand.Utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @Author L-ludongpeng
 * @Date 2020/11/30 14:10
 * @Description
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
