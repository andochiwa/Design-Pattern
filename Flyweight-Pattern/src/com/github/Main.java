package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/31
 */
public class Main {

    public static void main(String[] args){
        WebsiteFactory factory = new WebsiteFactory();

        WebSite website1 = factory.getWebsite("电商");
        website1.use(new User("A用户"));

        WebSite website2 = factory.getWebsite("电商");
        website2.use(new User("B用户"));

        WebSite website3 = factory.getWebsite("电商");
        website3.use(new User("C用户"));

        WebSite website4 = factory.getWebsite("博客");
        website4.use(new User("D用户"));

        WebSite website5 = factory.getWebsite("博客");
        website5.use(new User("E用户"));

        WebSite website6 = factory.getWebsite("博客");
        website6.use(new User("F用户"));
    }
}
