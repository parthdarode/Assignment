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
        a = a;      // only print the value in obj layout only 3 11 is storing
        System.out.println(a);
      
        
    }
}


class Program1
{
    public static void main(String Arg[])
    {
        A obj1 = new A();
        A obj2 = new A(10);
        obj2.a = 11; 
        System.out.println(obj2.a); //  => Yes updates in object, but constructor does NOT run again.
        

    }
}