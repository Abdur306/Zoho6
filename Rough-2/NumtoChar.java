import java.util.*;
class NumtoChar{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String str="";
int res=0;
while(n>0){
	char c=(char)((n-1)%26+'A');
	n=(n-1)/26;
	str=c+str;
	}
	System.out.println(str);
}
}