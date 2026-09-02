import java.util.List;
import java.util.Set;
import java.util.HashSet; 

class GottaSnatchEmAll { 

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean troca1 = false;
        boolean troca2 = false;
        
        for(String a : myCollection){
            if(!theirCollection.contains(a)){
                troca1 = true;
                break;
            }
        }
         for(String a : theirCollection){
            if(!myCollection.contains(a)){
                troca2 = true;
                break;
            }
        }
        return troca1 && troca2  ;        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
          if (collections == null || collections.isEmpty()) {
            return new HashSet<>();
        }
        
        Set<String> common = new HashSet<>(collections.get(0));
        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for (Set<String> collection : collections) {
            all.addAll(collection);
        }
        return all;
    }
}
