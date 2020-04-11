/*
Yuri Resende Corrêa - 20157082
 */
package execicios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int n1, n2;
        //Variáveis
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite um número INTEIRO: ");
        n1 = scan.nextInt();
        System.out.print("Digite mais um número INTEIRO: ");
        n2 = scan.nextInt();
        //Atribui números às variáveis
        
        System.out.println("=-=- EXIBINDO OPERAÇÕES -=-=");
        System.out.println(n1+ " + " +n2+ " = " +(n1 + n2));
        System.out.println(n1+ " - " +n2+ " = " +(n1 - n2));
        System.out.println(n1+ " x " +n2+ " = " +(n1 * n2));
        System.out.println(n1+ " / " +n2+ " = " +(n1 / n2));
        System.out.println("Resto de " +n1+ " por " +n2+ " é " +(n1 % n2));
        System.out.println("=-=- FIM DO PROGRAMA -=-=");
        //Exibe as operações entre as variáveirs
        
    }
}
