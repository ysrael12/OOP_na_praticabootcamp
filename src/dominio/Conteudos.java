package dominio;

public abstract class Conteudos {
    protected static final double XP_PADRAO = 10;

    protected String titulo;
    protected String descriçao;

    public abstract double calcularXp() ;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
}
