import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


/**
 * Created by Soumya Ranjan Sethy on 24/07/17.
 */
public class FindPath {

    static HashMap parm;
    static List printBill;

    public static void main(String[] args) {
        parm = new HashMap();
        parm.put("A", -5.0);
        parm.put("B", 25.0);
        parm.put("C", -20.0);
        parm.put("D", 25.0);
        parm.put("E", -20.0);
        parm.put("F", -5.0);

        //Passing values to findPath Method.
        findPath(parm);

        // System.out.println(printBill.toString());

    }


    public static void findPath(HashMap details) {
        printBill = new ArrayList();
        Double Max_Value = (Double) Collections.max(details.values());
        Double Min_Value = (Double) Collections.min(details.values());
        if (Max_Value != Min_Value) {
            String Max_Key = getKeyFromValue(details, Max_Value).toString();
            String Min_Key = getKeyFromValue(details, Min_Value).toString();
            Double result = Max_Value + Min_Value;
            result = round(result, 1);
            if ((result >= 0.0)) {
                //printBill.add(Min_Key + " needs to pay " + Max_Key + ":" + round(Math.abs(Min_Value), 2));
                System.out.println(Min_Key + " needs to pay " + Max_Key + ":" + round(Math.abs(Min_Value), 2));
                details.remove(Max_Key);
                details.remove(Min_Key);
                details.put(Max_Key, result);
                details.put(Min_Key, 0.0);
            } else {
                // printBill.add(Min_Key + " needs to pay " + Max_Key + ":" + round(Math.abs(Max_Value), 2));
                System.out.println(Min_Key + " needs to pay " + Max_Key + ":" + round(Math.abs(Max_Value), 2));


                details.remove(Max_Key);
                details.remove(Min_Key);
                details.put(Max_Key, 0.0);
                details.put(Min_Key, result);
            }
            findPath(details);
        }

    }

    public static Object getKeyFromValue(HashMap hm, Double value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

    public static double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}