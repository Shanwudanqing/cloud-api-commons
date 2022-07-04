package lesson.springcloud.service.impl;

import lesson.springcloud.dao.PaymentDao;
import lesson.springcloud.entities.Payment;
import lesson.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/6/30-10:17
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id")Long id){
        return paymentDao.getPaymentById(id);
    }

}
