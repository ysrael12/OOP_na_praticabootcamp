package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudos{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
