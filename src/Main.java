import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(happyDay(35,36));
        System.out.println(happyDay(15,-23));
        System.out.println(happyDay(46,10));
        System.out.println(happyDay(7,20));
        System.out.println(happyDay(65,-10));

        System.out.println(happyDay(generateRandomAge(),28));
        System.out.println(happyDay(generateRandomAge(),-30));
        System.out.println(happyDay(generateRandomAge(),12));
        System.out.println(happyDay(generateRandomAge(),-8));
    }

    public static String happyDay(
            int age, int temperature
    ){
        if (age>=20 && age<= 45 && temperature>=-20 && temperature<=30){
            return "Можно идти гулять";
        }else if (age<20 && temperature>=0 && temperature<=28){
            return "Можно идти гулять";
        }else if (age>45 && temperature>=-10 && temperature<=25){
            return "Можно идти гулять";
        }else {
            return "Оставайтесь дома!";
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(90);

    }
}