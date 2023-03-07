package com.springcourse.springcourse;

import com.springcourse.springcourse.game.GameRunner;
import com.springcourse.springcourse.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame(); // 1: Object Creation
        var gameRunneer = new GameRunner(game); // 2: Object Creation + Wiring of Dependencies // Game is a Dependency of GameRunner
        gameRunneer.run();
    }
}
