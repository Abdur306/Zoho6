import java.util.*;
class AsDes1{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n;i++){
	for(int j=0;j<n-1-i;j++){
	if(a[j]>a[j+1]){
     int temp=a[j];
      a[j]=a[j+1]; 
	  a[j+1]=temp;
	}
	}
}
int mid=n/2;
for(int i=0;i<mid;i++)
	System.out.print(a[i]+" ");
for(int i=n-1;i>=mid;i-- )
	System.out.print(a[i]+" ");

}
}