import java.util.ArrayList;

public class Cadeira {
    private String nome;
    private String codigo;
    private ArrayList<Cadeira> preRequisitos = new ArrayList<>();

    public Cadeira(String nome,String codigo){
        this.nome = nome;
        this.codigo = codigo.toUpperCase();
    }

    public void inserirRequisito(Cadeira c){
        this.preRequisitos.add(c);
    }

    public void verificarRequisitos(){

        if (!this.preRequisitos.isEmpty()){

            System.out.println("Os requisitos da cadeira "+ this.nome+" são:");

            for (int i = 0;i<this.preRequisitos.size();i++){

                System.out.println(this.preRequisitos.get(i));

            }
        }else{
            System.out.println("Não existe pré requisito para essa cadeira.");
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Cadeira> getPreRequisitos() {
        return this.preRequisitos;
    }

    public void setPreRequisitos(ArrayList<Cadeira> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return   "Nome:"+this.nome+"\n"+
                 "Código:"+this.codigo+"\n"+
                 "Pré-requisitos:"+this.preRequisitos+"\n";
    }
}
