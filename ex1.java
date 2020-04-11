/*
Yuri Resende Corrêa - 20157082
 */
package execicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        String nome, cidade;
        int idade;
        //Variáveis
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Olá! Digite seu nome: ");
        nome = scan.nextLine();
        //Lê o nome do usuário
        
        System.out.printf("Seja bem-vindo, %s.", nome);
        System.out.println("");
        //Exibe uma mensagem de boas vindas
        
        System.out.print("Agora, digite sua idade: ");
        idade = scan.nextInt();
        //Lê a idade do usuário
        
        System.out.print("E, por último, sua cidade: ");
        cidade = scan.next();
        //Lê a cidade do usuário
        
        System.out.println("-=-= EXIBINDO DADOS =-=-");       
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Cidade: " +cidade);
        System.out.println("-=-=FIM DO PROGRAMA =-=-");
        //Exibe as informaçôes recebidas
        
    }
}
