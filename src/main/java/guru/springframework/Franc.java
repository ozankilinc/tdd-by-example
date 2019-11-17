package guru.springframework;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multipliers) {
        return new Franc(amount* multipliers);
    }

    public Franc summation(int summatioanBy) {
        return new Franc(amount + summatioanBy);
    }

}
