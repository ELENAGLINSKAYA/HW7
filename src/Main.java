public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double bankTotal = 0;// вклад в банке
        var monthSum = 15000;//ежемесячное пополнение
        var month = 1;
        var procent = 1.07;
        while (bankTotal <= 2459000) {
            bankTotal = bankTotal * procent;
            bankTotal = bankTotal + monthSum;
            month++;
            System.out.println("Месяц" + month + "сумма накоплений" + bankTotal);
        }
        System.out.println();
        System.out.println("Потребуется" + month + "месяцев для того чтобы накопить" + bankTotal);
        System.out.println();
        System.out.println("Задание 2");// вывести последовательность чисел
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "");

        }
        System.out.println("Далее");
        int j = 10;

        for (j = 10; j >= 1; j--) {
            System.out.println(j + "");
        }
        System.out.println("Задание 3");
        int people = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;// естественный прирост в год на 1000 человек
        for (int year = 1; year <= 10; year++) {
            people += people * dif / 1000;
            System.out.println(" Год " + year + "население" + people);
        }
        System.out.println("Задание 4");
        int sum = 15_000;
        for (int Month = 1; Month <= 12; Month++) {
            sum += sum * 0.07;
            System.out.println("Месяц" + Month + "Сумма" + sum);
        }
        System.out.println("Задание 4.1 и 4.2");
        int Sum = 15_000;
        int MOnth = 1;
        while (Sum <= 12000000) {
            MOnth++;
            Sum += Sum * 0.07;

            if (MOnth % 6 == 0) {
                System.out.println("Месяц"+MOnth+"Сумма"+Sum);


            }}


        System.out.println("Задание 4.3");
        int S = 15_000;
        for (int M = 1; M <= 108; M++) {
            S += S* 0.07;
            if (M % 6 == 0) {
                System.out.println("Месяц" + M + "Сумма" + S);

            }}
        System.out.println("Задание 4.4");

        for (int data = 7; data<=31;data++) {
            if (data %7==0){
                System.out.println("Сегодня пятница" + data+ "е число. Необходимо подготовить отчет");
            }}
        System.out.println("Задание 6.2");

        int v = 2;
        int c = 1;
        while (c !=11){
            System.out.println(v+ "*" +c + " ="+v*c);
            c++;
        }

        System.out.println("Задание 6.1");
        int date = 2022;
        int dateMin = 1822;
        int dateMax = 2122;
        int n=79;
        int d = date - n;
        int d1 =  d -n;
        int d2 = date +n;


        System.out.println("Комета приближалась к Земле в" + d + " и в " + d1 + "году" + "приблизится в" + d2);




    }
}


