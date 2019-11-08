package com.example.jpademo.repository;

import com.example.jpademo.model.CoffeeOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 * Auther:cherry
 * CreateTime:2019-11-07 17:21
 */
public interface CoffeeOrderRepository extends CrudRepository<CoffeeOrder,Long> {
}
