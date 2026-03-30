class A 
{
    static int a;
    int b;

    static
    {
      a =  1;
    }
    A()
    {
        b = 3;
    }
    void fun()
    {
        System.out.println(a);
        System.out.println(b);
    }
    static void Gun()
    {
        System.out.println(a);
        //System.out.println(b);
    }

}
class Program23
{
   public static void main(String Arg[])
   {
    A obj = new A();
    obj.fun();
    obj.Gun();
   }
}