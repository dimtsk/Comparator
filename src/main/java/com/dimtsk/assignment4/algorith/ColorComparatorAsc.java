package com.dimtsk.assignment4.algorith;

import com.dimtsk.assignment4.model.TShirt;
import java.util.Comparator;

public class ColorComparatorAsc implements Comparator<TShirt> {

    @Override
    public int compare(TShirt o1, TShirt o2) {
        return o1.getColor().compareTo(o2.getColor());
    }

}
