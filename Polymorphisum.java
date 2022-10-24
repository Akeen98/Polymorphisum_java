class Vehicle{
    void park(){
        System.out.println(" ");
    }
}
class Car extends Vehicle{
    void park(){
        System.out.println("This Place For Car");
    }
}
class Bus extends Vehicle{
    void park(){
        System.out.println("This Place For Bus");
    }
}

class Van extends Vehicle{
    void park(){
        System.out.println("This Place For Van");
    }
}
class Polymorphisum{
    public static void main(String[] args){
        Vehicle v = new Van();//use machine for identify vehicle
        v.park();
    }
}
