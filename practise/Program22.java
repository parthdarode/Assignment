class A 
{
    static int a;
    static
    {
      a =  3;
    }
   
    void fun()
    {
        System.out.println(a);   // after creating a obj we can acess a static data
    }

}
class Program22
{
   public static void main(String Arg[])
   {
    A obj = new A();
    obj.fun();
   }
}