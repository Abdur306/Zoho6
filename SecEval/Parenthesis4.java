import java.util.*;
class Parenthesis4{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int count=0;
for(int i=0;i<str.length();i++){
	if(str.charAt(i)=='(' || str.charAt(i)==')')
		count++;
}
if(count%2==0)
System.out.println("0");
else
	System.out.println("1");

}
}