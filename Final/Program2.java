class A
{
    int a;

    A()
    {
      System.out.println("Inside default constrcutor");
      a = 2;
      //a = 5;  -> cannot do it
     // a = 6;  -> cannot do it
     
    }

     final void display()
    {
       System.out.println(a);
    }


}
class B extends A 
{ 
   int c;

   B()
   {
    System.out.println("Inside  derived default constructor");
    c = 3;
   
   }
   B(int c)
   {
    System.out.println("Inside derived parameterized constrcutor");
    this.c = c;
    }
   
   void display()    // error due to final keyword
   {
    System.out.println(a);
    System.out.println(c);
   }

}
class Program2
{
  public static void main(String Arg[])
  {
    

     B bobj  = new B();
     bobj.display();

     B bobj2 = new B(10);
     bobj2.display();
  }

}