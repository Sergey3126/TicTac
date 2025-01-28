import java.util.Objects;
import java.util.Scanner;
public class TicTacToe {
    public void TicTac(int lines, int columns) {
        Scanner scanner = new Scanner(System.in);
        int num2 = 1;
        String str = "1";
        String[][] arr = new String[lines][columns];
        int num = scanner.nextInt();
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                arr[i][j] = str;
                num2++;
                str = Integer.toString(num2);
            }
        }
        if (num != 1) {
            System.out.println("Эххх");
        } else {
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < lines; j++)
                    if (Integer.parseInt(arr[i][j]) < 10) {
                        System.out.print(arr[i][j] + "     ");
                    } else if (Integer.parseInt(arr[i][j]) < 100) {
                        System.out.print(arr[i][j] + "    ");
                    } else if (Integer.parseInt(arr[i][j]) < 1000) {
                        System.out.print(arr[i][j] + "   ");
                    } else if (Integer.parseInt(arr[i][j]) < 10000) {
                        System.out.print(arr[i][j] + "  ");
                    } else System.out.print(arr[i][j] + " ");
                System.out.println();
            }
            Cycle:
            for (int o = 0; o < columns * lines; o++) {
                System.out.println("Ход крестиков");
                System.out.println("Выберите место");
                String num1 = scanner.next();
                CycleX:
                for (int i = 0; i < columns; i++) {
                    for (int j = 0; j < lines; j++)
                        if (Objects.equals(arr[i][j], num1)) {
                            arr[i][j] = "X";
                            break CycleX;
                        }
                }
                for (int i = 0; i < columns; i++) {
                    for (int j = 0; j < lines; j++)
                        if (Objects.equals(arr[i][j], "X") || Objects.equals(arr[i][j], "O")) {
                            System.out.print(arr[i][j] + "     ");
                        } else if (Integer.parseInt(arr[i][j]) < 10) {
                            System.out.print(arr[i][j] + "     ");
                        } else if (Integer.parseInt(arr[i][j]) < 100) {
                            System.out.print(arr[i][j] + "    ");
                        } else if (Integer.parseInt(arr[i][j]) < 1000) {
                            System.out.print(arr[i][j] + "   ");
                        } else if (Integer.parseInt(arr[i][j]) < 10000) {
                            System.out.print(arr[i][j] + "  ");
                        } else System.out.print(arr[i][j] + " ");
                    System.out.println();
                }
                for (int i = 0; i < columns - 2; i++) {
                    for (int j = 0; j < lines - 2; j++)
                        if (Objects.equals(arr[i][j], "X") && Objects.equals(arr[i + 1][j + 1], "X") && Objects.equals(arr[i + 2][j + 2], "X")
                                || Objects.equals(arr[i][j + 2], "X") && Objects.equals(arr[i + 1][j + 1], "X") && Objects.equals(arr[i + 2][j], "X")
                                || Objects.equals(arr[i][j], "X") && Objects.equals(arr[i][j + 1], "X") && Objects.equals(arr[i][j + 2], "X")
                                || Objects.equals(arr[i + 1][j], "X") && Objects.equals(arr[i + 1][j + 1], "X") && Objects.equals(arr[i + 1][j + 2], "X")
                                || Objects.equals(arr[i + 2][j], "X") && Objects.equals(arr[i + 2][j + 1], "X") && Objects.equals(arr[i + 2][j + 2], "X")
                                || Objects.equals(arr[i][j], "X") && Objects.equals(arr[i + 1][j + j], "X") && Objects.equals(arr[i + 2][j], "X")
                                || Objects.equals(arr[i][j + 1], "X") && Objects.equals(arr[i + 1][j + 1], "X") && Objects.equals(arr[i + 2][j + 1], "X")
                                || Objects.equals(arr[i][j + 2], "X") && Objects.equals(arr[i + 1][j + 2], "X") && Objects.equals(arr[i + 2][j + 2], "X")) {
                            System.out.println("Крестики выиграли");
                            break Cycle;
                        }
                }
                if (o == columns * lines / 2) {
                    System.out.println("Ничья");
                    break Cycle;
                }
                System.out.println("Ход ноликов");
                System.out.println("Выберите место");
                num1 = scanner.next();
                CycleO:
                for (int i = 0; i < columns; i++) {
                    for (int j = 0; j < lines; j++)
                        if (Objects.equals(arr[i][j], num1)) {
                            arr[i][j] = "O";
                            break CycleO;
                        }
                }
                for (int i = 0; i < columns; i++) {
                    for (int j = 0; j < lines; j++)
                        if (Objects.equals(arr[i][j], "X") || Objects.equals(arr[i][j], "O")) {
                            System.out.print(arr[i][j] + "     ");
                        } else if (Integer.parseInt(arr[i][j]) < 10) {
                            System.out.print(arr[i][j] + "     ");
                        } else if (Integer.parseInt(arr[i][j]) < 100) {
                            System.out.print(arr[i][j] + "    ");
                        } else if (Integer.parseInt(arr[i][j]) < 1000) {
                            System.out.print(arr[i][j] + "   ");
                        } else if (Integer.parseInt(arr[i][j]) < 10000) {
                            System.out.print(arr[i][j] + "  ");
                        } else System.out.print(arr[i][j] + " ");
                    System.out.println();
                }
                for (int i = 0; i < columns - 2; i++) {
                    for (int j = 0; j < lines - 2; j++)
                        if (Objects.equals(arr[i][j], "O") && Objects.equals(arr[i + 1][j + 1], "O") && Objects.equals(arr[i + 2][2], "O")
                                || Objects.equals(arr[i][j], "O") && Objects.equals(arr[i + 1][j + 1], "O") && Objects.equals(arr[i + 2][j], "O")
                                || Objects.equals(arr[i][j], "O") && Objects.equals(arr[i + i][j + 1], "O") && Objects.equals(arr[i + i][j + 2], "O")
                                || Objects.equals(arr[i + 1][j], "O") && Objects.equals(arr[i + 1][j + 1], "O") && Objects.equals(arr[i + 1][j + 2], "O")
                                || Objects.equals(arr[i + 2][j], "O") && Objects.equals(arr[i + 2][j + 1], "O") && Objects.equals(arr[i + 2][j + 2], "O")
                                || Objects.equals(arr[i][j], "O") && Objects.equals(arr[i + 1][j], "O") && Objects.equals(arr[i + 2][j + j], "O")
                                || Objects.equals(arr[i][j + 1], "O") && Objects.equals(arr[i + 1][j + 1], "O") && Objects.equals(arr[i + 2][j + 1], "O")
                                || Objects.equals(arr[i][j + 2], "O") && Objects.equals(arr[i + 1][j + 2], "O") && Objects.equals(arr[i + 2][j + 2], "O")) {
                            System.out.println("Нолики выиграли");
                            break Cycle;
                        }
                }
            }
        }
    }
}


