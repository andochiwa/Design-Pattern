package com.github;

import java.util.HashMap;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class WebsiteFactory {

    private HashMap<String, WebSite> flyweights = new HashMap<>();

    public WebSite getWebsite(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }

}
