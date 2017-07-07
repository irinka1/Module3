import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;
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
        System.out.println("Введите размер массива:");

        int dlina = sc.nextInt();

        int []mas = new int[dlina];

        System.out.println("Введите числа в массив: ");

        for (int i=0;i<mas.length;i++)
        {mas[i]=sc.nextInt();}
        String x=Arrays.toString(mas);

        int max = mas[0];
        int min = mas[0];


              for (int j = 0; j < mas.length; j++) {
                  if (mas[j] > max)
                  { max=mas[j] ;
                  }
                else if (mas[j] < min) {
                      min=mas[j];
                  }
              }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        int p =0;
        for (int h=0; h<mas.length;h++) {
            if (mas[h]==5)
            {p++;}
        }
        System.out.println("Количество 5 = "+p);
//делаем сортировку пузырьком
        for(int s=0; s <mas.length; s++){
            for(int j = s; j >=1; j--) {
                if (mas[j-1] > mas[j]) {
                    int t = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = t;


                }
            }
        }
        String x1=Arrays.toString(mas);
        System.out.print("Отсортированный массив:   "+x1);

        }
    }