import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число N");
        int n = scanner.nextInt();
        int[] arr = { 1, 2, 3, 0, 5, 6, 7};
        metod(n, arr);

    }

    public static void metod(int n, int[] arr) {
        System.out.println("вход в метод");


        try {
            for (int i = 0; i < arr.length; i++) {

                //System.out.println(n);

                if (arr[i] == 0){
                throw new OurExeption(" В массиве НУЛЬ ");
                }
                else {
                n = n / arr[i];

                System.out.println(n);

                }


            }
        } catch (Exception err) { // ловит объект ошибки
            System.out.println(err.getMessage());
        }
    }
} class OurExeption extends Exception {

    public OurExeption(String message) {
        super(message); //вызов конструктора родительского класса.
    }
}
