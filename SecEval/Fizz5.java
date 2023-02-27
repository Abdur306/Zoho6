import java.util.*;
class Fizz5{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
//int in=s.nextInt();
for(int i=1;i<=50;i++){
if(i%3==0 && i%5==0)
	System.out.println("FizzBuzz");
else if(i%3==0)
     System.out.println("Fizz");
 else if(i%5==0)
	 System.out.println("Buzz");
 else
	 System.out.println(i);
}
}
}