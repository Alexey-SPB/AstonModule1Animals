public abstract class Animal {
    private String typeOfAnimal;
    private int age;
    private int weight;

    public Animal(String typeOfAnimal){
        this.typeOfAnimal = typeOfAnimal;

    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String name) {
        this.typeOfAnimal = typeOfAnimal;
    }

        @Override
    public String toString(){
        return "тип животного: " + typeOfAnimal;
    }
}