import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/** Create a new project on GitHub and on the local computer Write a program that:
 1. on the input through the console takes the size of the array
 2. the input through the console takes an array of numbers
 3. find the minimum number in the array and output to the console (without using sorting)
 4. Find the maximum number in the array and output to the console (without using sorting)
 5. Count the number of repetitions of the number 5 and output to the console
 6. output to the console the sorted array
 * Created by i on 05.07.2017.
 */
public class DZ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        int dlina = sc.nextInt();

        int []mas = new int[dlina];

        System.out.println("Enter the numbers in the array: ");

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

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        int p =0;
        for (int h=0; h<mas.length;h++) {
            if (mas[h]==5)
            {p++;}
        }
        System.out.println("amount 5 = "+p);
//do the sorting with a bubble
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
        System.out.print("Sorted array:   "+x1);

        }
    }
