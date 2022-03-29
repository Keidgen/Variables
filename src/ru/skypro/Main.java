package ru.skypro;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
	    // Задача 1
        byte a = 100;
        short b = 500;
        int c = 40000;
        long d = 430L;
        char e = 33;
        float f = 5.3f;
        double g = 45.7;
        boolean h = true;

        // Задача 2
        double weightFirstBoxer = 78.2;
        double weightSecondBoxer = 82.7;
        double sumWeight = weightFirstBoxer + weightSecondBoxer;
        double sumDiff = abs(weightFirstBoxer - weightSecondBoxer);
        System.out.println("Общий вес двух бойцов равен " + sumWeight + " кг");
        System.out.println("Разница между весами бойцов равна " + sumDiff + " кг");
        System.out.println(" ");

        // Задача 3
        short weightBanana = 80; //грамм
        short weightMilk = 105;
        short weightIceCream = 100;
        short weightEgg = 70;

        int weightAll = (weightBanana*5)+(weightMilk*2)+(weightIceCream*2)+(weightEgg*4);
        System.out.println("Общий вес в граммах равен " + weightAll);
        int weightKgInt = weightAll/1000;
        int weightKgLeft = weightAll%1000;
        System.out.println("Общий вес равен " + weightKgInt + " кг и " + weightKgLeft + " грамм");
        System.out.println(" ");

        // Задача 4
        short needWeight = 7; //кг
        short weightOne = 250; // грамм
        short weightTwo = 500; // грамм

        int needDayOne = (needWeight*1000) / weightOne;
        int needDayTwo = (needWeight*1000) / weightTwo;
        int needDayAverage = (needDayOne + needDayTwo)/2;
        System.out.println(needDayOne + " дней уйдет, если терять в день " + weightOne + " грамм");
        System.out.println(needDayTwo + " дней уйдет, если терять в день " + weightTwo + " грамм");
        System.out.println("В среднем для похудения потребуется " + needDayAverage +" день");
        System.out.println(" ");

        // Задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        salary(salaryMasha, "Маши");
        salary(salaryDenis, "Дениса");
        salary(salaryKristina, "Кристины");

    }

    public static void salary ( int salary, String name){
        System.out.println("Зарплата " + name + " до повышения равна " + salary);
        int newSalary = salary + salary/10;
        System.out.println("Зарплата " + name + " после повышения равна " + newSalary);
        int salaryYear = salary * 12;
        System.out.println("Годовая зарплата " + name + " до повышения равна " + salaryYear);
        int newSalaryYear = newSalary * 12;
        System.out.println("Годовая зарплата " + name + " после повышения равна " + newSalaryYear);
        int diffSalaryYear = newSalaryYear - salaryYear;
        System.out.println("Разница между годовыми доходами " + name + " составит " + diffSalaryYear);
        System.out.println(" ");
    }
}
