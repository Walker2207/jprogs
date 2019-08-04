import dmatics.*;
import dmatics.math.*;

class PkgDemo
{
 public static void main(String...arg)
 {
  Record x,y,z;
  x=new Record();

  x.set("tommy",20,1234.23);
  y=new Record("Dwight",25,21234.23);
  z=new Record();
  z.get();
 
  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);
  System.out.println();
  System.out.println("\n\n");

  Complex c,d,e;
  c=new Complex();
  c.get();
  d=new Complex(1.5,2.5);
  e=Complex.add(c,d);
  System.out.println();
  System.out.println("c : "+c);
  System.out.println("d : "+d);
  System.out.println("e : "+e);
 }
}  