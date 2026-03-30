class A
{
     final int a = 2;

    A()
    {
    System.out.println("Inside default constrcutor");
    //a = 2 -> assign value only once
    //a = 5;  -> cannot do it
     // a = 6;  -> cannot do it
      
    }
    void display()
    {
       System.out.println(a);
    }

}

class Program1
{
  public static void main(String Arg[])
  {
     A obj = new A();
     obj.display();
  }

}