package com.presidium.explodingsquares.model;

public class PlayerMoves {

    private Move firstMove;
    private Move secondMove;
    private Move thirdMove;

    public PlayerMoves(Move firstMove, Move secondMove, Move thirdMove) {
        this.firstMove = firstMove;
        this.secondMove = secondMove;
        this.thirdMove = thirdMove;
    }
}
