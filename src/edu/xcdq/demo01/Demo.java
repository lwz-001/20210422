package edu.xcdq.demo01;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/22 16:52
 */
public class Demo {
    public static void main(String[] args) {
        Dector dector = new Dector();
        dector.shoushu();
        dector.eat();
        Nurse nurse = new Nurse() ;
        nurse.eat();
        nurse.zhaogu();

    }
}
