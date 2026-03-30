final class A // error because class is final we cannot inherit
{
    int a;
    A()
    {
        System.out.println("Inside zero parameterized constructor");
       
    }
    A( int a)
    {
        this.a = a;   // cannot change value
   }
    void display()  // give error because it is final we cant not override
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

class Program21
{
    public static void main(String Arg[])
    {
        A obj = new A();
        obj.display();
        obj.a = 10;
        System.out.println(obj.a);  // we can chage the value in final class also but we can not inherit it

        //B obj1 = new B();
       // obj1.display();
      
        

    }

}