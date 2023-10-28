import java.io.IOException;
class Exxp114{

public void show() throws IOException{
throw new IOException();
}
public static void main(String[] args){
Exxp114 i = new Exxp114();
try{
i.show();
}
catch(IOException ex){
System.out.println("IO Error");
}
}
}