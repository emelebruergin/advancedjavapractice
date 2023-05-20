package advancedJavaPrc.generics.methods;

public class GenericMethods {
    public static void main(String[] args) {
        String[] stdList = {"Rafeel", "Donatello", "Leonardo", "MichelAngelo"};
        Double[] pointList = {75.5, 80.0, 90.75, 81.0};
        Character[] gradeList = {'A', 'B', 'C', 'D'};


        //1.Tüm listeleri yazdır
        printArray(stdList);
        printArray(pointList);
        printArray(gradeList);


        //2.Öğrencileri isimlerine göre sıralayınız

        //3.Öğrenci notlarını sıralayınız


        //4.Öğrenci harf notlarını sıralayınız

    }

    public static <T> void printArray(T[] array){
        for (T w:array){
            System.out.println(w);
        }
    }
}
