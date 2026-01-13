package Structures.Sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;

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
        Set<String> treSet = new TreeSet<>(
                (pal1,pal2) -> pal1.compareToIgnoreCase(pal2));
        treSet.add("D");
        treSet.add("A");
        treSet.add("A");
        treSet.add("E");
        treSet.add("I");
        treSet.add("O");
        treSet.add("B");
        treSet.add("a");
        return treSet;
    }

    public Set<Person> personsTreeSet(){
        
        //Set<Person> treePersons = new TreeSet<>(
            //(p1,p2) ->{

                //solo edad
                //return Integer.compare(p1.getEdad(), p2.getEdad());

                //solo nombre
                //return p2.getName().compareTo(p1.getName());

                //int comN = p2.getName().compareTo(p1.getName());
                
               // if(comN != 0) 
               //     return comN;
               // int comE = Integer.compare(p2.getEdad(), p1.getEdad());
               // return comE;
                
            //});
        
        Set<Person> treePersons = new TreeSet<>();

        treePersons.add(new Person("Carlos",23));
        treePersons.add(new Person("Ana",30));
        treePersons.add(new Person("Luis",18));
        treePersons.add(new Person("Ana",20));
        treePersons.add(new Person("Andres",23));
        treePersons.add(new Person("Luis",18));
        //treePersons.add(new Person("ana",20));
        return treePersons;

    }
}

