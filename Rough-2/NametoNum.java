\import java.util.*;
class NametoNum{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
int result=0;
for(int i=0;i<str.length();i++){
	result*=26;
	result+=str.charAt(i)-'A'+1;
}
System.out.println(result);
/*int n=s.nextInt();
int rev=0;int remain;
for(int i=0;i<n;i++){
	remain=n%10;
	rev=rev*10+remain;
	n/=10;
}
System.out.println(rev);*/
}
}
