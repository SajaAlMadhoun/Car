
public class Car1Test {
    public static void main(String []args){
        Car1 myHybird =new Car1(50);//50 miles per gallon
        myHybird.addGas(20);
        myHybird.drive(200);
        System.out.println(myHybird.getGasInTank());
        
    }
    
}
