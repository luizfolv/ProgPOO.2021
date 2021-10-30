import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {

    private JFrame janela;
    private JPanel painel;

    //componentes da janela
    private JLabel lblTitulo;
    private JLabel lblNum1;
    private JLabel lblNum2;

    private JTextField txtNum1;
    private JTextField txtNum2;

    private JButton btnSoma; //botão soma
    private JButton btnSub; //botão subtração
    private JButton btnMult; //botão multiplicação
    private JButton btnDiv; //botão divisão

    private JLabel lblResultado;

    public Calc(){
        janela = new JFrame();
        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        painel.setLayout(new GridLayout(0,1));


        //desenhar tela
        lblTitulo = new JLabel("Semana 9 - Calculadora");
        lblTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        painel.add(lblTitulo);

        lblNum1 = new JLabel("Numero 1: ");
        painel.add(lblNum1);
        txtNum1 = new JTextField("0");
        painel.add(txtNum1);
        
        lblNum2 = new JLabel("Numero 2: ");
        painel.add(lblNum2);
        txtNum2 = new JTextField("0");
        painel.add(txtNum2);
        
        //Botão somar
        btnSoma = new JButton("Somar");
        btnSoma.addActionListener(this);
        painel.add(btnSoma);
        //Botão Sub
        btnSub = new JButton("Subtrair");
        btnSub.addActionListener(this);
        painel.add(btnSub);
        //Botão Mult
        btnMult = new JButton("Multiplicar");
        btnMult.addActionListener(this);
        painel.add(btnMult);
        //Botão Div
        btnDiv = new JButton("Dividir");
        btnDiv.addActionListener(this);
        painel.add(btnDiv);


        lblResultado = new JLabel("Resultado: ");
        painel.add(lblResultado);

        janela.add(painel, BorderLayout.CENTER);
        janela.setSize(300,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Integer num1 = Integer.parseInt(txtNum1.getText());
            Integer num2 = Integer.parseInt(txtNum2.getText());
            if(e.getSource() == btnSoma){
                lblResultado.setText("Resultado: " + (num1 + num2));
            }else if (e.getSource() == btnSub){
                lblResultado.setText("Resultado: " + (num1 - num2));
            }else if (e.getSource() == btnMult){
                lblResultado.setText("Resultado: " + (num1 * num2));
            }else if (e.getSource() == btnDiv){
                lblResultado.setText("Resultado: " + (num1 / num2));
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        }
    }
    public static void main(String[] args) {
        new Calc();
    }
}