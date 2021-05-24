import entities.AlugarCarro;
import entities.Veiculo;
import service.AlugarServico;
import service.TaxaBrasileiraServico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Coloque os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String modeloCarro = sc.nextLine();
        System.out.println("Data do aluguel (dd/MM/yyyy hh:mm): ");
        Date entrada = sdf.parse(sc.nextLine());
        System.out.println("Data da devolução do carro (dd/MM/yyyy hh:mm): ");
        Date saida = sdf.parse(sc.nextLine());
        AlugarCarro carro = new AlugarCarro(entrada,saida,new Veiculo(modeloCarro));

        System.out.println("Entre o preço por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.println("Entre o preço por dia: ");
        double precoPorDia = sc.nextDouble();

        AlugarServico alugarServico = new AlugarServico(precoPorHora,precoPorDia,new TaxaBrasileiraServico());

        alugarServico.emitirNota(carro);

        System.out.println("NOTA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", carro.getNota().getPagamentoBasico()));
        System.out.println("Taxa: " + String.format("%.2f", carro.getNota().getTaxa()));
        System.out.println("Pagamento Total: " + String.format("%.2f", carro.getNota().getPagamentoTotal()));
    }
}
