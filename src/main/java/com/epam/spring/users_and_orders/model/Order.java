package com.epam.spring.users_and_orders.model;

public class Order {

    private final String id;
    private final String name;
    private final Integer cost;

    public Order(String id, String name, Integer cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
