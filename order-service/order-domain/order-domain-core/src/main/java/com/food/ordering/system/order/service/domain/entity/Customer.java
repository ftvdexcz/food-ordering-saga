package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valo.CustomerId;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class Customer extends AggregateRoot<CustomerId> {

}
