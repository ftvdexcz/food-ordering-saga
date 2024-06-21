package com.food.ordering.system.payment.service.domain.valo;

import com.food.ordering.system.domain.valo.BaseId;

import java.util.UUID;

public class CreditEntryId extends BaseId<UUID> {
    public CreditEntryId(UUID value){
        super(value);
    }
}
