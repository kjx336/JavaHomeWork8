
import java.io.*;
import static java.lang.String.valueOf;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
public class Exception2 {
    String str;
    Integer s;
    
    public Exception2(String str,Integer s){
        this.str = str;
        this.s = s;
    }

    public void input() throws NumberFormatException{
        System.out.println(s);
    }
    
    public static void main(String[] args){
        System.out.println("请输入一串字符：");
        Scanner in = new Scanner(System.in);
        String s1= in.next();        //字符串输入
        Integer s2 = Integer.valueOf(s1);
        Exception2 ex = new Exception2(s1,s2);
        ex.input();
    }

    
}
