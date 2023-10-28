class Excp1{
public static void main(String[] args){
int [] a= new int [5];
int b=0;
try{
System.out.println(a[7]/b);
}
catch(ArithmeticException e){
System.out.println("Can't divide by zero");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array Index Out Of Bounds ");
}
System.out.println("Done");
}
}

//multiple catch