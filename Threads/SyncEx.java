class Table
{
    public synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
            {
                System.out.println(n+"*"+i+"="+(n*i));
                try
                {
                    Thread.sleep(400);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        //need to remove synchronized key word in front of method
        // synchronized(this)
        // {
        //     for(int i=1;i<=10;i++)
        //     {
        //         System.out.println(n+"*"+i+"="+(n*i));
        //         try
        //         {
        //             Thread.sleep(400);
        //         }
        //         catch(InterruptedException e)
        //         {
        //             e.printStackTrace();
        //         }
        //     }
        // }
     
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table tm)
    {
        this.t = tm;
    }
    public void run()
    {
        t.printTable(20);
        
    }
}
class Thread2 extends Thread
{
    Table t;
    Thread2(Table tm)
    {
        this.t = tm;
    }
    public void run()
    {
        t.printTable(80);
    }
}
class SyncEx {
    public static void main(String[] args) {
        Table t = new Table();
        Thread1 t1= new Thread1(t);
        Thread2 t2= new Thread2(t);
        t1.start();
        t2.start();
    }
    
}
