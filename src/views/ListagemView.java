package views;
import Interfaces.LibraryItem;
import java.util.List;
import javax.swing.*;

public class ListagemView extends JFrame {
    private final List<LibraryItem> listMaterials;

    public ListagemView(List<LibraryItem> listMaterials){
        this.listMaterials = listMaterials;

        JFrame tela = new JFrame("Listagem");
        tela.setVisible(true);
        tela.setSize(400, 270);
        tela.setLocation(900,300);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setLayout(null);

        JLabel tipo = new JLabel("Listagem");
        tipo.setText("Listagem");
        tipo.setBounds(150,20,185,30);
        tela.add(tipo);

        JLabel conteudo = new JLabel("Conteudo");
        conteudo.setText(listarItem());
        conteudo.setBounds(10,30,380,200);
        tela.add(conteudo);
    }

    public String listarItem(){
        String materials = "<html> ";
        for ( LibraryItem libraryItem : listMaterials) {
            materials = materials.concat( libraryItem.toString() + "<br>" );
        }
        materials = materials.concat( "</html>" );
        return materials;
    }
}
