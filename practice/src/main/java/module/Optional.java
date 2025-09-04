package module;

import java.util.*;

        public class Optional {
        public static void main(String[] args) {
        java.util.Optional<String> maybe = java.util.Optional.of("Hello");
        System.out.println(maybe.orElse("Default"));

        java.util.Optional<String> empty = java.util.Optional.empty();
        System.out.println(empty.orElse("Default"));
        }
        }
