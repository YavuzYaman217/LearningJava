package Examples;

public class Cat {
    private String name;
    private int age;
    private static  int count = 0;
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
        count++;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Cat name : " + name + " age : " + age +" Count : " + count;
    }
    public static void Count(){
        System.out.println(count);
    }


}
