class Excp2{
public static void main(String[] args){
try{
int a= Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);

System.out.println(a/b);

}
catch(ArithmeticException e){
System.out.println("Can't divide by zero");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array Index Out Of Bounds ");
}
catch(NumberFormatException e){
System.out.println("Can't convert ");
}
}
}

//input through cmd and handling exceptions