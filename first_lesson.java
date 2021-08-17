import java.util.Scanner;

class Myclass {
    public static void Z (String[ ] args){
        String name = "Lucas";
        int age = 20;
        char group = 'M';
        boolean estuda = true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(group);
        System.out.println(estuda);
    }}

/* 
char stands for character and holds a single character.
boolean x = false; 
Double numero_complexo = 10.001;
*/

class Input {
    public static void x(String[ ] args){
        Scanner inputOne = new Scanner(System.in);
        System.out.println(inputOne.nextLine());
    }
}

// Modulo retorna aquilo que sobrou da divisão

class Numeros {
    public static void y (String[ ] args) {
        Scanner inputTwo = new Scanner(System.in);
        int input = inputTwo.nextInt();
        int result = input / 10;
        System.out.println(result);
    }
}

// incremet ++t decrement --t
// postfix a variable is first the value, then incremented t++

class CounterDaystoSecs {
    public static void x (String[ ] args) {
        Scanner input_zero = new Scanner(System.in);
        int input_one = input_zero.nextInt();

        int daysHours = input_one * 24;
        int hoursMin = daysHours * 60;
        int hoursSec = hoursMin * 60;

        System.out.println(hoursSec);
    }
}

class mySystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Scanner neue = new Scanner(System.in);
        char sex = neue.next().charAt(0);

        if (age > 18 && sex == 'm') {
            System.out.println("Hellcome");
        }else if (age == 18 || sex == 'f') {
            System.out.println("Almost");
        }else {
            System.out.println("LOOOOSER");
        }

        }
    }
