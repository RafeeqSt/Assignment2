package List;

import java.util.*;

public class SetClass {



    public static String addCat()
        {
            Set s = new HashSet();
            s.add("Cat");
            String animal = null;
            for(int i=0; i<s.size();i++)
            {
                animal = s.toArray()[0].toString();
            }
            return ""+animal;
        }

}
