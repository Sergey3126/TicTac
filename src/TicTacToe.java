import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {

    public void TicTac() {
        Scanner scanner = new Scanner(System.in);
        String[][] arr = {{"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}};
        int num = scanner.nextInt();
        if (num != 1) {
            System.out.println("Эххх");
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    System.out.print(arr[i][j] + "  ");
                System.out.println();
            }
            A1:
            for (int o = 0; o < 5; o++) {
                System.out.println("Ход крестиков");
                System.out.println("Выберите место");
                String num1 = scanner.next();
                A2:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        if (Objects.equals(arr[i][j], num1)) {
                            arr[i][j] = "X";
                            break A2;
                        }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        System.out.print(arr[i][j] + "  ");
                    System.out.println();
                }
                if (Objects.equals(arr[0][0], "X")
                        && Objects.equals(arr[1][1], "X") && Objects.equals(arr[2][2], "X")
                        || Objects.equals(arr[0][2], "X") && Objects.equals(arr[1][1], "X") && Objects.equals(arr[2][0], "X")
                        || Objects.equals(arr[0][0], "X") && Objects.equals(arr[0][1], "X") && Objects.equals(arr[0][2], "X")
                        || Objects.equals(arr[1][0], "X") && Objects.equals(arr[1][1], "X") && Objects.equals(arr[1][2], "X")
                        || Objects.equals(arr[2][0], "X") && Objects.equals(arr[2][1], "X") && Objects.equals(arr[2][2], "X")
                        || Objects.equals(arr[0][0], "X") && Objects.equals(arr[1][0], "X") && Objects.equals(arr[2][0], "X")
                        || Objects.equals(arr[0][1], "X") && Objects.equals(arr[1][1], "X") && Objects.equals(arr[2][1], "X")
                        || Objects.equals(arr[0][2], "X") && Objects.equals(arr[1][2], "X") && Objects.equals(arr[2][2], "X")) {
                    System.out.println("Крестики выиграли");
                    break A1;
                }
                if (o == 4) {
                    System.out.println("Ничья");
                    break A1;
                }
                System.out.println("Ход ноликов");
                System.out.println("Выберите место");
                num1 = scanner.next();
                A3:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        if (Objects.equals(arr[i][j], num1)) {
                            arr[i][j] = "O";
                            break A3;
                        }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        System.out.print(arr[i][j] + "  ");
                    System.out.println();
                }
                if (Objects.equals(arr[0][0], "O")
                        && Objects.equals(arr[1][1], "O") && Objects.equals(arr[2][2], "O")
                        || Objects.equals(arr[0][2], "O") && Objects.equals(arr[1][1], "O") && Objects.equals(arr[2][0], "O")
                        || Objects.equals(arr[0][0], "O") && Objects.equals(arr[0][1], "O") && Objects.equals(arr[0][2], "O")
                        || Objects.equals(arr[1][0], "O") && Objects.equals(arr[1][1], "O") && Objects.equals(arr[1][2], "O")
                        || Objects.equals(arr[2][0], "O") && Objects.equals(arr[2][1], "O") && Objects.equals(arr[2][2], "O")
                        || Objects.equals(arr[0][0], "O") && Objects.equals(arr[1][0], "O") && Objects.equals(arr[2][0], "O")
                        || Objects.equals(arr[0][1], "O") && Objects.equals(arr[1][1], "O") && Objects.equals(arr[2][1], "O")
                        || Objects.equals(arr[0][2], "O") && Objects.equals(arr[1][2], "O") && Objects.equals(arr[2][2], "O")) {
                    System.out.println("Нолики выиграли");
                    break A1;
                }
            }
        }
    }
}

