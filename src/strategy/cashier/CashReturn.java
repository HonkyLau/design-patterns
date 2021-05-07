package strategy.cashier;

/**
 * 返利活动
 * @author liuhongji
 */
public class CashReturn extends AbstractCashSuper {

    /**
     * 满足多少金额才有返利
     */
    private double returnCondiction;

    /**
     * 返利
     */
    private double returnMoney;

    public CashReturn(double returnCondiction, double returnMoney) {
        this.returnCondiction = returnCondiction;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if(money > returnCondiction){
            double totalReturnMoney = Math.floor(money / returnCondiction) * returnMoney;
            result = money - totalReturnMoney;
        }

        return result;
    }
}
