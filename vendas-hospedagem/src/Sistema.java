import java.util.ArrayList;
import java.util.stream.Stream;

// Classe que representa o sistema
public class Sistema {
    private static ArrayList<Comprador> compradores = new ArrayList<Comprador>();
    private static ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
    private static ArrayList<Vendavel> vendaveis = new ArrayList<Vendavel>();
    private static ArrayList<Venda> vendas = new ArrayList<Venda>();

    // Métodos para adicionar elementos às listas do sistema
    public static void addComprador(Comprador comprador) {
        compradores.add(comprador);
    }

    public static void addColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public static Colaborador getColaborador(String nome) {
        Stream<Colaborador> stream = colaboradores.stream().filter(colaborador -> colaborador.getNome().equals(nome));
        return stream.findFirst().get();
    }

    public static Comprador getComprador(String nome) {
        Stream<Comprador> stream = compradores.stream().filter(comprador -> comprador.getNome().equals(nome));
        return stream.findFirst().get();
    }

    public static void addVendavel(Vendavel vendavel) {
        vendaveis.add(vendavel);
    }

    public static void addVenda(Venda venda) {
        vendas.add(venda);
    }

    // Métodos para listar os elementos do sistema
    public static ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public static ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public static ArrayList<Vendavel> getVendaveis() {
        return vendaveis;
    }

    public static ArrayList<Venda> getVendas() {
        return vendas;
    }
}