class Node{
  private int size;
  private int prosessorer;

  public Node(int str, int antall){
    size = str;
    prosessorer = antall;
  }

  public int antProsessorer(){
    return prosessorer;
  }

  public boolean minneTest (int paakrevdMinne){
    if (size >= paakrevdMinne){
      return true;}
    else {
      return false;}
  }
}
