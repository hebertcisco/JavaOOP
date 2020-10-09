package me.hebertbarros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO {
    public static void main(String[] args){
        Main.newTheme("Constructors");
        Home myHome = new Home("Lirida Callou Harun",'d', (short) 31, 200000, 1644192000000l,
        3.5f, 320.3434344465446, false);
        //System.out.println(myHome);

        Main.newTheme("Lists");

        List<Home> homeList = new ArrayList<>();
        homeList.add(myHome);

        for(Home currentHome: homeList){
            System.out.println(currentHome);
        }

        Main.newTheme("Dictionaries");
        Map<String, Home> homeMap = new HashMap<>();
        homeMap.put("I", myHome);

        System.out.println(homeMap.get("I"));
        System.out.println(homeMap.size());

        Main.newTheme("Heritage");
        Apartment apartmentBeach = new Apartment("Malecón", 'B', (short) 101,
        2600000,1265500800000l,6.3f,180.874897456,true,(short)5);
        System.out.println(apartmentBeach);

        Main.newTheme("Polymorphism");

        sellHouse(myHome);
        sellHouse(apartmentBeach);

        Home apartmentCity = new Apartment("Principal", 'F', (short)913,1950000,
                1265500800000l, 4.5f, 145.654,false,
                (short)2);

        sellHouse(apartmentCity);

        Home newHome = new Home();
        newHome.setStreet("Cortez");
        newHome.setMortgaged(true);
        newHome.setTax(2.1f);

        System.out.println(newHome);
        sellHouse(newHome);

        Main.newTheme("Equals and HashCode");

        Home mySecondHome = new Home("Lirida Callou Harun",'d', (short) 31, 200000, 1644192000000l,
                3.5f, 320.3434344465446, false);
        System.out.println(myHome.equals(mySecondHome));
        Home myThirdHome = new Home();
        System.out.println(myHome.equals(homeMap.containsValue(myThirdHome)));

    }

    private static void sellHouse(Home home) {
        if (home.isMortgaged()){
            System.out.println("Impossible to sell!");
        }else {
            System.out.println("For sale");
        }
    }
}
