
public class Main {

  public static void main(String [] args)
  {
      LinkedList1 ll = new LinkedList1();
      ll.add("Amy");
      ll.add("Bob");
      ll.add(0, "Al");
      ll.add(2, "Beth");
      ll.add(4, "Carol");
      System.out.println("The members of the list are:");
      System.out.print(ll);

  }
}
