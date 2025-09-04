package module;

import java.util.*;

public class StudentService {
    private final Map<Integer, Student> byId = new HashMap<>();
    private final List<Student> registrationOrder = new ArrayList<>();
    private final Set<String> uniqueNames = new HashSet<>();

    public void add(Student s) {
        if (byId.containsKey(s.id())) {
            throw new IllegalArgumentException("Duplicate id: " + s.id());
        }
        byId.put(s.id(), s);
        registrationOrder.add(s);
        uniqueNames.add(s.name());
    }

    public Optional<Student> findById(int id) {
        return Optional.ofNullable(byId.get(id));
    }

    public void remove(int id) {
        Student removed = byId.remove(id);
        if (removed == null) {
            throw new IllegalArgumentException("Student id not found: " + id);
        }
        registrationOrder.remove(removed);
        uniqueNames.clear();
        registrationOrder.forEach(st -> uniqueNames.add(st.name()));
    }

    public List<Student> listSortedByName() {
        return registrationOrder.stream()
                .sorted(Comparator.comparing(Student::name))
                .toList();
    }

    public Set<String> uniqueNames() {
        return new HashSet<>(uniqueNames);
    }

    // Simple demo runner inside StudentService
    public static void main(String[] args) {
        StudentService svc = new StudentService();

        svc.add(new Student(1, "Alice", 3.8));
        svc.add(new Student(2, "Bob", 3.9));
        System.out.println("Find ID 1: " + svc.findById(1));
        System.out.println("Unique names: " + svc.uniqueNames());

        var sorted = svc.listSortedByName();
        System.out.println("Sorted by name: " + sorted);

        svc.remove(1);
        System.out.println("Find ID 1 after remove: " + svc.findById(1));
        System.out.println("Unique names after remove: " + svc.uniqueNames());

        svc.add(new Student(3, "Charlie", 3.6));
        System.out.println("Added Charlie");

        try {
            svc.add(new Student(3, "AnotherCharlie", 3.2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
