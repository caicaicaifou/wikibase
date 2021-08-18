package com.exec.wiki.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aki
 */
public class BeanCopyUtils {
    /**
     * 单体复制
     *
     * @param source source
     * @param clazz  clazz
     * @param <T>    <T>
     * @return <T>
     */
    public static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        T obj;
        try {
            obj = clazz.newInstance();
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        BeanUtils.copyProperties(source, obj);
        return obj;
    }

    /**
     * 集合复制
     *
     * @param source source
     * @param clazz  clazz
     * @param <T>    <T>
     * @return <T>
     */
    public static <T> List<T> copyList(List<?> source, Class<T> clazz) {
        List<T> target = new ArrayList<>();
        if (CollectionUtils.isEmpty(target)) {
            for (Object c : source) {
                T obj = copy(c, clazz);
                target.add(obj);
            }
        }
        return target;
    }
}