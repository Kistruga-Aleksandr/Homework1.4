public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
        int initialYear = 2022 - 200;
        int finalFear = 2022 + 100;
        for (int year = initialYear; year < finalFear; year++) {
            if (year % cometFlyby == 0) {
                System.out.println(year);
            }
        }
    }

    public static void task4() {
        int number1 = 3;
        int number2 = 5;
        for (int i = 1; i <= 30; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % number1 == 0) {
                System.out.println(i + ": ping");
            } else if (i % number2 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ":");
            }

        }

    }
}
