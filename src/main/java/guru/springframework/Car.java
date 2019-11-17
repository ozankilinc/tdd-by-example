package guru.springframework;


public class Car {
    private Model model;
    private int age;
    private int tierCount;
    private String engineName;
    private int speed;

    private Car(Model model, int age, int tierCount, String engineName, int speed) {
        this.model = model;
        this.age = age;
        this.tierCount = tierCount;
        this.engineName = engineName;
        this.speed = speed;
    }

    public Model getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public int getTierCount() {
        return tierCount;
    }

    public String getEngineName() {
        return engineName;
    }

    public int getSpeed() {
        return speed;
    }

    public static CarBuilder aNewCarBuilder() {
        return new CarBuilder();
    }
    public static class CarBuilder{
        private Model model;
        private int age;
        private int tierCount;
        private String engineName;

        private CarBuilder(){

        }

        public CarBuilder withModel(Model model){
            this.model = model;
            return this;
        }

        public CarBuilder withAge(int age){
            this.age = age;
            return this;
        }

        public CarBuilder withTierCount(int tireCount) {
            this.tierCount = tireCount;
            return this;
        }

        public CarBuilder withEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }

        public Car build() {
            return Model.Mercedes.equals(model) ?
                    new Car(model, age ,tierCount, engineName, 200) :
                    new Car(model, age, tierCount, engineName, 180);
        }
    }
}
