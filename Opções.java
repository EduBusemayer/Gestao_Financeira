public class Opções {

    public static void Início() {

        System.out.println();
        System.out.println("Gestor Financeiro");
        System.out.println("========================");
        System.out.println("1 - Adicionar Gasto");
        System.out.println("2 - Adicionar Ganho");
        System.out.println("3 - Relatório de Gastos");
        System.out.println("4 - Relatório de Ganhos");
        System.out.println("5 - Relatório Saldo Mensal");
        System.out.println("6 - CANCELAR");
        System.out.println();
        System.out.print("Selecione uma Opção: ");
    }

    public static void OpçõesGastos() {

        System.out.println();
        System.out.println("Adicione o Tipo do Gasto");
        System.out.println("========================");
        System.out.println("1 - Contas");
        System.out.println("2 - Lazer");
        System.out.println("3 - Alimentação");
        System.out.println("4 - Transporte");
        System.out.println("X - Outros");
        System.out.println("0 - VOLTAR");
        System.out.println();
        System.out.println("Selecione o Tipo do Gasto: ");
    }

    public static void OpçõesGanhos() {

        System.out.println();
        System.out.println("Adicione o Tipo de Ganho");
        System.out.println("========================");
        System.out.println("1 - Salário");
        System.out.println("2 - Freelancer");
        System.out.println("3 - Investimentos");
        System.out.println("0 - VOLTAR");
        System.out.println();
        System.out.println("Selecione o Tipo do Ganho: ");
    }

    public static void Valor() {

        System.out.println();
        System.out.println("Informe o Valor em Reais");
        System.out.println("========================");
        System.out.println("Valor: ");
    }

    public static void OpçõesPagamento() {

        System.out.println();
        System.out.println("Selecione a Forma de Pagamento");
        System.out.println("========================");
        System.out.println("1 - Crédito");
        System.out.println("2 - Pix");
        System.out.println("3 - Débito");
        System.out.println("4 - Dinheiro");
        System.out.println();
        System.out.println("Forma de Pagamento: ");
    }

    public static void Data() {

        System.out.println();
        System.out.println("Inoforme a Data do Gasto ou do Ganho");
        System.out.println("========================");
        System.out.println("Data: ");
    }
} 