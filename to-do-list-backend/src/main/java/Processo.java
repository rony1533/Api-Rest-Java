import java.util.Calendar;
import java.util.Date;

public class Processo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Ondulado",
                "Rony",
                "Sobral",
                new Date(2003, Calendar.JANUARY, 3)
        );

        Musico musico = new Musico(
                "Ondulado",
                "Rony",
                "Sobral",
                new Date(2003, Calendar.JANUARY, 3),
                "Guitarra"
        );

        System.out.println(pessoa);
        System.out.println(musico);
    }
}
