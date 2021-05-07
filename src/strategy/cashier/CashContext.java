package strategy.cashier;

/**
 * @author liuhongji
 */
public class CashContext {

    /**
     * 默认是正常收费
     */
    private AbstractCashSuper abstractCashSuper = new CashNormal() ;

    public void setAbstractCashSuper(AbstractCashSuper abstractCashSuper) {
        this.abstractCashSuper = abstractCashSuper;
    }

    /**
     * 通过简单工厂模式获取收费对象
     * @param type
     */
    public CashContext(String type){
        switch (type){
            case "正常收费":
                abstractCashSuper = new CashNormal();
                break;
            case "八折优惠":
                abstractCashSuper = new CashRebate(0.8);
                break;
            case "满300减100":
                abstractCashSuper = new CashReturn(300,100);
                break;
        }
    }

    public double calcMoney(double money){
        return abstractCashSuper.acceptCash(money);
    }

}
