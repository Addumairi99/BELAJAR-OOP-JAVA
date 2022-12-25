public class Person {
    String name;
    String address;
    final String country = "Indonesia";
    // Constructor
    // Constructor Overloading
    Person(String paramName,String paramAddress){
        this.name = paramName;
        this.address = paramAddress;

    }

    Person(String paramName){
        this(paramName,null);
    }

    Person(){
        this(null);

    }



    // variabel shadowing
    // this.name from name diatas
    // name from parameter sayHello
    void sayHello(String name){
        System.out.println("Hello " + name + " My name is " + this.name);
    }

}
