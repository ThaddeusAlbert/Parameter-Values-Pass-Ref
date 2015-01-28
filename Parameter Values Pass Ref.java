class PassRef {
  public static void main(String[] args) {
      Body sirius = new Body("Sirius", null);
      
      System.out.println("Before: " + sirius);
      commonName(sirius);
      System.out.println("after: " + sirius);
  }
  
  Public static void commonName(Body bodyRef) {
    bodyRef.name = "Dog Star";
    bodyRef = null;
  }
}
