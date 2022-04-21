public class Main {
    public static void main(String[] args) {

        //exercise1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //exercise2
        short clientDeviceYear = 2010;
        if (clientOS == 0)
            if (clientDeviceYear >= 2015) {
            System.out.printf("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1)
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        //exercise 3
        short year = 2020;
        if (year% 4 == 0 && year% 100 != 0 || year% 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //exercise 4
        int deliveryTime = 95;
        if (deliveryTime <= 20) {
            System.out.println("Время доставки 1 день");
        }
        if (deliveryTime > 20 && deliveryTime<= 60)
        {
            System.out.println("Время доставки 2 дня");
        }
        else if (deliveryTime > 60 && deliveryTime <100) {
            System.out.println("Время доставки 3 дня");
        }
        else {
            System.out.println("Доставка в ваш район невозможна");
        }



        //exercise 4
        short month = 4;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }

}