import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
    public static void main(String[] args) {
    	
    	//int agencia = 1021;
    	//String conta = "067-8";
    	//String nomeCliente = "MARIO ANDRADE";
    	double saldo = 237.48;
    	
        //criando o objeto scanner
    	
    	
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
         
        System.out.println("Por favor, digite o número da agência:!  ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua conta:  ");
        String conta = scanner.next();
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
      // System.out.println("saldo de sua conta é:");
      // double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola," + nome + " obrigado por criar uma conta em nosso banco, " );
        System.out.println("sua agência é:  " + agencia + " conta número: " + conta );
        System.out.println("Seu saldo é " + saldo);
        
        
    }
}

