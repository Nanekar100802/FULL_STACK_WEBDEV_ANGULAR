abstract class Animal
{
    abstract void sound();
    
}
class Tiger extends Animal
{
    void sound()
    {
        System.out.println("Tigers Sound");
    }
}
class Lion extends Animal
{
    void sound()
    {
        System.out.println("Lions Sound");
    }
}
class Test{
     public static void main(String args[])
    {
        Tiger ob=new Tiger();
        ob.sound();
        Lion ob1=new Lion();
        ob1.sound();
    }
}