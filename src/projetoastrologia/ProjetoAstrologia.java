package projetoastrologia;

import java.util.Scanner;

/**
 *
 * @author anaflavia 2014 
 */
public class ProjetoAstrologia {

    /**
     * Projeto de astrologia, desenvolvido para PI-EAD 2015
     * UFABC
     */
    
    
   
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo ao programa de astrologia do grupo 27!");
        
        String signo = lerDados();
        System.out.println("\n\nSeu signo é:" + signo);
        
        
        
    }
    
    public static String lerDados(){
        
        Scanner entrada = new Scanner(System.in);
        
        String nome = "";
        
        System.out.println("\nDigite seu nome, por favor:");
        nome = entrada.nextLine();
        
        
        System.out.println("\nDigite o dia de seu nascimento (por exemplo, '12'):");
        int dia = entrada.nextInt();
        
        System.out.println("\nDigite o mês de seu nascimento (por exemplo, 03):");
        int mes = entrada.nextInt();
        
        System.out.println("\nDigite o ano de seu nascimento (por exemplo, 1993):");
        int ano = entrada.nextInt();
        
        
        String signo = verSigno(dia,mes);
        
        return signo;
        
    }
    
    public static String verSigno(int dia, int mes){
       
        String signo = "";
        if(mes == 1 && dia <= 19 || mes == 12 && dia <= 31){
            signo = "Aquário";
        } else if (mes == 1 && dia > 19 || mes == 2 && dia <= 18){
            signo = "Peixes";
        } else if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20){
            signo = "Aries";
        } else if (mes == 3 && dia >= 21 || mes == 4 && dia <=19){
            signo = "Touro";
        } else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20){
            signo = "Gêmeos";
        } else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20){
            signo = "Câncer";
        } else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 22){
            signo = "Leão";
        } else if (mes == 7 && dia >= 23 || mes == 8 && dia <= 22){
            signo = "Virgem";
        } else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22){
            signo = "Libra";
        } else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22){
            signo = "Escorpião";
        } else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21){
            signo = "Sagitário";
        } else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21){
            signo = "Capricórnio";
        }
        
        return signo;
    }
    
    

}
