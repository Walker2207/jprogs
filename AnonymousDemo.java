interface Sample
{
 default void show(String msg)
 {
  System.out.println("\nSample : "+msg);
 }
}

class AnonymousDemo
{
 public static void main(String...arg)
 {
  Sample s;
  //s=new Sample();
  s=new Sample(){};
  s.show("using anonymous class..");
  System.out.println();
 }
}