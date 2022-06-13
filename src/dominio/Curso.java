package dominio;

public class Curso extends Conteudos{

    private int cargaHoraria;



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return 0;
    }
}
