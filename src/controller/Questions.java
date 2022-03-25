package controller;

public class Questions {
    private int awards;
    private int aleatory;
    private int cat;

    public int getCat() {
        return cat;
    }

    String questions[] = new String[5];

    public int getAleatory() {
        return aleatory;
    }

    //contructor
    public Questions() {
    }

    public String random(int awards){
        int cat = 0;
        this.aleatory = (int) (Math.random() * 5 + 1);
        if (awards == 0){
            this.cat = 1;
            return cat1(aleatory);

        }
        else if(awards == 100){
            this.cat = 2;
            return cat2(aleatory);

        }
        else if(awards == 200){
            this.cat = 3;
            return cat3(aleatory);

        }
        else if(awards == 300){
            this.cat = 4;
            return cat4(aleatory);

        }
        else if(awards == 400){
            this.cat = 5;
            return cat5(aleatory);

        }

/*        switch (cat){
            case 1:
                return cat1(aleatory);
            case 2:
                return cat2(aleatory);
            case 3:
                return cat3(aleatory);
            case 4:
                return cat4(aleatory);
            case 5:
                return cat5(aleatory);

        }*/
        return "";
    }
    public String cat1(int aleatory) {
        //Sports
        questions[0] = "How many World Cups has Brazil won?";
        questions[1] = "Which country has won the most EUROCUPs often?";
        questions[2] = "Who is the best basketball player of all time?";
        questions[3] = "How many motorcycling titles has Valentino Rossi won?";
        questions[4] = "How many Grand Slams has Roger Federer had?";
        return questions[aleatory - 1];
    }
    public String cat2(int aleatory){
        //Geography
        questions[0] = "What is the largest and most populous continent in the world?";
        questions[1] = "What is the capital of the Vatican?";
        questions[2] = "The great Gobi Desert is located in?";
        questions[3] = "Which of these countries does not have access to the Mediterranean Sea?";
        questions[4] = "What is the longest river in the world?";

        return questions[aleatory - 1];
    }

    public String cat3(int aleatory){
        //Art
        questions[0] = "Who is the author of the Mona Lisa?";
        questions[1] = "Who is the main author of cubism?";
        questions[2] = "Who is the author of scream?";
        questions[3] = "Who is the composer of the flight of the bumblebee?";
        questions[4] = "What is the date of composition of Carmina Burana?";

        return questions[aleatory - 1];
    }

    public String cat4(int aleatory){
        //Literature
        questions[0] = "Who is the Colombian Nobel for literature?";
        questions[1] = "Who is the writer of Harry Potter?";
        questions[2] = "How many psalms does the holy bible have?";
        questions[3] = "Who is the author of the book Don Quijote de la Mancha?";
        questions[4] = "What is the most translated book in history?";

        return questions[aleatory - 1];
    }

    public String cat5(int aleatory){
        //Science
        questions[0] = "Who discovered the force of gravity?";
        questions[1] = "Who invented the incandescent light bulb?";
        questions[2] = "Who is the author of the theory of relativity?";
        questions[3] = "Who is the father of modern astronomy?";
        questions[4] = "who discovered the neutron?";

        return questions[aleatory - 1];
    }




}
