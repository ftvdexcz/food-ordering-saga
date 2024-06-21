package com.food.ordering.system.payment.service.domain.entity;

import com.food.ordering.system.domain.valo.BaseId;

import java.util.UUID;

public class CreditHistoryId extends BaseId<UUID> {
    public CreditHistoryId(UUID value){
        super(value);
    }
}
