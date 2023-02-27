import java.util.*;
class Arradd{
public static void main(String[] abu){
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int a[]=new int [size];
for(int i=0;i<size;i++)
	a[i]=s.nextInt();
String str="";int n=0;
for(int i=0;i<size;i++){
	 n=n*10+a[i];
     	 
}
n+=1;
//System.out.println(n);
str+=n;
char c[]=str.toCharArray();
for(char data:c)
System.out.print(data);

}
}