/*    Здравствуй, Сергей! Я посчитал необходимым оставить небольшое обращение к тебе касательно моего проекта
   по первому спринту. А именно по поводу отсутствия класса "Converter".
      Дело в том, что во время разбора, на первом вебенаре по проекту, было сказано, что можно для решения задачи
   можно отходить от пройденного материала и использовать знания которых там небыло. Я в качестве хранения данных
   выбрал двумерный массив и вся дальнейшая логика строилась вокруг него. В результате когда я стал писать метод
   по выводу статистики я пришел к мнению, что класс  "Converter" не нужен. Так как его полностью заменяют два
   System.out.print.
      Естественно решенее о его необходимости полностью за вами. Просто я хотел рассказать о причинах его отсутствия
   =))
      В любом случае, спасибо! =)
*/
public class Main {
    public static void main(String[] args) {

        StepTracker stepTracker = new StepTracker();

        while(true) {
            printMenu();
            int userInput = StepTracker.inputData(3);
            if (userInput == 1) {
                StepTracker.inputDataStep(stepTracker.totalStep);
            }
            else if (userInput == 2) {
                StepTracker.getStatisticMonth(stepTracker.totalStep);
            }
            else if (userInput == 3) {
                StepTracker.newGoal();
                System.out.println("Новая цель по количеству шагов: " + StepTracker.minSteps + "\n");
            }
            else if (userInput == 0) {
                break;
            }

        }
    }
    public static void printMenu() {
        System.out.println("Выберите пункт меню. Введите число:");
        System.out.println("1. Ввести количество шагов за определённый день.");
        System.out.println("2. Напечатать статистику за определённый месяц.");
        System.out.println("3. Изменить цель по количеству шагов в день.");
        System.out.println("0. Выйти из приложения.");
    }


}