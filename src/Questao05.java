import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do jantar");
        float ValorJanta = ler.nextFloat();
        String texto = String.format("A taxa %sdo%s garços é %s10%s" , ANSI_AMARELO,ANSI_RESET,ANSI_AZUL,ANSI_RESET);
        System.out.println(texto + "%");
        float valorTaxa = ValorJanta /10;
        float valorConta = ValorJanta + valorTaxa;
        String texto2 = String.format("%s%s + %s10%s" , ANSI_RESET,ValorJanta,ANSI_AZUL,ANSI_RESET);
        String texto3 =  texto2 + "% = " + String.format("R$ %s%s%s.",ANSI_AMARELO,valorConta,ANSI_RESET);
        System.out.println(texto3);
                
        ler.close();
    }
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_VERDE = "\u001B[32m";
    public static final String ANSI_AMARELO = "\u001B[33m";
    public static final String ANSI_AZUL = "\u001B[34m";
}
