package com.example.springtest.configuration;

import com.example.springtest.entities.Order;
import com.example.springtest.entities.User;
import com.example.springtest.repository.OrderRepository;
import com.example.springtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User test1 = new User(null, "adddb", "db@db.com", "(11)1111-1111", "11111111");
        User test2 = new User(null, "testdb2", "testdb@testdb.com","(22)2222-2222", "22222");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), test1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), test2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), test1);

        userRepository.saveAll(Arrays.asList(test1,test2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
