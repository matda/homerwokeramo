package com.company;

public class Car implements Autostrada {

    public double calcolotariffa(int classe)
    {

        if (classe==1)
            return tariffa=0.50;
        if (classe==2)
            return tariffa=1;

        if (classe==3)
            return tariffa=1.50;

        if (classe==4)
            return tariffa=2;

        if (classe==5)
            return tariffa=3;

        if (classe==6)
            return tariffa=4;

        return tariffa;

    }


   public double calcoloecotariffa(int classe)

   {
        if (classe==2)
            return ecotassa=0.40;

        if (classe==3)

            return ecotassa=0.50;

        if (classe==4)
            return ecotassa=1;

        if (classe==5)
            return ecotassa=2;

        if (classe==6)
            return ecotassa=3;

        return ecotassa;

    }


}
