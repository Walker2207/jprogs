class Sample
{
 private int a=1;
 private static int x=2;
 int b=10;
 static int y=20;
}
 
class StaticData
{ 
 public static void main(String...arg)
 {
  Sample.y=201;
  Sample s=new Sample();
  System.out.println(s.b);
  System.out.println(s.y);
 }
}
