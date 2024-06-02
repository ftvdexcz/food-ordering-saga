package com.food.ordering.system.domain.valo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public abstract class BaseId<T> {
    private final T value;

    protected BaseId(T value){
        this.value = value;
    }
}
