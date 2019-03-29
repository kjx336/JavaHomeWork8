 JavaHomeWork8
异常处理
===============
任务与整体解决方案：
------
* 在java.lang包中定义了Integer类作为int数据类型的对等类，其中定义了如下方法：<br>
public static Integer valueOf(String s) throws NumberFormatException<br>
用于将字符串s转换成Integer对象。当s不符合整数格式时，该方法抛出NumberFormatException异常。请编写简单程序使用valueOf()方法转换一字符串为Integer对象，用2种方法抛出NumberFormatException异常：<br>
一种由程序本身捕获并处理异常，<br>
另一种将异常抛出，交由JVM捕获处理。

* 定义一个类实现银行帐户的概念。自定义显示存款、取款、查询余额和显示帐号的出错信息的异常类。定义主类，创建帐户类的对象，并完成相应操作。

### 请编写简单程序使用valueOf()方法转换一字符串为Integer对象，用2种方法抛出NumberFormatException异常：一种由程序本身捕获并处理异常，另一种将异常抛出，交由JVM捕获处理。

较为简单，第一种只需要使用catch进行捕获就可以了。第二种更简单，不用捕获直接会出现这个问题，因为JVM会捕获这个问题的

###定义一个类实现银行帐户的概念。自定义显示存款、取款、查询余额和显示帐号的出错信息的异常类。定义主类，创建帐户类的对象，并完成相应操作。

本次作业难点所在。如何自定义异常类需要基本完整理解整个java的异常处理机制

领悟：
------
### 异常处理基本机制：
java中分为“异常”和“错误”。当程序执行发现异常时，就会抛出一个携带异常信息的异常类的实例。<br>
java内置异常类很多，[菜鸟教程](http://www.runoob.com/java/java-exceptions.html)中有较为完整的内置异常类，在此不再赘述
### 异常处理语句：
```
try
{
   // 程序代码
}catch(ExceptionName e1)
{
   //Catch 块
}
```
try语句块内如果出现异常，catch语句就可以捕获异常。光看语句还是挺简单的。

### 有关于自定义异常
有三点大原则需要注意：
* 所有异常都必须是 Throwable 的子类。
* 如果希望写一个检查性异常类，则需要继承 Exception 类。
* 如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。
自定义异常类的方法是：
```
class MyException extends Exception{
}
```
MyException就是自定义的异常类了。




<br>*Signed-off-by: 遥梦幽兰kzx <kjx336@163.com>*