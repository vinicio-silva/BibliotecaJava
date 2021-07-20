package classes;
import Interfaces.LibraryItem;
import java.util.List;

public class Livro extends Item {
    String autor;

    public Livro(String titulo, String autor, int ano) {
        super(titulo, ano);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro - " +
                "titulo: " + titulo +
                ", ano: " + ano +
                ", autor: " + autor;
    }

    @Override
    public void includeMaterial(List<LibraryItem> list, LibraryItem libraryItem) {
        list.add(libraryItem);
    }

}

