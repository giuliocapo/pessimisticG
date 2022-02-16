package com.example.optimisticg;

import java.util.ArrayList;
import java.util.List;

public class HowDoesItCost {


    private static List<String> oListAll1Dollar;

    public HowDoesItCost(){

        oListAll1Dollar = new ArrayList<>();
        oListAll1Dollar.add("1.0");
        oListAll1Dollar.add("1.0"); //addo 3 oggetti da 1 dollaro
        oListAll1Dollar.add("1.0");
    }



    public boolean itCost1dollar(int oIndex, String cost){
       //systemoprinto l ' indice di 0ind
         //systemoprinto cost

        if (oListAll1Dollar.get(oIndex) ==  cost){
            //systemoprinto cost
            return true;
        }
        return false;


    }
}
