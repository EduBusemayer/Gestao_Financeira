import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int Opção = 0;

            while(Opção != 6) {
                Opções.Início();
                Opção = Integer.parseInt(input.nextLine());
                switch (Opção) {

                    case 1:
                    Opções.OpçõesGastos();
                        String tipogasto = input.nextLine();

                        if ("0".equals(tipogasto)) {

                            System.out.println("VOLTANDO");
                            System.out.println();
                        } 
                        
                        else {

                            Opções.Valor();
                            double valor = Double.parseDouble(input.nextLine());
                            Opções.OpçõesPagamento();
                            String pagamento = input.nextLine();
                            Opções.Data();
                            String data = input.nextLine();
                            Gastos gasto = new Gastos(tipogasto, valor, pagamento, data);
                            Relatórios.AddGasto(gasto);
                        }
                        break;

                    case 2:
                    Opções.OpçõesGanhos();
                        String tipoganho = input.nextLine();

                        if ("0".equals(tipoganho)) {

                            System.out.println("VOLTANDO");
                            System.out.println();
                        } 

                        else {  
                            
                            Opções.Valor();
                            double valor = Double.parseDouble(input.nextLine());
                            Opções.Data();
                            String data = input.nextLine();
                            Ganhos ganho = new Ganhos(tipoganho, valor, data);
                            Relatórios.AddGanho(ganho);
                        }
                        break;

                    case 3:
                        Relatórios.RelatórioGastos();
                        break;

                    case 4:
                        Relatórios.RelatórioGanhos();
                        break;

                    case 5:
                        Relatórios.RelatórioSaldoMensal();
                        break;

                    case 6:
                        System.out.println("OPERAÇÃO CANCELADA");
                        break;

                    default:
                        System.out.println("OPÇÃO INVÁLIDA");
                }
            }
        }
    }
}