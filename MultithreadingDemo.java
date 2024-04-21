
class Multithread extends Thread {
    public void run()
    {
        try{
            System.out.println("Thread"+ Thread.currentThread().getId()+"is Running");
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
    
}
public class MultithreadingDemo{
    public static void main(String args[])
    {
        int n=8;
        for (int i=0;i<n;i++)
        {
            MultithreadingDemo obj =new MultithreadingDemo();

        }
    }
}
