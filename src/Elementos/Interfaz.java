
package Elementos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Interfaz extends JFrame {
    /*El Label de la izquierda tiene el objetivo, Funcion objetivo y las 3 restricciones
      El Label del centro va a tener los valores de las restricciones Fijas para que no sean editadas
      Y el Label de la derecha va a tener los valores que tomara la grafica
      Para (1) x numero + y numero = z
      cuando x vale 0 y y vale 0 pero ya te la sabritas
     Fox1 Funcion objetivo x1
     */
    private TextField txtFox1,txtFox2,txtR1x1,txtR1x2,txtR2x1,txtR2x2,txtR3x1,
            txtR3x2,txtR1Coeficiente,txtR2Coeficiente,txtR3Coeficiente;
    private JLabel l_Izquierda, l_Centro, l_Derecho,l_Objetivo,l_Fox1,l_Fox2,
            l_Restriccion1,l_Restriccion2,l_Restriccion3,l_Rr1x1,l_Rr1x2,l_Rr2x1,l_Rr2x2,l_Rr3x1,l_Rr3x2,l_FuncionObjetivo
            ,l_SujetoA,l_SujetoARestriccion1,l_SujetoARestriccion2,l_SujetoARestriccion3, l_Restriccion1Fija, l_Restriccion2Fija, l_Restriccion3Fija,
            l_FuncionObjetivoFija;

    private JButton b_Limpiar, b_Fijar,b_AgregarR,b_BorrarR,b_Graficar;
    private JComboBox j_Objetivo, j_Desigualdad1,j_Desigualdad2,j_Desigualdad3;

    public Interfaz(){
        setLayout(null);
        //Creacion de los componentes
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\jossu\\OneDrive\\Escritorio\\MetodoGrafico\\MetodoGrafico\\src\\gato.jpg");
        l_Objetivo = new JLabel("Objetivo:");
        b_Limpiar = new JButton("Limpiar");
        b_Fijar = new JButton("Fijar");
        b_AgregarR = new JButton("Agregar Restriccion");
        b_BorrarR = new JButton("Borrar Restriccion");
        b_Graficar  = new JButton("Graficar");
        l_Restriccion1 = new JLabel("Restriccion 1:");
        l_Restriccion2 = new JLabel("Restriccion 2:");
        l_Restriccion3 = new JLabel("Restriccion 3:");
        l_SujetoA = new JLabel("Sujeto A:");
        l_SujetoARestriccion1 = new JLabel("Restriccion 1:");
        l_SujetoARestriccion2 = new JLabel("Restriccion 2:");
        l_SujetoARestriccion3 = new JLabel("Restriccion 3:");
        l_Fox1 = new JLabel("X1 +");
        l_Fox2 = new JLabel("X2");
        l_Rr1x1 = new JLabel("X1 +");
        l_Rr1x2 = new JLabel("X2");
        l_Rr2x1 = new JLabel("X1 +");
        l_Rr2x2 = new JLabel("X2");
        l_Rr3x1 = new JLabel("X1 +");
        l_Rr3x2 = new JLabel("X2");
        l_FuncionObjetivoFija = new JLabel();
        l_Restriccion1Fija = new JLabel();
        l_Restriccion2Fija = new JLabel();
        l_Restriccion3Fija = new JLabel();
        l_Derecho = new JLabel();
        l_Centro = new JLabel();
        l_FuncionObjetivo = new JLabel();
        l_Izquierda = new JLabel();
        j_Objetivo = new JComboBox();
        j_Desigualdad1 = new JComboBox();
        j_Desigualdad2 = new JComboBox();
        j_Desigualdad3 = new JComboBox();
        txtR1x1 = new TextField();
        txtR1x2 = new TextField();
        txtR2x1 = new TextField();
        txtR2x2 = new TextField();
        txtR3x1 = new TextField();
        txtR3x2 = new TextField();
        txtFox1 = new TextField();
        txtFox2 = new TextField();
        txtR1Coeficiente = new TextField();
        txtR2Coeficiente = new TextField();
        txtR3Coeficiente = new TextField();

        //Propiedades
        j_Objetivo.addItem("Maximizar");
        j_Objetivo.addItem("Minimizar");
        j_Desigualdad1.addItem("≥");
        j_Desigualdad1.addItem("≤");
        j_Desigualdad1.addItem("=");
        j_Desigualdad2.addItem("≥");
        j_Desigualdad2.addItem("≤");
        j_Desigualdad2.addItem("=");
        j_Desigualdad3.addItem("≥");
        j_Desigualdad3.addItem("≤");
        j_Desigualdad3.addItem("=");
        //Funcion objetivo
        l_Fox1.setBounds(80,70,50,60);
        txtFox1.setBounds(15,90,60,25);
        txtFox2.setBounds(115,90,60,25);
        l_FuncionObjetivoFija.setBounds(20,20,140,60);

        txtR1x1.setBounds(15,160,60,25);
        txtR1x2.setBounds(115,160,60,25);
        txtR2x1.setBounds(15,230,60,25);
        txtR2x2.setBounds(115,230,60,25);
        txtR3x1.setBounds(15,300,60,25);
        txtR3x2.setBounds(115,300,60,25);

        l_FuncionObjetivo.setBounds(20,20,80,60);
        l_Fox2.setBounds(185,70,50,60);
        //Restriccion base 1
        l_Restriccion1.setBounds(20,120,80,60);
        l_SujetoARestriccion1.setBounds(20,100,80,60);
        l_Restriccion1Fija.setBounds(20,120,200,60);
        l_Rr1x1.setBounds(80,140,50,60);
        l_Rr1x2.setBounds(185,140,50,60);
        txtR1Coeficiente.setBounds(270,160,70,25);
        //Restriccion base 2
        l_Restriccion2.setBounds(20,190,80,60);
        l_SujetoARestriccion2.setBounds(20,170,80,60);
        l_Restriccion2Fija.setBounds(20,190,200,60);

        l_Rr2x1.setBounds(80,210,50,60);
        l_Rr2x2.setBounds(185,210,50,60);
        txtR2Coeficiente.setBounds(270,230,70,25);
        //Restriccion base 3
        l_Restriccion3.setBounds(20,260,80,60);
        l_SujetoARestriccion3.setBounds(20,240,80,60);
        l_Rr3x1.setBounds(80,280,50,60);
        l_Rr3x2.setBounds(185,280,50,60);
        txtR3Coeficiente.setBounds(270,300,70,25);
        l_Restriccion3Fija.setBounds(20,260,200,60);

        l_Objetivo.setBounds(20,10,100,50);
        j_Objetivo.setBounds(20,50,100,20);
        j_Desigualdad1.setBounds(220,160,40,25);
        j_Desigualdad2.setBounds(220,230,40,25);
        j_Desigualdad3.setBounds(220,300,40,25);
        l_Izquierda.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Izquierda.setBounds(0,0,400,600);
        l_Centro.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Centro.setBounds(410,0,400,700);
        l_Derecho.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Derecho.setBounds(820,0,400,600);

        b_AgregarR.setBounds(20,450,150,40);
        b_BorrarR.setBounds(20,500,150,40);
        b_Fijar.setBounds(200,450,150,40);
        b_Limpiar.setBounds(200,500,150,40);
        b_Graficar.setBounds(120,500,150,30);

        //Comportamiento de los botones y los ComboBox
        j_Objetivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(j_Objetivo.getSelectedItem().equals("Maximizar")){
                    l_FuncionObjetivo.setText("Maximizar");
                }else{
                    l_FuncionObjetivo.setText("Minimizar");
                }
            }
        });
        b_Limpiar.addActionListener(new Eventos(txtFox1,txtFox2,txtR1x1,txtR1x2,txtR2x1,txtR2x2,txtR3x1,txtR3x2,txtR1Coeficiente,txtR2Coeficiente,txtR3Coeficiente));
        b_Fijar.addActionListener(this::actionPerformed);
        b_AgregarR.addActionListener(this::actionPerformed);
        b_BorrarR.addActionListener(this::actionPerformed);
    //Apartado de las 3 restricciones que van a estar ahi por mientras
        l_Izquierda.add(txtR1x1);
        l_Izquierda.add(txtR1x2);
        l_Izquierda.add(txtR2x1);
        l_Izquierda.add(txtR2x2);
        l_Izquierda.add(txtR3x1);
        l_Izquierda.add(txtR3x2);
        l_Izquierda.add(l_Rr1x1);
        l_Izquierda.add(l_Rr1x2);
        l_Izquierda.add(l_Rr2x1);
        l_Izquierda.add(l_Rr2x2);
        l_Izquierda.add(l_Rr3x1);
        l_Izquierda.add(l_Rr3x2);
        l_Izquierda.add(txtR1Coeficiente);
        l_Izquierda.add(txtR2Coeficiente);
        l_Izquierda.add(txtR3Coeficiente);

        l_Izquierda.add(j_Desigualdad1);
        l_Izquierda.add(j_Desigualdad2);
        l_Izquierda.add(j_Desigualdad3);
        l_Izquierda.add(l_Restriccion1);
        l_Izquierda.add(l_Restriccion2);
        l_Izquierda.add(l_Restriccion3);
        l_Izquierda.add(txtFox1);
        l_Izquierda.add(txtFox2);
        l_Izquierda.add(l_Fox1);
        l_Izquierda.add(l_Fox2);
        l_Izquierda.add(l_Objetivo);
        l_Izquierda.add(b_AgregarR);
        l_Izquierda.add(b_BorrarR);
        l_Izquierda.add(b_Fijar);
        l_Izquierda.add(b_Limpiar);
        l_Izquierda.add(j_Objetivo);
        //Contenido del JLabel del centro 
        l_Centro.add(b_Graficar);
        l_Centro.add(l_FuncionObjetivo);
        l_Centro.add(l_SujetoARestriccion1);
        l_Centro.add(l_SujetoARestriccion2);
        l_Centro.add(l_SujetoARestriccion3);
        l_Centro.add(l_Restriccion1Fija);
        l_Centro.add(l_Restriccion2Fija);
        l_Centro.add(l_Restriccion3Fija);
        l_Centro.add(l_FuncionObjetivoFija);


        add(l_Derecho);
        add(l_Centro);
        setResizable(false);
        //Propiedades del Frame
        setIconImage(icon);
        setTitle("Ola Padilla");
        add(l_Izquierda);
        setSize(1200,600);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b_AgregarR){
            //Agregar restriccion
            JOptionPane.showMessageDialog(null, "Agregar Restriccion");
        }
        if(e.getSource()==b_BorrarR){
            //Borrar restriccion
            JOptionPane.showMessageDialog(null, "Borrar Restriccion");
        }
        if(e.getSource()== b_Fijar){
            //Calcular
            l_Restriccion1Fija.setText(txtR1x1.getText()+"X1 + "+txtR1x2.getText()+"X2 "+j_Desigualdad1.getSelectedItem()+" "+txtR1Coeficiente.getText());
            l_Restriccion2Fija.setText(txtR2x1.getText()+"X1 + "+txtR2x2.getText()+"X2 "+j_Desigualdad2.getSelectedItem()+" "+txtR2Coeficiente.getText());
            l_Restriccion3Fija.setText(txtR3x1.getText()+"X1 + "+txtR3x2.getText()+"X2 "+j_Desigualdad3.getSelectedItem()+" "+txtR3Coeficiente.getText());
            l_FuncionObjetivoFija.setText("Z=" + l_FuncionObjetivo.getText()+" "+txtFox1.getText()+"X1 + "+txtFox2.getText()+"X2");
        }
    }
}
