package Allque;
class Arithmetic{
    int add(int a,int b)
    {
        return  a+b;
    }

}
class  demo1 extends  Arithmetic{

}
public class demo   {

    public void main(String[] args) {
        demo1 d = new demo1();

        System.out.println(d.add(10, 20));

    }
}
