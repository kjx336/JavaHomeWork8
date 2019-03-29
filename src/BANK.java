
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */

public class BANK {
    String user;
    String password;
    int money;
    BANK(String a,String b){
        this.user = a;
        this.password = b;
    }
    void getin(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.println("要存款多少元？");
        int a = Integer.parseInt(in.nextLine());
        try{
            if(a<=0)
                throw new OverflowException("异常操作！存款金额为负数！");
            else{
                this.money = this.money + a;
                System.out.println("存款"+ a +"元成功");
            }
        }catch (OverflowException oe){
            System.out.println(oe);
        }
    }
    void getout(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.println("要取款多少元？");
        int a = Integer.parseInt(in.nextLine());
        try{
            if(a<=0)
                throw new OverflowException("异常操作！取款金额为负数！");
            if(this.money < a)
                throw new OverflowException("异常操作！取款超出账户余额！");
            else{
                this.money = this.money - a;
                System.out.println("取款"+ a +"元成功");
            }
        }catch (OverflowException oe) {		// 捕获处理OverflowException异常
            System.out.println(oe);
	}
    }
    void show(){
        System.out.println("当前存款为" + this.money + "元");
    }
    void showInformation(){
        System.out.println("当前账户用户名为：" + this.user);
        System.out.println("当前账户密码为：" + this.password);
    }
    public static BANK readbank(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.println("请输入用户名");
        String user = in.nextLine();
        System.out.println("请输入密码");
        String password = in.nextLine();
        return new BANK(user,password);
    }
    public static void main(String[] args) {
        BANK mybank = BANK.readbank();
        mybank.showInformation();
        mybank.getin();
        mybank.show();
        mybank.getout();
        mybank.show();
    }
    class OverflowException extends java.lang.Exception {		// 用户自定义异常类
	public OverflowException() {
		super();
	} public OverflowException(String message) {
		super(message);
	}
    }   
}
