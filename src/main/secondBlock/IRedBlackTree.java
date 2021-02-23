package main.secondBlock;

/**
 * Коллекция хранит данные в структуре Red-black tree и гарантирует
 * логарифмическое время вставки, удаления и поиска.
 */
public interface IRedBlackTree<T extends Comparable<T>> {

    /**
     * Добавить элемент в дерево
     * @param o
     */
    void add(T o);

    /**
     * Удалить элемент из дерева
     * @param o
     */
    boolean remove(T o);

    /**
     * Возвращает true, если элемент содержится в дереве
     * @param o
     */
    boolean contains(T o);
}
