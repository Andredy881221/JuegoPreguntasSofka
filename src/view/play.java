package view;

import controller.Users;
import controller.Answers;
import controller.Questions;
import controller.Validation;
import model.Historical;

import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        //variables
        int optionList = 0;
        Scanner scanner = new Scanner(System.in);
        String saveFirstName;
        String saveLastName;
        int responsetUser;
        int persist;
        boolean flag = true;

        //declaring objects
        Users users;
        Questions questions;
        Answers answers;
        Validation validation;
        Historical historical;

        answers = new Answers();
        validation = new Validation();
        historical = new Historical();


        //input validation
        do {
            System.out.println("-------------------------------");
            System.out.println("WHO WANTS TO BE A MILLONAIRE");
            System.out.println("Choose an option");
            System.out.println("-------------------------------");
            System.out.println("1-View History \n2-Start Game \n3- Exit");
            System.out.println("-------------------------------");
            optionList = scanner.nextInt();
        }while((optionList != 1) && (optionList != 2) && (optionList != 3));


        if(optionList == 1){
            System.out.println("View History");
            historical.reading();
        }
        else if(optionList == 2){
            System.out.println("Start");
            System.out.println("Enter First Name");
            saveFirstName = scanner.next();
            System.out.println("Enter Last Name");
            saveLastName = scanner.next();
            users = new Users(saveFirstName,saveLastName);
            questions = new Questions();
            System.out.println(users.getAwards());



            while (flag){
                System.out.println(questions.random(users.getAwards()));

                System.out.println(answers.getAnswers(questions.getAleatory(), questions.getCat()));
                System.out.println("Choose the correct option");
                responsetUser = scanner.nextInt();

                //validation = new Validation();
                //System.out.println(validation.validationResponse(questions.getCat(), questions.getAleatory(), responsetUser));



                if(validation.validationResponse(questions.getCat(), questions.getAleatory(), responsetUser)){//validamos si la respuesta es correcta
                    users.setAwards(100);
                    System.out.println("Awards progress: " + users.getAwards());
                    if(users.getAwards() > 400){
                        System.out.println("You won the game");
                        System.out.println("Name: " + users.getFirstName() + "   Awards: " + users.getAwards());
                        historical.writing(users.getFirstName(), users.getLastName(), users.getAwards());
                        break;
                    }
                    System.out.println("Do you wish to continue");
                    System.out.println("1) Si \n2) No");
                    persist = scanner.nextInt();
                    if(persist == 1){
                        continue;
                    }
                    else if(persist == 2){
                        System.out.println("The game is over");
                        System.out.println("Name: " + users.getFirstName() + "   Awards: " + users.getAwards());
                        flag = false;
                        historical.writing(users.getFirstName(), users.getLastName(), users.getAwards());
                    }
                }
                else {
                    users.setAwards(-users.getAwards());
                    System.out.println("You lost the game");
                    System.out.println("Name: " + users.getFirstName() + "   Awards: " + users.getAwards());
                    flag = false;
                    historical.writing(users.getFirstName(), users.getLastName(), users.getAwards());
                }
            }



        }
        else{
            System.out.println("Exit");
        }

    }
}
