import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       HashSet<String> codigos = new HashSet<>();

       Cadeira c1 = new Cadeira("Lógica de programação","lop");
       Cadeira c2 = new Cadeira("Lógica Matemática","lom");
       Cadeira c3 = new Cadeira("Programação Orientada a Objetos","oop");
       Cadeira c4 = new Cadeira("Arquitetura de Computadores","arc");
       Cadeira c5 = new Cadeira("Sistemas Opreacionais","so");
       Cadeira c6 = new Cadeira("Rede de computadores","rede");
       Cadeira c7 = new Cadeira("Desenvolvimento web","web");
       Cadeira c8 = new Cadeira("Cybersegurança","cyr");

       c3.inserirRequisito(c1);
       c3.inserirRequisito(c2);
       c6.inserirRequisito(c4);
       c6.inserirRequisito(c5);
       c7.inserirRequisito(c3);
       c8.inserirRequisito(c6);

       HistoricoAcademico h = new HistoricoAcademico();
       h.inserirCadeiraFinalizada(c1.getCodigo());
       h.inserirCadeiraFinalizada(c2.getCodigo());
       h.inserirCadeiraFinalizada(c3.getCodigo());
       h.inserirCadeiraFinalizada(c4.getCodigo());
       h.inserirCadeiraFinalizada(c5.getCodigo());
       System.out.println(h.verificarPossibilidadeIngressao(c7));
       System.out.println(h.verificarPossibilidadeIngressao(c8));
    }
}