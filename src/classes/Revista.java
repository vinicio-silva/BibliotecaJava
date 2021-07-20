package classes;
import Interfaces.LibraryItem;
import java.util.List;

public class Revista extends Item{
    String org;
    int volume;
    int nro;

    public Revista(String titulo, int ano, String org, int volume, int nro) {
        super(titulo, ano);
        this.org = org;
        this.volume = volume;
        this.nro = nro;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Revista - " +
                "titulo: " + titulo +
                ", ano: " + ano +
                ", org: " + org +
                ", volume: " + volume +
                ", nro: " + nro;
    }
    @Override
    public void includeMaterial(List<LibraryItem> list, LibraryItem libraryItem) {
        list.add(libraryItem);
    }
}

