import java.util.Scanner;

public class TicTacGame {
    public static void main(String[] args) {
        TicTacToe myClassInstance = new TicTacToe();
        System.out.println("Добро пожаловать");
        System.out.println("Игра крестики-нолики");
        System.out.println("Введите 1, чтобы начать игру");
        myClassInstance.TicTac();
    }
}
