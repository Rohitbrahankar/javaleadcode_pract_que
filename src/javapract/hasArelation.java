package javapract;

public class hasArelation {
    String name;
    int Eno;

    public hasArelation(String name, int Eno) {
        this.name = name;
        this.Eno = Eno;

    }

    public static class edata {

        int age;
        hasArelation n;


        void display(hasArelation n, int age) {
            System.out.println("the age is :" + age);
            System.out.println("the name of employee :" + n.name + " "+"employee no is :" + n.Eno);
        }
    }

    public static void main(String[] args) {
        edata e= new  edata();
        hasArelation h= new hasArelation("abc",123);
        e.display(h,45);
    }
}
