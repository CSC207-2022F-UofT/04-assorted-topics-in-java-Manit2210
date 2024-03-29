/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }


    public boolean addDrivable(String id, Drivable item){
        if (!drivable_map.containsKey(id)){
            drivable_map.put(id, item);
            return true;
        }
        return false;
    }



    public boolean hasFasterThan(int speed){
        for (Drivable value: drivable_map.values()){
            if (value.getMaxSpeed() >= speed){
                return true;
            }
        }
        return false;
    }





    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public List<Tradable> getTradable(){
        List<Tradable> list1 = new ArrayList<Tradable>();
        for(Drivable value : drivable_map.values()){
            if (value instanceof Tradable){
                list1.add((Tradable) value);
            }
        }
        return list1;
    }



    
}