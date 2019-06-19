public class HomeWork1 {
    public static void main(String[] args) {
        byte varByte = -120;
        short varShort = 1806;
        int year =100, a, b, c, d;
        long varlong = 200000L;
        float varFloat = 1.86f;
        char varChar = 'y';
        boolean varBool = true;
        String name = "Пафнутий Никанорович";
        a = 10;
        b = 2;
        c = 3;
        d = 4;
        System.out.println("формула " + a + "*(" + b + "+(" + c + "/" + d + "))=" + calculator(a, b, c, d));
        System.out.println("результат работы проверки нахождения суммы a+b в пределах от 10 до 20 включительно а =" + a + ", b=" + b + " " + proverka(a, b));
        System.out.println("результат проверки числа " + a + "на отрицательность " + proverka2(a));
        vivod(name);
        visokosniGod(year);
    }

    public static float calculator(int a, int b, int c, int d) {
        float result = 0;
        result = (float) c / d;
        result = a * (b + result);
        return result;
    }

    public static boolean proverka(int a, int b) {
        boolean result = true;
        int c = a + b;
        if (c >= 10) {
            if (c <= 20) {
                result = true;
            }
        } else result = false;
        return result;
    }

    public static boolean proverka2(int a) {
        boolean result;
        if (a < 0) {
            result = true;
        } else result = false;
        return result;
    }

    public static int vivod(String a) {
        System.out.println("Приуетег " + a);
        return 0;
    }

    public static int visokosniGod(int year) {
        if (year % 4 == 0) {if (year<100){System.out.println("ГОД" + year + "-Високосный");}
            else if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("ГОД" + year + "-Високосный");
                } else {
                    System.out.println("ГОД" + year + "-не високосный");
                }
            } else {
                System.out.println("ГОД" + year + "-не високосный");
            }
                }
        else{
            System.out.println("ГОД" + year + "-не високосный");
        }
        return 0;
    }
}

