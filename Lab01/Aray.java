/**
 * Created by Timofey Belikov on 27.09.2019
 */
package com.company;
import java.lang.*;
import java.util.Scanner;

public class Aray {

        private int n;           //Длина массива
        private int[] arr;       //Целочисленный массив


    Aray(int n) throws Exception{
        if (n <=0) throw new Exception(new String("Kolichestvo elementov <=0"));
        this.n =n;
        arr=new int[this.n];        //Создание массива длинны n
    }

    void input_keyboard(){
        Scanner in=new Scanner(System.in);
        for(int i = 0; i< n; i++){
            System.out.print("Элемент "+(i+1)+" : ");
            arr[i]=in.nextInt();
            System.out.print("\n");
        }
    }                   //Метод ввода массива с клавиатуры

    void input_random(int max,int min){
        for (int i=0;i<n;i++){
            arr[i]=(int)(Math.random()* ++max +min);  //++max - Включает максимальное значение
        }
    }     //Метод ввода массива псевдослучайным образом

    void showUsingIndex(){
        for(int i=0;i<n;i++)
            System.out.print("element "+i+"= "+arr[i]+" \n");
    }                  //Метод вывода массива (перебор по индексу)

    void showLessIndex(){                 //Метод отображения массива без использования индекса(слева направо
        for(int i :arr){
            System.out.print(i+" ");
        }
    }                   //Метод вывода массива (перебор по коллекции)

    void showInvesionUsingIndex(){
        for(int i=n;i>0;i--)
            System.out.print( " "+arr[i-1]+ " ");
    }         //Метод вывода массива (В обратном порядке)

    void search(int min, int max){
        int k=0;
        for(int i=0;i<n;i++){
            if (arr[i]>=min && arr[i]<=max)
                k+=1;
        }
       System.out.println("Совпадений: "+k) ;
    }        //Метод поиска элементов массива, удовлетворяющих условию ( по диапозону)

    int[] sort(){
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
        }
        return arr;
    }

}
