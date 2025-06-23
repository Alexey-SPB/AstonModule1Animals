public class Cat extends Mammal implements Wool, Spine{


    public Cat(String typeOfAnimal) {
        super(typeOfAnimal);
            }

        @Override
    public void describeWool(){
        System.out.println("У кошки есть шерсть");
    }
    @Override
    public void hasSpine(){
        System.out.println("У кошки есть позвоночник");
    }
    @Override
    public String toString() {
        return "Это " + super.toString();
    }
}