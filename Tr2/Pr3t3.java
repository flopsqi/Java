import java.util.Scanner;
public class Pr3t3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String password;
            do {
                System.out.println("Введите пароль: ");
                password = scanner.nextLine();
                if (!password.equals("java123")) {
                    System.out.println("Неверный пароль. Попробуйте снова.");
                }
            } while (!password.equals("java123"));
            System.out.println("Доступ разрешён!");
            scanner.close();
        }
    }
