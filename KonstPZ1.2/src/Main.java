public class Main
{
    public static void main(String[] args) {
        PersonInfo p1=new PersonInfo("Oleg","Popov",33,"London");
        PersonInfo copyP1=p1.Clone();

        System.out.println("p1: " + p1.toString());
        System.out.println("copyP1: " + copyP1.toString());

        System.out.println("Hash value out of p1 identity: " + System.identityHashCode(p1));
        System.out.println("Hash value out of copyP1 identity: " + System.identityHashCode(copyP1));
    }

}