package com.food.ordering.system.payment.service.domain.valo;

import com.food.ordering.system.domain.valo.BaseId;

import java.util.UUID;

public class PaymentId extends BaseId<UUID> {
    public PaymentId(UUID value){
        super(value);
    }
}
