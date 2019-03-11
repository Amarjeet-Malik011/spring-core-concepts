package basicExample;

public class Coffee implements Drink{
    @Override
    public void getDrink() {
        System.out.println("Coffee");
    }

    @Override
    public String toString() {
        return "Coffee instance";
    }
}
