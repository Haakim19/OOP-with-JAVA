package multithreading;
class sample implements Runnable{
    public void run(){
        for(int x = 0 ; x <= 10; x++){
            System.out.println(x);
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
    };
    
}
public class MultiThreading {
    public static void main(String[] args) {
        sample obj = new sample();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        // t1.start();
        t1.isAlive();
        // t2.start();
    }
}
