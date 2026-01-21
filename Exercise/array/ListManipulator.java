package sprint;

import java.util.List;

public class ListManipulator {

    public List<String> manipulateList(List<String> list) {
        if(list == null){
            return null;
        }
        if(!list.isEmpty()){
            list.remove(list.size()- 1);
        }
        if(!list.isEmpty()){
            list.set(list.size() - 1, "The size of the list is " + list.size());
        }

        list.add("last");
        list.set(0, "first");

        return list;
    }
}
