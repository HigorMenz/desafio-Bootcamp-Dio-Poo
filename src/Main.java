import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria curso2 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso...");
        curso2.setData(LocalDate.now());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição.....");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMe = new Dev();
        devMe.setNome("Higor");
        devMe.inscreverBootcamp(bootcamp);
        System.out.println("couteudos inscritos"+devMe.getConteudosInscritos());
        devMe.progredir();
        System.out.println("----");
        devMe.progredir();
        System.out.println("----");
        devMe.progredir();
        System.out.println("----");
        System.out.println("couteudos Concluidos: "+devMe.getConteudosConcluidos());
        System.out.println("couteudos inscritos"+devMe.getConteudosInscritos());
        System.out.println("XP:" + devMe.calcularXp());

        System.out.println("-------------------------------------------------------");

        Dev devOther = new Dev();
        devOther.setNome("Camila");
        devOther.inscreverBootcamp(bootcamp);
        System.out.println("couteudos inscritos"+devOther.getConteudosInscritos());
        devOther.progredir();
        System.out.println("----");
        System.out.println("couteudos Concluidos: "+devOther.getConteudosConcluidos());
        System.out.println("couteudos inscritos"+devMe.getConteudosInscritos());
        System.out.println("XP:" + devOther.calcularXp());


    }

}