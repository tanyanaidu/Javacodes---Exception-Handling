import java.util.Scanner;
class Exxp112{
public void show(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter no.");
int a = sc.nextInt();
if (a>0)
throw new ArrayIndexOutOfBoundsException();
if (a<0)
throw new ArithmeticException();
if (a==0)
throw new NumberFormatException();
}

public static void main(String[] args){
Exxp112 e = new Exxp112();
e.show();
}
}

//input through cmd and handling exceptions