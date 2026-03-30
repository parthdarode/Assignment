class A 
{
    int a;
     
 void changeobject(A obj1)
 {
       this.a = obj1.a + 10;
       System.out.println("Value is: "+this.a);
 }

}
class Program14
{
    public static void main(String Arg[])
    {
       A obj = new A();
       obj.a = 5;
       obj.changeobject(obj);
       System.out.println("Value inside main: "+obj.a);
    }
}

// call by reference
// original value  change