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
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescriçao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
