import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here        
        for (int i=1 ; i<=arr.length ; i++){
            char nova = arr[arr.length-i];
            // aprender a voltar para uma string
            System.out.println(nova);
        }
        scanner.close();
	}
}
