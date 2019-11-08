package com.example.jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.joda.money.Money;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Auther:cherry
 * CreateTime:2019-11-07 09:42
 */

@Entity //对实体注释。任何Hibernate映射对象都要有这个注释
// 声明此对象映射到数据库的数据表，通过它可以为实体指定表(talbe),目录(Catalog)和schema的名字。
// 该注释不是必须的，如果没有则系统使用默认值(实体的短类名)。
@Table(name="T_MENU")//
//声明实体，表示可以进行Builder方式初始化
@Builder
//包含了get，set和toString
@Data
//空构造方法
@NoArgsConstructor
//包含所有参数的构造方法
@AllArgsConstructor
public class Coffee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column
    @Type(type="org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount",
            parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode", value = "CNY")})
    private Money price;
    @Column(updatable = false)
    @CreationTimestamp
    private Date createTime;
    @UpdateTimestamp
    private Date updateTime;
}
