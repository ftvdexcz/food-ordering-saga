package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valo.Money;
import com.food.ordering.system.domain.valo.ProductId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;
}
