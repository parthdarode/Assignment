class A 
{
    int a = 2;
    A()
    {
        System.out.println("Inside zero parameterized constructor");
        a = 3;    // cannot change value
    }
    A( int a)
    {
        this.a = a;   // cannot change value
   }
    final void display()  // give error because it is final we cant not override
    {   
        a = 5;
        System.out.println(a);
    }
}
class B extends A 
{
    B()
    {
       System.out.println("Inside zero parameterized constructor");
    }
    B(int a)
    {
        this.a = a;
    }
    void display()
    {
      a = 6;  
      System.out.println(a);  
    }
}
class Program19
{
    public static void main(String Arg[])
    {
       // A obj = new A();
        //obj.display();

        B obj1 = new B();
        obj1.display();
        

    }

}