package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int counter = 1;
        int ingCounter = 0;

        do {
            ArrayList<String> burrito = new ArrayList<>();
            Collections.addAll(burrito, riceOptions(), meatOptions(), beanOptions(), salsaOptions(),
                    veggieOptions(), cheeseOptions(), guacOptions(), quesoOptions(), sourCreamOptions());

            System.out.print("Burrito " + counter + ": ");
            for (int i = 0; i < burrito.size(); i++) {

                if (!burrito.get(i).contains("no")) {
                    ingCounter++;
                }
                if (!burrito.get(i).contains("X")) {
                    burrito.remove("X");
                }

                System.out.print(burrito.get(i));
            }

            cost(ingCounter);
            System.out.println();

            burrito.clear();
            ingCounter = 0;

            counter++;
        } while(counter <= 25);
    }

    private static void cost(int ingredients){
        System.out.print(" $" + (3 +(0.5 * ingredients)) + "0");

    }

    private static String riceOptions(){
        ArrayList<String> rice = new ArrayList<>();
        Collections.addAll(rice, " white rice,", " brown rice,",
                " no rice,", " all rice,");

        return rice.get((int) (Math.random() * rice.size()));
    }

    private static String meatOptions(){
        ArrayList<String> meat = new ArrayList<>();
        Collections.addAll(meat, " steak,", " chicken,", " chorizo,",
                " sofritas,", " veggies,", " no meat,", " all meat");

        return meat.get((int) (Math.random() * meat.size()));
    }

    private static String beanOptions(){
        ArrayList<String> beans = new ArrayList<>();
        Collections.addAll(beans, " pinto beans,", " black beans",
                " no beans,", " all beans,");

        return beans.get((int) (Math.random() * beans.size()));
    }

    private static String salsaOptions(){
        ArrayList<String> salsa = new ArrayList<>();
        Collections.addAll(salsa, " mild salsa,", " medium salsa,",
                " hot salsa,", " no salsa,", " all salsa,");

        return salsa.get((int) (Math.random() * salsa.size()));
    }

    private static String veggieOptions(){
        ArrayList<String> veggies = new ArrayList<>();
        Collections.addAll(veggies, " lettuce,", " fajita veggies,",
                " no veggies,", " all veggies,");

        return veggies.get((int) (Math.random() * veggies.size()));
    }

    // these all could be boolean but i'm too lazy to change it before deadline lol
    private static String cheeseOptions(){
        ArrayList<String> cheese = new ArrayList<>();
        cheese.add(" cheese,");
        cheese.add("X");

        return cheese.get((int) (Math.random() * cheese.size()));
    }

    private static String guacOptions(){
        ArrayList<String> guac = new ArrayList<>();
        guac.add(" guac,");
        guac.add("X");

        return guac.get((int) (Math.random() * guac.size()));
    }

    private static String quesoOptions(){
        ArrayList<String> queso = new ArrayList<>();
        queso.add(" queso,");
        queso.add("X");

        return queso.get((int) (Math.random() * queso.size()));
    }

    private static String sourCreamOptions(){
        ArrayList<String> sourCream = new ArrayList<>();
        sourCream.add(" sour cream,");
        sourCream.add("X");

        return sourCream.get((int) (Math.random() * sourCream.size()));
    }

//    public static String beanPicker() {
//        ArrayList<String> beans = new ArrayList<>();
//            beans.add("black beans");
//            beans.add("pinto beans");
//
//            Random r = new Ranom();
//            int randomIndex = r.nextInt(beans.size());
//        return beans.get(randomIndex);
//    }
}