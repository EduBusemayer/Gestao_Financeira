import java.util.ArrayList;
import java.util.Iterator;

public class Relatórios {

    public static ArrayList<Gastos> ListaGastos = new ArrayList();
    public static ArrayList<Ganhos> ListaGanhos = new ArrayList();

    public static void AddGasto(Gastos gasto) {
        ListaGastos.add(gasto);
    }

    public static void AddGanho(Ganhos ganho) {
        ListaGanhos.add(ganho);
    }

    public static void RelatórioGastos() {
        double Total = 0.0;
        System.out.println();
        System.out.println("Relatório de Gastos:");
        System.out.println("========================");

        Gastos Gasto;
        for(Iterator var2 = ListaGastos.iterator(); var2.hasNext(); Total += Gasto.getValor()) {
            Gasto = (Gastos)var2.next();
            System.out.println("Tipo: " + Gasto.getTipo());
            System.out.println("Data: " + Gasto.getData());
            System.out.println("Valor: " + Gasto.getValor());
            System.out.println("Forma de Pagamento: " + Gasto.getPagamento());
            System.out.println();
        }

        System.out.println("Total: " + Total);
        System.out.println();
    }

    public static void RelatórioGanhos() {
        double Total = 0.0;
        System.out.println();
        System.out.println("Relatório de Ganhos:");
        System.out.println("========================");

        Ganhos Ganho;
        for(Iterator var2 = ListaGanhos.iterator(); var2.hasNext(); Total += Ganho.getValor()) {
            Ganho = (Ganhos)var2.next();
            System.out.println("Tipo: " + Ganho.getTipo());
            System.out.println("Data: " + Ganho.getData());
            System.out.println("Valor: " + Ganho.getValor());
            System.out.println();
        }

        System.out.println("Total: " + Total);
    }

    public static void RelatórioSaldoMensal() {
        double TotalGanhos = 0.0;
        double TotalGastos = 0.0;

        Iterator var4;
        Ganhos Ganho;
        for(var4 = ListaGanhos.iterator(); var4.hasNext(); TotalGanhos += Ganho.getValor()) {
            Ganho = (Ganhos)var4.next();
        }

        Gastos Gasto;
        for(var4 = ListaGastos.iterator(); var4.hasNext(); TotalGastos += Gasto.getValor()) {
            Gasto = (Gastos)var4.next();
        }

        double Saldo = TotalGanhos - TotalGastos;
        System.out.println();
        System.out.println("Relatório Saldo Mensal:");
        System.out.println("========================");
        System.out.println("Total de Ganhos: R$" + TotalGanhos);
        System.out.println("Total de Gastos: R$" + TotalGastos);
        System.out.println("Saldo: R$" + Saldo);
        System.out.println();
    }
} 