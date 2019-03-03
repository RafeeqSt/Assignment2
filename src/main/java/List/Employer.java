package List;

public class Employer implements Pay {

    @Override
    public String payMoney(String amount) {
        return amount +" rand was payed";
    }
}
