package com.atguigu.common.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BusinessException {

//    状态码
    private Integer code;
//    错误消息
    private String message;
}
