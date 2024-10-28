class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("2*"+i+"="+(2*i));
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int j=1;j<=10;j++)
        {
            System.out.println("3*"+j+"="+(3*j));
        }
    }
}
class JoinTest
{
    public static void main(String args[])
    {
        A a=new A(); 
        B b=new B();
        Thread  t1=new  Thread(a);	//providing runnable object as argument
        Thread t2=new Thread(b);
        Thread t3=new Thread(); //new thread t3 is created, but note starte
        //calling isAlive() method 
        System.out.println("Thread t3 is live :"+t3.isAlive()); 
        t1.start();
        t2.start();
        //calling join() method 
        try
        {
            t1.join();
        }
        catch(InterruptedException e)
        {
          e.printStackTrace();
        }
       
        System.out.println("Thread t2 is live :"+t2.isAlive());
    }
}

