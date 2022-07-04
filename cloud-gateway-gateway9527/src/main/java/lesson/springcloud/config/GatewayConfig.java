package lesson.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/7/3-20:08
 */
@Configuration
public class GatewayConfig {

    /**
     * 配置了一个id为route-name的路由规则，当访问地址http://localhost:9527/guonei时会转发到
     * 地址：http://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_gua",
                r -> r.path("/guonei").
                uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

}
