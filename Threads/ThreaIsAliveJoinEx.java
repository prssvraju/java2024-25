class One extends Thread{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Inside One Class");
        }
    }
}
class Two extends Thread{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Inside Two Class");
        }
    }
}
class Three extends Thread{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Inside Three Class");
        }
    }
}
class ThreaIsAliveJoinEx
{
    public static void main(String args[])
    {
        One one = new One();
        Two two= new Two();
        Three three = new Three();
        System.out.println("One Thread Status "+one.isAlive());
        System.out.println("Two Thread Status "+two.isAlive());
        System.out.println("Three Thread Status "+three.isAlive());
        one.start();
        two.start();
        three.start();
        try
        {
            one.join();
            two.join();
            three.join();

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("One Thread Status "+one.isAlive());
        System.out.println("Two Thread Status "+two.isAlive());
        System.out.println("Three Thread Status "+three.isAlive());
    }
}