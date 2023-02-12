import java.util.ArrayList;

// Classe para colaboradores
public class Colaborador extends Usuario implements Cadastravel {
    private ArrayList<Hospedagem> hospedagens;

    public Colaborador(String nome, String email, String senha) {
        super(nome, email, senha);
        hospedagens = new ArrayList<Hospedagem>();
    }

    public ArrayList<Hospedagem> getHospedagens() {
        return hospedagens;
    }

    // Implementação do método cadastrar da interface Cadastravel
    public void cadastrar() {
        // Adiciona o colaborador à lista de colaboradores do sistema
        Sistema.addColaborador(this);
    }

    //Implementação do método consultar que retorna um objecto Cadastravel
    @Override
    public Cadastravel consultar(String nome) {
        return Sistema.getColaborador(nome);
    }

    //Implementação altera um objeto Cadastravel

    public void alterar(Cadastravel colaborador) {

    }

    //Método que deleta um objeto Cadastravel

    public void deletar(Cadastravel colaborador) {
        Sistema.getColaboradores().remove(colaborador);
    }

    // Método para cadastrar uma nova hospedagem
    public Hospedagem cadastrarHospedagem(String endereco, double preco) {
        Hospedagem hospedagem = new Hospedagem(this, endereco, preco);
        hospedagens.add(hospedagem);
        Sistema.addVendavel(hospedagem);
        return hospedagem;
    }
}