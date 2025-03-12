import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //Declaração de variaveis e objeto do Tipo Scanner.
        Scanner ler =new Scanner(System.in);
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;
        
        //Entrada de dados do usuario.
        System.out.println("Seja bem vindo ao DioBank");
        System.out.println("    ");
            System.out.println("Por Favor digite seu nome:"+"   ");
            NomeCliente=ler.nextLine();
            System.out.println("Digite o numero de sua conta bancaria:"+"   ");
            Numero=ler.nextInt();
            System.out.println("Digite o codigo de sua agencia:"+"  ");
            Agencia=ler.next();
            System.out.println("Entre com seu saldo inicial:"+ "    ");
            Saldo=ler.nextDouble();
        //Agora a mensagem de confirmação na criação da conta bancaria.
        System.out.println(" Olá"+" "+NomeCliente+","
                            +"obrigado por criar uma conta em nosso banco sua agencia é"+
                            " "+Agencia+","+"conta"+" "+Numero+" "+"e seu saldo"+" "+Saldo+ " "+
                            "já está disponivel para saque.");
    ler.close();    
    }
}
