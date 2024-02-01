public class CarTest {
    
        public static void main(String[] args){
            
            Car myCar = new Car.CarBuilder()
            .brand("Tesla")
            .engineType("Tesla Model S")
            .transmission("1-speed automatic")
            .color("Matte Black")
            .capacity(5)
            .build();

            System.out.println("Car brand: "+myCar.getBrand());
            System.out.println("Engine type: " + myCar.getEngineType());
            System.out.println("Transmission: " + myCar.getTransmission());
            System.out.println("Color: " + myCar.getColor());
            System.out.println("Capacity: " + myCar.getBrand());


        }
    
}
