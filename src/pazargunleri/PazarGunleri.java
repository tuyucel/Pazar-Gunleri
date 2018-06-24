package pazargunleri;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuyucel
 * 
 */
public class PazarGunleri {

    public static void main(String[] args) {

        getDatesFrom();
        String ayinIlkPazarlari = "";
        for (int c = 0; c < getDatesFrom().toArray().length; c++) {

            ayinIlkPazarlari = getDatesFrom().toArray()[c].toString();
            String aTarih[] = ayinIlkPazarlari.split("-");

            if (aTarih[2].equals("01")) {
                System.out.println(aTarih[0] + "-" + aTarih[1] + "-"
                        + aTarih[2] + " Pazar günü");
            }
        }
    }

    public static List<LocalDate> getDatesFrom() {
        List<LocalDate> dates = new ArrayList<>();

        for (int i = 1900; i <= 2000; i++) {
            for (int j = 1; j <= 12; j++) {
                LocalDate initial = LocalDate.of(i, j, 1);
                LocalDate start = initial.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.SUNDAY));
                dates.add(start);
            }
        }
        return dates;
    }
}
