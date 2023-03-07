package com.springcourse.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcourse.springcourse.game.GameRunner;
import com.springcourse.springcourse.game.GamingConsole;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfigurations.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
