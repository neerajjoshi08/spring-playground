package com.example;

import com.example.entity.Animal;
import com.example.entity.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal dog = applicationContext.getBean("Dog", Animal.class);
        Animal cat = applicationContext.getBean("Cat", Animal.class);

        dog.walk();
        cat.walk();

        Dog dog1 = applicationContext.getBean("Dog", Dog.class);
        dog1.getFood();
    }

}
