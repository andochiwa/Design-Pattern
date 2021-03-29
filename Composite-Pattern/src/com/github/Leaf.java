package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("cannot remove to a leaf");
    }

    @Override
    public void display(int index) {
        System.out.println(new String("-").repeat(index) + name);
    }
}
