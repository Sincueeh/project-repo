package main.test.java;

import main.java.models.Credentials;
import main.java.util.Login;

public class TEST_LoginOK {

    public static void main (String[] args){
        Credentials credentials = new Credentials();
        boolean correct = false;

        correct = Login.main(credentials);

        if(correct){
            System.out.println("Login Correcto");
        }else{
            System.out.println("Login Fallido");
        }

    }
}
