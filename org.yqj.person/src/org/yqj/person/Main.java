package org.yqj.person;

import org.yqj.address.Address;

/**
 * Created by yaoqi on 2017/07/04.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(100, "firstName", "lastName");
        Address address = person.getAddress();
        System.out.println(person);
        System.out.println(address.toString());
    }
}
