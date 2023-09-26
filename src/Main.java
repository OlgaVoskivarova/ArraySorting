import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        LocalDate[] events =  {
                LocalDate.of(1952, 7, 25),
                LocalDate.of(1957, 6, 28),
                LocalDate.of(1982, 7, 10),
                LocalDate.of(1983, 4, 23),
                LocalDate.of(1960, 2, 4),
                LocalDate.of(2014, 7, 2),
                LocalDate.of(2018, 6, 23),
        };

        int buffer;                     // переменная для хранения временных значений, которые мы получим в ходе работы цикла
        boolean isSorted = false;       // с помощью переменной типа  boolean  опредим нужно ли дальше продолжать цикл для сортировки данных массиыва
        while (!isSorted){              // цикл будет работать до тех пор, пока значение будет false, это значит, что массив еще не отсортирован
                                        // как только мы получим значение true цикл будет остановлен.

          isSorted = true;
            for (int i = 0; i < events.length-1 ; i++) {
                if (events[i].getYear() > events[i+1].getYear()){
                    isSorted = false;
                    buffer = events[i].getYear();
                    events[i].getYear() = events[i+1].getYear();
                    events[i+1].getYear() =buffer;

                }
            }

            }
        System.out.println(Arrays.toString(events));

    }
}