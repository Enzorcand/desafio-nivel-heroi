import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean canContinue = true;
        int exp = 0;
        do{
            try {
                exp = Integer.parseInt(scan.nextLine());
            } catch (Exception exception) {
                System.out.println("Input inválido!");
                canContinue = false;
            }
        }while (!canContinue);
        String level = selectLevel(exp);
        System.out.printf(level);
        scan.close();
    }

    private static String selectLevel(int exp) {
        return "";
    }
}
