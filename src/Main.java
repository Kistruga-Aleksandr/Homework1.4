public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        int i = 6;
        int daysMonth = 31;
        for (; i <= daysMonth; i = i + 7) {
            System.out.println("Сегоня пятница " + i + " -е. Необходимо подготовить отчет");
        }
    }

    public static void task3() {
        int cometFlyby = 79;
        int currentYear = 2022;
        int initialYear = currentYear - 200;
        int finalFear = currentYear + 100;
        for (int year = initialYear; year < finalFear; year++) {
            if (year % cometFlyby == 0) {
                System.out.println(year);
            }
        }
    }

    public static void task4() {

    }
}
