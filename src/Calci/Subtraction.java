package Calci;

import History.History;

public class Subtraction<T> {

    public static <T extends Number> double subtract(T one, T two)
    {
        double res = one.doubleValue() - two.doubleValue() ;
        History.keepTrack(String.valueOf(res)) ;
        return res;
    }

}
