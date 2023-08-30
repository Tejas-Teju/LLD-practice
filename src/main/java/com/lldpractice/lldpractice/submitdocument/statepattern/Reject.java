package com.lldpractice.lldpractice.submitdocument.statepattern;

public class Reject implements State {
    @Override
    public void doAction(Document document) throws Exception {
        if (document.getState() instanceof Draft) {
            System.out.println("Rejected...");
            document.setState(this);
        } else {
            throw new Exception("Document is in incorrect state: " + document.getClass().getName());
        }
    }
}
