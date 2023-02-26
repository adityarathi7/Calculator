package Calci;

import History.History;

public class Addition<T> {

    public static <T extends Number> double add(T one, T two)
    {
        double res = one.doubleValue() + two.doubleValue() ;
        History.keepTrack(String.valueOf(res)) ;
        return res;
    }

}
