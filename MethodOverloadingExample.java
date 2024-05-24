public class MethodOverloadingExample {
    static void display() {
        System.out.println("No parameters");
    }
    static void display(int num) {
        System.out.println("Parameter: " + num);
    }
    static void display(int num1, int num2) {
        System.out.println("Parameters: " + num1 + ", " + num2);
    }

    
    static void display(String str) {
        System.out.println("Parameter: " + str);
    }

    public static void main(String[] args) {
       
        display();            
        display(10);         
        display(20, 30);      
        display("Hello");     
    }
}
