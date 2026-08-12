
import java.util.HashSet;

public class HistoricoAcademico{
    private HashSet<String> cadeirasFinalizadas = new HashSet<>();

    public void inserirCadeiraFinalizada(String cadeira){
        this.cadeirasFinalizadas.add(cadeira.toUpperCase());
    }

    public void verificarCadeirasPassadas(){
        if (this.cadeirasFinalizadas.isEmpty()){
            System.out.println("Você ainda não finalizou nenhuma cadeira.");
        }else{
            for(String i:this.cadeirasFinalizadas){
                System.out.println(i);
            }
        }

    }

    public Boolean verificarPossibilidadeIngressao(Cadeira c){
        HashSet<String> codigos = new HashSet<>();

        if (c.getPreRequisitos().isEmpty()){
            return true;
        }else{

            for(int i = 0;i < c.getPreRequisitos().size();i++){

                Cadeira cadeira = c.getPreRequisitos().get(i);
                codigos.add(cadeira.getCodigo());

                if (!cadeira.getPreRequisitos().isEmpty()){

                    for (int j = 0;j <cadeira.getPreRequisitos().size();j++){
                        Cadeira cadeiraSegundaCamada = cadeira.getPreRequisitos().get(j);
                        codigos.add(cadeiraSegundaCamada.getCodigo());
                    }
                }
            }

            return this.cadeirasFinalizadas.containsAll(codigos);
        }
    }


}
