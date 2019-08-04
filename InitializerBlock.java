class Sample
{
 static
 {
  System.out.println("static-1");
 }

 {
  System.out.println("initilaizer-1");
 }

 Sample()
 {
  System.out.println("default constructor");
 }

 static
 {
  System.out.println("static-2");
 }
 
 Sample(int n)
 {
  System.out.println("parameterized constructor");
 }
 
 {
  System.out.println("initilaizer-2");
 }
}


class InitializerBlock
{
 public static void main(String...arg)
 {
  System.out.println();
  new Sample();
  System.out.println();
  new Sample(10);
 }
}