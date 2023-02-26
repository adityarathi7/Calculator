package Calci;

import History.History;

public class Multiply<T> {

    public static <T extends Number> double multiply(T one, T two)
    {
        double res = one.doubleValue() * two.doubleValue() ;
        History.keepTrack(String.valueOf(res)) ;
        return res ;
    }

}
