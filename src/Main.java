import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create an instance of SCKagura set
        HM_Set.SCKagura<String> sckaguraSet = new HM_Set().new SCKagura<>();

        // Test size and isEmpty methods
        System.out.println("Size: " + sckaguraSet.size());
        System.out.println("Is Empty: " + sckaguraSet.isEmpty());

        // Test add method
        sckaguraSet.add("Element1");
        sckaguraSet.add("Element2");
        sckaguraSet.add("Element3");

        System.out.println("Size: " + sckaguraSet.size());
        // Test contains method
        System.out.println("Contains 'Element1': " + sckaguraSet.contains("Element1"));
        System.out.println("Contains 'Element4': " + sckaguraSet.contains("Element4"));

        // Test iterator method
        System.out.println("Iterator Test:");
        for (String element : sckaguraSet) {
            System.out.println(element);
        }

        // Test toArray method
        Object[] array = sckaguraSet.toArray();
        System.out.println("Array representation of the set: " + Arrays.toString(array));

        // Test toArray method with argument
        String[] stringArray = new String[sckaguraSet.size()];
        sckaguraSet.toArray(stringArray);
        System.out.println("String Array representation of the set: " + Arrays.toString(stringArray));

        // Test remove method
        sckaguraSet.remove("Element2");
        System.out.println("After removing 'Element2': " + Arrays.toString(sckaguraSet.toArray()));

        // Test containsAll method
        Set<String> otherSet = new HashSet<>(Arrays.asList("Element1", "Element3"));
        System.out.println("ContainsAll otherSet: " + sckaguraSet.containsAll(otherSet));

        // Test addAll method
        sckaguraSet.addAll(otherSet);
        System.out.println("After addingAll otherSet: " + Arrays.toString(sckaguraSet.toArray()));

        // Test retainAll method
        Set<String> retainSet = new HashSet<>(Arrays.asList("Element1", "Element2"));
        sckaguraSet.retainAll(retainSet);
        System.out.println("After retainingAll retainSet: " + Arrays.toString(sckaguraSet.toArray()));

        // Test removeAll method
        Set<String> removeAllSet = new HashSet<>(Arrays.asList("Element1", "Element3"));
        sckaguraSet.removeAll(removeAllSet);
        System.out.println("After removeAll removeAllSet: " + Arrays.toString(sckaguraSet.toArray()));

        // Test clear method
        sckaguraSet.clear();
        System.out.println("After clear: " + Arrays.toString(sckaguraSet.toArray()));

        // Test equals method
        HM_Set.SCKagura<String> anotherSet = new HM_Set().new SCKagura<>();
        anotherSet.add("Element1");
        anotherSet.add("Element3");
        System.out.println("Sets are equal: " + sckaguraSet.equals(anotherSet));

        // Test hashCode method
        System.out.println("HashCode: " + sckaguraSet.hashCode());
    }
}
