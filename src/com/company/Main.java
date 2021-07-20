package com.company;
import java.util.List;
import java.util.ArrayList;
import Interfaces.LibraryItem;
import views.LivroView;

public class Main {

    public static void main(String[] args) {
        List<LibraryItem> listMaterials = new ArrayList<>();
        LivroView livro = new  LivroView(listMaterials);
    }
}
