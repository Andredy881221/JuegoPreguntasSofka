package controller;

public class Validation {
/*    private int cat;
    private int aleatory;
    private int response;*/

    public Validation() {
    }

    public boolean validationResponse(int cat, int aleatory, int response) {
        if (cat == 1 && aleatory == 1 && response == 1) {
            return true;
        } else if (cat == 1 && aleatory == 2 && response == 3) {
            return true;
        } else if (cat == 1 && aleatory == 3 && response == 4) {
            return true;
        } else if (cat == 1 && aleatory == 4 && response == 2) {
            return true;

        } else if (cat == 1 && aleatory == 5 && response == 1) {
            return true;
        } else if (cat == 2 && aleatory == 1 && response == 1) {
            return true;
        } else if (cat == 2 && aleatory == 2 && response == 3) {
            return true;
        } else if (cat == 2 && aleatory == 3 && response == 4) {
            return true;
        } else if (cat == 2 && aleatory == 4 && response == 2) {
            return true;
        } else if (cat == 2 && aleatory == 5 && response == 1) {
            return true;
        } else if (cat == 3 && aleatory == 1 && response == 1) {
            return true;
        } else if (cat == 3 && aleatory == 2 && response == 3) {
            return true;
        } else if (cat == 3 && aleatory == 3 && response == 4) {
            return true;
        } else if (cat == 3 && aleatory == 4 && response == 2) {
            return true;
        } else if (cat == 3 && aleatory == 5 && response == 1) {
            return true;
        } else if (cat == 4 && aleatory == 1 && response == 1) {
            return true;
        } else if (cat == 4 && aleatory == 2 && response == 3) {
            return true;
        } else if (cat == 4 && aleatory == 3 && response == 4) {
            return true;
        } else if (cat == 4 && aleatory == 4 && response == 2) {
            return true;
        } else if (cat == 4 && aleatory == 5 && response == 1) {
            return true;
        } else if (cat == 5 && aleatory == 1 && response == 1) {
            return true;
        } else if (cat == 5 && aleatory == 2 && response == 3) {
            return true;
        } else if (cat == 5 && aleatory == 3 && response == 4) {
            return true;
        } else if (cat == 5 && aleatory == 4 && response == 2) {
            return true;
        } else if (cat == 5 && aleatory == 5 && response == 1) {
            return true;
        } else
            return false;
    }
}

