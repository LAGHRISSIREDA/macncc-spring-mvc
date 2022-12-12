package com.codesigne.security;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class HashPass {


    static public String hashPassword(String password){
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }

    static public boolean verifyPassword(String password, String hashedPwd){
        return BCrypt.verifyer().verify(password.toCharArray(), hashedPwd).verified;
    }
}
