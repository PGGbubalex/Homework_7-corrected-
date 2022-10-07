public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    public static void task1() {

        int deposit = 15_000;
        double savingsTotal = 0;
        int month = 0;

        while (savingsTotal <= 2_459_000) {
            savingsTotal = savingsTotal + savingsTotal / 100;
            savingsTotal = savingsTotal + deposit;
            if (savingsTotal >= 2_459_000)
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", month, savingsTotal);
            month++;
        }
    }

    public static void task2() {

        System.out.println();

        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
    }

    public static void task3() {

        System.out.println();

        int year = 0;
        int population = 12_000_000;
        int birthRatePerThousand = 17;
        int totalBirthRate;
        int deathRatePerThousand = 8;
        int totalDeathRate;
        int birthsThisYear = 0;
        int deathsThisYear = 0;

        while (year < 10) {
            System.out.println();
            year++;
            totalBirthRate = (population / 1000) * birthRatePerThousand;
            totalDeathRate = (population / 1000) * deathRatePerThousand;
            population = population + totalBirthRate - totalDeathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);

            birthsThisYear = birthsThisYear + totalBirthRate;
            System.out.println("Родилось за " + year + " лет " + birthsThisYear + " человек.");
            deathsThisYear = deathsThisYear + totalDeathRate;
            System.out.println("Умерло за " + year + " лет " + deathsThisYear + " человек.");

        }
    }

    public static void task4(){

        System.out.println();

        double savings = 15_000f;
        int month = 1;

        while (savings<12_000_000){
            savings = savings*1.07;
            System.out.printf("Месяц %d, сумма накоплений составляет %f\n", month, savings);
            month++;
        }
    }

    public static void task5(){

        System.out.println();

        double savings = 15_000f;
        int month = 1;

        while (savings < 12_000_000) {
            savings = savings + (savings * 0.07);
            if (month % 6 == 0)
                System.out.printf("Месяц %d, сумма накоплений составляет %.2f\n", month, savings);
            month++;

        }
    }
    public static void task6(){

        System.out.println();

        double savings = 15_000f;
        int month = 0;
        int numberOfYears = 9;
        int monthsInYear = 12;
        int monthsInDesignatedYears = numberOfYears*monthsInYear;

        while (month<=monthsInDesignatedYears) {
            month++;
            savings = savings + (savings * 0.07);
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений составляет %.2f\n", month, savings);
            }
        }
    }
    public static void task7(){

        System.out.println();

        int todayIs = 1;
        int firstFriday = 7;
        int daysInMonth = 31;

        while (todayIs<daysInMonth){
            if (firstFriday==todayIs) {
                firstFriday = firstFriday + 7;
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", todayIs);
            }
            todayIs++;
        }
    }
    public static void task8(){

        System.out.println();

        int cometInterval = 79;
        int twoHundredYearsAgo = 1822;
        int hundredYearsAfter = 2122;
        int year = 0;

        while (year <= hundredYearsAfter){
            year++;
            if (year%cometInterval==0 &&year>twoHundredYearsAgo)
                System.out.println(year);
        }
    }
    public static void task9(){

        System.out.println();

        int result;
        int multiplier = 2;
        for (int multipliableNumber = 1; multipliableNumber<=10; multipliableNumber++){
            result = multipliableNumber*multiplier;
            System.out.println("2*" + multipliableNumber + "=" + result);
        }
    }
}