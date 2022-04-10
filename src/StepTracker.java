import java.util.Scanner;
public class StepTracker {

        static int minSteps = 10000;
        int[][] totalStep = new int[12][30];

    public static void inputDataStep(int[][]totalStep) {
        while (true) {
            System.out.println("Введите месяц от 0 до 11");
            int monthNumber = inputData(11);
            System.out.println("Введите день месяца от 0 до 29");
            int dayNumber = inputData(29);
            System.out.println("Введите количество пройденных шагов за день");
            int stepsTaken = inputData(999999);
            totalStep[monthNumber][dayNumber] = stepsTaken;
            System.out.println("Хотите добавить еще пройденные шаги? 1 - Да. 0 - Нет.");
            int userInput = inputData(1);
            if (userInput == 1) {
            } else if (userInput == 0) {
                break;
            }
        }

    }

    public static int inputData(int upValue) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int data = scanner.nextInt();
            if (data < 0) {
                System.out.println("Ошибка ввода!");
            } else if (data > upValue) {
                System.out.println("Ошибка ввода!");
            } else {
                return data;
            }
        }
    }

    public static void getStatisticMonth(int[][] totalStep) {
        System.out.println("За какой месяц вы хотите получить статистику? Выберите цифру от 0 до 11");
        int monthNumber = inputData(11);
        int currentSeries = 0;
        int maxSeries = 0;
        int s = 0;
        for (int i = 0; i < totalStep[monthNumber].length; i++) {
            System.out.print(i + " день: " + totalStep[monthNumber][i] + ", ");
            s = s + totalStep[monthNumber][i];
            if (totalStep[1][i] >= minSteps) {
                currentSeries = currentSeries + 1;
            }
            else if (currentSeries > maxSeries) {
                maxSeries = currentSeries;
                currentSeries = 0;
            }
        }
            System.out.print("\n");
            System.out.println("Общее число шагов за месяц: " + s);
            System.out.println("Среднее число шагов за месяц: " + s / totalStep[monthNumber].length);
            System.out.println("Пройденная дистанция (в км): " + (s * 0.00075));
            System.out.println("Количество сожжённых килокалорий: " + (s * 50 / 1000));
            System.out.println("Лучшая серия дней за месяц: " + maxSeries + "\n");

    }

    static void newGoal() {
        System.out.println("Введите новое необходимое количество пройденых шагов");
        minSteps = inputData(999999);
    }

}
