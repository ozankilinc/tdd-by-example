package guru.springframework;

public class Dollar extends Money {


    public Dollar(int amount){
        this.amount = amount;

    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public Dollar summation(int summationPrice) {
        return new Dollar(amount + summationPrice);
    }


}
