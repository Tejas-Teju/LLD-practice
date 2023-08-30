package com.lldpractice.lldpractice.submitdocument.statepattern;

public class Approve implements State {
    @Override
    public void doAction(Document document) throws Exception {
        if (document.getState() instanceof Draft) {
            System.out.println("Approved...");
            document.setState(this);
        } else {
            throw new Exception("Document is in incorrect state: " + document.getClass().getName());
        }
    }
}
