class ComplexDemo
{
 public static void main(String...arg)
 {
  Complex x,y,z,s;
  x=new Complex();
  x.set(1.5,2.7);  
  y=new Complex();
  y.get();
  
  z=Complex.add(x,y);
  s=Complex.subtract(x,y);

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);
  System.out.println("s : "+s);
  System.out.println();
 }
}