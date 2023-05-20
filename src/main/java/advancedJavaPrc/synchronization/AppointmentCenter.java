package advancedJavaPrc.synchronization;

import java.time.LocalDate;
import java.util.Locale;

public class AppointmentCenter  {

    private LocalDate day=LocalDate.now();
    public synchronized LocalDate getAppointmentDate(){
        day=day.plusDays(1);
        return day;
    }
}
