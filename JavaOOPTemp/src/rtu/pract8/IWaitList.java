package rtu.pract8;

import java.util.Collection;

/**
 * Интерфейс, содержащий базовые методы для реализации любого списка ожидания
 *
 * @param <E> тип элементов данного списка ожидания
 *
 * @author Тугушев Тимур
 * @version 1.0
 *
 * @see WaitList
 * @see BoundedWaitList
 * @see UnfairWaitList
 */

public interface IWaitList<E> {

    /**
     * Метод, ответственный за добавление в список ожидания нового элемента
     *
     * @param element элемент, который необходимо добавить в список ожидания
     */

    void add(E element);

    /**
     * Метод, который удаляет элемент из списка ожидания
     *
     * @param element элемент, который необходимо удалить из списка ожидания
     */

    void remove(E element);

    /**
     * Метод, возвращающий {@code true}, если список ожидания содержит поданный в аргумент
     * метода элемент, или {@code false} в случае отсутствия
     *
     * @param element элемент, который необходимо проверить на наличие в списке
     * @return {@code true}, если список ожидания содержит элемент
     */

    boolean contains(E element);

    /**
     * Метод, возвращающий {@code true}, если список ожидания содержит все элементы
     * поданной в аргумент метода коллекции, или {@code false} в обратном случае
     *
     * @param c коллекция, которую необходимо проверить на наличие в списке
     * @return {@code true}, если список ожидания содержит все элементы коллекции
     */

    boolean containsAll(Collection<E> c);

    /**
     * Метод, возвращающий {@code true}, если список ожидания не содержит ни одного элемента
     * (является пустым), или {@code false} в обратном случае
     *
     * @return {@code true}, если список ожидания является пустым
     */

    boolean isEmpty();
}
