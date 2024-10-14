import java.util.ArrayList;
import java.util.List;

public class TreeLinked<E> implements Position<E>{

    private E element;
    private TreeLinked parent;
    private List<TreeLinked> children;

    TreeLinked(E element){
        this.element = element;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    TreeLinked(E element,TreeLinked parent){
        this.element = element;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    @Override
    public E element() {
        if (element == null) throw new  InvalidPositionException("Element is null");
        return element;
    }
}
