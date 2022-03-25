package controller;

public class Answers {

    public Answers() {
    }

    public String getAnswers(int aleatory, int cat) {
        switch (cat) {
            case 1:
                return sports(aleatory);
            case 2:
                return geography(aleatory);
            case 3:
                return art(aleatory);
            case 4:
                return literature(aleatory);
            case 5:
                return science(aleatory);
        }
        return "";
    }

    public String sports(int aleatory) {
        String sports[] = new String[20];
        //Sports
        switch (aleatory) {
            case 1:
                sports[0] = "5"; //correcta
                sports[1] = "3";
                sports[2] = "6";
                sports[3] = "2";
                return "1)" + sports[0] + "\n" +
                        "2)" + sports[1] + "\n" +
                        "3)" + sports[2] + "\n" +
                        "4)" + sports[3] + "\n";
            case 2:
                sports[4] = "Spain";//correcta
                sports[5] = "England";
                sports[6] = "Italy";
                sports[7] = "France";
                return "1)" + sports[6] + "\n" +
                        "2)" + sports[5] + "\n" +
                        "3)" + sports[4] + "\n" +
                        "4)" + sports[7] + "\n";
            case 3:
                sports[8] = "Michael Jordan";//correcta
                sports[9] = "Kobe Bryant";
                sports[10] = "Shaquille O’Neal";
                sports[11] = "Oscar Roberson";
                return "1)" + sports[11] + "\n" +
                        "2)" + sports[9] + "\n" +
                        "3)" + sports[10] + "\n" +
                        "4)" + sports[8] + "\n";
            case 4:
                sports[12] = "9";//correcta
                sports[13] = "8";
                sports[14] = "6";
                sports[15] = "2";
                return "1)" + sports[13] + "\n" +
                        "2)" + sports[12] + "\n" +
                        "3)" + sports[14] + "\n" +
                        "4)" + sports[15] + "\n";
            case 5:
                sports[16] = "20";//correcta
                sports[17] = "28";
                sports[18] = "15";
                sports[19] = "19";
                return "1)" + sports[16] + "\n" +
                        "2)" + sports[17] + "\n" +
                        "3)" + sports[18] + "\n" +
                        "4)" + sports[19] + "\n";


        }
        return "";
    }


    public String geography(int aleatory) {
        String geography[] = new String[20];
        //Geography
        switch (aleatory) {
            case 1:
                geography[0] = "Asia";//correcta
                geography[1] = "America";
                geography[2] = "Oceania";
                geography[3] = "Europe";
                return "1)" + geography[0] + "\n" +
                        "2)" + geography[1] + "\n" +
                        "3)" + geography[2] + "\n" +
                        "4)" + geography[3] + "\n";
            case 2:
                geography[4] = "Vatican City";//correcta
                geography[5] = "Mexico City";
                geography[6] = "Bogota";
                geography[7] = "Washington";
                return "1)" + geography[6] + "\n" +
                        "2)" + geography[5] + "\n" +
                        "3)" + geography[4] + "\n" +
                        "4)" + geography[7] + "\n";
            case 3:
                geography[8] = "Asia";//correcta
                geography[9] = "Europe";
                geography[10] = "America";
                geography[11] = "Antarctica";
                return "1)" + geography[11] + "\n" +
                        "2)" + geography[9] + "\n" +
                        "3)" + geography[10] + "\n" +
                        "4)" + geography[8] + "\n";
            case 4:
                geography[12] = "Serbian";//correcta
                geography[13] = "Slovenia";
                geography[14] = "Cyprus";
                geography[15] = "Egypt";

                return "1)" + geography[13] + "\n" +
                        "2)" + geography[12] + "\n" +
                        "3)" + geography[14] + "\n" +
                        "4)" + geography[15] + "\n";
            case 5:
                geography[16] = "Nile";//correcta
                geography[17] = "Amazon";
                geography[18] = "Yellow River";
                geography[19] = "Yangtze";
                return "1)" + geography[16] + "\n" +
                        "2)" + geography[17] + "\n" +
                        "3)" + geography[18] + "\n" +
                        "4)" + geography[19] + "\n";
        }
        return "";
    }
    public String art(int aleatory) {
        String art[] = new String[20];
        //Art
        switch (aleatory) {
            case 1:
                art[0] = "Leonardo Davinci";//correcta
                art[1] = "Pablo Picasso";
                art[2] = "Van Gogh";
                art[3] = "Salvador Dali";
                return "1)" + art[0] + "\n" +
                        "2)" + art[1] + "\n" +
                        "3)" + art[2] + "\n" +
                        "4)" + art[3] + "\n";
            case 2:
                art[4] = "Alexander Archipenko";//correcta
                art[5] = "Fernando Botero";
                art[6] = "Jhon Stagger";
                art[7] = "Alejandro Obregon";
                return "1)" + art[6] + "\n" +
                        "2)" + art[5] + "\n" +
                        "3)" + art[4] + "\n" +
                        "4)" + art[7] + "\n";
            case 3:
                art[8] = "Edvard Munch";//correcta
                art[9] = "Claude Monet";
                art[10] = "Mozart";
                art[11] = "Beethoven";
                return "1)" + art[11] + "\n" +
                        "2)" + art[9] + "\n" +
                        "3)" + art[10] + "\n" +
                        "4)" + art[8] + "\n";
            case 4:
                art[12] = "Nicolai Rimsky";//correcta
                art[13] = "Carl Orff";
                art[14] = "Sebastian Bach";
                art[15] = "Amadeus Mozart";
                return "1)" + art[13] + "\n" +
                        "2)" + art[12] + "\n" +
                        "3)" + art[14] + "\n" +
                        "4)" + art[15] + "\n";
            case 5:
                art[16] = "1935";//correcta
                art[17] = "1845";
                art[18] = "1625";
                art[19] = "1256";
                return "1)" + art[16] + "\n" +
                        "2)" + art[17] + "\n" +
                        "3)" + art[18] + "\n" +
                        "4)" + art[19] + "\n";
        }
        return "";
    }
    public String literature(int aleatory) {
        String literature[] = new String[20];
        //Literature
        switch (aleatory) {
            case 1:
                literature[0] = "Gabriel Garcia Marquez";//correcta
                literature[1] = "Rafael Pombo";
                literature[2] = "Jose Eustacio Rivera";
                literature[3] = "Jorge Isaac";
                return  "1)" + literature[0] + "\n" +
                        "2)" + literature[1] + "\n" +
                        "3)" + literature[2] + "\n" +
                        "4)" + literature[3] + "\n";
            case 2:
                literature[4] = "J k Rowling";//correcta
                literature[5] = "Tolkien";
                literature[6] = "Agatha Cristi";
                literature[7] = "George Martin";
                return  "1)" + literature[6] + "\n" +
                        "2)" + literature[5] + "\n" +
                        "3)" + literature[4] + "\n" +
                        "4)" + literature[7] + "\n";
            case 3:
                literature[8]  = "150";//correcta
                literature[9]  = "120";
                literature[10] = "145";
                literature[11] = "156";
                return  "1)" + literature[11] + "\n" +
                        "2)" + literature[9] + "\n" +
                        "3)" + literature[10] + "\n" +
                        "4)" + literature[8] + "\n";
            case 4:
                literature[12] = "Miguel de Cervantes";//correcta
                literature[13] = "Stephen King";
                literature[14] = "Mark Twain";
                literature[15] = "Pablo Neruda";
                return  "1)" + literature[13] + "\n" +
                        "2)" + literature[12] + "\n" +
                        "3)" + literature[14] + "\n" +
                        "4)" + literature[15] + "\n";
            case 5:
                literature[16] = "The Holy Bible";//correcta
                literature[17] = "Necromicon";
                literature[18] = "one hundred years of solitude";
                literature[19] = "The little Prince";
                return  "1)" + literature[16] + "\n" +
                        "2)" + literature[17] + "\n" +
                        "3)" + literature[18] + "\n" +
                        "4)" + literature[19] + "\n";
        }
        return "";
    }
    public String science(int aleatory) {
        String science[] = new String[20];
        //Science
        switch (aleatory) {
            case 1:
                science[0] = "Isaac Newton";//correcta
                science[1] = "Galileo";
                science[2] = "Copernico";
                science[3] = "Albert Einstein ";
                return  "1)" + science[0] + "\n" +
                        "2)" + science[1] + "\n" +
                        "3)" + science[2] + "\n" +
                        "4)" + science[3] + "\n";
            case 2:
                science[4] = "Albert Einstein ";//correcta
                science[5] = "Nicolas Tesla";
                science[6] = "Charles Darwin";
                science[7] = "Pasteur";
                return  "1)" + science[6] + "\n" +
                        "2)" + science[5] + "\n" +
                        "3)" + science[4] + "\n" +
                        "4)" + science[7] + "\n";
            case 3:
                science[8] = "Albert Einstein";//correcta
                science[9] = "James Walt";
                science[10] = "Michael Faraday";
                science[11] = "Pythagoras";
                return  "1)" + science[11] + "\n" +
                        "2)" + science[9] + "\n" +
                        "3)" + science[10] + "\n" +
                        "4)" + science[8] + "\n";
            case 4:
                science[12] = "Nicolas Copernico";//correcta
                science[13] = "Gauss Jordan";
                science[14] = "Arquimedes";
                science[15] = "Michael Faraday";
                return  "1)" + science[13] + "\n" +
                        "2)" + science[12] + "\n" +
                        "3)" + science[14] + "\n" +
                        "4)" + science[15] + "\n";
            case 5:
                science[16] = "James Chadwick";//correcta
                science[17] = "Carl Anderson";
                science[18] = "Clinton Joseph";
                science[19] = "Enrico Fermi";
                return  "1)" + science[16] + "\n" +
                        "2)" + science[17] + "\n" +
                        "3)" + science[18] + "\n" +
                        "4)" + science[19] + "\n";
        }
        return "";
    }
}