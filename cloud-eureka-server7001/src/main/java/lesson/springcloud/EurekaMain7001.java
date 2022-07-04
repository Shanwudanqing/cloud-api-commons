package lesson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/6/30-19:26
 */
@SpringBootApplication
@EnableEurekaServer  //此时起着注册中心的作用
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }

}
