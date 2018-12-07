package patterns.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String,TreeType> treeTypeMaps = new HashMap<>();

    public static TreeType getTreeType(String name , Color color, String otherTreeData){
        TreeType res = treeTypeMaps.get(name);
        if (res == null){
            res = new TreeType(name,color,otherTreeData);
            treeTypeMaps.put(name,res);
        }
        return res;
    }
}
