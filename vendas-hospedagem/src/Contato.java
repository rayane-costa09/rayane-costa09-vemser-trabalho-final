public class Contato {

    private String descricao;

    private String telefone;

    //1 - residencial, 2 - comercial
    private int tipo;

    public void imprimirContato(){
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Telefone: "+ getTelefone());
        if(getTipo() == 1){
            System.out.println("Contato residencial");
        }else{
            System.out.println("Contato comercial");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
