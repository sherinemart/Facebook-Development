class Calc
{
 static int a=776;


 static int cube(int x)
{
 System.out.println(a);
 return x*x*x;

}

public static void main(String args[])
{
  int r=Calc.cube(5);
  System.out.println("The cube of a number:" +r);

}
}