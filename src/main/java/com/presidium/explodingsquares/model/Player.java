package com.presidium.explodingsquares.model;

public class Player {

    private Long id;
    private String name;
    private int health;

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
        this.health = 30;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void bigHit(){
        health -= 12;
    }

    public void smallHit(){
        health -= 4;
    }
}
