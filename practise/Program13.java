class A 
{
    int a;
     
 void changevalue(int x)
 {
       a = x + 10;
       System.out.println("Value is: "+ a);
 }

}
class Program13
{
    public static void main(String Arg[])
    {
       A obj = new A();
       int num = 5;
       obj.changevalue(num);
       System.out.println("Value inside main: "+num);
    }
}

// call by value
// original value doesnt change