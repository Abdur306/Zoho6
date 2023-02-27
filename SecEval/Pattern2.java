import java.util.*;
class Pattern2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String temp="";
int k=1;
int c=0;
String str[]=new String[n];
for(int i=0;i<n;i++){
	for(int j=0;j<=i;j++){
		if(j!=0){
			temp+="*"+k;
			System.out.print("*"+k++);
		}
		else{
		temp+=k;
		System.out.print((k++));
		}
		if(j==i)
			System.out.println();
	}
	str[c++]=temp;
	temp="";
}
for(int i=str.length-1;i>=0;i--){
	System.out.println(str[i]);
}

}
}