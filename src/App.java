import java.util.Set;

import Structures.Sets.Sets;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        Sets setsClases = new Sets();
        Set<String> hasSet = setsClases.cosntruirHashSet();
        System.out.println(hasSet);
        System.out.println(hasSet.size());
        System.out.println(hasSet.contains("A"));
        //System.out.println("A".hashCode());
        //System.out.println(Integer.hashCode(10));

        String a1 = "A";
        String a2 = "A";

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);

        Node<String> n1 = new Node<>("A",20);
        Node<String> n2 = new Node<>("A",19);

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n1.equals(n2));
        System.out.println(n1.hashCode() == n2.hashCode());

        Set<String> linkSet = setsClases.cosntruirLinkedHashSet();
        System.out.println(linkSet);

        Set<String> treeSet = setsClases.cosntruirTreeSet();
        System.out.println(treeSet);

        
    }
}
