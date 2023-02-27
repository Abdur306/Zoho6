import java.util.*;
class SelectSorting{
public static void main(String []abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int count=0;
for(int i=0;i<n;i++){
	int index=i;
	for(int j=i+1;j<n;j++){
	if(a[j]<a[index]){
     index=j;
	 count++;
	}			
	}
	if(count<=2){
	int temp=a[index];
	a[index]=a[i];
	a[i]=temp;
	}
	else{
		System.out.println("Not possible");
		break;
	}
}
if(count<=2){
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
System.out.println("the count is : "+count);
}
}
}
}
