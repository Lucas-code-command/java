import java.util.Scanner;

class Myclass {
    public static void main (String[ ] args){
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