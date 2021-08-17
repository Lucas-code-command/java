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
        inputOne.close();
    }
}

// Modulo retorna aquilo que sobrou da divisão

class Numeros {
    public static void y (String[ ] args) {
        Scanner inputTwo = new Scanner(System.in);
        int input = inputTwo.nextInt();
        int result = input / 10;
        System.out.println(result);

        inputTwo.close();
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

        input_zero.close();
    }
}

class mySystem {
    public static void x(String[] args){
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

        scanner.close();
        neue.close();
        }
    }

class switchOps {
    public static void x (String[ ] args){
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        //in case of
        switch(days){
            case 3,4,5,6 :
                System.out.println("some");
                break;
            case 7,8,9,10 :
                System.out.println("days");
                break;
            default:
                System.out.println("This is the Default.");
        }
        input.close();

        int week = 1;
        String toDays = switch(week){
            case 1,2,3,4,5,6 -> "Work";
            case 7,8 -> "Relax";
            default -> "invalid day";
        };
        System.out.println(toDays);
    }
}

/*
initialization int i = 0 ; i>2 ; i++
for (initialization; condition; increment/decrement) {
   statement(s)
}
*/

class doWhile {
    public static void x(String args[]) {
        int x = 0;
        do{
            System.out.println(x);
            x++;
        }while(x < 5);
    }
}

class conpass {
    public static void x(String args[]){
        int x = 5;
        while (x > 4) {
            System.out.println(x);
            if (x == 6){
                break;    
            }
            x++;
        }

        System.out.println("Continue");

        for (int i = 10; i <= 40; i = i+10){
            if (i==30){
                continue; //pass
            }
            System.out.println(i);
        }
    }
}

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextInt();
		//your code goes here
		
		for (int months = 0; months<=3 ; months++){
			amount = (amount/0.1)-amount;
            System.out.println(amount);
		}

        scanner.close();
    }
}