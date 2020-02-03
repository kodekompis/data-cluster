import java.util.ArrayList;
class Dataklynge{
  private int nprack;
  ArrayList<Rack> racks;

  Dataklynge(int str){
    racks = new ArrayList<Rack>();
    nprack = str;
  }

  public void SettInnNode(int str, int antall){
    boolean temp;
    Rack current;
    for (int l = 0; l < racks.size(); l++){
      current = racks.get(l);
      temp = current.SettInn(str, antall);
      if (temp == false){
        Rack create = new Rack(nprack);
        racks.add(create);
        create.SettInn(str, antall);}
      }
   }

   public int antProsessorer(){
     int bigtemp = 0;
     for (Rack rack: racks) {
       bigtemp = bigtemp + rack.ProsessorRack();}
     return bigtemp;
   }

   public int TotaltNoder(){
     int bigtemp = 0;
     for (Rack rack: racks) {
       bigtemp = bigtemp + rack.antallNoder();
     }return bigtemp;
   }

   public int NoderMinne(int minne){
     int bigtemp = 0;
     for (Rack rack: racks) {
       bigtemp = bigtemp + rack.noderMedNokMinne(minne);
     }return bigtemp;
   }

   public int antallRacks(){
     int temp = 0;
     for (Rack rack: racks){
       temp = temp + 1;
     }return temp;
   }



}
