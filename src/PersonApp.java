public class PersonApp {
    public static void main(String[] args) {
        // Menggunakan constructor pertama -> Dua Parameter
        var person1 = new Person("Addumairi","Lombok");
        // person1.name = "Addumairi"; dimasukan ke parameter constructor
        // person1.address = "Lombok";
        //person1.country = "Argentina"; Error -> tidak bisa karena final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        // Menggunakan constructor kedua -> satu parameter
        var person2 = new Person("Messi");

        // Menggunakan constructor ketiga -> tidak ada parameter
        Person person3;
        person3 = new Person();
        person3.name= "Joko";
        person3.sayHello("Budi");





    }
}
