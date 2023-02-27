import java.util.*;
class Dict7{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String temp="";
for(int i=0;i<str.length();i++){
	if(str.charAt(i)>=65 && str.charAt(i)<=90 ||str.charAt(i)>=97 && str.charAt(i)<=122 ){
		temp+=str.charAt(i);
	}
}
System.out.println(temp);
//char y[]=temp.toCharArray();
String str2=s.next();
boolean res=true;
for(int i=0;i<str2.length();i++){
	for(int j=0;j<str.length();j++){
	if(str2.charAt(i)==str.charAt(j))
	res=false;
}
}
if(res)
	System.out.println("0");
else
	System.out.println("-1");
}
}