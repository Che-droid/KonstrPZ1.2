public class Main
{
    public static void main(String[] args) {
        PersonInfo p1=new PersonInfo("Oleg","Popov",33,"London");
        PersonInfo copyP1=p1.Clone();

        System.out.println(p1.toString());
        System.out.println(copyP1.toString());

        System.out.println(System.identityHashCode(p1));
        System.out.println(System.identityHashCode(copyP1));
    }

}