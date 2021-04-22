package edu.xcdq.demo;

import edu.xcdq.demo.Uncle;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/22 16:33
 */
public class UncleOne extends Uncle {
    public UncleOne(){
        super();  //调用父类的构造方法
        System.out.println("子类大舅的构造方法被创建");
    }

    public void chouyan(){

        System.out.println("大舅喜欢抽烟");
    }
    @Override
    public void fahongbao(){
        System.out.println("大舅穷了，红包没了");
    }
}
