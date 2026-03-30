class Animal
{
    void Sound()
    {
        System.out.println("Animal sounds");
    }
}
class Dog extends Animal
{
    void Sound()
    {
        System.out.println("Dog Barks");
    }
}
class Program12
{
    public static void main(String Arg[])
    {
        Dog obj = new Dog();
        obj.Sound();
    }
}

// method overriding