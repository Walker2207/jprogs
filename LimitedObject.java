class Sample
{
 private static Sample s;
 private int val;
 private static int count=0;

 private Sample() 
 {
  count++;
 }

 void set(int val)
 {
  this.val=val;
 }

 void print()
 {
  System.out.println("val : "+val);
 }

 static Sample getObject()
 {
  if(count<3)
  {
   s=new Sample();
   return s;
  }
  return null;
 }

 public String toString()
 {
  return val+"";
 }

}

class LimitedObject
{
 public static void main(String...arg)
 {
  Sample x,y,z,a;

  x=Sample.getObject();
  y=Sample.getObject();
  z=Sample.getObject();
  a=Sample.getObject();

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);
  System.out.println("a : "+a);

  x.set(10);
  y.set(20);
  z.set(30);

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);
  System.out.println("a : "+a);
  System.out.println();

 }
}
