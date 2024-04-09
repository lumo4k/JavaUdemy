package banco;

import entities.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome  = sc.nextLine();
        System.out.println("Digite seu CPF");
        String cpf  = sc.nextLine();

        String deposito;
        double depositoConvertido;

        do {
            System.out.println("Quanto quer depositar inicialmente?");
            System.out.println("(Obs: Pode deixar esse valor nulo mas não negativo.)");
            deposito  = sc.nextLine();
            System.out.println(deposito);
        } while (!verificarDouble(deposito));

        depositoConvertido = Double.parseDouble(deposito);

        Conta c1 = new Conta(nome,cpf,depositoConvertido);

        System.out.println(c1.getNome());
        System.out.println(c1.getCpf());
        System.out.println(c1.getSaldo());

    }

    public static boolean verificarDouble(String numero) {
        if (numero == "") {
            return true;
        }

        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}