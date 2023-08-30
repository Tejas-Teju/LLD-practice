package com.lldpractice.lldpractice.submitdocument.statepattern;

public class Document {
    private State state = null;

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }
}
