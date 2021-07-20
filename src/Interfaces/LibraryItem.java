package Interfaces;
import java.util.List;

public interface LibraryItem {
    public void includeMaterial(List<LibraryItem> list, LibraryItem libraryItem);
    public String toString();
}
