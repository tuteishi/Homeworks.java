package homework3cyclesArrays;

import java.util.Random;
import java.util.Scanner;
public class Cat {
    private int age = 15;
    private String name = "Cezar";
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void chain(){

        Cat cat = new Cat();
        int numberOfChoice = 0;

        while (numberOfChoice >= 0 ){
            System.out.println("Choose way:");
            System.out.println("1. While (defolt) \n" +
                    "2. While (random) \n" +
                    "3. For \n" +
                    "4. Do while \n" +
                    "5. For each \n" + "Enter:");

            Scanner in = new Scanner(System.in);
            numberOfChoice = in.nextInt();

            switch (numberOfChoice) {
                case 1:
                    numberOfChoice = 1;
                    defoltCat();
                    break;
                case 2:
                    numberOfChoice = 2;
                    whileNameAge();
                    break;
                case 3:
                    numberOfChoice = 3;
                    forNameAgeSettersGettrs();
                    break;
                case 4:
                    numberOfChoice = 4;
                    doWhileNameAge();
                    break;
                case 5:
                    numberOfChoice = 5;
                    forEachNameAge();
                    break;
                default:
                    System.out.println("Enter way error!");
                    break;
            }
        }
    }

    //____________________________________________________________________________________________________
    /*4.while создает 10 котиков и выводит на консоль дефолтное ( далее рандомное)  имя и возраст*/
    public static void defoltCat() {
        int i = 0, j = 0, age = 0;
        String name = null;
        while (i < 9) {
            System.out.print("Name cat: " + name);
            i++;
            while (j < 9) {
                System.out.println("  Age cat: " + age);
                j++;
                break;
            }
        }
    }

    public static void whileNameAge() {

        int catAge[] = new int[10];

         int i = 0;
         int j = 0;
         int k = 0;

        while (j <9) {
            System.out.print("Cat name: ");
            int m = 3 + (int) (Math.random() * 7);
            while (k < m) {
                Random letter = new Random();
                char symbol =  (char)(letter.nextInt(26) + 'A');
                System.out.print(symbol);
                k++;
            }
            k = 0;
            j++;
            System.out.print("  ");
            while (i < catAge.length) {
                catAge[i] = ((int) (Math.random() * 28));
                System.out.print("Cat age: ");
                System.out.print(catAge[i] +"\n");
                i++;
                break;
            }
        }
    }
//____________________________________________________________________________________________________
    /* 5.for создаем 10 котиков, вводим их возраст и имя через сеттер, и   выводим в консоль через геттер.*/
    public static void forNameAgeSettersGettrs() {

        Cat cat = new Cat();

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++){
                System.out.print("Enter cat name: ");
                Scanner in = new Scanner(System.in);
                cat.setName(in.nextLine());
                break;
            }
            System.out.print("Enter cat age: ");

            Scanner in = new Scanner(System.in);
            cat.setAge(in.nextInt());

                while (cat.getAge() > 28) { // Проверка на не правильно введенные данные
                    System.out.println("Error! Age must be < 28!");
                    System.out.print("Enter cat age again: ");

                    Scanner newIn = new Scanner(System.in);
                    cat.setAge(in.nextInt());

                    System.out.println( "Success new age!");
                }
            System.out.println("Cat name - " + cat.getName()+ ",  cat age -  " + cat.getAge() );
            System.out.println();
        }
    }

    //____________________________________________________________________________________________________
    /* 6.do while создает 10 котиков вводит имя и возраст через конструктор.Выводим в консоль.*/
    public static  int randomAgeForConstructor(){
        Random randomAge = new Random();
        int age = randomAge.nextInt(28);
                return age;
    }

    public static String randomNameForConstructor(){
        String nameCat[]= { "Barsic","Mazer","Boris","Albert","Feofan","Tom","Leopold", "Fedor", "Chernysh", "Hel"};
        Random numberCat = new Random();
        int number = numberCat.nextInt(10);
       return nameCat[number];
        }

    public Cat (String name, int age){
        this.name = randomNameForConstructor();
        this.age = randomAgeForConstructor();
    }
    public Cat () {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void doWhileNameAge() {
        int i = 0;
    do {
        Cat cat = new Cat(randomNameForConstructor(), randomAgeForConstructor());
        System.out.println(cat);
        i++;
    }
    while (i < 9);
    }

    //____________________________________________________________________________________________________
    /*7. цикл foreach выводит массив из пяти котиков, у них выводим name/age*/
    public static void forEachNameAge() {

        String nameCat[]= { "Barsic","Boris","Albert","Feofan","Tom","Leopold", "Fedor"};
        int ageCat [] = new int [5];
        Random numberCat = new Random();

        for (int ageCatNumber:ageCat) {
            for (String nameCatNumber: nameCat) {

                int number = numberCat.nextInt(5);
                System.out.print("Cat name: " + nameCat[number] + "  ");
                break;
            }
               int  number = numberCat.nextInt(28);
                System.out.println("Cat age: " + number);
        }
    }
}