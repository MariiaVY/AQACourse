//in the Example class, implement a couple of equals / hashCode methods in accordance with the rules
// for implementing these methods (check details with your favorite search engine).
//Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
package task7;

import java.util.HashSet;
import java.util.Set;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Example example = (Example) o;

        return (example.first == this.first && example.last == this.last);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}
