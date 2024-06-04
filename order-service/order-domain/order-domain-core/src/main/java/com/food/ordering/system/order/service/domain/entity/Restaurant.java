package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valo.RestaurantId;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Restaurant extends AggregateRoot<RestaurantId> {
    private final List<Product> products;
    private boolean active;
}
