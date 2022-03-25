package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;


public class Historical {

    int awards;
    int cursor;
    String firstName;
    String lastName;


    public Historical(){
    }

    public void reading(){
        try{
            FileReader read = new FileReader("src//model//play.txt");

            while(cursor != -1){

                cursor = read.read();

                char converts = (char)cursor;

                System.out.print(converts);
            }

        }catch(IOException e){
            System.out.println("No File Found");
        }

    }

    public void writing(String firstName,String lastName,int awards){
        try{
            FileWriter writer = new FileWriter("src//model//play.txt",true);
            writer.write("Name: " + firstName + " , LastName: " + lastName + " , Awards: " + awards +  "\n");
            writer.close();

            System.out.println("Saved Successfully ");
        }catch(IOException e){
            System.out.println("Saved Error");
        }
    }




}

