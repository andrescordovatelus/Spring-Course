package com.springcourse.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcourse.springcourse.game.GameRunner;
import com.springcourse.springcourse.game.GamingConsole;
import com.springcourse.springcourse.game.PacmanGame;

@Configuration
public class GamingConfigurations{

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}