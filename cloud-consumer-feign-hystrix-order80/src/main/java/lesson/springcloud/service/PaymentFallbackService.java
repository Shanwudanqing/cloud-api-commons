package lesson.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/7/3-14:21
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_OK, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

}
