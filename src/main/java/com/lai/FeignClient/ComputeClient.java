package com.lai.FeignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lailai on 2017/9/22.
 * 定义的对应compute-service服务的接口
 * 使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
 * 使用@FeignClient注解中的fallback属性指定回调类
 * 通过Spring MVC的注解来配置compute-service服务下的具体实现
 * Spring Cloud为Feign增加了对Spring MVC注解的支持,还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现
 */
@FeignClient(value = "compute-service",fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET,value = "/add")
    Integer add(@RequestParam(value = "a") Integer a,@RequestParam(value = "b") Integer b);
}
