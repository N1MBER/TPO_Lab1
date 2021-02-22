package main.thirdBlock;

public abstract class Being {
    private String name;
    private int age;

    Being() {
        this.name = "undefined";
        this.age = 0;
    }

    Being(String name) {
        this.name = name;
        this.age = 0;
    }

    Being(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
