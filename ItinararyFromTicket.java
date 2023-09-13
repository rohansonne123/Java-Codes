import java.util.*;
public class ItinararyFromTicket {
    public static String startingPoint(HashMap<String,String> ticket){
        HashMap<String,String> revmap=new HashMap<>();
        for (String map : ticket.keySet()) {
            revmap.put(ticket.get(map),map);
        }
        for (String maps : ticket.keySet()) {
            if(!revmap.containsKey(maps)){
                return maps;
            }
        }
        return null;
    }
    public static void main(String args[]){
      HashMap<String,String> ticket=new HashMap<>();
      ticket.put("chennai","bangluru");
      ticket.put("mumbai","delhi");
      ticket.put("geo","chennai");
      ticket.put("delhi","geo");

      String start=startingPoint(ticket);
      System.out.print(start);
      for (String maps : ticket.keySet()) {
        System.out.print("-->"+ticket.get(start));
        start=ticket.get(start);
      }
    }
}
