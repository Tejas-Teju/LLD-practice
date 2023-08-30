package com.lldpractice.lldpractice.submitdocument.statepattern;

public class Draft implements State {

    @Override
    public void doAction(Document document) throws Exception {
        if (document.getState() == null) {
            System.out.println("Drafted...");
            document.setState(this);
        } else {
            throw new Exception("Document is in incorrect state: " + document.getClass().getName());
        }
    }
}
