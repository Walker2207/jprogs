import static java.lang.System.*;
class SystemDemo
{
 public static void main(String...arg)
 {
  System.out.println();
  System.out.println("O/S            : "+System.getenv("os"));
  System.out.println("Path           : "+System.getenv("path"));
  System.out.println();
  System.out.println("JDK ver.       : "+System.getProperty("java.version"));
  System.out.println("Operating Arch : "+System.getProperty("os.arch"));
  System.out.println("Operating Ver. : "+System.getProperty("os.version")); 
 }
}
