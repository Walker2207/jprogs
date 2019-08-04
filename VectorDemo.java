import java.util.*;
import java.util.stream.*;
import java.util.Arrays.*;

class VectorDemo
{
 public static void main(String...arg)
 {
  int x[]={20,45,10,15,20,35,10,20,15,40};
  x=Arrays.stream(x).distinct().toArray();
  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println();
  
  Vector <Integer>vct=new Vector<>();
  for(int n:x)
  vct.add(n);
  System.out.println();
  System.out.print("Items in Vector : ");
  for(int i=0;i<vct.size();i++)
  System.out.print(vct.get(i)+" ");
  System.out.println("\n");
 }
}