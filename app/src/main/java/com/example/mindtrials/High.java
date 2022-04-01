package com.example.mindtrials;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class High {
    private static List<Integer> adam;
    int first=0;
    int second=0;

    public static int getScore(int Scorecount){
        adam.add(Scorecount);
        Collections.sort(adam);
       int first= adam.get(0);
        return (first);
    }



}
