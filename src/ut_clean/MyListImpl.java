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
    
    /**
     * (non-Javadoc)
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

    @Override
    public T removeAt(int pos)
    {
        
    }

    @Override
    public T removeItem(T item)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAt(T item, int pos)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getAt(int pos)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Method to reset fields from constructor
     */
    @Override
    public void reset() {size = -1; start = null; current = start;}
    
    /**
     * I tried change the 'Elem' class to a class file, but I failed. This class
     * must be whited here. I don't know the response now.
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
