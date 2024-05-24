
class Parent{
    void property(String owner){
        System.out.println("This is property belongs to "+owner);
    }
}
class Son extends Parent{
    void raju(){
        property("Raju");
    }
}
class Daughter extends Parent{
    void sita(){
        property("sita");
    }
}
class Main{
    public static void main(String[] args)
    {
        Son son=new Son();
        Daughter daughter=new Daughter();
        son.raju();
        daughter.sita();
    }
}