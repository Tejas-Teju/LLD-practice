package com.lldpractice.lldpractice.submitdocument.statepattern;

public class Print implements State {
    @Override
    public void doAction(Document document) throws Exception {
        if (document.getState() instanceof Approve) {
            System.out.println("Printing...");
            document.setState(this);
        } else {
            throw new Exception("Document is in incorrect state: " + document.getClass().getName());
        }
    }
}
