// Write two interfaces “Fruit” and “Vegetable” containing methods ‘hasAPeel’ and ‘hasARoot’. Now write a class “Tomato” implementing Fruit and Vegetable. Instantiate an object of Tomato. Print the details of this object.

interface Fruit {
    default void hasAPeel() {
        System.out.println("It has Peel");
    }

    default void hasARoot() {
        System.out.println("It has not Root");
    }
}

interface Vegetable {
    default void hasAPeel() {
        System.out.println("It has not Peel");
    }

    default void hasARoot() {
        System.out.println("It has Root");
    }
}

class Tomato implements Fruit, Vegetable
{
    public void hasAPeel() {
        System.out.println("It has not Peel");
    }

    public void hasARoot() {
        System.out.println("It has not Root");
    }

    public static void main(String args[])
    {
        Tomato t = new Tomato();

        t.hasAPeel();

        t.hasARoot();
    }
}