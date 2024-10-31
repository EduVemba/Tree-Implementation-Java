package ADT;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

 class Person{
    String name;

    Person(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return name.equals(p.name);
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }

}


/**
 * @param = Implementação de Um Graph entre pessoas
 * @Return = New Graph
 */

public class GrathPeople {
    Map<Person, List<Person>> adjVertices;

    public GrathPeople() {}

    public GrathPeople(Map<Person, List<Person>> adjVertices){
        this.adjVertices = adjVertices;
    }

    public void setAdjVertices(Map<Person, List<Person>> adjVertices){
        this.adjVertices = adjVertices;
    }
    public Map<Person, List<Person>> getAdjVertices() {
        return adjVertices;
    }

    public void addVertex(String name){
        adjVertices.put(new Person(name), new ArrayList<>());
    }

    public void remmoveVertex(String name){
        Person p = new Person(name);
        adjVertices.values().stream().forEach(list -> list.remove(p));
        adjVertices.remove(new Person(name));
    }

    public void addEdge(String name1, String name2){
        Person p1 = new Person(name1);
        Person p2 = new Person(name2);
        adjVertices.get(p1).add(p2);
        adjVertices.get(p2).add(p1);
    }
    public void removeEdge(String name1, String name2){
        Person p1 = new Person(name1);
        Person p2 = new Person(name2);
        List<Person> eP1 = adjVertices.get(p1);
        List<Person> eP2 = adjVertices.get(p2);
        if(eP1 != null){
            eP1.remove(p2);
        }
        if(eP2 != null){
            eP2.remove(p1);
        }
    }
    public List<Person> getAdjVertices(String name){
        return adjVertices.get(new Person(name));
    }

}


