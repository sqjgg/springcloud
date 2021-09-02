package com.jg.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Package: com.jg.springcloud.lb
 * @ClassName: LB
 * @Author: Levi
 * @CreateTime: 2021/8/26 19:10
 * @Description:
 */
@Component
public class LB implements MyLoadBanlance{

    //原子整型类
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int get(){
        int current,next;
        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        }while (!atomicInteger.compareAndSet(current,next));
        return next;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> list) {
        int index = get() % list.size();
        return list.get(index);
    }
}
