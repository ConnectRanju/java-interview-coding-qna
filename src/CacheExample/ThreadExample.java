package CacheExample;

public class ThreadExample extends Thread{

    @Override
   public  void run(){
        System.out.println("inside Thread 1");
    }

    public static void main(String[] args) {
        ThreadExample t=new ThreadExample();
    t.start();
    }
}
