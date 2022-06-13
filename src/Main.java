import dominio.* ;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(1);
        curso1.setTitulo("como criar apps");
        curso1.setDescriçao("feito pela dio");
        System.out.println(curso1.getTitulo());

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Como criar sua carreira");
        mentoriaJava.setData(LocalDate.now());
        mentoriaJava.setDescriçao("lalal");
        System.out.println(mentoriaJava.getTitulo());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp philisps fullStack");
        bootcamp.setDescriçao("dio");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoriaJava);

        Devs devYsrael = new Devs();
        devYsrael.setNome("Ysrael Sacrati");
        devYsrael.inscreverBootcamp(bootcamp);
        devYsrael.progredir();
        System.out.println("conteudos inscritos\n" + devYsrael.getConteudosInscritos());
        System.out.println("conteudos concluidos"+ devYsrael.getConteudosConcluidos());

    }
}