public class Fish extends Animal implements Water{


    public Fish(String typeOfAnimal) {
        super(typeOfAnimal);
    }

    @Override
    public void liveInWater(){
        System.out.println("Рыба плавает в воде");
    }

    @Override
    public String toString() {
        return "Это " + super.toString();
    }
}