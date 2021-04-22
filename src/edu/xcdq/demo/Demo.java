package edu.xcdq.demo;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/22 16:36
 */
public class Demo {
    public static void main(String[] args) {
        UncleOne longfei = new UncleOne();
        longfei.fahongbao();
        longfei.chouyan();

        UncleTwo uncletwo = new UncleTwo() ;
        uncletwo.fahongbao();
        uncletwo.deinkWine();

        final Uncle uncle1 = new Uncle();
        uncle1.setName("修改前的名字");
        System.out.println(uncle1.getName());
    }
}
