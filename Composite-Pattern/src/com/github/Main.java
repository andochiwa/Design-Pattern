package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/30
 */
public class Main {

    public static void main(String[] args){
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Component comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf AA"));
        comp.add(new Leaf("Leaf BB"));

        root.add(comp);

        Component comp2 = new Composite("Composite X");
        comp2.add(new Leaf("Leaf CC"));
        comp2.add(new Leaf("Leaf DD"));

        root.add(comp2);

        root.add(new Leaf("Leaf C"));
        root.display(1);
    }
}
