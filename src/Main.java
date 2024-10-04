import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7};
        metod(n, arr);
        //System.out.println("вывод "+n);
    }

    public static void metod(int n, int[] arr) {
        System.out.println("вход в метод");


        try {
            for (int i = 0; i < arr.length; i++) {

                System.out.println(n);

                if (arr[i] == 0){
                throw new Exception(" В массиве НУЛЬ ");
                }
                else {
                n = n / arr[i];
                }


            }
        } catch (Exception err) { // ловит объект ошибки
            System.out.println(err.getMessage());
        }
    }
}