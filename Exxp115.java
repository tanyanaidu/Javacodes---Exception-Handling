import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

class Exxp115{

public void show() throws FileNotFoundException,IOException,SQLException{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number ");
int a = sc.nextInt();

if (a>0)
throw new FileNotFoundException();

if (a<0)
throw new IOException();

if (a==0)
throw new SQLException();
}

public static void main(String[] args){
Exxp115 i = new Exxp115();
try{
i.show();
}

catch(FileNotFoundException x){
System.out.println("file Error");
}
catch(IOException ex){
System.out.println("IO Error");
}
catch(SQLException ex){
System.out.println("mast Error");
}
}
}