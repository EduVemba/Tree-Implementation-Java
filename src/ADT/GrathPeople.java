package ADT;

import java.util.*;


/**
 * @param = Implementação de Um Graph entre pessoas
 * @return
 */

public class GrathPeople {
    private Map<Person, List<Person>> adjVertices;

    public GrathPeople(Map<Person, List<Person>> adjVertices) {
        this.adjVertices = adjVertices;
    }


    public void setAdjVertices(Map<Person, List<Person>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public Map<Person, List<Person>> getAdjVertices() {
        return adjVertices;
    }

    public void addVertex(String name) {
        adjVertices.put(new Person(name), new ArrayList<>());
    }

    public void remmoveVertex(String name) {
        Person p = new Person(name);
        adjVertices.values().stream().forEach(list -> list.remove(p));
        adjVertices.remove(new Person(name));
    }

    public void addEdge(String name1, String name2) {
        Person p1 = new Person(name1);
        Person p2 = new Person(name2);
        adjVertices.get(p1).add(p2);
        adjVertices.get(p2).add(p1);
    }

    public void removeEdge(String name1, String name2) {
        Person p1 = new Person(name1);
        Person p2 = new Person(name2);
        List<Person> eP1 = adjVertices.get(p1);
        List<Person> eP2 = adjVertices.get(p2);
        if (eP1 != null) {
            eP1.remove(p2);
        }
        if (eP2 != null) {
            eP2.remove(p1);
        }
    }

    public List<Person> getAdjVertices(String name) {
        return adjVertices.get(new Person(name));
    }


    /**
     * @param grath
     * @param root
     * @return
     */
    // Primeiro os Vertices depois as bordas
    public Set<String> dephFirstTraversal(GrathPeople grath, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String person = stack.pop();
            if (!visited.contains(person)) {
                visited.add(person);
                for (Person p : grath.getAdjVertices(person)) {
                    stack.push(p.name);
                }
            }
        }
        return visited;
    }

    //Primeiro as bordas depois os vertices
    public Set<String> breadthFirstTraversal(GrathPeople grath, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            String people = queue.poll();
            for (Person p : grath.getAdjVertices(people)) {
                if (!visited.contains(p.name)) {
                    visited.add(p.name);
                    queue.add(p.name);
                }
            }
        }
        return visited;
    }

}


