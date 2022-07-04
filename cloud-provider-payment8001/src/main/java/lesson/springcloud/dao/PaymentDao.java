package lesson.springcloud.dao;

import lesson.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: Wanzhen
 * @Date: 2022/6/30-9:57
 */
@Mapper
public interface PaymentDao {
    //写操作
    public int create(Payment payment);
    //读操作
    public Payment getPaymentById(@Param("id")Long id);

}
