package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int counter = 1;
        int ingCounter = 0;

        do {
            ArrayList<String> burrito = new ArrayList<>();

            burrito.add(riceOptions()); burrito.add(meatOptions());
            burrito.add(beanOptions()); burrito.add(salsaOptions());
            burrito.add(veggieOptions()); burrito.add(cheeseOptions());
            burrito.add(guacOptions()); burrito.add(quesoOptions());
            burrito.add(sourCreamOptions());

            System.out.print("Burrito " + counter + ": ");
            for (int i = 0; i < burrito.size(); i++) {
                String tempStr = "";

                if (!burrito.get(i).contains("no")) {
                    ingCounter++;
                }
                if (!burrito.get(i).contains("X")) {
                    burrito.remove("X");
                }

                System.out.print(burrito.get(i) + tempStr);
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
        rice.add(" white rice,");
        rice.add(" brown rice,");
        rice.add(" no rice,");
        rice.add(" all rice,");

        return rice.get((int) (Math.random() * rice.size()));
    }

    private static String meatOptions(){
        ArrayList<String> meat = new ArrayList<>();
        meat.add(" steak,");
        meat.add(" chicken,");
        meat.add(" chorizo,");
        meat.add(" sofritas,");
        meat.add(" veggies,");
        meat.add(" no meat,");
        meat.add(" all meat,");

        return meat.get((int) (Math.random() * meat.size()));
    }

    private static String beanOptions(){
        ArrayList<String> beans = new ArrayList<>();
        beans.add(" pinto beans,");
        beans.add(" black beans,");
        beans.add(" no beans,");
        beans.add(" all beans,");

        return beans.get((int) (Math.random() * beans.size()));
    }

    private static String salsaOptions(){
        ArrayList<String> salsa = new ArrayList<>();
        salsa.add(" mild salsa,");
        salsa.add(" medium salsa,");
        salsa.add(" hot salsa,");
        salsa.add(" no salsa,");
        salsa.add(" all salsa,");

        return salsa.get((int) (Math.random() * salsa.size()));
    }

    private static String veggieOptions(){
        ArrayList<String> veggies = new ArrayList<>();
        veggies.add(" lettuce,");
        veggies.add(" fajita veggies,");
        veggies.add(" no veggies,");
        veggies.add(" all veggies,");

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
}