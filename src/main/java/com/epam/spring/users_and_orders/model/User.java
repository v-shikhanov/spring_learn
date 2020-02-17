package com.epam.spring.users_and_orders.model;

import java.util.Iterator;
import java.util.List;

public class User {

  private final String id;
  private final String firstName;
  private final String lastName;
  private final List<Order> orders;

  public User(String id, String firstName, String lastName, List<Order> orders) {

    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.orders = orders;
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public List<Order> getAllOrders() {
    return orders;
  }

  public void addOrder(Order order) {
    orders.add(order);
  }

  public boolean removeOrder(String id) {

    Iterator<Order> it = orders.listIterator();

    while (it.hasNext()) {
      if (it.next().getId().equals(id)) {
        it.remove();

        return true;
      }
    }

    return false;
  }

  @Override
  public String toString() {

    return "User{" +
        "id='" + id + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", orders=" + orders +
        '}';
  }
}
