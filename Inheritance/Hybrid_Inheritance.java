interface LandAnimal{
    void move();
}
interface AquaticAnimal{
    void swim();
}
class Animal{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Lion extends Animal implements LandAnimal{
    public void move(){
        System.out.println("Lion is moving on land");
    }  
    }
class SeaLion extends Lion implements AquaticAnimal{
    public void swim(){
        System.out.println("Sea Lion is swimming in water");
    }
}
class Fish implements AquaticAnimal{
    public void swim(){
        System.out.println("Fish is swimming in water");
    }
}
public class Hybrid_Inheritance{
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.eat();
        lion.move();
        Fish fish=new Fish();
        fish.swim();
        SeaLion sealion=new SeaLion();
        sealion.eat();
        sealion.move();
        sealion.swim();;
    }
}

