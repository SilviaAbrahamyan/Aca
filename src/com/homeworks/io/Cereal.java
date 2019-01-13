package com.homeworks.io;

import java.io.*;

/**
 * Created by home on 10/27/2018.
 */
public class Cereal implements Serializable{
    private transient String name = "CocoaCookies";
    private  int sugar = 9;
    private  static int sug3ar = 9;
    private transient Address address = new Address("fa", "dagh", "df");
    public Cereal() {
        super();
        this.name = "CaptainPebbles";
    }
    {
        name = "SugarPops";
    }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getSugar() { return sugar; }
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public Address getAddress() {
        return address;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cereal c = new Cereal();
        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(c);
        out.flush();
        System.out.println("success");


        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        Cereal s=(Cereal)in.readObject();
        System.out.println(s.name+" "+s.sugar);
        System.out.println(s.getAddress());
        System.out.println(s.sug3ar);

        in.close();
    }

}
class Address implements Serializable{
    String addressLine,city,state;
    public Address(String addressLine, String city, String state) {
        this.addressLine=addressLine;
        this.city=city;
        this.state=state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}