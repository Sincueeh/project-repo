package main.java.util;

import main.java.models.Usuario;

public class Autenticar {

	public static Boolean auth(Usuario user) {
		
		Boolean access = false;
		
		if(user != null && user.getId() != 0) {
			access = true;
		}
		return access;
		
	}
}
