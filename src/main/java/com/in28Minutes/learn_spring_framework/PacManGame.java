package com.in28Minutes.learn_spring_framework;

import com.in28Minutes.learn_spring_framework.game.GameRunner;
import com.in28Minutes.learn_spring_framework.game.GamingConsole;

public class PacManGame implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }
    public void down() {
        System.out.println("Sit");
    }

    public void left() {
        System.out.println("Left");
    }

    public void right() {
        System.out.println("Right");
    }
}
