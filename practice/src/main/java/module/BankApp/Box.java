package module.BankApp;

/**
 * Simple generic class with PECS demo (Producer Extends, Consumer Super).
 */
public class Box<T> {
    private T value;
    public Box(T v) { this.value = v; }
    public T get() { return value; }
    public void set(T v) { this.value = v; }

    public static <T> void copy(Box<? extends T> src, Box<? super T> dst) {
        dst.set(src.get()); // producer extends, consumer super
    }
}
