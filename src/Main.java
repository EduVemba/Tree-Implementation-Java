


import ADT.GrathPeople;
import ADT.Person;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {

        Map<Person, List<Person>> people = new HashMap<>();

        GrathPeople graph = new GrathPeople(people);
        graph.addVertex("Eduardo");
        graph.addVertex("Pedro");
        graph.addVertex("Antonio");
        graph.addEdge("Eduardo", "Pedro");
        graph.getAdjVertices("Eduardo");

    }
}
