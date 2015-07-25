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
        System.out.println("Seu signo é:" + signo);
        
        
        
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
            signo = "aquário";
        } else if (mes == 1 && dia > 19 || mes == 2 && dia <= 18){
            signo = "peixes";
        } else if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20){
            signo = "aries";
        } else if (mes == 3 && dia >= 21 || mes == 4 && dia <=19){
            signo = "touro";
        } else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20){
            signo = "gêmeos";
        } else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20){
            signo = "câncer";
        } else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 22){
            signo = "leão";
        } else if (mes == 7 && dia >= 23 || mes == 8 && dia <= 22){
            signo = "virgem";
        } else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22){
            signo = "libra";
        } else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22){
            signo = "escorpião";
        } else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21){
            signo = "sagitário";
        } else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21){
            signo = "capricórnio";
        }
        
        return signo;
    }
    
    

}
