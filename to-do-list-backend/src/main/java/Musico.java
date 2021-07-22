import java.util.Date;

public class Musico extends Pessoa{
    private String instrumento;
    public Musico(
            String tipoCabelo,
            String nome,
            String sobrenome,
            Date dataNascimento,
            String instrumento
    ) {
        super(
                tipoCabelo,
                nome,
                sobrenome,
                dataNascimento
        );
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return "Musico{" +
                "instrumento='" + instrumento + '\'' +
                "nome='" + getNome() + '\'' +
                "sobrenome='" + getSobrenome() + '\'' +
                '}';
    }
}
