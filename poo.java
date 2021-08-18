public class poo {
    static void sayName(String nome) {
        System.out.println(nome);
    }

    static int age(int age){
        return age;
    }

    public static void main(String arg[]){
        sayName("Lucas");
        int age_ = age(20);
        System.out.println(age_);
    }
    // void é para classes que não tem return ex=> main 

}
