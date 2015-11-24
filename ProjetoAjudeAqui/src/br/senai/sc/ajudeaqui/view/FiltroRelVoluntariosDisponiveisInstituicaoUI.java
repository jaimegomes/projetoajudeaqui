/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.ajudeaqui.view;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

/**
 *
 * @author Jaime Gomes
 */
public class FiltroRelVoluntariosDisponiveisInstituicaoUI extends javax.swing.JInternalFrame {

	private static final long serialVersionUID = 1L;
    /**
     * Creates new form FiltroRelatorioVoluntariosUI
     */
    public FiltroRelVoluntariosDisponiveisInstituicaoUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelFiltroRelVoluntarios = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        chkTodos = new javax.swing.JCheckBox();
        lblTipoServico = new javax.swing.JLabel();
        cmbTipoServico = new javax.swing.JComboBox();
        btnGerarRelatorio = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle(":: Sistema do Voluntário Ajude Aqui ::");

        panelFiltroRelVoluntarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro Relatório Voluntários Disponíveis"));

        lblNome.setText("Nome:");

        lblEmail.setText("Email:");

        chkTodos.setText("Todos Voluntários");

        lblTipoServico.setText("Tipo Serviço:");

        javax.swing.GroupLayout gl_panelFiltroRelVoluntarios = new javax.swing.GroupLayout(panelFiltroRelVoluntarios);
        gl_panelFiltroRelVoluntarios.setHorizontalGroup(
        	gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelFiltroRelVoluntarios.createSequentialGroup()
        			.addGap(3)
        			.addGroup(gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panelFiltroRelVoluntarios.createSequentialGroup()
        					.addGroup(gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblEmail)
        						.addComponent(lblNome))
        					.addGap(57)
        					.addGroup(gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtNome, 206, 206, 206)
        						.addComponent(txtEmail, 206, 206, 206)))
        				.addGroup(gl_panelFiltroRelVoluntarios.createSequentialGroup()
        					.addComponent(lblTipoServico)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.LEADING)
        						.addComponent(chkTodos)
        						.addComponent(cmbTipoServico, 0, 206, Short.MAX_VALUE))))
        			.addContainerGap())
        );
        gl_panelFiltroRelVoluntarios.setVerticalGroup(
        	gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelFiltroRelVoluntarios.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNome)
        				.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblEmail)
        				.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panelFiltroRelVoluntarios.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblTipoServico)
        				.addComponent(cmbTipoServico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(chkTodos)
        			.addContainerGap(34, Short.MAX_VALUE))
        );
        panelFiltroRelVoluntarios.setLayout(gl_panelFiltroRelVoluntarios);

        btnGerarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agenda_16x16.png"))); // NOI18N
        btnGerarRelatorio.setText("Gerar Relatório");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar_16x16.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panelFiltroRelVoluntarios, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(btnGerarRelatorio)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panelFiltroRelVoluntarios, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnGerarRelatorio, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(37, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JComboBox cmbTipoServico;
    private javax.swing.JPanel panelFiltroRelVoluntarios;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipoServico;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration                   
}
