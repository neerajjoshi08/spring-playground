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

        Animal dog2 = applicationContext.getBean("Dog", Animal.class);
        if (dog == dog2) {
            System.out.println("They are same object.");
        } else {
            System.out.println("They are different objects.");
        }

        System.out.println(dog);
    }
}
/*
OUTPUT:
Calling setter :: setName
Calling setter :: setFood
Dog is walking...
Cat is walking...
Calling setter :: setName
Calling setter :: setFood
Dog is eating food...
Calling setter :: setName
Calling setter :: setFood
They are different objects.
Dog{name='testdog', food=com.example.entity.Food@35ef1869}
 */
