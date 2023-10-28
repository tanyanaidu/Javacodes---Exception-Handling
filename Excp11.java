class Excp11{
public static void main(String[] args){
int a= 4,b=0;
System.out.println("Tanya");
try{
System.out.println(a/b);
}
catch(ArithmeticException e){
System.out.println("Can't divide by zero");
}
System.out.println("Done");
}
}

//example