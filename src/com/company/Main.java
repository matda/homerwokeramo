package com.company;

public class Main {
    public static void Main() {

        int nuovatassa = 0;
        int tragitto=0;
        double tassa;
        Car fosvaghe;
        Casello TeramoMare;
        TeramoMare= new Casello();
        TeramoMare.rotta=Teramo, Mare;
        TeramoMare.lrotta=300,200;

        fosvaghe = new Car();
        fosvaghe.classe = 2;
        fosvaghe.tariffa = 0;
        fosvaghe.ecotassa=0;

        fosvaghe.tariffa == fosvaghe.calcolotariffa(int classe);
        fosvaghe.ecotassa==fosvaghe.calcoloecotariffa(int classe);
        tragitto=TeramoMare.lunghezzarotta(int casello[]);

        if (nuovatassa == 0) {
            tassa=fosvaghe.tariffa*tragitto+((fosvaghe.tariffa*tragitto)/5);

        }
         if (nuovatassa==1){
             tassa=(fosvaghe.tariffa+fosvaghe.ecotassa)*tragitto+(((fosvaghe.tariffa+fosvaghe.ecotassa)*tragitto)/5);
         }
       // tassa=double ciel(tassa);

    }
}



