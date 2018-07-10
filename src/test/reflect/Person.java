package reflect;

/**
 * Created by ZX on 2018/7/10.
 *
 * @param
 * @return
 */
public class Person {

    int age;

    private int weight;

    protected int height;

    public String name="testPerson";

    int[] array;

    private void eat(String a){
        System.out.println("eat something:"+a);
    }

    protected void drink(String a,String b){
        System.out.println("drink :"+a+" with "+b);
    }

     void sing(){
         System.out.println("sing a song");
    }

    public void say(){
        System.out.println("hello world");
    }

    public Person() {

    }


    private Person(String name) {
        this.name = name;
    }

    public Person(int age) {
       this.age = age;
    }

    public Person(int age,int weight) {
        this.age = age;
        this.weight = weight;
    }


    public Person(int age,int weight,int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    /* public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }*/


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
