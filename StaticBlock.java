class Sample
{
 int n=1;
 static int x=2;
 
 Sample(){}
 Sample(int n)
 {
  System.out.println("\ninside constructor..");
  System.out.println("\nn : "+this.n);
  System.out.println("\nx : "+x);
 }

 static void show()
 {
  System.out.println("\ninside show..");
  System.out.println("\nx : "+x);
 }
 
 static
 {
  System.out.println("\ninside static block..");
  System.out.println("\nx : "+x);
  x=20;
 }
}


class StaticBlock
{
 public static void main(String...arg) throws ClassNotFoundException
 {
  Sample s;
  
  Class.forName("Sample");
 }
}