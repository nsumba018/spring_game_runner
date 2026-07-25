package com.in28Minutes.learn_spring_framework;

import com.in28Minutes.learn_spring_framework.game.GameRunner;
import com.in28Minutes.learn_spring_framework.game.MarioGame;
import com.in28Minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

//        var  marioGame = new MarioGame();
        var superContrGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContrGame);
        gameRunner.run();
    }
}
