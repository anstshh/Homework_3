public class Main {
    public static void main(String[] args) {

        // Задание 1.

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2.

        int clientDeviceYear = 2014;
        int clientOS1 = 0;

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задание 3.

        int year = 2020;

        if (year % 400 == 0) {
            System.out.println("Год является високосным");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        // Задание 4.

        int deliveryDistance = 44;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }

        // я в упор не понимаю как сделать так, чтобы код работал при каждом условном расширении расстояния на 20 км :С

        // Задание 5

        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
                System.out.println("Такого сезона нет");
        }
    }
}

