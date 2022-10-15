import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome");
        String strNome = ler.nextLine();
        System.out.println("Digite o valor da hora");
        float fltValorHora = ler.nextFloat();
        System.out.println("Digite a quantida de horas trabalhadas");
        int qtdHoras = ler.nextInt();
        double valorParaReceber = fltValorHora * qtdHoras;
        
         System.out.println(ANSI_RESET + String.format("%s %s %svai receber R$ %s%s%s",ANSI_VERDE,strNome,ANSI_RESET,ANSI_VERDE ,valorParaReceber, ANSI_RESET));
        
        ler.close();
    }
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_VERDE = "\u001B[32m";
}
