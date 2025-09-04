package module;
import java.nio.file.*;
import java.io.*;

public class BinaryIOExample {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("data.bin");

        // Write bytes
        byte[] data = {1, 2, 3, 4, 5};
        Files.write(file, data);

        // Read bytes
        byte[] loaded = Files.readAllBytes(file);
        System.out.println("First byte: " + loaded[0]);
    }
}
