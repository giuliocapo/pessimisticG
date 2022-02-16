package com.example.optimisticg;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HowDoesItCost {


    private final List<String> oListAll1Dollar;


    public HowDoesItCost(){

        oListAll1Dollar = new ArrayList<>();
        oListAll1Dollar.add("1.0");
        oListAll1Dollar.add("1.0"); //addo 3 oggetti da 1 dollaro
        oListAll1Dollar.add("1.0");
    }



    public boolean itCost1dollar(int oIndex, String cost){
       //systemoprinto l ' indice di 0ind
         //systemoprinto cost

        //systemoprinto cost
        return Objects.equals(oListAll1Dollar.get(oIndex), cost);


    }
}
