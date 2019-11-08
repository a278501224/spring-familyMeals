package com.example.jpademo.repository;

import com.example.jpademo.model.Coffee;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 * Auther:cherry
 * CreateTime:2019-11-07 17:20
 */
public interface CoffeeRepository extends CrudRepository<Coffee,Long> {

}
