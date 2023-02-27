import java.util.*;
class SortingQ3{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String str[]=new String[n];
char c[]=new char[n];
for(int i=0;i<n;i++){
	str[i]=s.next();
   c[i]=str[i].charAt(0);
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(c[i]>c[j]){
	char temp=c[i];
	c[i]=c[j];
	c[j]=temp;
	
}
}
}
String str2[]=new String[n];
for(int i=0;i<n;i++){
	if(c[i]==str[i].charAt(0)){
	str2[i]=str[i];	
	}
	}
//Arrays.sort(str);
for(int i=0;i<n;i++){
System.out.print(str2[i]+" ");
}
}
}