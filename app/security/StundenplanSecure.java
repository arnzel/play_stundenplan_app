package security;

import controllers.Secure;

public class StundenplanSecure extends Secure.Security{
	
	static boolean authenticate(String username,String password){
		if(username.equals("admin") && password.equals("wurstsalat")){
			return true;
		}else{
			return false;
		}
	}

}
