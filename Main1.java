import java.util.function.Supplier;

class Base
{
    void animal()
    {
        System.out.println("This is an animal");
    }

}
class Sub extends Base
{
    void animal()
    {
        super.animal(); 
        System.out.println("IM A LION");
    }
}
class Main1{
    public static void main(String args[])
    {
        Base obj=new Sub();
        obj.animal();
    }
}