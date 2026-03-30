class A 
{
   final int a = 2;
    A()
    {
        System.out.println("Inside zero parameterized constructor");
        a = 3;    // cannot change value
    }
    A( int a)
    {
        this.a = a;   // cannot change value
   }
    void display()
    {
        System.out.println(a);
    }
}
class Program18
{
    public static void main(String Arg[])
    {
        A obj = new A();
        obj.display();
    }

}