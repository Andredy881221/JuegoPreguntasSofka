package controller;

public class Users {
    int awards = 0;
    String firstName;
    String lastName;

    public Users(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards += awards;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsers(){
        return lastName + " " + firstName + " 💸💸 Awards: " + awards;
    }
}
