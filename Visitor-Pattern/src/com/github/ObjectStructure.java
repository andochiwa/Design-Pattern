package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(e -> e.accept(visitor));
    }

}
