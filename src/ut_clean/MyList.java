/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut_clean;

/**
 *
 * @author sire_marcos
 * @param <T> General type for my list. So T could be any type not primitive
 */
public interface MyList<T extends Comparable<T>>
{
    void add(T e);
    T removeAt(int pos);
    T removeItem(T item);
    void setAt(T item, int pos);
    T getAt(int pos);
    int getSize();
    void reset();
}
