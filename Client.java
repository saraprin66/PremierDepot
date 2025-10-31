public class Client{
    public static void main (int a){
        if(a==1){
        Program1 p = new Program1();
        System.out.println("je suis le main2");
        p.go();}
    }

    public static void main2(int a){
        if(a==2){
        Program1 p =new Program1();
        System.out.println("je suis le main2");
        p.go();}
    }
    public static void main(int a){
        if(a==1){
        Program1 p = new Program1();
        System.out.println("je suis le main3");
        p.go();}
    }
}