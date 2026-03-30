class A 
{
    public int a;
    private int b;
    protected int c;
    int d;                         // default acess specifier

    A()
    {
        System.out.println("Inside zero parameterized constructor");
    }
    A(int a,int b,int c,int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    void display()
    {
       System.out.println(a);   //acess
       System.out.println(b);   //acess
       System.out.println(c);   //acess
       System.out.println(d);   //acess

    }
}
class Program15
{
    public static void main(String Arg[])
    {
        A obj = new A();

        A obj1 = new A(10,20,30,40);
        obj1.display();
    }
}