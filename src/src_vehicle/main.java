package src.src_vehicle;

class vehicle {
    public static void main(String[] arg){
        
        car v1 = new car("wolks");
        car v2 = new car();
        System.out.println(v1.getModel());
        System.out.println(v2.getModel());


    
        v1.setSpeed(170);
        System.out.println(v1.getSpeed());
    }
}
