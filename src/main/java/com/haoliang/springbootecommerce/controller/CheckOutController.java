package com.haoliang.springbootecommerce.controller;

import com.haoliang.springbootecommerce.dto.Purchase;
import com.haoliang.springbootecommerce.dto.PurchaseResponse;
import com.haoliang.springbootecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckOutController {

    private CheckoutService checkoutService;

    public CheckOutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){

        PurchaseResponse purchaseResponse = checkoutService.plcaeOrder(purchase);

        return purchaseResponse;
    }
}
