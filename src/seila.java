import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class seila extends JFrame{
    public seila(){
        setDefaultCloseOperation(seila.EXIT_ON_CLOSE);
        setTitle(" Menu Principal ");
        setSize(450,600); /*1600,900*/ // 450,600 //
        setLocationRelativeTo(null);
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        ////
        JLabel jblTipo_C=new JLabel("Escolha O Tipo da Conta:");
        getContentPane().add(jblTipo_C);

        JButton btPoupanca=new JButton("Conta poupança");
        getContentPane().add(btPoupanca);
        btPoupanca.setMaximumSize(new Dimension(140,20));
        btPoupanca.setMinimumSize(new Dimension(140,20));
        btPoupanca.setPreferredSize(new Dimension(140,20));
        btPoupanca.addActionListener(new ActionListener(){public void actionPerformed (ActionEvent ae){
        
            setDefaultCloseOperation(seila.EXIT_ON_CLOSE);
            setTitle(" Menu Principal ");
            setSize(450,600); /*1600,900*/ // 450,600 //
            setLocationRelativeTo(null);
            getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
            setResizable(false);
        
            }});

        JButton btCorrente=new JButton("Conta Corrente");
        getContentPane().add(btCorrente);
        btCorrente.setMaximumSize(new Dimension(120,20));
        btCorrente.setMinimumSize(new Dimension(120,20));
        btCorrente.setPreferredSize(new Dimension(120,20));

        JButton btConta_E=new JButton("Cliente Especial");
        getContentPane().add(btConta_E);
        btConta_E.setMaximumSize(new Dimension(140,20));
        btConta_E.setMinimumSize(new Dimension(140,20));
        btConta_E.setPreferredSize(new Dimension(140,20));
        
        JButton btsair=new JButton("Sair");
        getContentPane().add(btsair);
        btsair.setMaximumSize(new Dimension(100,40));
        btsair.setMinimumSize(new Dimension(100,40));
        btsair.setPreferredSize(new Dimension(100,40));
        btsair.addActionListener(new ActionListener(){public void actionPerformed (ActionEvent ae){dispose();}});
        
        ////

        /*JLabel jbllogin=new JLabel("Login");
        getContentPane().add(jbllogin);
        JTextField txtlogin=new JTextField(37);
        getContentPane().add(txtlogin);
        
        JLabel jblsenha=new JLabel("Senha");
        getContentPane().add(jblsenha);
        JPasswordField jpwsenha=new JPasswordField(37);
        getContentPane().add(jpwsenha);
        
        JButton btlimpar=new JButton("Limpar");
        getContentPane().add(btlimpar);
        btlimpar.setMaximumSize(new Dimension(100,40));
        btlimpar.setMinimumSize(new Dimension(100,40));
        btlimpar.setPreferredSize(new Dimension(100,40));
        btlimpar.addActionListener(new ActionListener(){public void actionPerformed (ActionEvent ae){
        txtlogin.setText(null);
        jpwsenha.setText(null);
        txtlogin.requestFocus();
        }});
        
        JButton btacesso=new JButton("Acesso");
        getContentPane().add(btacesso);
        btacesso.setMaximumSize(new Dimension(100,40));
        btacesso.setMinimumSize(new Dimension(100,40));
        btacesso.setPreferredSize(new Dimension(100,40));
        btacesso.addActionListener(new ActionListener(){public void actionPerformed (ActionEvent ae){
        String login,senha;
        login = txtlogin.getText();
        senha = jpwsenha.getText();
        if (login.equals("")|| senha.equals("")){// || = ou, && = e//
            JOptionPane.showMessageDialog(null, "Preecha todos os campos.", "Acesso negado.", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Login: "+login+"\nSenha: "+senha, "Acesso",JOptionPane.INFORMATION_MESSAGE);
        
        }});
        
        JButton btsair=new JButton("Sair");
        getContentPane().add(btsair);
        btsair.setMaximumSize(new Dimension(100,40));
        btsair.setMinimumSize(new Dimension(100,40));
        btsair.setPreferredSize(new Dimension(100,40));
        btsair.addActionListener(new ActionListener(){public void actionPerformed (ActionEvent ae){dispose();}});
        */
    }
}