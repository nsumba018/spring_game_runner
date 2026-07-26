package com.in28Minutes.learn_spring_framework.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("running game: " + game);
        game.down();
        game.left();
        game.up();
        game.right();
    }


}
