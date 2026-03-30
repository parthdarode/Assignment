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
        System.out.println("Inside  parameterized constructor");
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
class B extends A 
{
    B()
    {
        System.out.println("Inside zero parameterized constructor");
    }
    void display1()
    {
        System.out.println(a);   //acess
       //System.out.println(b);   // not acess
       System.out.println(c);   //acess
       System.out.println(d);   //acess
    }
}
class C extends  B
{
    C()
    {
        System.out.println("Inside zero parameterized constructor");
    }
    void display2()
    {
        System.out.println(a);   //acess
      // System.out.println(b);   // not acess
       System.out.println(c);   //acess
       System.out.println(d);   //acess
    }
}

class Program17
{
    public static void main(String Arg[])
    {
        C obj = new C();
        obj.display2();

    }
}

/*
How it works step by step
C() constructor runs
First line is implicitly super(); → calls B() constructor
B() constructor runs
First line is implicitly super(); → calls A() constructor
A() constructor runs → prints message
B() body runs, then C() body runs
*/