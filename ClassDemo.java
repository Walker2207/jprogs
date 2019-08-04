class Complex
{
 private float real;
 float imag;
 
 void set(double real,double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
 
  print();
 }

 void print()
 {
  System.out.println("("+real+","+imag+"i)");
 }
}


class ClassDemo
{
 public static void main(String...arg)
 {

  Complex x,y;
  x=new Complex();
  y=new Complex();
  

    x.imag=2;

  x.set(10,20);
  y.set(1.5,2.3);
 }
}