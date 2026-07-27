package com.in28Minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;
    public GameRunner(@Qualifier("SuperContraGameQualifier")
                      GamingConsole game) {
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
