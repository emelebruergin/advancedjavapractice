package advancedJavaPrc.multithreads.threadpool;
/*
Thread oluşturmak maliyetli bir olaydır.Her thread için sistemden belli bir kaynak ayırılır.
Bu kaynaklar CPU, Hafıza gibi önemli olanlardır. Uygulamamız çalışırken belli bir miktarda
thread ile sınırlamak isteyebiliriz.

Bu nedenle Thread havuzu oluşturup bu havuzu önceden oluşturulmuş ve kullanıma hazır Thread nesneleri
ile doldururuz. Böylece performans kazanımı ve sistem kaynaklarının verimli kullanımını sağlayabiliriz.

Task: Bir randevu oluşturma uygulaması tasarlayınız. (AppointmentCenter)
Uygulama herbir talep için bir gün sonrasını tarih vermelidir. 5 kişi için
randevu alınmak isteniyor. Thread havuzu oluşturup işleri 3 threade yaptırınız
 */
public class AppointmentApp2 {
}
