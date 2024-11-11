import java.util.*;
@FunctionalInterface
interface Sam
{
    //void callMe(int i);
    int add(int a,int b);
}
class A
{
    @Deprecated
    public void showMe()
    {

    }
    public void getValueFromDatabase()
    {
        System.out.println("Inside A");
    }
}
class B extends A
{
    @Override
    public void getValueFromDatabase()
    {
        System.out.println("Inside B");
    }
}

class FIex {
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //Lamada Expression :: annotations FunctionlInterface -1
        Sam obj = (a,b)-> a+b;
        int res= obj.add(5,6);
        System.out.println("The addition value is "+res);
        //annotatins  SuppressWarnings("unchecked") -2
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hello");
        String s = (String)al.get(0);
        System.out.println("Value is "+s);
        A obj2= new A();
        //annotatins 2 Deprecated -3
        obj2.showMe();
        B obj3=new B();
        //annotatins 2 Override -4
        obj3.getValueFromDatabase();
   }
   
    
}
