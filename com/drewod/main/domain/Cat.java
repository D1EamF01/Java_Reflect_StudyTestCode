package domain;
public class Cat {
    private String name;
    private Integer age;

    public Cat() {
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }

    public void introduce() {
        System.out.println(name + "是一只猫，今年" + age + "岁");
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }
}
