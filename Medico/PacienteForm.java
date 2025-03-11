package Medico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PacienteForm extends JFrame {
    private JTextField txtNombre;
    private JTextField txtCategoria;
    private JTextField txtCedula;
    private JTextField txtRadiografias;
    private JButton btnCalcular;
    private JLabel lblResultado;

    public PacienteForm() {
        // Configurar el JFrame
        setTitle("Formulario de Paciente");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear componentes
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 10, 100, 20);
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 10, 150, 20);

        JLabel lblCategoria = new JLabel("Categoría (C, R, D):");
        lblCategoria.setBounds(10, 40, 100, 20);
        txtCategoria = new JTextField();
        txtCategoria.setBounds(120, 40, 150, 20);

        JLabel lblCedula = new JLabel("Cédula:");
        lblCedula.setBounds(10, 70, 100, 20);
        txtCedula = new JTextField();
        txtCedula.setBounds(120, 70, 150, 20);

        JLabel lblRadiografias = new JLabel("Radiografías:");
        lblRadiografias.setBounds(10, 100, 100, 20);
        txtRadiografias = new JTextField();
        txtRadiografias.setBounds(120, 100, 150, 20);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 140, 120, 30);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(10, 180, 250, 20);

        // Añadir los componentes al JFrame
        add(lblNombre);
        add(txtNombre);
        add(lblCategoria);
        add(txtCategoria);
        add(lblCedula);
        add(txtCedula);
        add(lblRadiografias);
        add(txtRadiografias);
        add(btnCalcular);
        add(lblResultado);

        // Acción al presionar el botón Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener los datos del formulario
                    String nombre = txtNombre.getText();
                    String categoria = txtCategoria.getText();
                    double cedula = Double.parseDouble(txtCedula.getText());
                    double radiografias = Double.parseDouble(txtRadiografias.getText());

                    // Crear una instancia de Paciente y asignar los datos
                    Paciente paciente = new Paciente();
                    paciente.setDatos(nombre, categoria, cedula, radiografias);  // Asignar los datos del formulario

                    // Calcular el costo
                    paciente.calcularCosto();

                    // Mostrar el resultado en el JLabel
                    if (categoria.equalsIgnoreCase("c")) {
                        lblResultado.setText("El costo cardiovascular es: " + paciente.getCostoc());
                    } else if (categoria.equalsIgnoreCase("r")) {
                        lblResultado.setText("El costo respiratorio es: " + paciente.getCostor());
                    } else if (categoria.equalsIgnoreCase("d")) {
                        lblResultado.setText("El costo muscular es: " + paciente.getCostod());
                    } else {
                        lblResultado.setText("Categoría inválida.");
                    }
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Por favor ingrese valores válidos.");
                }
            }
        });
    }

    // Método para mostrar el formulario
    public static void main(String[] args) {
        PacienteForm formulario = new PacienteForm();
        formulario.setVisible(true);
    }
}


