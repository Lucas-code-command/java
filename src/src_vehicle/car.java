package src.src_vehicle;

public class car {
    private int speed;

    public void setSpeed(int s){
        this.speed = s;
    }

    public int getSpeed(){
        return speed;
    };

    //constructor

    private String model;
    
    public void setModel(String marca){
        this.model = marca;
    }
    
    car(){
        this.setModel("BMW") ;
    };

    car(String marca){
        this.setModel(marca);
    }


    public String getModel(){
        return model;
    };
}
