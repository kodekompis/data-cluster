class Hovedprogram{
  public static void main(String[] args){

   Dataklynge abel = new Dataklynge(12);

   for (int i = 0; i < 650; i++){
   abel.SettInnNode(64,1);}

   for (int ik = 0; ik < 16; ik++){
     abel.SettInnNode(1024,2);
   }

   System.out.println("Noder med minst 32GB:" + abel.NoderMinne(32));
   System.out.println(abel.TotaltNoder());
   System.out.println(abel.antProsessorer());
   System.out.println(abel.antallRacks());



   Rack test = new Rack(12);

   int sjekk = 0;
   while (sjekk < 16 ){
     test.SettInn(1024,2);
     sjekk = sjekk + 1;}

    System.out.println(test.antallNoder());







  }
}
