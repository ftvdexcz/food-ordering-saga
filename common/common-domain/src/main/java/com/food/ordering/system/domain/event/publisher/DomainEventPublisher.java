package com.food.ordering.system.domain.event.publisher;

import com.food.ordering.system.domain.event.DomainEvent;

// publish domain event, generic type extend DomainEvent to publish only a range support type of event
public interface DomainEventPublisher<T extends DomainEvent>{
    void publish(T domainEvent);
}
