package prog_boletin28;

import javax.swing.*;

public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton botonUsar, botonLimpiar;
    JLabel etiquetaNombre, etiquetaPassword;
    JTextField nombre, password;
    JTextArea areaTexto;
    
     public void iniciarComponentes() {
        marco = new JFrame();
        panel = new JPanel();
        botonUsar = new JButton("USAR");
        botonLimpiar = new JButton("LIMPIAR");
        etiquetaNombre = new JLabel("NOMPBRE");
        etiquetaPassword=new JLabel("PASSWORD");
        nombre = new JTextField();
        password=new JTextField();
        areaTexto = new JTextArea("Area de Texto.");
        
        marco.setBounds(0, 0, 700, 700);
        panel.setBounds(0, 0, 700, 700);
        etiquetaNombre.setBounds(50, 100, 100, 50);
        etiquetaPassword.setBounds(50, 200, 100, 50);
        nombre.setBounds(150, 100, 200, 50);
        password.setBounds(150, 200, 200, 50);
        areaTexto.setBounds(50, 300, 400, 150);
        botonUsar.setBounds(100, 500, 100, 50);
        botonLimpiar.setBounds(300, 500, 100, 50);
        
        panel.setLayout(null); //para quitar por defecto
        panel.add(etiquetaNombre);
        panel.add(etiquetaPassword);
        panel.add(nombre);
        panel.add(password);
        panel.add(areaTexto);
        panel.add(botonUsar);
        panel.add(botonLimpiar);
        marco.add(panel);
        marco.setDefaultCloseOperation(3);
        marco.setLocationRelativeTo(panel);
        marco.setVisible(true);
        
     }
}
