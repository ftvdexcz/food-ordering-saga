package com.food.ordering.system.domain.entity;

import lombok.experimental.SuperBuilder;

// marked class for distinguish aggregate root class
@SuperBuilder
public abstract class AggregateRoot<ID> extends BaseEntity<ID> {

}
