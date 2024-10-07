import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main m = new Main();
        // №1.1
        double x = 0;
        boolean validInput1 = false;
        while (!validInput1) {
            System.out.print("1.1. Введите вещественное число: ");
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                validInput1 = true;
            } else {
                System.out.println("Ошибка, введите корректное вещественное число.");
                in.next();
            }
        }
        double result = m.fraction(x);
        System.out.println("Дробная часть числа равна: " + result);
        // №1.1
        // №1.3
        System.out.print("1.3. Введите символ от '0' до '9': ");
        char y = in.next().charAt(0);

        if (y >= '0' && y <= '9') {
            int numberResult = m.charToNum(y);
            System.out.println("Результат преобразования символа '" + y + "' в число: " + numberResult);
        } else {
            System.out.println("Ошибка: Пожалуйста, введите символ от '0' до '9'.");
        }
        // №1.3
        // №1.5
        int z = 0;
        boolean validInput2 = false;
        while (!validInput2) {
            System.out.print("1.5. Введите число: ");
            if (in.hasNextInt()) {
                z = in.nextInt();
                validInput2 = true;
            } else {
                System.out.println("Ошибка, введите корректное число.");
                in.next();
            }
        }
        boolean DvyhChislo = m.is2Digits(z);
        System.out.println("результат: "+DvyhChislo);
        // №1.5
        // №1.7
        int a = 0;
        int b = 0;
        int num = 0;
        boolean validInput3 = false;
        while (!validInput3) {
            System.out.print("1.7. Введите числа a, b, num: ");
            if (in.hasNextInt()) {
                a = in.nextInt();
                b = in.nextInt();
                num = in.nextInt();
                validInput3 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        boolean Diapazon = m.isInRange(a,b,num);
        System.out.println("результат: "+Diapazon);
        // №1.7
        // №1.9
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        boolean validInput4 = false;
        while (!validInput4) {
            System.out.print("1.7. Введите числа a, b, c: ");
            if (in.hasNextInt()) {
                a1 = in.nextInt() ;
                b1 = in.nextInt();
                c1 = in.nextInt();
                validInput4 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        boolean Ravenstvo = m.isEqual(a1,b1,c1);
        System.out.println("результат: "+Ravenstvo);
        // №1.9
        // №2.1
        int a2 = 0;
        boolean validInput5 = false;
        while (!validInput5) {
            System.out.print("2.1. Введите число: ");
            if (in.hasNextInt()) {
                a2 = in.nextInt() ;
                validInput5 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        int modul = m.abs(a2);
        System.out.println("x =  "+modul);
        // №2.1
        // №2.3
        int a3 = 0;
        boolean validInput6 = false;
        while (!validInput6) {
            System.out.print("2.3. Введите число: ");
            if (in.hasNextInt()) {
                a3 = in.nextInt() ;
                validInput6 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        boolean delenie35 = m.is35(a3);
        System.out.println("результат:  "+delenie35);
        // №2.3
        // №2.5
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        boolean validInput7 = false;
        while (!validInput7) {
            System.out.print("2.5. Введите число(a) x,y,z: ");
            if (in.hasNextInt()) {
                x1 = in.nextInt() ;
                y1 = in.nextInt() ;
                z1 = in.nextInt() ;
                validInput7 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        int maksTri = m.max3(x1,y1,z1);
        System.out.println("результат:  "+maksTri);
        // №2.5
        // №2.7
        int x2 = 0;
        int y2 = 0;
        boolean validInput8 = false;
        while (!validInput8) {
            System.out.print("2.7. Введите число(a) x,y: ");
            if (in.hasNextInt()) {
                x2 = in.nextInt() ;
                y2 = in.nextInt() ;
                validInput8 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        int summaXY = m.sum2(x2,y2);
        System.out.println("результат:  "+summaXY);
        // №2.7
        // №2.9
        int x3 = 0;
        boolean validInput9 = false;
        while (!validInput9) {
            System.out.print("2.9. Введите день недели(число): ");
            if (in.hasNextInt()) {
                x3 = in.nextInt() ;
                validInput9 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(день недели).");
                in.next();
            }
        }
        String denNedeli = m.day(x3);
        System.out.println("результат:  "+denNedeli);
        // №2.9
        // №3.1
        int x4 = 0;
        boolean validInput10 = false;
        while (!validInput10) {
            System.out.print("3.1. Введите число: ");
            if (in.hasNextInt()) {
                x4 = in.nextInt() ;
                validInput10 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        String StrokaChisel = m.listNums(x4);
        System.out.println("результат:  "+ StrokaChisel);
        // №3.1
        // №3.3
        int x5 = 0;
        boolean validInput11 = false;
        while (!validInput11) {
            System.out.print("3.3. Введите число: ");
            if (in.hasNextInt()) {
                x5 = in.nextInt() ;
                validInput11 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        String StrokaChisel2 = m.chet(x5);
        System.out.println("результат:  "+ StrokaChisel2);
        // №3.3
        // №3.5
        long x6 = 0;
        boolean validInput12 = false;
        while (!validInput12) {
            System.out.print("3.5. Введите число: ");
            if (in.hasNextBigInteger()) {
                x6 = in.nextLong() ;
                validInput12 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        int KolvoZnakov = m.numLen(x6);
        System.out.println("результат:  "+ KolvoZnakov);
        // №3.5
        // №3.7
        int x7 = 0;
        boolean validInput13 = false;
        while (!validInput13) {
            System.out.print("3.7. Введите сторону квадрата: ");
            if (in.hasNextInt()) {
                x7 = in.nextInt() ;
                validInput13 = true;
            } else {
                System.out.println("Ошибка, введите корректную сторону.");
                in.next();
            }
        }
        m.square(x7);
        // №3.7
        // №3.9
        int x8 = 0;
        boolean validInput14 = false;
        while (!validInput14) {
            System.out.print("3.9. Введите высоту треугольника: ");
            if (in.hasNextInt()) {
                x8 = in.nextInt() ;
                validInput14 = true;
            } else {
                System.out.println("Ошибка, введите корректную сторону.");
                in.next();
            }
        }
        m.rightTriangle(x8);
        // №3.9
        // №4.1
        int x9 = 0;
        boolean validInput15 = false;
        while (!validInput15) {
            System.out.print("4.1. Введите число: ");
            if (in.hasNextInt()) {
                x9 = in.nextInt() ;
                validInput15 = true;
            } else {
                System.out.println("Ошибка, введите корректное число(а).");
                in.next();
            }
        }
        System.out.print("Введите размер массива: ");
        int size = 0;
        while (true) {
            if (in.hasNextInt()) {
                size = in.nextInt();
                if (size > 0) {
                    break; // размер положительный - выход из цикла
                } else {
                    System.out.println("Ошибка, введите корректное число(положительное).");
                }
            } else {
                System.out.println("Ошибка, введите корректное число.");
                in.next();
            }
        }
        int[] massiv = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Элемент " + (i + 1) + ": ");
                if (in.hasNextInt()) {
                    massiv[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число.");
                    in.next();
                }
            }
        }
        int indeks = findFirst(massiv, x9);
        System.out.println("результат: " + indeks);
        // №4.1
        // №4.3
        System.out.print("4.3. Введите размер массива: ");
        int size1 = 0;
        while (true) {
            if (in.hasNextInt()) {
                size1 = in.nextInt();
                if (size1 > 0) {
                    break; // размер положительный - выход из цикла
                } else {
                    System.out.println("Ошибка, введите корректное число(положительное).");
                }
            } else {
                System.out.println("Ошибка, введите корректное число.");
                in.next();
            }
        }
        int[] massiv1 = new int[size1];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size1; i++) {
            while (true) {
                System.out.print("Элемент " + (i + 1) + ": ");
                if (in.hasNextInt()) {
                    massiv1[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число.");
                    in.next();
                }
            }
        }
        int maksPoModuluInMassiv = maxAbs(massiv1);
        System.out.println("результат: " + maksPoModuluInMassiv);
        // №4.3
        // №4.5
        System.out.print("4.5. Введите размер массива №1: ");
        int size2 = 0;
        while (true) {
            if (in.hasNextInt()) {
                size2 = in.nextInt();
                if (size2 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число(положительное).");
                }
            } else {
                System.out.println("Ошибка, введите корректное число.");
                in.next();
            }
        }
        int[] massiv2 = new int[size2];

        System.out.println("Введите элементы массива №1:");
        for (int i = 0; i < size2; i++) {
            while (true) {
                System.out.print("Элемент " + (i + 1) + ": ");
                if (in.hasNextInt()) {
                    massiv2[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число.");
                    in.next();
                }
            }
        }
        System.out.print("4.5. Введите размер массива №2: ");
        int size3 = 0;
        while (true) {
            if (in.hasNextInt()) {
                size3 = in.nextInt();
                if (size3 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число(положительное).");
                }
            } else {
                System.out.println("Ошибка, введите корректное число.");
                in.next();
            }
        }
        int[] massiv3 = new int[size3];

        System.out.println("Введите элементы массива №2:");
        for (int i = 0; i < size3; i++) {
            while (true) {
                System.out.print("Элемент " + (i + 1) + ": ");
                if (in.hasNextInt()) {
                    massiv3[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число.");
                    in.next();
                }
            }
        }
        int x15 = 0;
        boolean validInput16 = false;
        while (!validInput16) {
            System.out.print("4.5. Введите позицию вставки: ");
            if (in.hasNextInt()) {
                x15 = in.nextInt() ;
                validInput16 = true;
            } else {
                System.out.println("Ошибка, введите корректную позицию.");
                in.next();
            }
        }
        int[] result1 = add(massiv2, massiv3, x15);
        System.out.print("результат: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // №4.5
        // №4.7
        System.out.print("4.7. Введите размер массива : ");
        int size4 = 0;
        while (true) {
            if (in.hasNextInt()) {
                size4 = in.nextInt();
                if (size4 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число(положительное).");
                }
            } else {
                System.out.println("Ошибка, введите корректное число.");
                in.next();
            }
        }
        int[] massiv4 = new int[size4];

        System.out.println("Введите элементы массива :");
        for (int i = 0; i < size4; i++) {
            while (true) {
                System.out.print("Элемент " + (i + 1) + ": ");
                if (in.hasNextInt()) {
                    massiv4[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число.");
                    in.next();
                }
            }
        }
        int[] perevernutiyMassiv = reverseBack(massiv4);
        System.out.print("Результат: [");
        for (int i = 0; i < perevernutiyMassiv.length; i++) {
            System.out.print(perevernutiyMassiv[i]);
            if (i < perevernutiyMassiv.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // №4.7
        // №4.9
        System.out.print("4.9. Введите размер массива : ");
        int size5 = 0;
        while (true) {
            if (in.hasNextInt()) {
                size5 = in.nextInt();
                if (size5 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число(положительное).");
                }
            } else {
                System.out.println("Ошибка, введите корректное число.");
                in.next();
            }
        }
        int[] massiv5 = new int[size5];

        System.out.println("Введите элементы массива :");
        for (int i = 0; i < size5; i++) {
            while (true) {
                System.out.print("Элемент " + (i + 1) + ": ");
                if (in.hasNextInt()) {
                    massiv5[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное число.");
                    in.next();
                }
            }
        }
        int x16 = 0;
        System.out.print("4.5. Введите число: ");
        x16 = in.nextInt() ;
        int[] result2 = findAll(massiv5, x16);
        System.out.print("Результат: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // №4.9
    }



    private boolean isEqual(int a, int b, int c) {
        return (a == b) && (a == c);
    }
    public int abs(int x) {
        if (x<0){
            return -x;
        }
        else{
            return x;
        }
    }
    public boolean is35 (int x){
        if ((x%3 == 0)&&(x%5 == 0)){
            return false;
        } else if ((x%3 == 0) || (x%5 == 0)) {
            return true;
        }
        return false;
    }
    public int max3 (int x, int y, int z){
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    public int sum2 (int x, int y){
        int zaz = 20;
        if (x+y >= 10 && x+y <= 19){
            return zaz;
        }else{
            return x+y;
        }
    }
    public String listNums (int x){
        String result = "";

        for (int i = 0; i <= x; i++) {
            result += i + (i < x ? " " : "");
        }

        return result;
    }
    public String chet (int x){
        String result = "";

        for (int i = 0; i <= x; i=i+2) {
            result += i + (i < x ? " " : "");
        }

        return result;
    }

    public int numLen (long x){
        if(x==0){
            return 1;
        }
        int lenght=0;
        while (x>0){
            x/=10;
            lenght +=1;
        }
        return lenght;
    }
    public void square (int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {  // пробелы для выравнивания по правому краю
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static int maxAbs(int[] arr) {
        int maxZnach = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxZnach)) {
                maxZnach = arr[i];
            }
        }

        return maxZnach;
    }
    public static int[] add (int[] arr, int[] ins, int pos){
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }

        return result;
    }
    public static int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }
    public static int[] findAll(int[] arr, int x) {
        int count = 0; //кол-во вхождений икса
        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }
        if (count == 0) {
            return new int[0];
        }
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index++] = i;
            }
        }

        return indices;
    }
    public String day (int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }
    public double fraction(double x) {
        return x - (int) x;
    }
    public int charToNum(char x){
        return x - '0';
    }
    public boolean is2Digits (int x){
        return (x >= 10 && x <=99) || (x >=-99 && x <=-10);
    }
    public boolean isInRange (int a, int b, int num){
        int min = (int)Math.min(a, b);
        int max = (int)Math.max(a, b);
        return num >= min && num <= max;
        }
    }