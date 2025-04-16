package linklist.basic;

public class linklist {
    public static void main(String[] args) {
        ll l= new ll();
        l.inserstfirst(2);
        l.inserstfirst(3);
        l.inserstfirst(4);
        l.inserstfirst(5);
        l.inserstfirst(6);
        l.inserstfirst(7);
        l.display();
//        l.insertend(1);
//        l.display();
//        l.insertatindex(3,19);
//        l.display();
//        l.deletefirst();
//        l.display();
//    int v=    l.deletelast();
        int v= l.deletAtindex(3);
        System.out.println("value deleted:"+v);
        l.display();


    }
}
