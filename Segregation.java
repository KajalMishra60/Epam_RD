class Car{
    public Car(){
        System.out.println("Car is created");
    }
}
interface ParkingIN {
    public void parkCar();
	public void unparkCar();
	public void getCapacity();	
}
interface FreeParking extends ParkingIN{
  
}
interface PaidParking extends ParkingIN{
    public double calculateFee(Car car); 
	public void doPayment(Car car);
}
class Parking implements FreeParking{
    public void parkCar(){
        System.out.println("Add the car");
    }
	public void unparkCar(){
        System.out.println("Remove the car");
    }
	public void getCapacity(){
        System.out.println("10");
    }
}
public class Segregation{

    public static void main(String[] ar){
        Parking obj=new Parking();
        obj.parkCar();
        obj.unparkCar();
        obj.getCapacity();
    }
}