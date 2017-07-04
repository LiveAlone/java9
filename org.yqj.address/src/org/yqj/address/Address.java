package org.yqj.address;

/**
 * Created by yaoqi on 2017/07/04.
 * default Address 配置方式
 */
public class Address {

    private String line1 = "default line";

    private String city = "default city";

    private String state = "default state";

    private String zip = "default zip";

    public Address(){}

    public Address(String line1, String line2, String city, String state, String zip) {
        this.line1 = line1;
        this.city = city;
        this.state = state;
        this.zip = zip;
        System.out.println("construct default line2 is " + line2);
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
