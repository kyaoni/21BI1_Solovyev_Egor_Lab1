import java.util.InputMismatchException;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int flag=0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число типа int");
            num1 = in.nextInt();
            System.out.println("Введите второе число типа int");
            num2 = in.nextInt();
            System.out.println("Введите третье число типа int");
            num3 = in.nextInt();
            System.out.println("Введите четвертое число типа int");
            num4 = in.nextInt();
            in.close();
        } catch (InputMismatchException e) {
                System.out.println("Ошибка, некорректные данные");
                flag=1;
        }
        if (flag==0) {
            if ((num1 <= num2) & (num1 <= num3) & (num1 <= num4))
                System.out.println("Наименьшее значение " + num1);
            if ((num2 <= num1) & (num2 <= num3) & (num2 <= num4))
                System.out.println("Наименьшее значение " + num2);
            if ((num3 <= num2) & (num3 <= num1) & (num3 <= num1))
                System.out.println("Наименьшее значение " + num3);
            if ((num4 <= num2) & (num4 <= num3) & (num4 <= num1))
                System.out.println("Наименьшее значение " + num4);
        }
    }
}