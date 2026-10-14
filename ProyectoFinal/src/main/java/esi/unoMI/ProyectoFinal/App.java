package esi.unoMI.ProyectoFinal;

import at.favre.lib.crypto.bcrypt.BCrypt;
import java.util.Scanner;

public class App {



    public static void main(String[] args) {
        System.out.println("Hello, world!");
        App appClass = new App();
    }
        
    
    public int checkLogin(String user, String pass) {
		
    	int returnUser = -1;
    	
    	if (user == "caja") {
    		String hash = "$2a$12$Fevk3pWomlZg/y5iakgasOCoPQZz5I64o33IpJBF9EVxLYRoofUaO";
    		if (BCrypt.verifyer().verify(pass.toCharArray(), hash).verified == true)
    			returnUser = 0;
    		
    	} 
    	else if (user == "stock") {
    		String hash = "$2a$12$1Pe.yHvd16no./CdEL6eQu.Zdp8VKp7Dp39UCsnQGWeHZ4ai5px9.";
    		if (BCrypt.verifyer().verify(pass.toCharArray(), hash).verified == true)
    			returnUser = 0;
    		
    	}
    	
    	return returnUser;
    	
    }
    

}