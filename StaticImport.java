import static java.lang.System.*;

class StaticImport
{
 public static void main(String...arg)
 {
  out.println("\nwithout using System..");
  System.out.println("\nusing system..");
  exit(0);
  err.println("/nunreachable code..");
 }
}