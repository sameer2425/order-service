package com.msdemo.springbootorder.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Repository;
import com.msdemo.springbootorder.entity.Order;

@Repository
public class OrderDAO {

	public List<Order> getOrders() {
        return Stream.of(
                new Order(101, "Mobile", 1, 30000),
                new Order(58, "Book", 4, 2000),
                new Order(205, "Laptop", 1, 150000),
                new Order(809, "headset", 1, 1799))
                .collect(Collectors.toList());
    }
}
