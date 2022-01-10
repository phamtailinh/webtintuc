package Model;

public class User {

	 public boolean LoginValid(String username,String password){
	       if(username.equals("admin") && password.equals("admin")){
	           return true;
	       }else{
	           return false;
	       }
	    }
}
