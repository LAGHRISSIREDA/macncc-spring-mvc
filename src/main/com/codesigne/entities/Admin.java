package main.com.codesigne.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Admin {
    private long id;
    private String firsname;
    private String lastname;
    private String email;
    private String password;

}
