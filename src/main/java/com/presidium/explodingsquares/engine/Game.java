package com.presidium.explodingsquares.engine;

import com.presidium.explodingsquares.model.Player;

import java.util.Set;

public class Game {

    private final Long individualGameid;
    private final Set<Player> players;

    public Game(Long code, Set<Player> players) {
        this.individualGameid = code;
        this.players = players;
    }


}
