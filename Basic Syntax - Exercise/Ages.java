import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 66){
            System.out.println("elder");
        } else if(age > 19){
            System.out.println("adult");
        } else if (age > 13) {
            System.out.println("teenager");
        } else if (age > 2) {
            System.out.println("child");
        } else {
            System.out.println("baby");
        }
    }
}