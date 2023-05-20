package advancedJavaPrc.serialization;
//Task:Book tipinde nesneler üretip bu nesneleri
//books.txt dosyasına kaydedin ve sonra bu dosyadan
//nesneleri okuyun
import java.io.*;
public class SerializationPractice {
    public static void main(String[] args) {
           writeObject();
        readObject();
    }

    public static void writeObject() {
        Book book1 = new Book("Sefiller", "Victor Hugo", 1990);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("Bir İdam Mahkumunu Son Günü", "Victor Hugo", 1995);

        try {
            //dosyaları akışa alıyoruz
            FileOutputStream fos = new FileOutputStream("books.txt");
            //objeleri yazdırmak için
            ObjectOutputStream write = new ObjectOutputStream(fos);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);
            fos.close();
            write.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void readObject() {

        try {
            FileInputStream fis=new FileInputStream("books.txt");
            ObjectInputStream read=new ObjectInputStream(fis);
            Book book1=(Book)read.readObject();
            Book book2=(Book)read.readObject();
            Book book3=(Book)read.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);
            read.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


