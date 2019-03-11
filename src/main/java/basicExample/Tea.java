package basicExample;

public class Tea implements Drink{
    @Override
    public void getDrink() {
        System.out.println("TEA");
        
    }

    @Override
    public String toString() {
        return "Tea instance";
    }
}
