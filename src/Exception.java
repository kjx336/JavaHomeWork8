/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
import java.lang.*;
import static java.lang.String.valueOf;
import java.util.*;

public class Exception {
    public static void main(String[] args) {
        String str;             //定义要转换的目标字符串
        System.out.println("请输入一串字符：");
        Scanner in = new Scanner(System.in);
        try{
            str = in.next();        //字符串输入
            Integer s = Integer.valueOf(str);
            System.out.println("转换后的字符串为：");
            System.out.println(s);
        }catch(NumberFormatException nfe){
            System.out.println(nfe);
        }

    }
    
}
