package edu.xcdq.demo;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/22 16:28
 */
public class Uncle {
    private String name ;
    private int age ;
    // getter   setter
    public void setName (String name){

        this.name = name ;
    }
    public String getName(){

        return name ;
    }
    public void setAge(int age){

        this.age = age ;
    }
        public int getAge(){

        return age ;
        }
        // 发红包
    public void fahongbao(){
        System.out.println("舅舅再发红包");
    }
    public Uncle(){
        System.out.println("父类的无参构造方法被调用，父类被创建了");
    }
}
