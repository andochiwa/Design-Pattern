package com.github;

import java.util.LinkedList;
import java.util.List;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class Composite extends Component{

    private List<Component> children = new LinkedList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int index) {
        System.out.println(new String("-").repeat(index) + name);
        children.forEach(component -> component.display(index + 2));
    }
}
