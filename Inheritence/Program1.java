class First
{
    int a;
    int b;

    First()
    {

    }
    First(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void display1()
    {
      System.out.println(a);
      System.out.println(b);

    }
}
class Second extends First
{
    int c;
    
    Second()
    {

    }
    Second(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void display2()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
class Third extends Second
{  
    int d;
    Third()
    {

    }
    
    Third(int a,int b,int c,int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    void display3()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
class Program1
{
    public static void main(String Arg[])
    {
             First obj1 = new First(10,11);
             obj1.display1();

             Second obj2 = new Second(12,13,14);
             obj2.display2();

             Third obj3 = new Third(15,16,17,18);
             obj3.display3();

    }
}