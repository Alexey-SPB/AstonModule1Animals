//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("кошка");
        System.out.println(cat);
        cat.describeWool();
        cat.hasSpine();
        System.out.println();

        Fish fish = new Fish("рыба");
        System.out.println(fish);
        fish.liveInWater();
        System.out.println();

        Bear bear = new Bear("медведь");
        System.out.println(bear);
        bear.describeWool();
        bear.hasSpine();
        System.out.println();

        Whale whale = new Whale("кит");
        System.out.println(whale);
        whale.liveInWater();
        whale.hasSpine();
        System.out.println();
    }
}