import java.util.Scanner;

class Complex
{
 private float real, imag;

 Complex(){}

 Complex(double real,double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
 }

 Complex(Complex c)
 {
  real=c.real;
  imag=c.imag;
 }

 void set(double real, double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
 } 

 void get()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println();
  System.out.print("Enter Real part : ");
  real=sc.nextFloat();
  System.out.print("Enter Imag part : ");
  imag=sc.nextFloat();
 }
 void print()
 {
  System.out.println("[" + real + "," + imag + "i]");
 }

 public String toString()
 {
  return String.format("[%.2f,%.2fi]",real,imag);
 }

 Complex add(Complex c)
 {
  Complex d=new Complex();
  d.real=real+c.real;
  d.imag=imag+c.imag;
  return d;
 }
 static Complex add(Complex c, Complex d)
 {
  Complex e=new Complex();
  e.real=c.real+d.real;
  e.imag=c.imag+d.imag;
  return e;
 }
 Complex subtract(Complex d)
 {
  Complex p=new Complex();
  p.real=real-d.real;
  p.imag=imag-d.imag;
  return p;
 }
 static Complex subtract(Complex a,Complex b)
 {
  Complex s=new Complex();
  s.real=a.real-b.real;
  s.imag=a.imag-b.imag;
  return s;
 }
}