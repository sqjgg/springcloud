package com.jg.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Package: com.jg.springcloud.entities
 * @ClassName: Payment
 * @Author: Levi
 * @CreateTime: 2021/8/24 11:45
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
