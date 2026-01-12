package Structures.Sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> cosntruirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        return hashSet;
    }

    public Set<String> cosntruirLinkedHashSet(){
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("A");
        linkSet.add("B");
        linkSet.add("C");
        linkSet.add("A");
        linkSet.add("D");
        linkSet.add("E");
        linkSet.add("F");
        linkSet.add("7DDDDDGGGG99992343153");
        linkSet.add("12345678");
        return linkSet;
    }

    public Set<String> cosntruirTreeSet(){
        Set<String> treSet = new TreeSet<>();
        treSet.add("D");
        treSet.add("A");
        treSet.add("E");
        treSet.add("I");
        treSet.add("O");
        treSet.add("B");
        treSet.add("a");
        return treSet;
    }

    public Set<String> cosntruirTreeSetConComparador(){

        return null;
    }
}
