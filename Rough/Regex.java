import java.util.*;
class Regex{
public static void main(String [] args){

}

public static boolean validate(String str){
	String regex="^(?.*[0-9])"+"(?.*[a-z])(?.*[A-Z])"+"(?.*[!@#$])"+"(?=\\S+$).{6,10}$";
	Pattern p=Pattern(regex);
	Matcher m=p.Matcher(passsword);
	
}
}