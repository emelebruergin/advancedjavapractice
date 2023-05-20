package advancedJavaPrc.multithreads.creation;

public class Sayac extends Thread{
    private String name;

    public Sayac(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+ " ekim işlemi başladı");
        for (int i=0;i<=100;i++){
            System.out.println(this.name+" boyu "+i+" cm oldu");
        }
        System.out.println(this.name+" yenmeye hazır.");
    }


}
