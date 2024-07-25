import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso");
        curso2.setCargahoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria do Curso");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Curso");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito "  + devCamila.getNome() + ":"+ devCamila.getConteudosInscritos()+"\n");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscrito "  + devCamila.getNome() + ":"+ devCamila.getConteudosInscritos()+"\n");
        System.out.println("Conteúdo Concluidos " + devCamila.getNome() + ":"+ devCamila.getConteudosConcluidos()+"\n");
        System.out.println("XP " + devCamila.getNome() + ":"+ devCamila.calcularTotalXp());
        System.out.println("---------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos " + devJoao.getNome() + ":"+ devJoao.getConteudosInscritos()+"\n");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos " + devJoao.getNome() + ":"+ devJoao.getConteudosInscritos()+"\n");
        System.out.println("Conteúdo Concluidos " + devJoao.getNome() + ":"+ devJoao.getConteudosConcluidos()+"\n");
        System.out.println("XP " + devJoao.getNome() + ":" + devJoao.calcularTotalXp());
    }
}
