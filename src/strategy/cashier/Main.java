package strategy.cashier;

import java.util.Scanner;

/**
 * 模拟收银台系统
 * @author liuhongji
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("初始化收银台系统...");
        System.out.println("请输入商场活动名称：1.正常收费；2.满300减100；3.八折优惠");

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("请输入商品单价：");
        double price = scanner.nextDouble();
        System.out.println("请输入商品数量：");
        double num = scanner.nextDouble();

        CashContext cashContext = new CashContext(next);
        double calcMoney = cashContext.calcMoney(price * num);

        System.out.println("需要收取金额：" + calcMoney);
    }


}
