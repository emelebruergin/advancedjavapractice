package advancedJavaPrc.multithreads.creation;

public class ThreadCreation2 {
    //Task:Runnable interfacini implement eden Counter isminde sınıf oluşturup
//bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturun

//Task: Başlarken Yarış başladı
//Bitince de yarış bitti desin
public static void main(String[] args) {
    System.out.println("Yarış Başladı");
    Counter thr1=new Counter("Road Runner");
    Counter thr2=new Counter("Speedy Gonzales");
    Thread thread1=new Thread(thr1);
    Thread thread2=new Thread(thr2);
    thread1.start();
    thread2.start();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println("Yarış Bitti");

}
}
