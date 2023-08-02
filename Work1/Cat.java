public class Cat implements INameAge{


    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
         this.age = age;
    }

    void showDem() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " лет. " + homeAnimals());
    }

}

