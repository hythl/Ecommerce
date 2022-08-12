package com.haoliang.springbootecommerce.dto;

import com.haoliang.springbootecommerce.entity.Address;
import com.haoliang.springbootecommerce.entity.Customer;
import com.haoliang.springbootecommerce.entity.Order;
import com.haoliang.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
