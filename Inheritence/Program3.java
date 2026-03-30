class A 
{
   A()
   {
    //super();
    System.out.println("in A");
   }
   A(int n)
   {
    //super();
    System.out.println("in * A");
   }
}
class B extends A 
{
   B()
   {
    //super();
    System.out.println("in B");
   }
   B(int n)
   {
    //super();
    System.out.println("in * B");
   }
}
class Program3
{
    public static void main(String Arg[])
    {
        A obj1 = new A();
        A obj2 = new A(10);
        B obj3 = new B();
        B obj4 = new B(11);
    }
}