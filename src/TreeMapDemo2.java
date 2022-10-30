import java.util.*;
class TComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int i,j,k;

        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(j));
        if (k==0)
            return o1.compareTo(o2);
        else
            return k;

    }
}
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap(new TComp());

        tm.put("John Dou",new Double(3431.46));
        tm.put("Tom Smith", new Double(123.23));
        tm.put("Jain Baker",new Double(1378.23));
        tm.put("Tode Hall",new Double(99.23));
        tm.put("Ralph Smith", new Double(-19.08));

        Set<Map.Entry<String,Double>> set = tm.entrySet();
        for (Map.Entry<String,Double> val: set)
            System.out.print(val.getKey()+" "+ val.getValue()+"\n");

        System.out.println();

        double balance = tm.get("John Dou");
        tm.put("John Dou",balance + 992.45);
        System.out.println("John Dou :"+tm.get("John Dou"));
    }



}
