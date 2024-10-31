


import ADT.GrathPeople;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.io.*;
import java.util.List;
import java.util.Random;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) throws IOException {

        GrathPeople graph = new GrathPeople();
        graph.addVertex("Eduardo");
        graph.addVertex("Pedro");
        graph.addVertex("Antonio");
        graph.addEdge("Eduardo", "Pedro");

    }
}
