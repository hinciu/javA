package patterns.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {



    @Override
    public void pay(int am) {
        System.out.println(am +" paid with credit/debit card");
    }
}
