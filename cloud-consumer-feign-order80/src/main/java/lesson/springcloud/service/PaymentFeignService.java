package lesson.springcloud.service;

import lesson.springcloud.entities.CommonResult;
import lesson.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:服务接口
 * @Author: Wanzhen
 * @Date: 2022/7/1-23:45
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Configuration
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
