abstract class Person 
{// abstract class declared  
    abstract void display();// abstract method declared  
}  
class AnonymousDemo 
{  
    public static void main (String args[]) 
    {  
        Person person = new Person() {// creating an object  
            void display() 
            {
                System.out.println("My name is John.");
            }  
        };// anonymous class closes  
        person.display();  
    } //The main class closes  
}// class AnonymousDemo2 closes 
