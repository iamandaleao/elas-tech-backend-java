import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExemploCalculosTempo {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(10);

        Duration duracao = Duration.between(agora, futuro);
        System.out.println(duracao.toDays());

        LocalDate datahoje = LocalDate.now();
        LocalDate dataFim = LocalDate.of(2025,12,31);
        Period period = Period.between(datahoje, dataFim);
        System.out.println(period.getDays());
        // System.out.println(duracao.between(datahoje, dataFim).toDays());
        System.out.println(ChronoUnit.DAYS.between(datahoje, dataFim));
    }
}
