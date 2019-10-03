public class Actor {

    String name;
    String lastname;
    int age;


    public Actor() {
        System.out.println("CONSTRUCTOR CALLED");
    }

    public Actor(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    void play(){
        System.out.println("IT IS PLAYING NOW");
    }

    void act(){
        System.out.println("IT IS ACTING NOW");
    }

    void retire(){
        System.out.println("IT IS RETIRE NOW");
    }

}
