package com.vineetsingh.fooddelivery.events;

import java.time.Instant;
import java.util.UUID;

public record FoodEvent(
    String eventId,
    EventType type,
    int schemaVersion,
    String orderId,
    String restaurantId,
    String courierId,
    Instant promisedBy,
    Instant occurredAt) {
    
        public static final int CURRENT_SCHEMA_VERSION=1;

        public static FoodEvent of(EventType type, String orderId, String restaurantId, String courierId, Instant promisedBy){
            return new FoodEvent(UUID.randomUUID().toString(),
                type,
                CURRENT_SCHEMA_VERSION,
                orderId,
                restaurantId,
                courierId,
                promisedBy,
                Instant.now()
            );
        }
}
