public class Whale extends Mammal implements  Water,Spine{
    public Whale(String typeOfAnimal) {
        super(typeOfAnimal);
    }

    @Override
    public void liveInWater(){
        System.out.println("Кит живет в воде");
    }
    @Override
    public void hasSpine(){
        System.out.println("У кита есть позвоночник");
    }

    @Override
    public String toString() {
        return "Это " + super.toString();
    }
}