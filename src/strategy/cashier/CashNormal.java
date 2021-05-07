package strategy.cashier;

/**
 * 正常收费
 * @author liuhongji
 */
public class CashNormal extends AbstractCashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
