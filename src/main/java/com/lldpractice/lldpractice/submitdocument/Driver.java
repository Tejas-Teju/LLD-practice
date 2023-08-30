package com.lldpractice.lldpractice.submitdocument;

import com.lldpractice.lldpractice.submitdocument.statepattern.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        Document document = new Document();

        // Draft -> Approve -> Print
        //                  -> Reject

        Draft draft = new Draft();
        Print print = new Print();
        Approve approve = new Approve();
        Reject reject = new Reject();

        draft.doAction(document);
        approve.doAction(document);
        print.doAction(document);
        reject.doAction(document);
    }
}
