package com.skproject.inventory;

import java.util.ArrayList;

public class SwrdModel {

    private ArrayList<ArrayList<Object>> swrds = new ArrayList<ArrayList<Object>>();

    public SwrdModel() {
    }

    private void buildSwrds() {

        if (!this.swrds.contains((Object) "Cold Iron Carver")) {
            // code to retrieve data
            ArrayList<Object> wpn = new ArrayList<>();

            wpn.add("Weapon Name"); // name
            wpn.add("Rating"); // rating
            wpn.add("Style"); // style
            wpn.add("Attack Speed"); // atk spd
            wpn.add("Damage Type"); // dmg type(s)
            wpn.add("Base Damage"); // base dmg
            wpn.add("Status Effect"); // status(es)
            wpn.add("Ability"); // ability

            swrds.add(wpn);

            wpn.clear(); // reset wpn for more entries

            wpn.add("Cold Iron Carver"); // name
            wpn.add(4); // rating
            wpn.add("calibur"); // style
            wpn.add(70); // atk spd
            wpn.add("N"); // dmg type(s)
            wpn.add(118); // base dmg
            wpn.add(null); // status(es)
            wpn.add("Undead HIGH"); // ability

            swrds.add(wpn);

            wpn.clear(); // reset wpn for more entries
        }
    }

    public ArrayList<ArrayList<Object>> getSwrdData() {
        return this.swrds;
    }
}