import java.util.Scanner;

public class TicTacGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe myClassInstance = new TicTacToe();
        System.out.println("Добро пожаловать");
        System.out.println("Игра крестики-нолики");
        System.out.println("Введите 1, чтобы начать игру");
        int num = scanner.nextInt();
        if (num != 1) {
            System.out.println("Эххх");
        } else
        myClassInstance.TicTac();
    }
}
