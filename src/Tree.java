

public interface Tree<E>{

    public Position<E> insert(Position<E> position, E elem)throws InvalidPositionException;



}