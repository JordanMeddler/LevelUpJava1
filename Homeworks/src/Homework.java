public class Homework {

    public static void main(String[] args){

        linearEquation(5,8);
    }

//    Домашнее задание 1 пункт 4
//    Написать программу осуществляющую решение линейного уравнения ax + b = 0. a и b задаете в программе, х выводите на экран.
//
//    В задании ничего не сказано о типах для переменных a и b,
//    поэтому выбор оставляю за собой, пусть для наглядности это будет тип double.
    public static void linearEquation(double a, double b){
        System.out.println("Урок 1, задание 4:");
        System.out.println("Решаем уравнение: " + a + "x" + " + " + b + " = 0");
        System.out.println(-b/a);
    }
}
