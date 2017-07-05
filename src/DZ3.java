import java.util.Scanner;

/**Создать новый проект на GitHub и на локальном компе Написать программу которая:
 1. на вход через консоль принимает размер массива
 2. на вход через консоль принимает массив чисел
 3. найти минимальное число в массиве и вывести в консоль (без использования сортировки)
 4. найти максимальное число в массиве и вывести в консоль (без использования сортировки)
 5. посчитать кол-во повторений числа 5 и вывести в консоль
 6. вывести в консоль отсортированный массив
 * Created by i on 05.07.2017.
 */
public class DZ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите числа в массив: ");
        int a = sc.nextInt();
        int[] mas = new int[a];
        int max = mas[0];
        int min = mas[0];
        int p = mas[0];
        for (int i = 0; i < mas.length; i++) {    //считываем числа как элементы массива
            mas[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < mas.length; i++) {    //выбираем макс
            if (mas[i] > max)
                max = mas[i];

            if (mas[i] < min)                       //выбираем мин
                min = mas[i];

                }
        for (int i = 0; i < mas.length; i++) {
           if (mas[i] == 5) {                   //ищем числа 5
            p = 1;
            System.out.println(p);}}

         for (int i = 0; i<mas.length; i++){      //сортировка пузырьком по возрастанию
                for(int j =1; j<(mas.length-i); j++) {
                    if (mas [j-1]>mas[j])
                    {
                        int temp = mas[i];
                        mas[j-1]=mas[j];
                        mas [j] =temp;

                    }

                    for (int mass :mas);

          }
        }


            System.out.println(mas);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        }
    }