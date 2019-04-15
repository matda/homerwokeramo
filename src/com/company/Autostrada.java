package com.company;



public interface Autostrada implements Car {

     int classe=1;
     char modello=0;
     char marca=0;
     int anno=0;
     int assi=0;
     float peso=0;
     float altezza=0;
     double tariffa=0;
     double ecotassa=0;


     public double calcoloecotariffa(int classe);

   public double calcolotariffa(int classe);


}
