package projetoastrologia;

import java.util.Scanner;

/**
 *
 * @author anaflavia 2014
 */
public class ProjetoAstrologia {

    /**
     * Projeto de astrologia, desenvolvido para PI-EAD 2015 UFABC
     */
    
    
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("**~* SEJA BEM-VINDO AO PROGRAMA DE ASTROLOGIA DO GRUPO 27 ***~*~**");

        String nome = lerNome();
        String signo = lerNascimento();
        
        
        System.out.println("___________________________________________");
        System.out.println("\n\nSeu signo é:\n" + signo + ".");
        
        String caracteristicas = caracteristicas(signo);
        System.out.println("\nCaractersísticas do seu signo: " + caracteristicas);
        
        System.out.println("\n");
        
        verNumerologiaNome(nome);
        
        

    }

    
    
    public static String lerNome(){
        
        Scanner entrada = new Scanner(System.in);

        String nome = "";

        System.out.println("\nDigite seu nome, por favor:");
        nome = entrada.nextLine();
        
        return nome;
        
    }
    
    public static String lerNascimento() {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nDigite o dia de seu nascimento (por exemplo, '12'):");
        int dia = entrada.nextInt();

        System.out.println("\nDigite o mês de seu nascimento (por exemplo, '03'):");
        int mes = entrada.nextInt();

        System.out.println("\nDigite o ano de seu nascimento (por exemplo, '1993'):");
        int ano = entrada.nextInt();

        String signo = verSigno(dia, mes);

        return signo;

    }

    public static String verSigno(int dia, int mes) {

        String signo = "";
        if (mes == 1 && dia <= 19 || mes == 12 && dia <= 31) {
            signo = "Aquário";
        } else if (mes == 1 && dia > 19 || mes == 2 && dia <= 18) {
            signo = "Peixes";
        } else if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20) {
            signo = "Aries";
        } else if (mes == 3 && dia >= 21 || mes == 4 && dia <= 19) {
            signo = "Touro";
        } else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20) {
            signo = "Gêmeos";
        } else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
            signo = "Câncer";
        } else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 22) {
            signo = "Leão";
        } else if (mes == 7 && dia >= 23 || mes == 8 && dia <= 22) {
            signo = "Virgem";
        } else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
            signo = "Libra";
        } else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
            signo = "Escorpião";
        } else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
            signo = "Sagitário";
        } else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
            signo = "Capricórnio";
        }

        return signo;
    }

    public static String caracteristicas(String signo) {

        String car = "";

        if (signo == "Aries") {

            car = "Impulsividade, espontaneidade e impulsividade. \n"
                    + "Em Áries, podemos encontrar espontaneidade, uma energia que"
                    + " é total impulso e um forte anseio por existir.\nEste signo "
                    + "tem uma forte tendência a realizações instantâneas, pois vive"
                    + " sua vida no agora. ";

        } else if (signo == "Touro") {

            car = "Realização, teimosia e sensualidade.\n"
                    + "Em Touro, podemos encontrar a pulsão da vida em sua intensidade máxima. "
                    + "\nVoltado para a realização das ideias num plano tangível, material. "
                    + "\nO ritmo pode até ser lento, mas dificilmente falha.";

        } else if (signo == "Gêmeos") {

            car = "Inteligência, versatilidade e comunicação.\n"
                    + "No signo de Gêmeos, podemos encontrar a manifestação viva do poder "
                    + "da linguagem.\nVive em sua própria mente, dialogando e especulando."
                    + "\nElabora raciocínios brilhantes, trazendo luz para outras pessoas.";

        } else if (signo == "Câncer") {

            car = "Emoção, afeição e imaginação."
                    + "Em Câncer, encontramos a ligação às origens."
                    + "\nEste signo tem o poder de fazer com que a maioria"
                    + "das pessoas se sinta à vontade na sua presença.\n"
                    + "Adora mergulhar fundo no mistério dos sentimentos humanos.";

        } else if (signo == "Leão") {

            car = "Generosidade, nobreza e criatividade." + "\n"
                    + "Em Leão, podemos encontrar a ideia de calor, de irradiação de luz."
                    + "\nÉ um signo generoso, doador e vibrante em seu idealismo.\n"
                    + "Uma alma que costuma possuir uma consciência plena de si mesma "
                    + "e do papel que veio desempenhar no mundo.";

        } else if (signo == "Virgem") {

            car = "Pefeccionismo, inteligência e opinião." + "\n"
                    + "No signo de Virgem, podemos encontrar uma simplicidade funcional,"
                    + " que tem por objetivo o aperfeiçoamento do mundo circundante.\n"
                    + "É também extremamente crítico e perfeccionista.";

        } else if (signo == "Libra") {

            car = "Vaidade, gentileza e idealização." + "\n"
                    + "No signo de Libra, podemos encontrar o desenvolvimento da"
                    + " consciência através dos relacionamentos interpessoais."
                    + "\nPara isso, abusa do charme da racionalidade. "
                    + "\nPossui a rara capacidade de reconhecer no outro um semelhante.";

        } else if (signo == "Escorpião") {

            car = "Intensidade, transformação e mistério." + "\n"
                    + "Em Escorpião, podemos encontrar um criador de seu próprio destino."
                    + "\nÉ também um signo transformador. "
                    + "\nEstá sempre envolvido com suas emoções, que geralmente são muito"
                    + " intensas e profundas.";

        } else if (signo == "Sagitário") {

            car = "Originalidade, intuição e inspiração." + "\n"
                    + "No signo de Sagitário, podemos encontrar a dualidade "
                    + "entre o mundo real e o imaginário. "
                    + "\nÉ um grande incentivador e adora motivar pessoas. "
                    + "Vai além da mediocridade e quase sempre ultrapassa as expectativas.";

        } else if (signo == "Capricórnio") {

            car = "Personalidade, persistência e esforço." + "\n"
                    + "No signo de Capricórnio, podemos encontrar ambições específicas "
                    + "e metas bem definidas. Reflete uma determinação e atração por desafios.\n"
                    + "É uma estrela que brilha devagar, mas que, ao acender, se sustenta"
                    + " por um longo tempo.";

        } else if (signo == "Aquário") {

            car = "Inovação, originalidade e visão." + "\n"
                    + "No signo de Aquário encontramos a abertura a novas ideias."
                    + "\nAbusa das teorias e sua visão vai além do habitual, "
                    + "daí se dizer que Aquário é o signo dos inventores."
                    + "\nTem facilidade para enxergar o que pode dar certo ou não. ";

        } else if (signo == "Peixes") {

            car = "Solidariedade, sensibilidade e intuição." + "\n"
                    + "No signo de Peixes encontramos o pensamento no coletivo."
                    + "\nO sentimento pisciano valoriza o todo em vez da parte."
                    + "\nE tem o dom de resolver as coisas por intermédio de uma certeira "
                    + "intuição.";

        }
        
        return car;
    }
    
    public static int numerologiaLetra(String letra){
        
        /*Valores retirados do alfabeto hebraico Kabala
           http://30geons.blogspot.com.br/2011/01/chaldean-hebrew-kabala-numerical.html
        */
        
        int valor = 0;
        
        if("A".equals(letra)){
            valor = 1;
        } else if ("B".equals(letra)){
            valor = 2;
        } else if ("C".equals(letra)){
            valor = 3;
        } else if ("D".equals(letra)){
            valor = 4;
        } else if ("E".equals(letra)){
            valor = 5;
        } else if ("F".equals(letra)){
            valor = 6;
        } else if ("G".equals(letra)){
            valor = 3;
        } else if ("H".equals(letra)){
            valor = 5;
        } else if ("I".equals(letra)){
            valor = 1;
        } else if ("J".equals(letra)){
            valor = 1;
        } else if ("K".equals(letra)){
            valor = 2;
        } else if ("L".equals(letra)){
            valor = 3;
        } else if ("M".equals(letra)){
            valor = 4;
        } else if ("N".equals(letra)){
            valor = 5;
        } else if ("O".equals(letra)){
            valor = 7;
        } else if ("P".equals(letra)){
            valor = 8;
        } else if ("Q".equals(letra)){
            valor = 1;
        } else if ("R".equals(letra)){
            valor = 2;
        } else if ("S".equals(letra)){
            valor = 3;
        } else if ("T".equals(letra)){
            valor = 4;
        } else if ("U".equals(letra)){
            valor = 6;
        } else if ("V".equals(letra)){
            valor = 6;
        } else if ("W".equals(letra)){
            valor = 6;
        } else if ("X".equals(letra)){
            valor = 5;
        } else if ("Y".equals(letra)){
            valor = 1;
        } else if ("Z".equals(letra)){
            valor = 7;
        }
        
        return valor;
        
    }
    
    public static char[] fazerVetorComLetras(String nome){
        
        nome = nome.toUpperCase();
        int nLetras = nome.length();
        char[] letras = new char[nLetras];
        
        for(int i = 0; i < nLetras ; i++){
            letras[i] = nome.charAt(i);
        }
        
        return letras;
    }
    
    public static void imprimirVetorLetras(char[] letras){
        
        for(int i = 0; i < letras.length; i++){
            System.out.print(letras[i]);
        }
    }
    
    public static void verNumerologiaNome(String nome){
        
        char[] letras = fazerVetorComLetras(nome);
        
        System.out.println("Seu nome, de acordo com o alfabeto hebraico de numerologia:");
        
        for (int i = 0; i < letras.length; i++){
            
            String letra = letras[i] + "";
            int valor = numerologiaLetra(letra);
            System.out.println(letra + " - " + valor);
            
        }
    }

}
