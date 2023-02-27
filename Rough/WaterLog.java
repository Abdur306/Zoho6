import java.util.*;
class WaterLog{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int res=0;
int left[]=new int[n];
int right[]=new int[n];
left[0]=a[0];
for(int i=1;i<n;i++){
	left[i]=left[i-1]>a[i]?left[i-1]:a[i];
System.out.println("left :"+left[i]);
}
right[n-1]=a[n-1];
for(int i=n-2;i>=0;i--){
	right[i]=right[i+1]>a[i]?right[i+1]:a[i];
System.out.println("right :"+right[i]);
}
for(int i=0;i<n;i++){
	res+=(left[i]<right[i]?left[i]:right[i])-a[i];
System.out.println(res);
}
}
}











/*
for(int i=1;i<n-1;i++){
	
	int left=a[i];
	for(int j=0;j<i;j++)
		left=a[j]>left?a[j]:left;
	
	int right=a[i];
	for(int j=i+1;j<n;j++)
		right=a[j]>right?a[j]:right;
	
	res+=(left<right?left:right)-a[i];
}
System.out.println(res);

}
}*/