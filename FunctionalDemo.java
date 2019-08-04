interface Message
{
 void show(String s);
}

class Sample implements Message
{
 public void show(String str)
 {
  System.out.println(str);
 }
}


class FunctionalDemo
{
 public static void main(String...arg)
 {
  System.out.println();
  Sample s=new Sample();
  s.show("using a class");
  
  Message m=new Message(){
                          public void show(String msg)
                          {
			   System.out.println(msg);
                          }
                         };
 m.show("using anonymous class...");
 
 Message f=(str)->System.out.println(str);
 f.show("using functional programming..");
 System.out.println();
 }
}