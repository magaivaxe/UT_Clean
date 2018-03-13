/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut_clean;

/**
 * Interface to create a list personalized and his methods
 * @author sire_marcos
 * @param <T> General type for my list. So T could be any type not primitive
 */
public interface MyList<T extends Comparable<T>>
{
    /**
     * Method to add to the MyList
     * @param e intern argument of type T
     */
    void add(T e);
    
    /**
     * Method to remove an element of T type at position 'pos'
     * @param pos the integer or index to remove element type T
     * @return 
     */
    T removeAt(int pos);
    
    /**
     * Method to remove a element named of type T
     * @param item the element of type T that will be added
     * @return 
     */
    T removeItem(T item);
    
    /**
     * Method to set to the MyList the element added on add(T e)
     * @param item the element to set
     * @param pos the index to set the item
     */
    void setAt(T item, int pos);
    
    /**
     * Method to get a value from index 'pos'
     * @param pos index 'pos'
     * @return 
     */
    T getAt(int pos);
    
    /**
     * Method to get the MyList size
     * @return 
     */
    int getSize();
    
    /**
     * 
     */
    void reset();
}
