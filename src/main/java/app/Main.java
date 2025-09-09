package app;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Tarefa[] tarefas = new Tarefa[5];

        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas[4] = new Tarefa(4, "Novo", false);

        // Compromisso[] compromissos = new Compromisso[5]

        // compromissos[2] = new Compromisso(0, "Teste", "Hoje", "Amanhã");

        // System.out.println(tarefas[0].getDescricao());
        // System.out.println(tarefas[4].getDescricao());

        PessoaFisica pf1 = new PessoaFisica("Guilherme", "Quintana", LocalDate.now(), LocalDate.of(2007, Month.JANUARY, 02), "492.179.98-20");
        PessoaJuridica pj1 = new PessoaJuridica("Microsoft Corporation", "EUA", LocalDate.now(), "Microsoft", "60.316.817/0001-03");

        System.out.println(pf1.exbibirInformações());
        System.out.println(pj1.exbibirInformações());
    }
}