import java.util.Collection;
import java.util.HashMap ;
import java.util.Set ;
import java.util.Iterator ;

public class HM_Set{
    public  class SCKagura<E> implements  Set<E>{
        private  static  final  Object DEFAULT_VALUE =new Object() ;
        private  HashMap<E,Object> Hmap ;
        // Constructor
        public SCKagura(){
            Hmap = new HashMap<>() ;
        }
        /**
         * Returns the number of elements in the set.
         *
         * @return The number of elements in the set.
         * @postcondition The set remains unchanged.
         */
        @Override
        public  int size() {
            return Hmap.size() ;
        }
        /**
         * Checks if the set is empty.
         *
         * @return True if the set is empty, false otherwise.
         * @postcondition The set remains unchanged.
         */
        @Override
        public boolean isEmpty() {
            return Hmap.isEmpty() ;
        }
        /**
         * Checks if the set contains the specified element.
         *
         * @param o The element to check for containment.
         * @return True if the set contains the element, false otherwise.
         * @postcondition The set remains unchanged.
         */
        @Override
        public boolean contains(Object o) {
            return Hmap.containsKey(o) ;
        }
        /**
         * Returns an iterator over the elements in the set.
         *
         * @return An iterator over the elements in the set.
         * @postcondition The set remains unchanged.
         */
        @Override
        public  Iterator<E> iterator() {
            return  Hmap.keySet().iterator();
        }
        // No need todo
        @Override
        public Object[] toArray() {
            return Hmap.keySet().toArray();
        }
        //No need todo
        @Override
        public <T> T[] toArray(T[] a) {
            return Hmap.keySet().toArray(a);
        }

        /**
         * Adds the specified element to the set.
         *
         * @param e The element to be added.
         * @return True if the set is modified, false otherwise.
         * @precondition The element is not null.
         * @postcondition The element is added to the set.
         * @postcondition If the element is already present, the set remains unchanged.
         * @postcondition The size of the set increases by 1 if the element is not already present.
         */
        @Override
        public boolean add(E e) {
            Hmap.put(e, DEFAULT_VALUE);
            return true;
        }
        /**
         * Removes the specified element from the set.
         *
         * @param o The element to be removed.
         * @return True if the set is modified, false otherwise.
         * @postcondition If the set contains the specified element, it is removed.
         * @postcondition If the set does not contain the element, the set remains unchanged.
         * @postcondition The size of the set decreases by 1 if the element is present.
         */
        @Override
        public boolean remove(Object o) {
            return Hmap.remove(o) != null;
        }
        /**
         * Checks if the set contains all elements in the specified collection.
         *
         * @param c The collection to be checked for containment.
         * @return True if the set contains all elements in the collection, false otherwise.
         * @postcondition The set remains unchanged.
         */
        @Override
        public boolean containsAll(Collection<?> c) {
            return Hmap.keySet().containsAll(c);
        }
        /**
         * Adds all elements in the specified collection to the set.
         *
         * @param c The collection whose elements are to be added.
         * @return True if the set is modified, false otherwise.
         * @precondition The specified collection is not null.
         * @postcondition All elements in the collection are added to the set.
         * @postcondition If an element is already present, the set remains unchanged for that element.
         * @postcondition The size of the set increases by the number of unique elements in the collection.
         */
        @Override
        public boolean addAll(Collection<? extends E> c) {
            for (E element : c) {
                add(element);
            }
            return true;
        }
        /**
         * Retains only the elements in the set that are contained in the specified collection.
         *
         * @param c The collection with elements to be retained in the set.
         * @return True if the set is modified, false otherwise.
         * @postcondition The set contains only elements that are present in the specified collection.
         * @postcondition The set remains unchanged for elements not present in the specified collection.
         * @postcondition The size of the set becomes equal to the number of common elements with the specified collection.
         */
        @Override
        public boolean retainAll(Collection<?> c) {
            return Hmap.keySet().retainAll(c);
        }
        /**
         * Removes all elements in the set that are contained in the specified collection.
         *
         * @param c The collection with elements to be removed from the set.
         * @return True if the set is modified, false otherwise.
         * @postcondition The set does not contain any elements present in the specified collection.
         * @postcondition The set remains unchanged for elements not present in the specified collection.
         * @postcondition The size of the set decreases by the number of elements present in the specified collection.
         */
        @Override
        public boolean removeAll(Collection<?> c) {
            return Hmap.keySet().removeAll(c);
        }
        /**
         * Removes all elements from the set.
         *
         * @postcondition The set becomes empty.
         */
        @Override
        public void clear() {
            Hmap.clear();
        }
        // No need to do for now
        @Override
        public boolean equals(Object obj) {
            return Hmap.keySet().equals(obj);
        }

        /**
         * Returns a hash code value for the set.
         *
         * @return A hash code value for the set.
         * @postcondition The set remains unchanged.
         */

        @Override
        public int hashCode() {
            return Hmap.keySet().hashCode();
        }


    }
}