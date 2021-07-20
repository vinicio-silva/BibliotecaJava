package views;
import Interfaces.LibraryItem;
import classes.Revista;
import java.util.List;
import javax.swing.*;

public class RevistaView extends JFrame {
    private final  JFrame tela = new JFrame("Revistas");
    private final  JButton inserirButton = new JButton("Incluir");
    private final  JButton livrosButton = new JButton("Livros");
    private final  JButton listagemButton = new JButton("Listagem");
    private final JTextField tituloField = new JTextField();
    private final JTextField orgField = new JTextField();
    private final JTextField anoField = new JTextField();
    private final JTextField nroField = new JTextField();
    private final JTextField volField = new JTextField();
    private final List<LibraryItem> listMaterials;

    public RevistaView(List<LibraryItem> listMaterials){

        this.listMaterials = listMaterials;

        //Tela
        tela.setVisible(true);
        tela.setSize(370, 270);
        tela.setLocation(900,300);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setLayout(null);
        //LabelTela
        JLabel tipo = new JLabel("Revistas");
        tipo.setText("Revistas");
        tipo.setBounds(150,20,185,30);
        tela.add(tipo);
        //Titulo
        JLabel titulo = new JLabel("Titulo");
        titulo.setText("Titulo: ");
        titulo.setBounds(30,70,90,25);
        tela.add(titulo);
        tituloField.setBounds(70,70,200,25);
        tela.add(tituloField);
        //Org
        JLabel org = new JLabel("Org");
        org.setText("Org: ");
        org.setBounds(30,100,90,25);
        tela.add(org);
        orgField.setBounds(70,100,200,25);
        tela.add(orgField);
        //Vol
        JLabel vol = new JLabel("Vol");
        vol.setText("Vol: ");
        vol.setBounds(30,130,90,25);
        tela.add(vol);
        volField.setBounds(70,130,40,25);
        tela.add(volField);
        //Nro
        JLabel nro = new JLabel("Nro");
        nro.setText("Nro: ");
        nro.setBounds(120,130,90,25);
        tela.add(nro);
        nroField.setBounds(160,130,40,25);
        tela.add(nroField);
        //Ano
        JLabel ano = new JLabel("Ano");
        ano.setText("Ano: ");
        ano.setBounds(210,130,90,25);
        tela.add(ano);
        anoField.setBounds(250,130,40,25);
        tela.add(anoField);
        //Botoes
        inserirButton.setBounds(30,170,90,30);
        tela.add(inserirButton);

        livrosButton.setBounds(135,170,90,30);
        tela.add(livrosButton);

        listagemButton.setBounds(240,170,90,30);
        tela.add(listagemButton);
        setInserirButton();
        setListagemButton();
        setLivrosButton();
    }

    public void setInserirButton(){
        inserirButton.addActionListener(event -> {
            try {
                if(isFieldEmpty()){
                    JOptionPane.showMessageDialog(tela,"Favor preencha todos os campos!");
                } else {
                    Revista revista = new Revista (tituloField.getText(), Integer.parseInt(anoField.getText()),orgField.getText(),Integer.parseInt(volField.getText()),Integer.parseInt(nroField.getText()));
                    revista.includeMaterial(listMaterials, revista);
                    JOptionPane.showMessageDialog(tela, "Revista adicionada com sucesso!");
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(tela,"Favor preencha os campos ano, vol e nro com valores numéricos!");
            }
        });
    }

    public void setListagemButton(){
        listagemButton.addActionListener(event -> {
            ListagemView listagem = new ListagemView(listMaterials);
        });
    }

    public void setLivrosButton(){
        livrosButton.addActionListener(event -> {
           LivroView livro = new LivroView(listMaterials);
        });
    }

    public boolean isFieldEmpty() {
        return tituloField.getText().equals( "" ) || orgField.getText().equals( "" ) || anoField.getText().equals( "" ) || volField.getText().equals( "" ) || nroField.getText().equals( "" );
    }
}
