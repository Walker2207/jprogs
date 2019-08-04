class main
{
 public static void main(String arg[])
 {
  System.out.println("\nexecutable main..");
  new main();
  new main(null);
 }

 public main()
 {
  System.out.println("\ndefault constructor..");
 }

 public main(String arg[])
 {
  System.out.println("\nparameterized constructor..");
 }
}
  