import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here        
        for (int i=1 ; i<=arr.length ; i++){
            char nova = arr[arr.length-i];
            String s = new StringBuilder().append(nova).toString();
            for (String each:s){
                
            }
            System.out.println(s);
            String x = s[0]+s[1];
        }
	}
}
