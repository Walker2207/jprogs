class Alfa
{ 
 private int n=10;
 
 void set(int x)
 {
  class Beta
  {
   void set()
   {
    n=x;
   }
   void show()
   {
    System.out.println();
    System.out.println("Beta[n] : "+n);
    System.out.println("Beta[x] : "+x);
   }
  }
  
  Beta b=new Beta();
  b.set();
  b.show(); 
 }

 void show()
 {
  System.out.println("Alfa[n] : "+n);
 }
}

class MethodLocal
{
 public static void main(String...arg)
 {
  Alfa a=new Alfa();
  a.set(25);
  a.show();
 }
}
