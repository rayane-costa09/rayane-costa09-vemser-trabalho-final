import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criação de Compradores
        Comprador comprador1 = new Comprador("João", "joao@gmail.com", "123456");
        Comprador comprador2 = new Comprador("Maria", "maria@gmail.com", "789012");
        Comprador comprador3 = new Comprador("José", "josé@gmail.com", "345678");

        // Adição dos Compradores ao sistema
        comprador1.cadastrar();
        comprador2.cadastrar();
        comprador3.cadastrar();

        // Criação de Colaboradores
        Colaborador colaborador1 = new Colaborador("Pedro", "pedro@gmail.com", "abcdef");
        Colaborador colaborador2 = new Colaborador("Marta", "marta@gmail.com", "ghijkl");
        Colaborador colaborador3 = new Colaborador("Paulo", "paulo@gmail.com", "mnopqr");

        // Adição dos Colaboradores ao sistema
        colaborador1.cadastrar();
        colaborador2.cadastrar();
        colaborador3.cadastrar();

        // Cadastro de Planos de Hospedagem
        PlanoHospedagem plano1 = new PlanoHospedagem("Plano Básico", 50.0);
        PlanoHospedagem plano2 = new PlanoHospedagem("Plano Premium", 100.0);
        PlanoHospedagem plano3 = new PlanoHospedagem("Plano Super", 150.0);

        // Adição dos Planos de Hospedagem ao sistema
        plano1.cadastrar();
        plano2.cadastrar();
        plano3.cadastrar();

        // Cadastro de Hospedagens pelos Colaboradores
        Hospedagem hospedagem1 = colaborador1.cadastrarHospedagem("Av. Paulista, 100", 80.0);
        Hospedagem hospedagem2 = colaborador2.cadastrarHospedagem("Rua Augusta, 200", 120.0);

        // Adição das Hospedagens ao sistema
        hospedagem1.cadastrar();
        hospedagem2.cadastrar();

        // Vendas realizadas
        Venda venda1 = new Venda(comprador1, plano1, "meudominio.com.br");
        Venda venda2 = new Venda(comprador2, plano2, "meusite.com");

        // Adição das Vendas ao sistema
        venda1.vender();
        venda2.vender();

        // Exibição das informações dos Compradores
        ArrayList<Comprador> compradores = Sistema.getCompradores();
        System.out.println("Compradores: ");
        for (Comprador comprador : compradores) {
            System.out.println("Nome: " + comprador.getNome());
            System.out.println("E-mail: " + comprador.getEmail());
            System.out.println("Senha: " + comprador.getSenha());
            System.out.println();
        }

        // Exibição das informações dos Colaboradores
        ArrayList<Colaborador> colaboradores = Sistema.getColaboradores();
        System.out.println("Colaboradores: ");
        for (Colaborador colaborador : colaboradores) {
            System.out.println("Nome: " + colaborador.getNome());
            System.out.println("E-mail: " + colaborador.getEmail());
            System.out.println("Senha: " + colaborador.getSenha());
            System.out.println();
        }

        // Exibição das informações dos Planos de Hospedagem
        ArrayList<Vendavel> vendaveis = Sistema.getVendaveis();
        System.out.println("Planos de Hospedagem: ");
        for (Vendavel vendavel : vendaveis) {
            if (vendavel instanceof PlanoHospedagem) {
                PlanoHospedagem plano = (PlanoHospedagem) vendavel;
                System.out.println("Nome: " + plano.getNome());
                System.out.println("Preço: " + plano.getPreco());
                System.out.println();
            }
        }

        // Exibição das informações das Hospedagens cadastradas pelos Colaboradores
        System.out.println("Hospedagens: ");
        for (Vendavel vendavel : vendaveis) {
            if (vendavel instanceof Hospedagem) {
                Hospedagem hospedagem = (Hospedagem) vendavel;
                System.out.println("Endereço: " + hospedagem.getEndereco());
                System.out.println("Preço: " + hospedagem.getPreco());
                System.out.println("Colaborador responsável: " + hospedagem.getColaborador().getNome());
                System.out.println();
            }
        }

        // Exibição das informações das Vendas realizadas
        ArrayList<Venda> vendas = Sistema.getVendas();
        System.out.println("Vendas: ");
        for (Venda venda : vendas) {
            System.out.println("Comprador: " + venda.getComprador().getNome());
            System.out.println("Produto vendido: " + venda.getPlano().getNome());
            System.out.println("Domínio: " + venda.getDominio());
            System.out.println();
        }
    }
}

