package com.vineetsingh.fooddelivery.events;

/**
 * The order of these values matters: it is the order of an order's life.
 * The read model uses ordinal() to ignore events that arrive late.
 */
public enum EventType{
    ORDER_PLACED,
    ORDER_ACCEPTED,
    ORDER_READY,
    ORDER_ASSIGNED,
    ORDER_PICKED_UP,
    ORDER_DELIVERED
}