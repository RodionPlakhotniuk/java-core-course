public class Lesson11Solution {
    public static void main(String[] args) {

        System.out.print("1. ");
        Person rodion = new Person("Rodion", 22, "meneger at DTRZ");
        Person karina = new Person("Karina", 22, "Financier");
        Person oleg = new Person("Oleg", 22, "MacDonalds worker");
        System.out.println(rodion);
        System.out.println("   " + karina);
        System.out.println("   " + oleg);

        System.out.println();
        System.out.print("2. ");
        System.out.println(rodion);
        System.out.println("   (Після оновлення професії)");
        rodion.changeProfession("Java Developer");
        System.out.println("   " + rodion);


    }
}
