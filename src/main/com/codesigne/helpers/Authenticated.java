package main.com.codesigne.helpers;


import main.com.codesigne.entities.Agent;
import main.com.codesigne.entities.Person;

public class Authenticated {

    private Person loggedInUser;
    private String role;

    public Person getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(Person loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
