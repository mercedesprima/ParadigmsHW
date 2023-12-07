//Таблица умножения: На вход подается число n.
//Задача: Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
//Обосновать выбор парадигм.

    import java.util.Scanner;

    public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 9; j++) {
                    int result = i * j;
                    System.out.printf("%d * %d = %d \t", i,  j, result);
                }
                System.out.println();
            }
        }
    }

// В данном примере используется императивная парадигма программирования.