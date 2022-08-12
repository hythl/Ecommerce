package com.haoliang.springbootecommerce.service;

import com.haoliang.springbootecommerce.dto.Purchase;
import com.haoliang.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse plcaeOrder(Purchase purchase);
}
