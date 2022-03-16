package Strategy.cashier;

/**
 * 打折收费
 * @author liuhongji
 */
public class CashRebate extends AbstractCashSuper {

    /**
     * 折扣，比如八折，moneyRebate是0.8
     */
    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
