class Excp22{
public static void main(String[] args){
int [] a= new int [5];
try{
System.out.println(a[7]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array Index Out Of Bounds ");
}
System.out.println("Done");
}
}

//example