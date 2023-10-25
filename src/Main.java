import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {


        System.out.println("Sortowanie przez wstawianie");
        System.out.println("Czy liczby wylosowac czy chcesz je wpisać?");
        System.out.println("Wpisz 1 dla losowania, lub cokolwiek dla wpisywania z klawiatury");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        System.out.println("Wpisz jaki ma byc rozmiar tablicy");
        int sizeOfArray = scanner.nextInt();
        double [] doubleArray = new double[sizeOfArray];
        if(userChoice.equals("1")){

            for(int i = 0; i < sizeOfArray; i++){
                doubleArray[i] = (double)(int)(random()*1000)/10;
            }

        }
        else {
            System.out.printf("Wpisz kolejno %d liczb oddzielonych spacjami\n", sizeOfArray);
            for(int i = 0; i < sizeOfArray; i++){
                doubleArray[i] = scanner.nextDouble();
                scanner.nextLine();
            }
        }
        System.out.println("Tablica przed sortowaniem");
        for (double itr: doubleArray
        ) {
            System.out.print(itr + " ");
        }

        System.out.println();
        System.out.println("Po sortowaniu");
        insertionSort(doubleArray);
        for (double element: doubleArray) {
            System.out.print(element + ", ");
        }

    }

    public static void insertionSort(double[] doubleArray){
        double temp;
        int n = doubleArray.length;
        for(int i = 1; i < n; i++){
            temp = doubleArray[i];
            for(int j = i - 1; j >=0; j--){
                if(doubleArray[j] > temp){
                    doubleArray[j+1] = doubleArray[j];
                    doubleArray[j] = temp;
                }
            }
        }
    }

}