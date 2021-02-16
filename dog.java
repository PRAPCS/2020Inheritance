public class dog extends pets{

private int legs;

public dog(String n, int l){
  super(n);
  legs = l;
}

public int getLegs(){
  return legs;
}

//public String getName(){
 // return "This is the dogs get name";
//}

public String toString(){
  return super.toString()+ " It has "+legs+" legs";
}
}