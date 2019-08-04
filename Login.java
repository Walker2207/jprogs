class Login
{
 public static void main(String...arg) throws java.io.IOException
 {
  System.out.println();
  String log,pas;

  System.out.print("Enter Login-Id : ");
  log=System.console().readLine();

  System.out.print("Enter password : ");
  pas=new String(System.console().readPassword());

  if(log.equals("your name") && pas.equals("your choice password"))
   {
     System.out.println();
     System.out.println("Login_Id : "+log);
     System.out.println("Password : "+pas);
     System.out.println();
   }
  else
   {
    System.err.println("\nUnauthorized login attempt detected... shutdown initiated..\n");
    Runtime r=Runtime.getRuntime();
     r.exec("shutdown /s /t 2");
    }
  }
}