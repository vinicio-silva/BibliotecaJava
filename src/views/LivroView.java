package views;
import Interfaces.LibraryItem;
import classes.Livro;
import java.util.List;
import javax.swing.*;

public class LivroView extends JFrame {
    private final  JFrame tela = new JFrame("Livros");
    private final  JButton inserirButton = new JButton("Incluir");
    private final  JButton revistasButton = new JButton("Revistas");
    private final  JButton listagemButton = new JButton("Listagem");
    private final JTextField tituloField = new JTextField();
    private final JTextField autorField = new JTextField();
    private final JTextField anoField = new JTextField();
    private final List<LibraryItem> listMaterials;

    public LivroView(List<LibraryItem> listMaterials){

        this.listMaterials = listMaterials;

        //Tela
        tela.setVisible(true);
        tela.setSize(370, 270);
        tela.setLocation(900,300);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        //LabelTela
        JLabel tipo = new JLabel("Livros");
        tipo.setText("Livros");
        tipo.setBounds(150,20,185,30);
        tela.add(tipo);
        //Titulo
        JLabel titulo = new JLabel("Titulo");
        titulo.setText("Titulo: ");
        titulo.setBounds(30,70,90,25);
        tela.add(titulo);
        tituloField.setBounds(70,70,200,25);
        tela.add(tituloField);
        //Autor
        JLabel autor = new JLabel("Autor");
        autor.setText("Autor: ");
        autor.setBounds(30,100,90,25);
        tela.add(autor);
        autorField.setBounds(70,100,200,25);
        tela.add(autorField);
        //Ano
        JLabel ano = new JLabel("Ano");
        ano.setText("Ano: ");
        ano.setBounds(30,130,90,25);
        tela.add(ano);
        anoField.setBounds(70,130,40,25);
        tela.add(anoField);
        //Botoes
        inserirButton.setBounds(30,170,90,30);
        tela.add(inserirButton);

        revistasButton.setBounds(135,170,90,30);
        tela.add(revistasButton);

        listagemButton.setBounds(240,170,90,30);
        tela.add(listagemButton);

        setInserirButton();
        setRevistasButton();
        setLstagemButton();
    }

    public void setInserirButton(){
        inserirButton.addActionListener(event -> {
            try {
                if(isFieldEmpty()){
                    JOptionPane.showMessageDialog(tela,"Favor preencha todos os campos!");
                } else {
                    Livro livro = new Livro(tituloField.getText(), autorField.getText(), Integer.parseInt(anoField.getText()));
                    livro.includeMaterial(listMaterials, livro);
                    JOptionPane.showMessageDialog(tela, "Livro adicionado com sucesso!");
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(tela,"Favor preencha o campo ano com valores numéricos!");
            }
        });
    }

   public void setLstagemButton(){
        listagemButton.addActionListener(event -> {
            ListagemView listagem = new ListagemView(listMaterials);
        });
   }

    public void setRevistasButton(){
        revistasButton.addActionListener(event -> {
            RevistaView revista = new RevistaView(listMaterials);
        });
    }

    public boolean isFieldEmpty() {
        return tituloField.getText().equals( "" ) || autorField.getText().equals( "" ) || anoField.getText().equals( "" );
    }
}






