public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Addumairi";

        manager.sayHello("Budi");

        var vp = new VicePresident();

        vp.name = "Scaloni";
        vp.sayHello("Budi");

    }
}
