import java.util.Scanner;

public class metodos {
    Scanner read = new Scanner(System.in);

    public void somativaGrupo() {
        System.out.println("Digite o nome do aluno: ");
        String nome = read.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = read.nextInt();
        System.out.println("Digite o sexo do aluno: 1-Feminino ou 2-Masculino");
        int sexo = read.nextInt();
        System.out.println("Digite a altura do aluno em metros: ");
        double altura = read.nextDouble();
        System.out.println("Digite o peso do aluno: ");
        double peso = read.nextDouble();
        double pesoIdeal = 0;
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Sexo inválido.");
        }
        double imc = peso / (altura * altura);
        int imcclasse = 0;
        if (imc > 0 && imc <= 20) {
            imcclasse = 1; // Abaixo do peso
            System.out.println("Abaixo do peso: necessário realizar atividades para ganho de massa muscular (Difícil)");
        } else if (imc > 20 && imc <= 27) {
            imcclasse = 2; // Peso normal
            System.out.println("Peso normal: Atividade Moderada");
        } else if (imc > 27){
            imcclasse = 3; // Acima do peso
            System.out.println("Acima do peso: necessário realizar atividades para perder peso (Fácil)");
        } else {
            System.out.println("ERRO! Digite os dados novamente.");
        }
        System.out.println("IMC: =" + imc);
        int idadeclasse = 0;
        if (idade >= 16 && idade <= 25) {
            idadeclasse = 1;
            System.out.println("Faixa de Idade I: entre 16 e 25 anos.");
        } else if (idade >= 26 && idade <= 35) {
            idadeclasse = 2;
            System.out.println("Faixa de Idade II: entre 26 e 35 anos.");
        } else if (idade >= 36 && idade <= 45) {
            idadeclasse = 3;
            System.out.println("Faixa de Idade III: entre 36 e 45 anos.");
        } else if (idade >= 46 && idade <= 55) {
            idadeclasse = 4;
            System.out.println("Faixa de Idade IV: entre 46 e 55 anos.");
        } else if (idade >= 56 && idade <= 65) {
            idadeclasse = 5;
            System.out.println("Faixa de Idade V: entre 56 e 65 anos.");
        } else if (idade >= 66) {
            idadeclasse = 6;
            System.out.println("Faixa de Idade VI: Acima de 65 anos.");
        } else {
            System.out.println("ERRO! Digite os dados novamente.");
        }

        if (imcclasse == 1 && (idadeclasse == 2 || idadeclasse == 3)) {
            System.out.println("O indíduo deve fazer musculação intensa");
        }
        if (imcclasse == 2 && (idadeclasse == 2 || idadeclasse == 3 || idadeclasse == 1 || idadeclasse == 4)) {
            System.out.println("O indíduo deve fazer musculação moderada");
        }
        if (imcclasse == 3 && (idadeclasse == 1 || idadeclasse == 4 || idadeclasse == 5 || idadeclasse == 6)) {
            System.out.println("O indíduo deve fazer musculação leve");
        }
        if (imcclasse == 1 && (idadeclasse == 2 || idadeclasse == 3 || idadeclasse == 4 || idadeclasse == 1)) {
            System.out.println("O indíduo deve fazer luta");
        }
        if (imcclasse == 2) {
            System.out.println("O indíduo deve fazer dança");
        }
        if (imcclasse == 1 && (idadeclasse == 4 || idadeclasse == 5 || idadeclasse == 6)) {
            System.out.println("O indíduo deve fazer pilates");
        }
        if (imcclasse == 2 && (idadeclasse == 2 || idadeclasse == 3 || idadeclasse == 4 || idadeclasse == 5)) {
            System.out.println("O indíduo deve fazer corrida");
        }
        if (imcclasse == 3) {
            System.out.println("O indíduo deve fazer ioga");
        }

    }

}
