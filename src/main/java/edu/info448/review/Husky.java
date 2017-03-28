package edu.info448.review;

/**
 * Created by luke on 3/28/17.
 */
public class Husky extends Dog implements Huggable {
    public Husky(String name) {
        super(name, "Husky");
    }

    public void pullSled() {
        System.out.println(this + " pulls the sled");
    }

    public void bark() {
        System.out.println(this + " says: Woof!");
    }

    @Override
    public void hug() {

    }
}
