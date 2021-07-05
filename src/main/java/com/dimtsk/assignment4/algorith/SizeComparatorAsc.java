package com.dimtsk.assignment4.algorith;

import com.dimtsk.assignment4.model.TShirt;
import java.util.Comparator;

public class SizeComparatorAsc implements Comparator<TShirt>{

    @Override
    public int compare(TShirt o1, TShirt o2) {
        return o1.getSize().compareTo(o2.getSize());
    }
}
