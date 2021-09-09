/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Arithmetic {
    Scanner input = new Scanner(System.in); // Объявляем Scanner
    private int size;   //размер массива
    private int mul;  //произведение 
    private int sum;   //сумма
    private int[] array;   //массив чисел
    
    /**
     * метод для ввода чисел
     */
    void getNum() {
        System.out.println("Введите количество аргументов: ");
        size = input.nextInt(); // Читаем с клавиатуры размер массива 
        array = new int[size]; 
        System.out.println("Введите целые числа:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
    }
    
    /**
     * метод для подсчета суммы чисел
     */
    void sumNum() {
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
    }

    /**
     * метод для подсчета произведения чисел
     */
    void multiplyNum() {
        mul = 1;
        for (int i = 0; i < size; i++) {
            mul = mul * array[i]; 
        } 
    }
    
    /**
     * метод для вывода результата суммы и произведения чисел 
     */
    void resultNum() {
        System.out.printf("Сумма чисел: %d  Происзведение чисел: %d  \n", sum, mul);
    }
}   

