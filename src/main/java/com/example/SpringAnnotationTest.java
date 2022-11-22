package com.example;

import com.example.entity.annotation.Rectangle;
import com.example.entity.annotation.Shape;
import com.example.entity.annotation.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape shape = applicationContext.getBean("my-square", Square.class);
        shape.draw();

        Shape rectangle = applicationContext.getBean("rectangle", Rectangle.class);
        rectangle.draw();
    }
}
/*
OUTPUT:
Square: drawing...
Rectangle: drawing...
*/
