import java.util.*;
class RoughMin{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=1;i<n;i++){
	a[i]=s.nextInt();
}
	int max=0;
for(int i=0;i<n-1;i++){
	if(a[i]<a[i+1]){
		max=a[i+1];
	}
	else{
		continue;
	}
	}
	for(int i=0;i<n;i++){
		if(a[i]>max)
			a[i]=max;
	}
	System.out.print(Arrays.toString(a));
}
}