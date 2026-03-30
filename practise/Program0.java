class A 
{
    int a;
    A()
    {
        System.out.println("Inside Default constrcutor");
        a = 3;
        System.out.println(a);

    }
    A(int a)
    {
        System.out.println("Inside parameterized constructor");
        this.a = a;
        System.out.println(a);
      
        
    }
}


class Program0
{
    public static void main(String Arg[])
    {
        A obj1 = new A();
        A obj2 = new A(10);
        obj2.a = 11;  //  => Yes updates in object, but constructor does NOT run again.
        

    }
}