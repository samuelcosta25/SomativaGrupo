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
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Sexo inválido.");
        }
        double imc = peso / (altura * altura);
        int imcclasse;
        if (imc > 0 && imc <= 20) {
            imcclasse = 1; // Abaixo do peso
        } else if (imc > 20 && imc <= 27) {
            imcclasse = 2; // Peso normal
        } else if (imc > 27) {
            imcclasse = 3; // Acima do peso
        } else {
            System.out.println("ERRO! Digite os dados novamente.");
        }
        int idadeclasse;
        if (idade >= 16 && idade <= 25) {
            idadeclasse = 1;
        } else if (idade >= 26 && idade <= 35) {
            idadeclasse = 2;
        } else if (idade >= 36 && idade <= 45) {
            idadeclasse = 3;
        } else if (idade >= 46 && idade <= 55) {
            idadeclasse = 4;
        } else if (idade >= 56 && idade <= 65) {
            idadeclasse = 5;
        } else if (idade >= 66) {
            idadeclasse = 6;
        } else {
            System.out.println("ERRO! Digite os dados novamente.");
        }

    }

}
