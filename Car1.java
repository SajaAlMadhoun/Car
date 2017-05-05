//https://www.youtube.com/watch?v=K3W7kCJbCUY&feature=youtu.be
// فيديو لشرح كيفية كتابة هذا الكود
public class Car1 {
private final double efficiency;
private double gas;
public Car1(double anEfficiency){
    efficiency=anEfficiency;}
public void addGas(double amount){
    gas=gas+amount;}
public void drive(double distance){
    gas=gas-(distance/efficiency);}
public double getGasInTank(){
    return gas;}}

    
    
    

