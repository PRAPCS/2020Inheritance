class Main {
  public static void main(String[] args) {
    
   pets p = new pets("Bruno");
   System.out.println(p);
   

   dog d = new dog("Pluto",4);
   System.out.println(d);
   System.out.println(d.getName());

   snake s = new snake("Ka","red");
   System.out.println(s);


  }
}