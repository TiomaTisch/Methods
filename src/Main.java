import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void checkLeapYear (int year){

        if (year < 1584) {
            System.out.println( year + " Тогда небыло такого понятия как високосный год");
        }
        if (year % 100 == 0 && year % 400 != 0 && year % 4 == 0) {
            System.out.println( year + " не високосный год");
        } else {
            System.out.println( year + " високосный год");
        }
    }

    public static void checkVersion (boolean clientOS, int year) {
        if (year >= 2015) {
            if (clientOS) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else {
            if (clientOS) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public  static byte calculationDeliveryDay (int deliveryDistance){
        byte deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }

    public static void main(String[] args) {

        System.out.println("_______Задание 1________");

        checkLeapYear(Integer.parseInt(System.console().readLine("Enter the year: ")));

        System.out.println("_______Задание 2________");

        Random rn = new Random();
        boolean clientOS = rn.nextBoolean();

        checkVersion(clientOS, LocalDate.now().getYear());

        System.out.println("_______Задание 3________");

        int deliveryDistance = Integer.parseInt(System.console().readLine("Specify the approximate distance from you to the office: "));
        if(calculationDeliveryDay(deliveryDistance) <= 3) {
            System.out.println("Потребуется дней: " + calculationDeliveryDay(deliveryDistance));
        }else {
            System.out.println("Доставки нет");
        }
    }

}