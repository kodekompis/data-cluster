import java.util.ArrayList;
class Rack{
  private int size;
  ArrayList<Node> noder;
  Rack(int str){
    noder = new ArrayList<Node>();
    size = str;


  }

  public boolean SettInn(int str, int antall){
    if (noder.size() < size){
     noder.add(new Node(str, antall));
     return true;}
    else {
      System.out.print("false");
      return false;}

  }

  public int ProsessorRack(){
    int temp = 0;
    for (Node node: noder) {
      temp = temp + node.antProsessorer();
    }return temp;
  }

  public int antallNoder(){
    int temp = 0;
    for (Node node: noder) {
      temp = temp + 1;
    }return temp;
  }

  public int noderMedNokMinne(int minne){
    int temp = 0;
    for (Node node: noder) {
      if (node.minneTest(minne) == true){
        temp = temp + 1;}
    }return temp;
  }


}
