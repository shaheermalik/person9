import java.util.Scanner;

public class PersonDriver{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first persons name");
        String name = keyboard.next();
        String outputAge;

        System.out.println("Please enter the first persons age");
        int age = Integer.parseInt(keyboard.next());
        Person person1 = new Person(name,age);
        System.out.println(person1);

        System.out.println("Please enter the secound persons name");
        name = keyboard.next();
        System.out.println("Please enter the secound persons age");
        age = Integer.parseInt(keyboard.next());
        Person person2 = new Person(name,age);
        System.out.println(person2);


        if (person1.toString().equals(person2.toString())==true){
            System.out.println("Person 1 equals to Person 2");
        } else {
            System.out.println("Person 1 does not equal to Person 2");
        }
        if (person1.getName().equals(person2.getName())){
            System.out.println("The first person does have teh same name as the secound person");
        } else {
            System.out.println("The first person does not have the same name as the secound person");
        }

        if (person1.getAge()==person2.getAge()){
            outputAge = "The first person is the same age as the secound person";
        }
        else if (person1.getAge()>person2.getAge()) {
            outputAge=" The first person is older than the secound person";

        }
        else{
            outputAge="The first person is younger than the secound person";

        }

        System.out.println(outputAge);
    }
}




