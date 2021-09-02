package com.jg.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Package: com.jg.springcloud.lb
 * @ClassName: MyLoadBanlance
 * @Author: Levi
 * @CreateTime: 2021/8/26 19:09
 * @Description:
 */
public interface MyLoadBanlance {

    ServiceInstance instance(List<ServiceInstance> list);
}
