interface Alfa
{
 int x=10;
 void print();
 static void show()
 {
  System.out.println("Alfa[x]  : "+x);
 }
 static void main(String...arg)
 {
  System.out.println("\nexecutable interface..");
 }
}

class Sigma implements Alfa
{
 public void print()
 {
  System.out.println("Sigma[x] : "+x);
 }
}



class StaticInterface
{ 
 public static void main(String...arg)
 {
  Alfa.show();
  Alfa a=new Sigma();
  a.print();
 }
} 