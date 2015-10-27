/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.ajudeaqui.view;

import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Dimension;
import datechooser.beans.DateChooserCombo;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author Jaime Gomes
 */
public class PrincipalVoluntarioUI extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JTextArea atxtInfoComplementares;
	private javax.swing.JButton btnAddAreaInteresse;
	private javax.swing.JButton btnAddExperiencia;
	private javax.swing.JButton btnAddHorario;
	private javax.swing.JButton btnHorariosDisponiveis;
	private javax.swing.JButton btnAreasInteresse;
	private javax.swing.JButton btnEditarDadosPerfil;
	private javax.swing.JButton btnFoto;
	private javax.swing.JButton btnPesquisarFiltroVagas;
	private javax.swing.JButton btnPesquisarFiltroVagas1;
	private javax.swing.JButton btnSalvarDadosPerfil;
	private javax.swing.JComboBox cmbAreasInteresse;
	private javax.swing.JComboBox cmbAtuouComoVoluntario;
	private javax.swing.JComboBox cmbEstadoCivil;
	private javax.swing.JComboBox cmbHorarioDisponivel;
	private javax.swing.JComboBox cmbInstituicaoFiltroVagas;
	private javax.swing.JComboBox cmbSexo;
	private javax.swing.JComboBox cmbTipoServicoVagas;
	private JComboBox cmbFuncao;
	private JDateChooser dateChooserEntrada;
	private javax.swing.JFormattedTextField jftxtCelular;
	private javax.swing.JFormattedTextField jftxtEmail;
	private javax.swing.JFormattedTextField jftxtTelefone;
	private javax.swing.JFormattedTextField jftxtCpf;
	private javax.swing.JLabel lblAreaInteresse;
	private javax.swing.JLabel lblAtuouComoVoluntario;
	private javax.swing.JLabel lblAvatar;
	private javax.swing.JLabel lblCelular;
	private javax.swing.JLabel lblComplemento;
	private javax.swing.JLabel lblCpf;
	private javax.swing.JLabel lblDataNascimento;
	private javax.swing.JLabel lblDataPublicacaoFiltroVagas;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblEndereco;
	private javax.swing.JLabel lblEntrada;
	private javax.swing.JLabel lblEstadoCivil;
	private javax.swing.JLabel lblFuncao;
	private javax.swing.JLabel lblHorarioDisponivel;
	private javax.swing.JLabel lblInfoComplementares;
	private javax.swing.JLabel lblInstituicaoExp;
	private javax.swing.JLabel lblInstituicaoFiltroVagas;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblSaida;
	private javax.swing.JLabel lblSexo;
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JLabel lblTipoServicoVagas;
	private javax.swing.JLabel lblTituloFiltroVagas;
	private javax.swing.JTabbedPane menuPrincipalVoluntario;
	private javax.swing.JPanel panelDadosPessoais;
	private javax.swing.JPanel panelExperiencias;
	private javax.swing.JPanel panelFiltroVagas;
	private javax.swing.JPanel panelPerfil;
	private javax.swing.JPanel panelVagas;
	private javax.swing.JScrollPane scrollPaneInfoComplementares;
	private javax.swing.JScrollPane scrollpaneVagas;
	private javax.swing.JTable tableVagas;
	private javax.swing.JTextField txtComplemento;
	private javax.swing.JTextField txtEndereco;
	private javax.swing.JTextField txtInstituicao;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtTituloFiltroVagas;
	private JDateChooser dateChooserSaida;
	private JDateChooser dateChooserDataNascimento;

	// End of variables declaration

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(
					PrincipalVoluntarioUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					PrincipalVoluntarioUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					PrincipalVoluntarioUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					PrincipalVoluntarioUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PrincipalVoluntarioUI().setVisible(true);
			}
		});
	}

	/**
	 * Creates new form PrincipalUI
	 */
	public PrincipalVoluntarioUI() {
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

		menuPrincipalVoluntario = new javax.swing.JTabbedPane();
		panelPerfil = new javax.swing.JPanel();
		btnSalvarDadosPerfil = new javax.swing.JButton();
		btnEditarDadosPerfil = new javax.swing.JButton();
		panelDadosPessoais = new javax.swing.JPanel();
		txtComplemento = new javax.swing.JTextField();
		lblCelular = new javax.swing.JLabel();
		lblNome = new javax.swing.JLabel();
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblAvatar = new javax.swing.JLabel();
		lblComplemento = new javax.swing.JLabel();
		jftxtCpf = new javax.swing.JFormattedTextField();
		lblCpf = new javax.swing.JLabel();
		lblCpf.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTelefone = new javax.swing.JLabel();
		jftxtCelular = new javax.swing.JFormattedTextField();
		lblEstadoCivil = new javax.swing.JLabel();
		cmbEstadoCivil = new javax.swing.JComboBox();
		jftxtTelefone = new javax.swing.JFormattedTextField();
		txtEndereco = new javax.swing.JTextField();
		lblEndereco = new javax.swing.JLabel();
		lblEndereco.setFont(new Font("Dialog", Font.PLAIN, 12));
		jftxtEmail = new javax.swing.JFormattedTextField();
		btnFoto = new javax.swing.JButton();
		lblEmail = new javax.swing.JLabel();
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtNome = new javax.swing.JTextField();
		lblDataNascimento = new javax.swing.JLabel();
		lblDataNascimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSexo = new javax.swing.JLabel();
		cmbSexo = new javax.swing.JComboBox();
		btnHorariosDisponiveis = new javax.swing.JButton();
		btnAreasInteresse = new javax.swing.JButton();
		panelExperiencias = new javax.swing.JPanel();
		lblInstituicaoExp = new javax.swing.JLabel();
		scrollPaneInfoComplementares = new javax.swing.JScrollPane();
		atxtInfoComplementares = new javax.swing.JTextArea();
		atxtInfoComplementares.setTabSize(6);
		txtInstituicao = new javax.swing.JTextField();
		btnAddAreaInteresse = new javax.swing.JButton();
		lblHorarioDisponivel = new javax.swing.JLabel();
		btnAddHorario = new javax.swing.JButton();
		cmbHorarioDisponivel = new javax.swing.JComboBox();
		lblAreaInteresse = new javax.swing.JLabel();
		lblFuncao = new javax.swing.JLabel();
		cmbAtuouComoVoluntario = new javax.swing.JComboBox();
		lblInfoComplementares = new javax.swing.JLabel();
		lblAtuouComoVoluntario = new javax.swing.JLabel();
		btnAddExperiencia = new javax.swing.JButton();
		lblEntrada = new javax.swing.JLabel();
		lblSaida = new javax.swing.JLabel();
		cmbAreasInteresse = new javax.swing.JComboBox();
		panelVagas = new javax.swing.JPanel();
		panelFiltroVagas = new javax.swing.JPanel();
		lblTituloFiltroVagas = new javax.swing.JLabel();
		lblInstituicaoFiltroVagas = new javax.swing.JLabel();
		lblDataPublicacaoFiltroVagas = new javax.swing.JLabel();
		txtTituloFiltroVagas = new javax.swing.JTextField();
		cmbInstituicaoFiltroVagas = new javax.swing.JComboBox();
		btnPesquisarFiltroVagas = new javax.swing.JButton();
		lblTipoServicoVagas = new javax.swing.JLabel();
		cmbTipoServicoVagas = new javax.swing.JComboBox();
		btnPesquisarFiltroVagas1 = new javax.swing.JButton();
		scrollpaneVagas = new javax.swing.JScrollPane();
		tableVagas = new javax.swing.JTable();
		cmbFuncao = new JComboBox();
		dateChooserEntrada = new JDateChooser();
		dateChooserSaida = new JDateChooser();
		dateChooserDataNascimento = new JDateChooser();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(":: Sistema doVoluntário Ajude Aqui ::");
		setBounds(new java.awt.Rectangle(0, 0, 0, 0));
		setMaximumSize(new java.awt.Dimension(1300, 700));
		setMinimumSize(new java.awt.Dimension(1300, 700));
		setName("frameVoluntario"); // NOI18N

		menuPrincipalVoluntario.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		menuPrincipalVoluntario
				.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
		menuPrincipalVoluntario
				.setMaximumSize(new java.awt.Dimension(1300, 750));
		menuPrincipalVoluntario
				.setMinimumSize(new java.awt.Dimension(1300, 750));
		menuPrincipalVoluntario.setPreferredSize(new java.awt.Dimension(1300,
				750));

		panelPerfil.setBorder(new javax.swing.border.LineBorder(
				new java.awt.Color(0, 0, 0), 1, true));
		panelPerfil.setMaximumSize(new Dimension(1110, 730));
		panelPerfil.setMinimumSize(new Dimension(1110, 730));
		panelPerfil.setName(""); // NOI18N
		panelPerfil.setPreferredSize(new Dimension(900, 500));

		btnSalvarDadosPerfil.setIcon(new ImageIcon("img/salvar_16x16.png")); // NOI18N
		btnSalvarDadosPerfil.setText("Salvar");

		btnEditarDadosPerfil.setIcon(new ImageIcon(
				"img/editar_usuario_16x16.png")); // NOI18N
		btnEditarDadosPerfil.setText("Editar");

		panelDadosPessoais.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Dados Pessoais"));
		panelDadosPessoais.setMaximumSize(new java.awt.Dimension(1197, 180));
		panelDadosPessoais.setMinimumSize(new java.awt.Dimension(1197, 180));
		panelDadosPessoais.setName(""); // NOI18N
		panelDadosPessoais.setPreferredSize(new java.awt.Dimension(1197, 180));

		lblCelular.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblCelular.setText("Celular:");

		lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		lblNome.setText("Nome:");

		lblAvatar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblAvatar.setIcon(new ImageIcon("img/avatar.png")); // NOI18N

		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblComplemento.setText("Complemento:");

		jftxtCpf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		jftxtCpf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jftxtCpfActionPerformed(evt);
			}
		});

		lblCpf.setText("CPF:");

		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblTelefone.setText("Telefone:");

		jftxtCelular.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		jftxtCelular.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ftxtCelularActionPerformed(evt);
			}
		});

		lblEstadoCivil.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblEstadoCivil.setText("Estado Civil:");

		cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "...", "Casado", "Solteiro", "Outro" }));

		jftxtTelefone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

		lblEndereco.setText("Endereço:");

		btnFoto.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
		btnFoto.setText("Upload Imagem");
		btnFoto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnFotoActionPerformed(evt);
			}
		});

		lblEmail.setText("E-mail:");

		txtNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeActionPerformed(evt);
			}
		});

		lblDataNascimento.setText("Data Nascimento:");

		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblSexo.setText("Sexo:");

		cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"...", "Masculino", "Feminino" }));
		
		dateChooserDataNascimento.setSize(100, 19);
		dateChooserEntrada.setSize(100, 19);

		javax.swing.GroupLayout panelDadosPessoaisLayout = new javax.swing.GroupLayout(
				panelDadosPessoais);
		panelDadosPessoaisLayout
				.setHorizontalGroup(panelDadosPessoaisLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelDadosPessoaisLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelDadosPessoaisLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																btnFoto,
																GroupLayout.DEFAULT_SIZE,
																122,
																Short.MAX_VALUE)
														.addComponent(
																lblAvatar,
																GroupLayout.PREFERRED_SIZE,
																122,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												panelDadosPessoaisLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblDataNascimento)
														.addComponent(lblCpf)
														.addComponent(
																lblEndereco)
														.addComponent(lblNome)
														.addComponent(
																lblEstadoCivil))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelDadosPessoaisLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelDadosPessoaisLayout
																		.createSequentialGroup()
																		.addGap(1)
																		.addGroup(
																				panelDadosPessoaisLayout
																						.createParallelGroup(
																								Alignment.LEADING,
																								false)
																						.addComponent(
																								txtEndereco,
																								GroupLayout.DEFAULT_SIZE,
																								291,
																								Short.MAX_VALUE)
																						.addComponent(
																								jftxtCpf,
																								GroupLayout.PREFERRED_SIZE,
																								129,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txtNome)))
														.addGroup(
																panelDadosPessoaisLayout
																		.createParallelGroup(
																				Alignment.TRAILING,
																				false)
																		.addComponent(
																				dateChooserDataNascimento,
																				Alignment.LEADING,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				cmbEstadoCivil,
																				Alignment.LEADING,
																				0,
																				130,
																				Short.MAX_VALUE)))
										.addGap(10)
										.addGroup(
												panelDadosPessoaisLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblComplemento)
														.addComponent(
																lblTelefone)
														.addComponent(lblSexo)
														.addComponent(lblEmail)
														.addComponent(
																lblCelular))
										.addGap(6)
										.addGroup(
												panelDadosPessoaisLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																jftxtTelefone,
																GroupLayout.PREFERRED_SIZE,
																110,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																cmbSexo,
																GroupLayout.PREFERRED_SIZE,
																105,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jftxtEmail,
																GroupLayout.PREFERRED_SIZE,
																247,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txtComplemento,
																GroupLayout.PREFERRED_SIZE,
																116,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jftxtCelular,
																GroupLayout.PREFERRED_SIZE,
																110,
																GroupLayout.PREFERRED_SIZE))
										.addGap(303)));
		panelDadosPessoaisLayout
				.setVerticalGroup(panelDadosPessoaisLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelDadosPessoaisLayout
										.createSequentialGroup()
										.addGroup(
												panelDadosPessoaisLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelDadosPessoaisLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblAvatar)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnFoto))
														.addGroup(
																panelDadosPessoaisLayout
																		.createSequentialGroup()
																		.addGroup(
																				panelDadosPessoaisLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								panelDadosPessoaisLayout
																										.createSequentialGroup()
																										.addComponent(
																												jftxtTelefone,
																												GroupLayout.PREFERRED_SIZE,
																												22,
																												GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												panelDadosPessoaisLayout
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																jftxtCelular,
																																GroupLayout.PREFERRED_SIZE,
																																22,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																lblCelular))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												panelDadosPessoaisLayout
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																jftxtEmail,
																																GroupLayout.PREFERRED_SIZE,
																																22,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																lblEmail))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												panelDadosPessoaisLayout
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																cmbSexo,
																																GroupLayout.PREFERRED_SIZE,
																																22,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																lblSexo)))
																						.addGroup(
																								panelDadosPessoaisLayout
																										.createSequentialGroup()
																										.addGroup(
																												panelDadosPessoaisLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																lblNome)
																														.addGroup(
																																panelDadosPessoaisLayout
																																		.createParallelGroup(
																																				Alignment.BASELINE)
																																		.addComponent(
																																				txtNome,
																																				GroupLayout.PREFERRED_SIZE,
																																				22,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addComponent(
																																				lblTelefone)))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												panelDadosPessoaisLayout
																														.createParallelGroup(
																																Alignment.TRAILING)
																														.addComponent(
																																jftxtCpf,
																																GroupLayout.PREFERRED_SIZE,
																																22,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																lblCpf))
																										.addGap(7)
																										.addGroup(
																												panelDadosPessoaisLayout
																														.createParallelGroup(
																																Alignment.TRAILING)
																														.addComponent(
																																lblDataNascimento)
																														.addComponent(
																																dateChooserDataNascimento,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												panelDadosPessoaisLayout
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																cmbEstadoCivil,
																																GroupLayout.PREFERRED_SIZE,
																																22,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																lblEstadoCivil))))
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				panelDadosPessoaisLayout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								txtEndereco,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txtComplemento,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								lblComplemento)
																						.addComponent(
																								lblEndereco))))
										.addGap(24)));
		panelDadosPessoais.setLayout(panelDadosPessoaisLayout);

		panelExperiencias.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Experiências"));
		panelExperiencias.setMaximumSize(new java.awt.Dimension(1197, 233));
		panelExperiencias.setMinimumSize(new java.awt.Dimension(1197, 233));
		panelExperiencias.setPreferredSize(new java.awt.Dimension(1197, 233));

		lblInstituicaoExp.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInstituicaoExp.setText("Instituição:");

		atxtInfoComplementares.setColumns(20);
		atxtInfoComplementares.setRows(5);
		scrollPaneInfoComplementares.setViewportView(atxtInfoComplementares);

		txtInstituicao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

		btnAddAreaInteresse.setIcon(new ImageIcon("img/add_16x16.png")); // NOI18N

		lblHorarioDisponivel.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblHorarioDisponivel.setText("Horário Disponível:");

		btnAddHorario.setIcon(new ImageIcon("img/add_16x16.png")); // NOI18N

		cmbHorarioDisponivel.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "...", "Matutino", "Vespertino", "Noturno" }));

		lblAreaInteresse.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblAreaInteresse.setText("Áreas de Interesse em Ajudar:");

		lblFuncao.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblFuncao.setText("Função:");

		cmbAtuouComoVoluntario.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "...", "Sim", "Não" }));
		cmbAtuouComoVoluntario.setMaximumSize(new java.awt.Dimension(44, 20));

		btnHorariosDisponiveis.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnHorariosDisponiveis.setText("Horários Disponíveis");

		btnAreasInteresse.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnAreasInteresse.setText("Áreas de Interesse");

		lblInfoComplementares.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInfoComplementares.setText("Informações Complementares:");

		lblAtuouComoVoluntario.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblAtuouComoVoluntario.setText("Já atuou como Voluntário?");

		btnAddExperiencia.setIcon(new ImageIcon("img/add_16x16.png")); // NOI18N

		lblEntrada.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblEntrada.setText("Entrada:");

		lblSaida.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblSaida.setText("Saída:");

		cmbAreasInteresse.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "..." }));

		javax.swing.GroupLayout panelExperienciasLayout = new javax.swing.GroupLayout(
				panelExperiencias);
		panelExperienciasLayout
				.setHorizontalGroup(panelExperienciasLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelExperienciasLayout
										.createSequentialGroup()
										.addGroup(
												panelExperienciasLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblInfoComplementares)
														.addComponent(
																lblHorarioDisponivel)
														.addComponent(
																lblAtuouComoVoluntario))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelExperienciasLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																scrollPaneInfoComplementares,
																GroupLayout.PREFERRED_SIZE,
																375,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																panelExperienciasLayout
																		.createSequentialGroup()
																		.addComponent(
																				cmbAtuouComoVoluntario,
																				GroupLayout.PREFERRED_SIZE,
																				62,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				lblInstituicaoExp)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				txtInstituicao,
																				GroupLayout.PREFERRED_SIZE,
																				175,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				lblFuncao)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				cmbFuncao,
																				GroupLayout.PREFERRED_SIZE,
																				176,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				lblEntrada)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				4,
																				Short.MAX_VALUE)
																		.addComponent(
																				dateChooserEntrada,
																				GroupLayout.PREFERRED_SIZE,
																				121,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblSaida)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				dateChooserSaida,
																				GroupLayout.PREFERRED_SIZE,
																				121,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnAddExperiencia,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																panelExperienciasLayout
																		.createSequentialGroup()
																		.addComponent(
																				cmbHorarioDisponivel,
																				GroupLayout.PREFERRED_SIZE,
																				105,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnAddHorario,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnHorariosDisponiveis)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				649,
																				Short.MAX_VALUE)))
										.addContainerGap())
						.addGroup(
								panelExperienciasLayout
										.createSequentialGroup()
										.addComponent(lblAreaInteresse)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(cmbAreasInteresse,
												GroupLayout.PREFERRED_SIZE,
												177, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(btnAddAreaInteresse,
												GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(btnAreasInteresse)
										.addContainerGap(581, Short.MAX_VALUE)));
		panelExperienciasLayout
				.setVerticalGroup(panelExperienciasLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelExperienciasLayout
										.createSequentialGroup()
										.addGap(13)
										.addGroup(
												panelExperienciasLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelExperienciasLayout
																		.createSequentialGroup()
																		.addComponent(
																				dateChooserEntrada,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(137))
														.addGroup(
																panelExperienciasLayout
																		.createSequentialGroup()
																		.addGroup(
																				panelExperienciasLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								panelExperienciasLayout
																										.createParallelGroup(
																												Alignment.BASELINE)
																										.addComponent(
																												txtInstituicao,
																												GroupLayout.PREFERRED_SIZE,
																												22,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												lblInstituicaoExp)
																										.addComponent(
																												lblFuncao)
																										.addComponent(
																												cmbFuncao,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												lblEntrada))
																						.addGroup(
																								panelExperienciasLayout
																										.createParallelGroup(
																												Alignment.BASELINE)
																										.addComponent(
																												lblAtuouComoVoluntario)
																										.addComponent(
																												cmbAtuouComoVoluntario,
																												GroupLayout.PREFERRED_SIZE,
																												22,
																												GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								btnAddExperiencia,
																								Alignment.TRAILING,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								Alignment.TRAILING,
																								panelExperienciasLayout
																										.createSequentialGroup()
																										.addGap(2)
																										.addGroup(
																												panelExperienciasLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																dateChooserSaida,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																lblSaida))))
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				panelExperienciasLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblHorarioDisponivel,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								cmbHorarioDisponivel,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								panelExperienciasLayout
																										.createSequentialGroup()
																										.addGap(1)
																										.addGroup(
																												panelExperienciasLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																btnHorariosDisponiveis,
																																GroupLayout.PREFERRED_SIZE,
																																22,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																btnAddHorario,
																																GroupLayout.PREFERRED_SIZE,
																																22,
																																GroupLayout.PREFERRED_SIZE))))
																		.addGap(6)
																		.addGroup(
																				panelExperienciasLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblInfoComplementares)
																						.addComponent(
																								scrollPaneInfoComplementares,
																								GroupLayout.PREFERRED_SIZE,
																								67,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(11)
																		.addGroup(
																				panelExperienciasLayout
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(
																								lblAreaInteresse)
																						.addGroup(
																								panelExperienciasLayout
																										.createParallelGroup(
																												Alignment.LEADING,
																												false)
																										.addComponent(
																												cmbAreasInteresse,
																												GroupLayout.DEFAULT_SIZE,
																												22,
																												Short.MAX_VALUE)
																										.addComponent(
																												btnAddAreaInteresse,
																												GroupLayout.PREFERRED_SIZE,
																												22,
																												GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								btnAreasInteresse,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE))))
										.addGap(20)));
		panelExperiencias.setLayout(panelExperienciasLayout);

		javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(
				panelPerfil);
		panelPerfilLayout
				.setHorizontalGroup(panelPerfilLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								panelPerfilLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelPerfilLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																panelPerfilLayout
																		.createSequentialGroup()
																		.addComponent(
																				btnSalvarDadosPerfil,
																				GroupLayout.PREFERRED_SIZE,
																				116,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				btnEditarDadosPerfil,
																				GroupLayout.PREFERRED_SIZE,
																				116,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																panelDadosPessoais,
																Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																1063,
																Short.MAX_VALUE)
														.addComponent(
																panelExperiencias,
																Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																1105,
																GroupLayout.PREFERRED_SIZE))
										.addGap(176)));
		panelPerfilLayout
				.setVerticalGroup(panelPerfilLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelPerfilLayout
										.createSequentialGroup()
										.addGap(8)
										.addComponent(panelDadosPessoais,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(panelExperiencias,
												GroupLayout.PREFERRED_SIZE,
												213, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												panelPerfilLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnEditarDadosPerfil,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btnSalvarDadosPerfil,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(278, Short.MAX_VALUE)));
		panelPerfil.setLayout(panelPerfilLayout);

		menuPrincipalVoluntario.addTab("Perfil", new ImageIcon(
				"img/usuario_16x16.png"), panelPerfil); // NOI18N

		panelVagas.setBorder(new javax.swing.border.LineBorder(
				new java.awt.Color(0, 0, 0), 1, true));
		panelVagas.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelVagas.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelVagas.setPreferredSize(new java.awt.Dimension(1110, 700));

		panelFiltroVagas.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Filtro de Pesquisa"));
		panelFiltroVagas.setMaximumSize(new java.awt.Dimension(1197, 150));
		panelFiltroVagas.setMinimumSize(new java.awt.Dimension(1197, 150));
		panelFiltroVagas.setPreferredSize(new java.awt.Dimension(1197, 150));

		lblTituloFiltroVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTituloFiltroVagas.setText("Título:");

		lblInstituicaoFiltroVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblInstituicaoFiltroVagas.setText("Instituição:");

		lblDataPublicacaoFiltroVagas
				.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblDataPublicacaoFiltroVagas.setText("Data Publicação:");

		btnPesquisarFiltroVagas.setIcon(new ImageIcon("img/lupa_16x16.png")); // NOI18N
		btnPesquisarFiltroVagas.setText("Pesquisar");

		lblTipoServicoVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTipoServicoVagas.setText("Tipo de Serviço:");

		cmbTipoServicoVagas.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		btnPesquisarFiltroVagas1.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnPesquisarFiltroVagas1.setText("Gerar Relatório");
		
		JDateChooser dateChooserDataPublicacaoFiltroVagas = new JDateChooser();

		javax.swing.GroupLayout panelFiltroVagasLayout = new javax.swing.GroupLayout(
				panelFiltroVagas);
		panelFiltroVagasLayout.setHorizontalGroup(
			panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelFiltroVagasLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(panelFiltroVagasLayout.createSequentialGroup()
							.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTituloFiltroVagas)
								.addComponent(lblDataPublicacaoFiltroVagas)
								.addComponent(lblInstituicaoFiltroVagas))
							.addGap(4)
							.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelFiltroVagasLayout.createSequentialGroup()
									.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(cmbTipoServicoVagas, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
										.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(cmbInstituicaoFiltroVagas, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(txtTituloFiltroVagas, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addComponent(btnPesquisarFiltroVagas))
								.addComponent(dateChooserDataPublicacaoFiltroVagas, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblTipoServicoVagas))
					.addPreferredGap(ComponentPlacement.RELATED, 608, Short.MAX_VALUE)
					.addComponent(btnPesquisarFiltroVagas1)
					.addContainerGap())
		);
		panelFiltroVagasLayout.setVerticalGroup(
			panelFiltroVagasLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(panelFiltroVagasLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTituloFiltroVagas)
						.addComponent(txtTituloFiltroVagas, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisarFiltroVagas, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbInstituicaoFiltroVagas, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblInstituicaoFiltroVagas))
					.addGap(8)
					.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDataPublicacaoFiltroVagas)
						.addComponent(dateChooserDataPublicacaoFiltroVagas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(cmbTipoServicoVagas, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoServicoVagas))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(panelFiltroVagasLayout.createSequentialGroup()
					.addContainerGap(95, Short.MAX_VALUE)
					.addComponent(btnPesquisarFiltroVagas1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelFiltroVagas.setLayout(panelFiltroVagasLayout);

		scrollpaneVagas.setMaximumSize(new java.awt.Dimension(1197, 480));
		scrollpaneVagas.setMinimumSize(new java.awt.Dimension(1197, 480));
		scrollpaneVagas.setPreferredSize(new java.awt.Dimension(1197, 480));

		tableVagas.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "Instituição", "Título", "Descrição" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tableVagas.setAutoscrolls(false);
		tableVagas.setMaximumSize(new java.awt.Dimension(1197, 480));
		tableVagas.setMinimumSize(new java.awt.Dimension(1197, 480));
		tableVagas.setPreferredSize(new java.awt.Dimension(1197, 480));
		scrollpaneVagas.setViewportView(tableVagas);

		javax.swing.GroupLayout panelVagasLayout = new javax.swing.GroupLayout(
				panelVagas);
		panelVagas.setLayout(panelVagasLayout);
		panelVagasLayout
				.setHorizontalGroup(panelVagasLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelVagasLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelVagasLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																scrollpaneVagas,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																panelFiltroVagas,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(82, Short.MAX_VALUE)));
		panelVagasLayout
				.setVerticalGroup(panelVagasLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelVagasLayout
										.createSequentialGroup()
										.addGap(9, 9, 9)
										.addComponent(
												panelFiltroVagas,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												scrollpaneVagas,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, 0)));

		menuPrincipalVoluntario.addTab("Vagas", new ImageIcon(
				("img/lupa_16x16.png")), panelVagas);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				menuPrincipalVoluntario, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				menuPrincipalVoluntario, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		menuPrincipalVoluntario.getAccessibleContext().setAccessibleName("");

		pack();
	}// </editor-fold>

	private void ftxtCelularActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jftxtCpfActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {

	}
}
