import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;

public class ExemploZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Duration duration = Duration.ofHours(5);
        System.out.println(duration);

        LocalDate datanascimento = LocalDate.of(1997,11, 18);
        Period period = Period.between(datanascimento, LocalDate.now());
        System.out.println(period.getYears());
    }
}
