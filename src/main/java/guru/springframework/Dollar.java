package guru.springframework;

public class Dollar {
    int amount;

    public Dollar(int amount){
        this.amount = amount;

    }

    void times(int multiplier){
        this.amount *= multiplier;
    }

    public void summation(int summationPrice) {
        this.amount += summationPrice;
    }
}
