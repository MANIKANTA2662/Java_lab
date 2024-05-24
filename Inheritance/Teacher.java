class Employee {
    float salary = 35000; 
}

class Teacher extends Employee {
    int bonus = 10000; 
    public static void main(String[] args) {
        Teacher t = new Teacher(); 
        System.out.println("Teacher salary is " + t.salary); 
        System.out.println("Teacher bonus is " + t.bonus); 
    }
}
