package lesson.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/7/1-15:58
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();   //定义为随机
    }

}
