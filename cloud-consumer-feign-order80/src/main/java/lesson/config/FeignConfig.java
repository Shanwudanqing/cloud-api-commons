package lesson.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/7/2-10:25
 */
@Configuration
public class FeignConfig {

    //OpenFeign日志打印
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
