package com.food.ordering.system.order.service.domain.valo;

import com.food.ordering.system.domain.valo.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value){
        super(value);
    }
}
