import java.util.*;

class SortingQ4{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("Enter the n");
int n=s.nextInt();
System.out.println("Enter the k");
int k=s.nextInt();
int a[]=new int[n];
int b[]=new int[20];
int count=0;
System.out.println("Enter elements");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<19;i++)
	b[i]=i;
for(int i=0;i<n;i++){
	for(int j=0;j<19;j++){
		if(a[i]==b[j]){
			b[j]=0;
			count++;
		}
	}
}
boolean res=true;
for(int i=0;i<19;i++){
	if(k==i-count && res){
		System.out.println(b[i]+"  ");
		res=false;
		break;
		}
}

}
}
