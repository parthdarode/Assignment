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
    void setvalue(int x)
    {
        System.out.println("Inside set Method");
        a = x;
        
        
    }

}


class Program2
{
    public static void main(String Arg[])
    {
        A obj1 = new A();
        A obj2 = new A(10);
        obj2.setvalue(50);
        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(obj2.a);

         //System.out.println(obj2.a);  // 10 (before change)
        //obj2.setvalue(50); 
        //System.out.println(obj2.a);  // 50 (after change)
        

    }
}