public class Car {
    private final String brand;
    private final String engineType;
    private final String transmission;
    private final String color;
    private final Integer capacity;


    public String getBrand() {
        return brand;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public Integer getCapacity() {
        return capacity;
    }

    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.capacity = builder.capacity;
    }

    protected static class CarBuilder{
        private String brand;
        private String engineType;
        private String transmission;
        private String color;
        private Integer capacity;

        public CarBuilder brand(String brand){
            this.brand = brand;
            return this;
        }

        public CarBuilder engineType(String engineType){
            this.engineType = engineType;
            return this;
        }

        public CarBuilder transmission(String transmission){
            this.transmission = transmission;
            return this;
        }

        
        public CarBuilder color(String color){
            this.color = color;
            return this;
        }

           
        public CarBuilder capacity(Integer capacity){
            this.capacity = capacity;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }


}
