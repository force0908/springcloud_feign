package com.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * Feign以接口和注解配置的方式，轻松实现了对compute-service服务的绑定，
 * 这样我们就可以在本地应用中像本地服务一下的调用它，并且做到了客户端均衡负载
 *
 * Feign是一个声明式的Web Service客户端，它使得编写Web Serivce客户端变得更加简单
 * 只需要使用Feign来创建一个接口并用注解来配置它既可完成
 *
 * Feign中使用Hystrix来实现熔断器功能，默认Feign中已经依赖了Hystrix
 */
@SpringBootApplication
@EnableDiscoveryClient   //启动发现服务的能力
@EnableFeignClients    //开启Feign功能
public class SpringbootFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFeignApplication.class, args);
	}
}
