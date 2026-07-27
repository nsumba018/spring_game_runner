package com.in28Minutes.learn_spring_framework;

import com.in28Minutes.learn_spring_framework.game.GameRunner;
import com.in28Minutes.learn_spring_framework.game.PacManGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var  game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacManGame(); // Object Creation
        var gameRunner = new GameRunner(game);
        // Object Creation + wiring of Dependency
        // GamingConsole(specific game) is dependency of Game Runner
        gameRunner.run();
    }
}
