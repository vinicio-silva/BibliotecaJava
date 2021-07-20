package classes;
import Interfaces.LibraryItem;
import java.util.List;

public class Item implements LibraryItem {
    String titulo;
    int ano;

    public Item(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void includeMaterial(List<LibraryItem> list, LibraryItem libraryItem) {
        list.add(libraryItem);
    }
};
