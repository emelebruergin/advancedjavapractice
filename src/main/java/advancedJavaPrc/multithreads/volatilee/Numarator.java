package advancedJavaPrc.multithreads.volatilee;

public class Numarator {
    private volatile static int counter=0;

    public synchronized void getOrder(){
        String name=Thread.currentThread().getName();
        counter++;
        System.out.println("Sayın "+ name+" sıranız: "+counter);
    }
}
