package com.itheima.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AccountUser extends Account {
    private Integer id;
    private Integer uid;
    private double money;
    private String username;
    private String address;

}
