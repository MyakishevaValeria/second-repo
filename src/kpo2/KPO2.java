/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo2;

/**
 *
 * @author Admin
 */
public class KPO2 {

    /**
     * @param args the command line arguments
     */

   
public static void main(String[] args) {
	Arithmetic arithmetic = new Arithmetic();   //создаем объект класса
        arithmetic.getNum();   //используем метод для ввода данных
        arithmetic.sumNum();   //используем метод для подсчета суммы чисел
        arithmetic.multiplyNum();   //используем метод для подсчета произведения чисел
        arithmetic.resultNum();    //используем метод для вывода суммы и произведения чисел
        }
}     
    


