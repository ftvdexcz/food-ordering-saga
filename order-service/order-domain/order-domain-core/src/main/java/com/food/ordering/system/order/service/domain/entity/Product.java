package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valo.Money;
import com.food.ordering.system.domain.valo.ProductId;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId){
        super.setId(productId);
    }

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public void updateWithConfirmedNameAndPrice(String name, Money price){
        this.name = name;
        this.price = price;
    }
}
