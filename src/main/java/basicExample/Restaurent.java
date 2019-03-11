package basicExample;

public class Restaurent {
    Drink drink;
    String name;
    int age;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
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
//primitive type not allowed in constructor, use object-based

    public Restaurent( String name) {
        this.drink = drink;
        this.name = name;
    }

/*    public Restaurent(Drink drink) {
        this.drink = drink;
    }*/

    public void prepareDrink(Drink drink){

    }
}
