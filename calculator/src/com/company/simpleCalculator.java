package com.company;
import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Обьявление переменных
        double firstNum;
        double secondNum;
        double division = 0, addition = 0, subtraction = 0, multiplication = 0;
        String userChoice = "";
        String choices[] = {"+","*","/","-"};

        //Запросить ввод пользователя
        System.out.print("Введите первое число: ");
        firstNum = input.nextDouble();
        System.out.println("Какую операцию вы хотите выполнить с этими числами?");
        System.out.println("+ " +"* " +"- " + "/ ");
        userChoice = input.next();
        System.out.print("Введите второе число: ");
        secondNum = input.nextDouble();

        //Операции
        addition = firstNum + secondNum;
        subtraction = firstNum - secondNum;
        multiplication = firstNum * secondNum;
        division = firstNum / secondNum;

        //Ответ
        if (userChoice.equals("+")){
            System.out.print("Ответ = " + addition);
        }
        else if (userChoice.equals("-")){
            System.out.print("Ответ = " + subtraction);
        }
        else if (userChoice.equals("*")){
            System.out.print("Ответ = " + multiplication);
        }
        else if (userChoice.equals("/")){
            System.out.print("Ответ = " + division);
        }

    }
}
