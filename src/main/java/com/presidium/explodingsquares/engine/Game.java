package com.presidium.explodingsquares.engine;

import com.presidium.explodingsquares.player.Player;

import java.util.Set;

public class Game {

    private final Long code;
    private final Set<Player> players;

    public Game(Long code, Set<Player> players) {
        this.code = code;
        this.players = players;
    }
}
