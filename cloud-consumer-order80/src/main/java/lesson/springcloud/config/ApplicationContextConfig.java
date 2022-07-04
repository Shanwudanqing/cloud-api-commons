package lesson.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/6/30-15:28
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced //开启自动负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
