class Sample implements Cloneable
{
 private int n;
 private Complex c;
 
 Sample()
 { 
  System.out.println("\nDefalut constructor..");
 }

 Sample(int n,double real,double imag)
 {
  System.out.println("\nparameterized Constructor..");
  this.n=n;
  c=new Complex(real,imag);
 }

 void set(int n,double real,double imag)
 {
  this.n=n;
  c.set(real,imag);
 }

 public String toString()
 {
  return n+","+c;
 }
 
 public Sample clone() throws CloneNotSupportedException
 {
  Sample s=(Sample)super.clone();
  s.c=new Complex(c);
  return s;
 }
}

class DeepCloning
{
 public static void main(String...arg)
 {
  Sample x,y;
  x=new Sample(10,2.5,7.3);

  System.out.println("\ncloning Object..");
  
  try
  {
   y=x.clone();
  }
  catch(CloneNotSupportedException e)
  {
   System.err.println("\nCloning failed..\n");
   y=null;
  } 

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
 
  y.set(20,1.1,2.3);
  
  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println();
 }
}