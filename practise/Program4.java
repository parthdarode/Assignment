class A 
{
    public int a;
    private int b;
    protected int c;

    A()
    {
        System.out.println("0 Parameterized constrcutor");
        a = 1;
        b = 2;
        c = 3;
        
    }
    A(int a,int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class Program4
{
    public static void main(String Arg[])
    {
        A obj1 = new A();
        obj1.display();
        
    }
}