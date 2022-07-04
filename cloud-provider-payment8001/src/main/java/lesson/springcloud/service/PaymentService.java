package lesson.springcloud.service;

import lesson.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/6/30-10:15
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);

}
