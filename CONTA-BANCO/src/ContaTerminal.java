import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        double saldo= 1230.20;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();          
        
    
        System.out.println("Olá " + nomeCliente+  ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é: "+ agencia +", conta: " +numero+ "e seu saldo: "+saldo);
        

    }

    }
