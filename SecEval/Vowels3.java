import java.util.*;
class Vowels3{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
String temp="";
for(int i=0;i<str.length();i++){
	if((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')||(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')){
	if(str.charAt(i+1)=='a' || str.charAt(i+1)=='e' || str.charAt(i+1)=='i' || str.charAt(i+1)=='o' || str.charAt(i+1)=='u'||str.charAt(i+1)=='A' || str.charAt(i+1)=='E' || str.charAt(i+1)=='I' || str.charAt(i+1)=='O' || str.charAt(i+1)=='U'){
		temp+=str.charAt(i);
        temp+=str.charAt(i+1);		
	}else{
		continue;
	}
	}
	else{	
		temp+=str.charAt(i);
}
}
System.out.println(temp);
}
}