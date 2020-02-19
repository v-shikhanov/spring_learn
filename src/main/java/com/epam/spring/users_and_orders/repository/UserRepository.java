package com.epam.spring.users_and_orders.repository;

import com.epam.spring.users_and_orders.model.Order;
import com.epam.spring.users_and_orders.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Repository
public class UserRepository {

  private static final List<User> USERS;

  private static final List<String> USERS_NAMES = Arrays.asList("Ivan", "Andrey", "Maxim", "Iluya", "Alexey", "John",
      "Petr", "Semeon", "Artem", "Vladimir", "Donald");
  private static final List<String> USERS_LAST_NAMES = Arrays.asList("Ivanov", "Andreev", "Maximov", "Iluyich",
      "Alexeev", "Smith", "Petrov", "Semenov", "Artemov", "Putin", "Trump");
  private static final List<String> ORDERS_NAMES = Arrays.asList("Potato", "Tomato", "Cucumber", "Coffee", "Tea",
      "Bread", "Olive Oil", "Bubble gum", "Magazine", "Pork", "Coca-cola");

  private final static Random random = new Random();

  static {
    USERS = createList(15, UserRepository::createUser);
  }

  public UserRepository() {
  }

  private static <T> List<T> createList(int lim, Supplier<T> supplier) {

    int size = 0;
    while (size < 1) {
      size = random.nextInt(lim);
    }

    List<T> list = new ArrayList<>();

    for (int index = 0; index < size; index++) {
      list.add(supplier.get());
    }

    return list;
  }

  private static User createUser() {

    String id = String.valueOf(random.nextLong());
    String name = USERS_NAMES.get(random.nextInt(USERS_NAMES.size()));
    String lastName = USERS_LAST_NAMES.get(random.nextInt(USERS_LAST_NAMES.size()));
    return new User(id, name, lastName, createList(10, UserRepository::createOrder));
  }

  private static Order createOrder() {

    String id = String.valueOf(random.nextLong());
    String name = ORDERS_NAMES.get(random.nextInt(ORDERS_NAMES.size()));
    Integer cost = random.nextInt(100);

    return new Order(id, name, cost);
  }

  public List<User> getUsers() {
    return USERS;
  }
}
