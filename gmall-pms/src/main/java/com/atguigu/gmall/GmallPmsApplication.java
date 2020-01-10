package com.atguigu.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author Only when I saw the eyes from mirror, I realized that's me.
 */
@SpringBootApplication
@MapperScan("com.atguigu.gmall.pms.dao")
@EnableDiscoveryClient
@EnableSwagger2
public class GmallPmsApplication {
  public static void main(String[] args) {
    SpringApplication.run(GmallPmsApplication.class, args);
  }

}
 

