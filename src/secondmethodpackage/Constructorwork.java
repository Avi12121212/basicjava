/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondmethodpackage;

/**
 *
 * @author HP
 */
class Web {

    String name, address;
    int age;
    String phone;

    public Web(String name, String address, int age, String phone) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }

    public void Display() {
        System.out.printf("%s%s%d%s", name, address, age, phone);
    }

    @Override
    public String toString() {
        return "Web{" + "name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone + '}';
    }

}

public class Constructorwork {

    public static void main(String[] args) {
        Web w = new Web("rohit", "Pandeypur", 20, "7895412365");
//        System.out.println();
//        w.Display();
        System.out.println(w);
    }

}
