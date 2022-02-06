package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FMenu {
    private JButton adicionarEmpregadoButton;
    private JButton consultarEmpregadosButton;
    private JPanel panelMenu;

    public static void main(String[]args){
        JFrame frame = new JFrame("Gestão de Funcionários");
        frame.setContentPane(new FMenu().panelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public FMenu() {
        adicionarEmpregadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FEmpregado().setVisible(true);
            }
        });
        consultarEmpregadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FConsulta().setVisible(true);
            }
        });
    }
}
