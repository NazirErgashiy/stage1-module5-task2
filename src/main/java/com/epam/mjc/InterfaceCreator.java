package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> returnList = new ArrayList<>();
            for (int get : x) {
                get = get / divider;
                returnList.add(get);
            }
            return returnList;
        };
    }
}
