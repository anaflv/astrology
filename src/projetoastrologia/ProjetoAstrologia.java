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
        System.out.println("**~* SEJA BEM-VINDO AO PROGRAMA DE ESOTÉRICO DE ASTROLOGIA E NUMEROLOGIA"
                + " DO GRUPO 27 ***~*~**");

        String nome;
        System.out.println("\nDigite seu nome inteiro, sem acentos, por favor:");
        nome = entrada.nextLine();
        
        
        
        System.out.println("___________________________________________");
        verNumerologiaNome(nome);

        System.out.println("\n___________________________________________");

        System.out.print("*~**~* ASTROLOGIA ~~***~\nPara saber informações de horóscopo, digite 1:\n\n");
        if(entrada.nextInt()== 1 ){

            String signo = lerNascimento();
            String caracteristicas = caracteristicas(signo);
            System.out.println("\nCaractersísticas do seu signo: " + caracteristicas);
        }




    }


    public static String lerNascimento() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o dia de seu nascimento (por exemplo, '12'):");
        int dia = entrada.nextInt();

        System.out.println("\nDigite o mês de seu nascimento (por exemplo, '03'):");
        int mes = entrada.nextInt();

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

    public static int numerologiaLetra(String letra) {

        /*Valores retirados do alfabeto hebraico Kabala
         http://30geons.blogspot.com.br/2011/01/chaldean-hebrew-kabala-numerical.html
         */
        int valor = 0;

        if ("A".equals(letra)) {
            valor = 1;
        } else if ("B".equals(letra)) {
            valor = 2;
        } else if ("C".equals(letra)) {
            valor = 3;
        } else if ("D".equals(letra)) {
            valor = 4;
        } else if ("E".equals(letra)) {
            valor = 5;
        } else if ("F".equals(letra)) {
            valor = 8;
        } else if ("G".equals(letra)) {
            valor = 3;
        } else if ("H".equals(letra)) {
            valor = 5;
        } else if ("I".equals(letra)) {
            valor = 1;
        } else if ("J".equals(letra)) {
            valor = 1;
        } else if ("K".equals(letra)) {
            valor = 2;
        } else if ("L".equals(letra)) {
            valor = 3;
        } else if ("M".equals(letra)) {
            valor = 4;
        } else if ("N".equals(letra)) {
            valor = 5;
        } else if ("O".equals(letra)) {
            valor = 7;
        } else if ("P".equals(letra)) {
            valor = 8;
        } else if ("Q".equals(letra)) {
            valor = 1;
        } else if ("R".equals(letra)) {
            valor = 2;
        } else if ("S".equals(letra)) {
            valor = 3;
        } else if ("T".equals(letra)) {
            valor = 4;
        } else if ("U".equals(letra)) {
            valor = 6;
        } else if ("V".equals(letra)) {
            valor = 6;
        } else if ("W".equals(letra)) {
            valor = 6;
        } else if ("X".equals(letra)) {
            valor = 5;
        } else if ("Y".equals(letra)) {
            valor = 1;
        } else if ("Z".equals(letra)) {
            valor = 7;
        }

        return valor;

    }

    public static char[] fazerVetorComLetras(String nome) {

        nome = nome.toUpperCase();
        int nLetras = nome.length();
        char[] letras = new char[nLetras];

        for (int i = 0; i < nLetras; i++) {
            letras[i] = nome.charAt(i);
        }

        return letras;
    }

    public static void verNumerologiaNome(String nome) {

        System.out.println("*~**~** NUMEROLOGIA DO SEU NOME **~*~***");

        //separar os diferentes nomes
        String nomes[] = separarNomes(nome);
        int corr[] = new int[nomes.length];

        for (int j = 0; j < nomes.length; j++) {
            nome = nomes[j];

            char[] letras = fazerVetorComLetras(nome);
            //fazer um vetor com as diferentes letras do nome

            int letrasN = letras.length;
            int[] numeros = new int[letrasN];
            //fazer um vetor com os diferentes números correspondentes a cada letra

            for (int i = 0; i < letras.length; i++) {

                String letra = letras[i] + "";
                int valor = numerologiaLetra(letra);
                numeros[i] = valor;
                System.out.println(letra + " - " + valor);

            }

            corr[j] = somaNumeros(numeros);
        }

        somaDosCorrespondentes(corr);

    }

    public static int somaNumeros(int[] numeros) {

        System.out.println("\nNÚMERO CORRESPONDENTE");

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos números do nome é: " + soma);

        int digito1;
        int digito2;

        if (soma != 22 && soma != 44) {
            while (soma > 9) {
                digito1 = soma / 10;
                digito2 = soma % 10;
                soma = digito1 + digito2;
                System.out.println(digito1 + " + " + digito2 + " = " + soma);
            }
        }

        System.out.println("O número correspondente ao nome é " + soma + ".\n");
        return soma;

    }

    public static String[] separarNomes(String nome) {

        String nomes[] = nome.split(" ");
        return nomes;
    }

    public static void somaDosCorrespondentes(int[] corr) {

        System.out.println("NÚMERO CORRESPONDENTE AO NOME INTEIRO");

        int soma = 0;
        for (int i = 0; i < corr.length; i++) {
            System.out.print(corr[i]);
            if (i + 1 < corr.length) {
                System.out.print(" + ");
            }
            soma += corr[i];
        }

        System.out.print(" = " + soma + "\n");

        int digito1;
        int digito2;

        while (soma > 9) {
            digito1 = soma / 10;
            digito2 = soma % 10;
            soma = digito1 + digito2;
            System.out.println(digito1 + " + " + digito2 + " = " + soma);
        }

        System.out.println("\n*** O número correspondente ao seu nome inteiro é: " + soma + " ***\n");
        verSignificadoNumero(soma);


    }

    public static void verSignificadoNumero(int num) {
        if (num == 1) {
            System.out.println("O número 1 representa criatividade, proteção e benevolência. "
                    + "1 é o número da ação original, a base de todos os outros números.\n"
                    + "Pessoas de número 1 possuem um senso forte de auto-valor, e normalmente "
                    + "não gostam de críticas. Uma pessoa 1 demanda - e normalmente consegue - "
                    + "respeito; vão insistir em organizar e controlar todos e todas a sua volta.\n"
                    + "Possuem o desejo de ser inventivos, creativos e fortemente originais.");

        } else if (num == 2) {

            System.out.println("O número 2 representa imaginação, paternidade e sensibilidade.\n"
                    + "2 é o número da decepção, do nascimento e de sonhos.\n"
                    + "Pessoas 2 são sonhadoras, com uma tendência de ter medo do"
                    + " desconhecido ou do pouco familiar.\n"
                    + "São muito imaginativos e inventivos, mas não forçam as ourtas pessoas a concordar "
                    + "com suas ideias ou seus planos.");

        } else if (num == 3) {

            System.out.println("Número 3 representa idealismo, educação superior, viagens a "
                    + "outros países e religião.\n3 é o número de otimismo, movimento e expansão "
                    + "- e a Santíssima Trindidade de corpo, alma e espírito.\nPessoas 3 baseam todas"
                    + " suas ações em algum grande ideal que possuem.\nEles miram para o alto e para a"
                    + " verdade -- não são satisfeitos com nada além da verdade, seja em um relacionam"
                    + "ento, em uma amizade, na carreira, na política ou na religão. \n"
                    + "Eles não são abrem mão do que querem, e conseguem perceber mentiras de "
                    + "longe. Alguns deles alcançam seu objetivo da verdade, e outros são levados"
                    + " a acreditar em suas próprias ilusões, mas eles nunca param sua busca.");

        } else if (num == 4) {

            System.out.println("O número 4 vibra para o planeta Urano."
                    + "\nRepresenta individualismo, originalidade, inventividade e tolerância.\n"
                    + "4 é o número do compartamento não convencional e de eventos inesperados "
                    + "e repentinos.\n"
                    + "Pessoas do número 4 são raramente compreendidos por seus amigos e familiares."
                    + "\nSão um enigma para todos que conhecem. Fazem suas próprias regras, e elas nem sempre combinam com aquelas da sociedade.\n"
                    + "Todos seus pensamentos e ações são coloridas por invididualidade.\n"
                    + "Se tem um jeito diferente de fazer alguma coisa, a pessoa número 4 vai descobri-lo.\n"
                    + "Suas palavras frequentemente chocam as outras, e pode parecer que elas fazem isso de propósito. E fazem.");

        } else if (num == 5) {

            System.out.println("O número 5 vibra para o planeta Mercúrio.\n"
                    + "Representa comunicação, movimento e versatilidade.\n"
                    + "5 é o número do intelecto e da expressão oral e escrita.\n"
                    + "Pessoas número 5 possuem um charme natural são gentis.\n"
                    + "São rápidos para perceber coisas erradas, e não hesitam em apontá-los.\n"
                    + "São incapazes de ignorar erros (seus próprios e das outras pessoas), e isso é associado a um amor por movimento e viagem.\n"
                    + "Mudanças são uma necessidade interminável para pessoas 5.\n"
                    + "Mudanças de cenário, de relacionamentos, de residência, de crenças políticas, etc.\n"
                    + "Pessoas 5 têm dificuldade de agor de forma intuitiva; são determinados a encontrar respostas lógicas.");

        } else if (num == 6) {

            System.out.println("O número 6 vibra para o planeta Vênus. Representa a essência feminina, compaixão, e também dinheiro."
                    + "6 é o número do amor e do romance.\n"
                    + "Pessoas 6 parecem atrair magneticamente as outras a elas.\n"
                    + "São genuinamente amados por seus amigos e associados -- e quando amam as outras pessoas, se tornam devotados a seus amados.\n"
                    + "Há mais idealismo e afeição do que sensualidade no amor que expressam.\n"
                    + "Essas pessoas já nascem românticas e sentimentais, independentemente do quanto tentam esconder ou negar isso.\n"
                    + "Possuem um amor por arte e uma afinidade grande por música.");

        } else if (num == 7) {

            System.out.println("O número 7 vibra para o planeta Netuno.\n"
                    + "Representa espiritualidade, simpatia e mistério.\n"
                    + "7 é o número da elusão e da delusão - e às vezes da mentira - mas também o número da cura, dos milagres e da fé, e de sonhos que se realizam.\n"
                    + "Pessoas 7 tendem a ter sonhos impressionantes.\n"
                    + "Às vezes falam sobre eles, e às vezes não comentam sobre eles com ninguém.\n"
                    + "Mas eles são os mais sonhadores. \n"
                    + "Em segredo, são interessados em mistérios esotéricos, em extraterrestres, e no desconhecido.\n"
                    + "Às vezes possuem o dom da intuição e de um magnetismo que acalma os outros.\n"
                    + "Muitas vezes, conseguem acalmar as pessoas apenas a presença deles.");

        } else if (num == 8) {

            System.out.println("O número 8 vibra para o planeta Saturno. \n"
                    + "Representa conhecimento, aprendizado através da experiência, estabilidade, paciência e responsabilidade.\n"
                    + "8 é também o número da estabilidade financeira, da precaução, da restrição, da auto-disciplina e do auto-controle.\n"
                    + "Pessoas 8 são normalmente reservadas, quietas e tímidas. \n"
                    + "Não necessariamente se destacam, mas devagar chegam onde querem, e nada vai impedi-las a alcançar suas ambições.\n"
                    + "A timidez é uma forma de encobrir a energia que possuem para chegar ao todo de suas profissões ou carreiras.");

        } else if (num == 9) {

            System.out.println("O número 9 vibra para o planeta Marte.\n"
                    + "Representa ação agressiva, coragem e conflito.\n"
                    + "9 é o número da originalidade e da intuição, e da iniciativa ....\n"
                    + "também dos aspectos contraditórios da vulnerabilidade e da ingenuidade.\n"
                    + "Pessoas 9 não são teimosas, mas são determinadas a obter o que querem.\n"
                    + "Têm uma tendência a serem impulsivas e a fazerem decisões precipitadas, que depois arrependem.\n"
                    + "Apesar de às vezes ficarem irritados com as pessoas, são rápidos a perdoar e a esquecer de brigas.\n"
                    + "São vulneráveis a seus inimigos porque o primeiro instinto deles é confiar em todos.\n"
                    + "Pessoas manipulativas podem chocar pessoas 9.");

        }
    }


    public static String combinacaoNumerologia(int p1, int p2){

        String num[][] = new String[9][9];

        String r1 = "De acordo com numerologia, vocês têm uma combinação ótima!"+
                "Vocês se encaixam naturalmente";
        String r2 = "De acordo com numerologia, seus números normalmente são compatíveis e vocês se dão bem!";
        String r3 = "De acordo com numerologia, pode ser que vocês se deem bem e pode ser que não. Tudo depende de suas ações!";
        String r4 = "De acordo com numerologia, a combinação de seus números é um desafio e requer esforço e compromisso.";

        //A combinação entre os valores de todos os números e o significado deles


        num[1][1] = num[1][5] = num[1][7] = r1;
        num[2][2] = num[2][4] = num[2][8] = r1;
        num[3][3] = num[3][6] = num[3][9] = r1;
        num[4][2] = num[4][2] = num[4][8] = r1;
        num[5][1] = num[5][5] = num[5][7] = r1;
        num[6][3] = num[6][6] = num[6][9] = r1;
        num[7][1] = num[7][5] = num[7][7] = r1;
        num[8][4] = num[8][4] = num[8][8] = r1;
        num[9][3] = num[9][6] = num[9][9] = r1;

        num[1][3] = num[1][9] = r2;
        num[2][3] = num[2][6] = r2;
        num[3][1] = num[3][2] = num[3][5] = r2;
        num[4][6] = num[4][7] = r2;
        num[5][3] = num[5][9] = r2;
        num[6][2] = num[6][4] = num[6][8] = r2;
        num[7][4] = r2;
        num[8][6] = r2;
        num[9][1] = num[1][5] = r2;

        num[1][8] = num[2][9] = num[5][8] = r3;
        num[7][9] = num[8][1] = num[8][5] = r3;
        num[9][2] = num[9][7] = r3;

        num[1][2] = num[1][4] = num[1][6] = r4;
        num[2][5] = num[2][5] = num[2][7] = r4;
        num[3][4] = num[3][7] = num[3][8] = r4;
        num[4][1] = num[4][3] = num[4][5] = num[4][9] = r4;
        num[5][2] = num[5][4] = num[5][6] = r4;
        num[6][1] = num[6][5] = num[6][7] = r4;
        num[7][2] = num[7][3] = num[7][6] = num[7][8] = r4;
        num[8][3] = num[8][7] = num[8][9] = r4;
        num[9][4] = num[9][8] = r4;

        return num[p1][p2];

    }




}
