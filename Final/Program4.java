final class A 
{
    int a = 2;

    A()
    {
        System.out.println("Inside default");
        a = 3;
    }
    A(int a)
    {
        System.out.println("Inside parameterized constrcutor");
        this.a = a;

    }
    void display()
    {
        System.out.println(a);
    }

}
class Program4
{
    public static void main(String Arg[])
    {
        A obj = new A();
        obj.display();

        A aobj1 = new A(10);
        aobj1.display();
    }
}


//Final variable
=>//Cannot modify value once assigned

//Final method
=> //Cannot override in child class

//Final class
=>//Cannot inherit (extend)
  //But we can create object and use it
  // We can change variable values only if they are not final