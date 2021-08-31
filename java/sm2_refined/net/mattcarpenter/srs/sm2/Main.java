package net.mattcarpenter.srs.sm2;

import java.util.Random;

public  class Main {
    public static void main(String[] args) {

        Scheduler scheduler = Scheduler.builder().build();
        Item item = Item.builder().build();
        Random rand = new Random();

        for (int i=1; i<=10; i++){
            //Fake user quality
            int quality = rand.nextInt(6);
            //Test what happens when item gets a perfect quality = 5, on 10 attempts!
//            int quality = 5;
            String result = quality > 2 ? "CORRECT" : "WRONG";
            System.out.println(i + ". [Result: " + result + ", quality: " + quality + "]");

            Session session2 = new Session();
            Review review2 = new Review(item, quality);
            session2.applyReview(review2);
            scheduler.applySession(session2);

            System.out.println(item.toString());

        }



    }
}