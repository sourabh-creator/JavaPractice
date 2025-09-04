package module;

import java.nio.file.*;
import java.io.*;

public class ReadWriteIO {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("hello.txt");

        // Write
        Files.writeString(file, "Hello, world!");

        // Read
        String text = Files.readString(file);
        System.out.println("File content: " + text);
    }
}
