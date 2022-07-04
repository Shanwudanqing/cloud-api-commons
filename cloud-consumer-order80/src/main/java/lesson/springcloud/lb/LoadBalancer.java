package lesson.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description:自定义负载均衡器
 * @Author: Wanzhen
 * @Date: 2022/7/1-21:30
 */
public interface LoadBalancer {

    //获取现在集群上服务机器的总数
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
