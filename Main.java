import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean canContinue = true;
        int exp = 0;
        String nome = "";
        do{
            try {
                System.out.println("Insira o nome do héroi");
                nome = scan.nextLine();
                System.out.println("Insira o exp do héroi");
                exp = Integer.parseInt(scan.nextLine());
                if (exp < 0){
                    throw new Exception("Valor invalido!");
                }
            } catch (Exception exception) {
                System.out.println("Input inválido!");
                canContinue = false;
            }
        }while (!canContinue);
        String level = selectLevel(exp);
        System.out.printf("O Herói de nome %s está no nivel %s%n", nome, level);
        scan.close();
    }

    private static String selectLevel(int exp) {
        int selection = (int) Math.ceil(exp / 1000.0);
        return switch (selection) {
            case 0, 1 -> "Ferro";
            case 2 -> "Bronze";
            case 3, 4, 5 -> "Prata";
            case 6, 7 -> "Ouro";
            case 8 -> "Platina";
            case 9 -> "Ascendente";
            case 10 -> "Imortal";
            default -> "Radiante";
        };
    }
}
