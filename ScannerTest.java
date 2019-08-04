import java.util.*;

class ScannerTest
{
 public static void main(String...arg)
 {
  Scanner sc=new Scanner(System.in);
  
  String nam;
  int age;

  System.out.println();

  System.out.print("Enter Age  : ");
  age=sc.nextInt(); 
  sc.nextLine(); 
  System.out.print("Enter name : ");   
  nam=sc.nextLine();

  System.out.println();
  System.out.println("Name     : "+nam);
  System.out.println("Age      : "+age);
  System.out.println();
 }
}