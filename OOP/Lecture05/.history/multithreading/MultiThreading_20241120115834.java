package multithreading;
class sample implements Runnable{
    public void run(){
        for(int x = 0 ; x < 10; x++){
            System.out.print(x);
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.err.println("Error!");
            }
        }
    };
    
}
public class MultiThreading {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        t1.start();
    }
}
