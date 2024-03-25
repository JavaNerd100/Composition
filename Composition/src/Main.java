public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("1000220","Tesla","X",100000);
        Vehicle vehicle2 = new Car("222355","Toyoto","Camry",200000);

        vehicle1.setCarType("Electric");
        vehicle1.setTorque(2000);
        vehicle1.setHorsePower(2000);
        vehicle1.setFuelType("N/A");
        vehicle1.setNumberOfCylinder(4);

        System.out.println("The description of Vehicle 1 -->" + vehicle1);


        vehicle2.setCarType("Petrol");
        vehicle2.setTorque(1000);
        vehicle2.setHorsePower(2000);
        vehicle2.setFuelType("Petrol");
        vehicle2.setNumberOfCylinder(5);

        System.out.println("The description of vehicle 2 -->" + vehicle2);


        /*
         * The Composition is a way to design or implement the "has-a" relationship.
         * Composition and Inheritance both are design techniques. The Inheritance is used to
         * implement the "is-a" relationship. The "has-a" relationship is used to ensure the code reusability
         * in our program. In Composition, we use an instance variable that refers to another object.
         *The composition relationship of two objects is possible when one object contains another object, and
         * that object is fully dependent on it. The contained object should not exist without the existence of
         * its parent object.In a simple way, we can say it is a technique through which we can describe the
         * reference between two or more classes. And for that, we use the instance variable, which should be created before it is used.
         */

        /*
         *  Benefits of using Composition:
         *        1)  Composition allows us to reuse the code.
         *        2)  In Java, we can use multiple Inheritance by using the composition concept.
         *        3) The Composition provides better test-ability of a class.
         *        4) Composition allows us to easily replace the composed class implementation with a better and improved version.
         *        5) Composition allows us to dynamically change our program's behavior by changing the member objects at run time.
         */

    }
}
