import java.util.Objects;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;
        if (typeOfGroup.equals("Students")){
            if (dayOfWeek.equals("Friday")){
                price = 8.45;
            }else if (dayOfWeek.equals("Saturday")){
                price = 9.80;
            }else if (dayOfWeek.equals("Sunday")){
                price = 10.46;
                // 313.8 - 47.07
            }
            totalPrice = price * people;
            if (people >= 30){
                totalPrice = totalPrice - 0.15 * totalPrice;
            }
        }else if (typeOfGroup.equals("Business")){
            if (dayOfWeek.equals("Friday")){
                price = 10.90;
            }else if (dayOfWeek.equals("Saturday")){
                price = 15.60;
            }else if (dayOfWeek.equals("Sunday")){
                price = 16;
            }
            totalPrice = price * people;
            if (people >= 100){
                totalPrice = totalPrice - 10 * price;
            }
        }else if (typeOfGroup.equals("Regular")){
            if (dayOfWeek.equals("Friday")){
                price = 15;
            }else if (dayOfWeek.equals("Saturday")){
                price = 20;
            }else if (dayOfWeek.equals("Sunday")){
                price = 22.50;
            }
            totalPrice = price * people;
            if (people >= 10 && people <= 20){
                totalPrice = totalPrice - 0.05 * totalPrice;
            }
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
