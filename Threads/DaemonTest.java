class DeamonThreadEx extends Thread{
    public void run()
    {
           //Thread.currentThread().isDaemon()
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Demon Thread");
        }
        else
        {
            System.out.println("Normal thread Thread");
        }
    }
}
class DaemonTest
{
    public static void main(String args[])
    {
        DeamonThreadEx t1 = new DeamonThreadEx();
        DeamonThreadEx t2 = new DeamonThreadEx();
        DeamonThreadEx t3 = new DeamonThreadEx();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}