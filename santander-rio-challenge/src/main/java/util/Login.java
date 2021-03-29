package main.java.util;

import main.java.models.Credentials;

public class Login {

    public static boolean main(Credentials credentials){
        Boolean access = false;
        try{
            if(credentials != null && (!credentials.getUsername().isEmpty() && !credentials.getPassword().isEmpty())){
                access = true;
            }
        }catch(Exception e){
            System.out.println("Error en Login Java: "+e);
        }

        return access;
    }

}
