class CmdArg
{
 public static void main(String []arg)
 {
  System.out.println("\ncount of Argument : "+ arg.length);
  
  for(int i=0;i<arg.length;i++)
  {
   System.out.printf("\nArgument #%d : %s",i+1,arg[i]);
  }

  System.out.println();
  }
}