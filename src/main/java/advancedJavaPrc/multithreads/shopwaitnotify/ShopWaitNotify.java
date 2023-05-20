package advancedJavaPrc.multithreads.shopwaitnotify;

import javax.swing.plaf.TableHeaderUI;

/*
Task: Bir marketteki stok miktarını takip eden bir uygulama tasarlayınız.
Marketteki yeterli ürün yoksa yeni ürün gelmesi beklensin.
Yeni ürün eklenince ürün satışı gerçekleşsin
 */
public class ShopWaitNotify {
    public static volatile int stock=2;
    public static void main(String[] args) {
        ShopWaitNotify shop=new ShopWaitNotify();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {

                shop.consumeProduct(3);

            }
        });
        thread1.setName("Tüketici");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shop.produceProduct(4);
            }
        });
        thread2.setName("Üretici");
        thread2.start();




    }

    public synchronized void consumeProduct(int amount){
        if (amount>stock){
            System.out.println();
            System.out.println(Thread.currentThread().getName()+" urun satın almak istiyor...");
            System.out.println("Yeterli ürün yok..Ürün stogu: "+stock);
            System.out.println("Tüketici ürün girişini bekliyor..");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (amount<=stock){
            System.out.println();
            System.out.println(Thread.currentThread().getName()+" urun satın almak istiyor...");
            System.out.println("Ürün satın alındı ve stocktan düşülüyor...");
            stock-=amount;
            System.out.println("Güncel stock : "+ stock);
        }
        else {
            System.out.println(Thread.currentThread().getName()+" urun satın almak istiyor...");
            System.out.println("Yeterli ürün yok.Güncel stok: "+stock);
            System.out.println("Başka zaman gel");
        }
    }

    public synchronized void produceProduct(int amount){
        System.out.println();
        System.out.println(Thread.currentThread().getName()+" ürün eklemek istiyor..");
        System.out.println("Yeni ürünler eklendi");
        stock+=amount;
        System.out.println("Güncel stok: "+stock);
        notify();
        System.out.println();
    }
}
