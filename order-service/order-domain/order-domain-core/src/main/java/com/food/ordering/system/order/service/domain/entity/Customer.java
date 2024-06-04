package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valo.CustomerId;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer extends AggregateRoot<CustomerId> {
}
