package App.login;
/***
 * 
 * @author diego
 *
 */
import java.awt.Color;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class loginTemplate extends JFrame{

    private JPanel pDerecha, pIzquierda;
    private JLabel lEslogan, lNotificaciones, lUsuario,lPortada;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox<String> cbTipoUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    private ImageIcon iDimAux , iUsuario,iportada;


    public loginTemplate() {
        super("Login Usuario");

        pIzquierda = new JPanel();
        pIzquierda.setSize(600, 500);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(new Color(245, 245, 245));
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(400, 500);
        pDerecha.setLocation(600, 0);
        pDerecha.setBackground(new Color(78, 115, 223));
        pDerecha.setLayout(null);
        this.add(pDerecha);
        
        iUsuario = new ImageIcon("../Clse2/recursos/perfil.png");
        iDimAux = new ImageIcon(iUsuario.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));

        lUsuario = new JLabel();
        lUsuario.setBounds((pDerecha.getWidth()/2)-30, 60, 60, 60);
        lUsuario.setIcon(iDimAux);
        pDerecha.add(lUsuario);
       
        iportada = new ImageIcon("../Clse2/recursos/imagen-estadistica.png");
        iDimAux = new ImageIcon(iportada.getImage().getScaledInstance(350, 350, Image.SCALE_AREA_AVERAGING));

        lPortada = new JLabel();
        lPortada.setBounds((pDerecha.getWidth()/2)-100, 60, 360, 360);
        lPortada.setIcon(iDimAux);
        pIzquierda.add(lPortada);

        
        lEslogan = new JLabel("Iniciar sesión");
        lEslogan.setSize(130, 20);
        lEslogan.setLocation((pIzquierda.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        lEslogan.setForeground(Color.DARK_GRAY);
        pIzquierda.add(lEslogan);

        lNotificaciones = new JLabel("¿Recordar contraseña?");
        lNotificaciones.setSize(170, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 360);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        tNombreUsuario = new JTextField("User");
        tNombreUsuario.setSize(300, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField();
        tClaveUsuario.setSize(300, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 180);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tClaveUsuario);

        cbTipoUsuario = new JComboBox<String>();
        cbTipoUsuario.addItem("Usuario");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.addItem("invitado");
        cbTipoUsuario.setSize(300, 40);
        cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 240);
        cbTipoUsuario.setForeground(Color.DARK_GRAY);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(cbTipoUsuario);

        bEntrar = new JButton("Siguiente >");
        bEntrar.setSize(120, 45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth() / 2)-120, 300);
        bEntrar.setFocusable(false);
        bEntrar.setBackground(new Color(78, 115, 223));
        bEntrar.setForeground(Color.WHITE);
        pDerecha.add(bEntrar);

        bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(new Color(78, 115, 223));
        bCerrar.setForeground(Color.WHITE);
        pDerecha.add(bCerrar);

        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setBounds(((pDerecha.getWidth() - bEntrar.getWidth()) / 2)-80, 300,120,45);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(new Color(78, 115, 223));
        bRegistrarse.setForeground(Color.WHITE);
        pDerecha.add(bRegistrarse);

        

        checkSi = new JCheckBox("Si");
        checkSi.setSize(45, 25);
        checkSi.setFocusable(false);
        checkSi.setBackground(new Color(78, 115, 223));
        checkSi.setForeground(Color.DARK_GRAY);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 385);
        pDerecha.add(checkSi);

        checkNo = new JCheckBox("No");
        checkNo.setSize(45, 25);
        checkNo.setFocusable(false);
        checkNo.setBackground(new Color(78, 115, 223));
        checkNo.setForeground(Color.DARK_GRAY);
        checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 385);
        pDerecha.add(checkNo);

        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);

        setLayout(null);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
