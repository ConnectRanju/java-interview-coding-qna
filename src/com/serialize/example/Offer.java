package com.serialize.example;

import java.io.*;

public class Offer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private double discount;

    public Offer() throws IOException {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public static void main(String[] args)  {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("offer.ser"));
            Offer offer = new Offer();
            offer.setName("Percentage Off");
            offer.setDiscount(20);
            out.writeObject(offer);
            out.close();

            //Deserialization
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("offer.ser"));

            Offer offer1 = (Offer) in.readObject();
            System.out.println(offer1.getName());
            in.close();
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }

}
