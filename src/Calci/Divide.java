package Calci;

import History.History;

public class Divide<T> {

    public static <T extends Number> double divide(T one, T two)
    {
        if( one.doubleValue() == 0 || two.doubleValue() ==  0) return 0 ;

        double res = one.doubleValue() / two.doubleValue() ;
        History.keepTrack(String.valueOf(res)) ;
        return res ;
    }

}
