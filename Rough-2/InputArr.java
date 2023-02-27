import java.util.*;
class InputArr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
inr n=s.nextInt();
ArrayList<String>arr=new ArrayList<String>();
for(int i=0;i<n;i++)
	arr.add(i,s.next());
arr.shuffle();
System.out.println(arr);

}
}