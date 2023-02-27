import java.util.*;
class AddSum6{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();

add(a,n);
}
public static void add(int a[],int n){
	int sum=0;
	for(int i=0;i<n;i++){
   for(int j=0;j<=i;j++){
   if(j==0)	   
		System.out.print(a[j]);
	else
		System.out.print("+"+a[j]);
		sum+=a[j];
   }
	System.out.println("="+sum);
	 sum=0;
	}	        
}
}