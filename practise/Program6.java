class A 
{
    public int a;
    public int b;
    public int c;

    A()
    {
        System.out.println("0 Parameterized constrcutor");
        a = 1;
        b = 2;
        c = 3;
        
    }
    A(int a,int b, int c)
    {
        System.out.println(" Parameterized constrcutor");
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
class B extends A 
{
    int d;

    B()
    {
        //super();   // by default base 0 parameterized constructor runs
        System.out.println("0 Parameterized constrcutor");
         d = 7;
    }
    B(int a, int b, int c, int d)
    {
        //super();    // by default base 0 parameterized constructor runs
        System.out.println("Parameterized constrcutor");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    void display1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class Program6
{
    public static void main(String Arg[])
    {
        A obj1 = new A();
        obj1.display();

        A obj2 = new A(4,5,6);
        obj2.display();

        B obj3 = new B();
        obj3.display1();

        B obj4 = new B(8,9,10,11);
        obj4.display1();
        
    }
}