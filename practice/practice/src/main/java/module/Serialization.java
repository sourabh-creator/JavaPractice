package module;

import java.io.*;
import java.nio.file.*;

class User implements Serializable {
    String name;
    User(String n) { name = n; }
}

public class Serialization {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("user.bin");

        // Save
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(new User("Alice"));
        }

        // Load
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            User u = (User) ois.readObject();
            System.out.println("Loaded user: " + u.name);
        }
    }
}
