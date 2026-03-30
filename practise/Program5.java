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
class Program5
{
    public static void main(String Arg[])
    {
        A obj1 = new A();
        obj1.display();

        A obj2 = new A(4,5,6);
        obj2.display();
        
    }
}