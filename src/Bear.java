public class Bear extends Mammal implements Wool,Spine{
       public Bear(String typeOfAnimal) {
           super(typeOfAnimal);

    }


    @Override
    public void describeWool(){
        System.out.println("У медведя есть шерсть");
    }

    @Override
    public void hasSpine(){
        System.out.println("У медведя есть позвоночник");
    }

    @Override
    public String toString() {
        return "Это " + super.toString();
    }
}