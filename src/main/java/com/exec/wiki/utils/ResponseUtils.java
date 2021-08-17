package com.exec.wiki.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Aki
 */
@Data
@AllArgsConstructor
public class ResponseUtils<T> implements Serializable {
    private static final long serialVersionUID = 8992436576262574064L;
    private int code;
    private String message;
    private T data;
}
