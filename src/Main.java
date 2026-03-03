import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3,media;

        System.out.print("Informe a quantidade de alunos: ");
        int totalAlunos = entrada.nextInt();
        entrada.nextLine();

        for(int i = 0; i < totalAlunos;i++){
            System.out.println("Digite o nome completo do aluno: ");
            nome = entrada.nextLine();
            System.out.println("Digite nota 1: ");
            nota1 = entrada.nextDouble();
            System.out.println("Digite nota 2: ");
            nota2 = entrada.nextDouble();
            System.out.println("Digite nota 3: ");
            nota3 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3)/3;
            entrada.nextLine();


        }
    }
}