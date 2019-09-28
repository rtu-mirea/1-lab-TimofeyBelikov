/**
 * Created by Timofey Belikov on 27.09.2019
 */

package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        test();

    }

    static void menu(Aray arr){
    int num=0;
    Scanner in = new Scanner(System.in);
      while (num!=7){

          { System.out.println("\n");
            System.out.println("Выполнить операцию: ");
            System.out.println("1. Ввод массива c клавиатуры");
            System.out.println("2. Ввод массива случайным образом");
            System.out.println("3. Вывод массива в нормальном порядке ");
            System.out.println("4. Вывод массива в обратном порядке");
            System.out.println("5. Определение количества чисел по диапозону ");
            System.out.println("6. Отсортировать содержимое массива по возрастанию");
            System.out.println("7. Завершение работы ");
            System.out.print("Выберите объект: ");
            num= in.nextInt();}
        switch (num)
        {
            case 1: arr.input_keyboard();                     //Ввод массива с клавиатуры
                break;

            case 2: arr.input_random(100,1);       //Рандомное заполнение массива
                break;

            case 3: arr.showLessIndex();                    //Вывод массива по коллекции
                break;

            case 4: arr.showInvesionUsingIndex();           //Вывод массива в обратном порядке
                break;

            case 5: arr.search(20,50);                      //Поиск среди массива по диапозону
                break;

            case 6: arr.sort();                            //Отсортировать массив по возрастанию
                break;

            case 7: System.exit(0);                 //Завершить работу
                break;

        }
    }
    }

    public static void test() {
        {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Введите длинну желаемого массива: ");
                int k = input.nextInt();  //Ввод длинны массива
                System.out.println("Будет создан массив длинны " + k);
                Aray arr = new Aray(k);                                     //Создание экзмпляра класса Aray
                menu(arr);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

}
