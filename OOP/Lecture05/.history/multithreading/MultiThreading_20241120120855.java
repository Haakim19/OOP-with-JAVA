package multithreading;
class sample implements Runnable{
    public void run(){
        for(int x = 0 ; x <= 10; x++){
            System.out.print(x);
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
        System.out.println();
    };
    
}
public class MultiThreading {
    public static void main(String[] args) {
        sample obj = new sample();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        System.out.println(t1.isAlive());
        // t2.start();
    }
}
