import java.util.*;
class AddRec{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
System.out.println(add(a,0));
}
public static int add(int a[],int index){
	int sum=0;
	if(index==a.length-1){
		return a[index];
	}
	
	 return a[index]+ add(a,index+1);
	
}
}