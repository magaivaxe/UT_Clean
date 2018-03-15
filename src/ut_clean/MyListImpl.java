/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut_clean;

/**
 *
 * @author sire_marcos
 * @param <T>
 */
public class MyListImpl<T extends Comparable<T>> implements MyList<T>
{
    //Instances
    private Elem start;
    private Elem current;
    //Fields
    private int size;
    
    //Constructor
    public MyListImpl()
    {
        super();
        start = null;
        current = start;
        size = -1;
    }
    
    /* (non-Javadoc)
     * @see ut_clean.MyList#add(T)  
     */
    @Override
    public void add(T e)
    {
        //Instace of class Elem
        Elem newElem = new Elem(e, null);
        //If MyList is void the MyList will be to start
        if(start == null)
        {
            start = newElem;
            current = start;
        }
        //Else the next will be seted and null will be vanished
        else
        {
            current.setNext(newElem);
            current = newElem;
        }
        //The size is add by one
        size++;
    }
    
    /* (non-Javadoc)
     * @see ut_clean.MyList#removeAt(int)
     */
    @Override
    public T removeAt(int pos)
    {
        //Condition to an exception of out of index
        if (pos > size)
        {
            throw new ArrayIndexOutOfBoundsException("The size is "+ size + 
                    " the element " + pos + "don't exists");
        }
        //Variables type class Elem
        Elem previus = start;
        Elem toRemove = previus;
        //Condition to remove and replace the removed element by null
        if (pos == 0)
        {
            //This code remplace the zero position by the next element
            toRemove = start;
            start.setNext(start.getNext());
        }
        else
        {
            while (pos-- > 1)
            {            
                //Replace the value on pos by null
                previus = previus.getNext();
                toRemove = previus.getNext();
                previus.setNext(toRemove.getNext());
            }
        }
        //Size decremantation
        size--;
        //the removed element
        return toRemove.getContent();
    }
    
    /* (non-Javadoc)
     * @see ut_clean.MyList#removeItem(item)
     */
    @Override
    public T removeItem(T item)
    {
        //Variables
        Elem previus = null;
        Elem toRemove = start;
        boolean found = false;
        //Conditions to found the item
        if(start != null && start.getContent().equals(item))
        {
            found = true;
            toRemove = start;
            start.setNext(start.getNext());
            size--;
        }
        else
        {
            //Loop to find the item
            while (!found && toRemove != null)
            {                
                previus = toRemove;
                toRemove = toRemove.getNext();
                //Condition to found
                if(toRemove.getContent().equals(item)){ found = true; }
            }
            previus.setNext(toRemove.getNext());
        }
        return (toRemove == null) ? null:toRemove.getContent();
    }

    @Override
    public void setAt(T item, int pos)
    {
        //Condition to set 
        if (pos > size)
        {
            throw new ArrayIndexOutOfBoundsException("The size is " + size +
                    ". The element " + pos + "don't exists");
        }
        //Variables
        Elem current = start;
        while (pos-- > 0){ current = current.getNext(); }
        current.setContent(item);
    }

    @Override
    public T getAt(int pos)
    {
        //Condition to get
        if (pos > size)
        {
            throw new ArrayIndexOutOfBoundsException("The size is " + size +
                    ". The element " + pos + "don't exists");
        }
         //Variables
        Elem current = start;
        while (pos-- > 0){ current = current.getNext(); }
        return current.getContent();
    }

    @Override
    public int getSize()
    {
        return size + 1;
    }
    
    /**
     * Method to reset fields from constructor
     */
    @Override
    public void reset() {size = -1; start = null; current = start;}
    
    /**
     * THIS CLASS RUN AS A STRUCTURE!
     */
    class Elem
    {
        //Recursivity instance of next and content type general
        private T content;
        private Elem next;
        
        /**
         * Constructor from 'Elem' 
         * @param content The element of general type T from MyList;
         * @param next The next element from the list. That's why the next use
         * recursivity there;
         */
        public Elem(T content, Elem next)
        {
            super();
            this.content = content;
            this.next = next;
        }
        
        /**
         * Getter from content
         * @return the content field value
         */
        public T getContent() { return content; }
        
        /**
         * Getter from next 
         * @return the next value
         */
        public Elem getNext() { return next; }
        
        /**
         * Setter from next
         * @param n value to set to field next
         */
        public void setNext(Elem n) { next = n; }
        
        /**
         * Setter from content
         * @param c value to set to field content
         */
        public void setContent(T c) { content = c; }       
    }
    
}
