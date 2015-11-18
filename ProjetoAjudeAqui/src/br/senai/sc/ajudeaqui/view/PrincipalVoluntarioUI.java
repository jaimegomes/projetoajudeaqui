/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.ajudeaqui.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.toedter.calendar.JDateChooser;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.controller.FuncaoController;
import br.senai.sc.ajudeaqui.controller.FuncaoVoluntarioController;
import br.senai.sc.ajudeaqui.controller.HorarioController;
import br.senai.sc.ajudeaqui.controller.HorarioVoluntarioController;
import br.senai.sc.ajudeaqui.controller.VoluntarioController;
import br.senai.sc.ajudeaqui.model.Funcao;
import br.senai.sc.ajudeaqui.model.FuncaoVoluntario;
import br.senai.sc.ajudeaqui.model.Horario;
import br.senai.sc.ajudeaqui.model.HorarioVoluntario;
import br.senai.sc.ajudeaqui.model.Usuario;
import br.senai.sc.ajudeaqui.model.Voluntario;

/**
 *
 * @author Jaime Gomes
 */
public class PrincipalVoluntarioUI extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JTextArea atxtInfoComplementares;
	private javax.swing.JButton btnAddAreaInteresse;
	private javax.swing.JButton btnAddHorario;
	private javax.swing.JButton btnHorariosDisponiveis;
	private javax.swing.JButton btnAreasInteresse;
	private javax.swing.JButton btnEditarDadosPerfil;
	private javax.swing.JButton btnFoto;
	private javax.swing.JButton btnPesquisarFiltroVagas;
	private javax.swing.JButton btnPesquisarFiltroVagas1;
	private javax.swing.JButton btnSalvarDadosPerfil;
	private javax.swing.JComboBox cmbAreasInteresse;
	private javax.swing.JComboBox cmbEstadoCivil;
	private javax.swing.JComboBox cmbHorarioDisponivel;
	private javax.swing.JComboBox cmbInstituicaoFiltroVagas;
	private javax.swing.JComboBox cmbSexo;
	private javax.swing.JComboBox cmbTipoServicoVagas;
	private javax.swing.JFormattedTextField jftxtCelular;
	private javax.swing.JFormattedTextField jftxtEmail;
	private javax.swing.JFormattedTextField jftxtTelefone;
	private javax.swing.JFormattedTextField jftxtCpf;
	private javax.swing.JLabel lblAreaInteresse;
	private javax.swing.JLabel lblAvatar;
	private javax.swing.JLabel lblCelular;
	private javax.swing.JLabel lblComplemento;
	private javax.swing.JLabel lblCpf;
	private javax.swing.JLabel lblDataNascimento;
	private javax.swing.JLabel lblDataPublicacaoFiltroVagas;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblEndereco;
	private javax.swing.JLabel lblEstadoCivil;
	private javax.swing.JLabel lblHorarioDisponivel;
	private javax.swing.JLabel lblInfoComplementares;
	private javax.swing.JLabel lblInstituicaoFiltroVagas;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblSexo;
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JLabel lblTipoServicoVagas;
	private javax.swing.JLabel lblTituloFiltroVagas;
	private javax.swing.JTabbedPane menuPrincipalVoluntario;
	private javax.swing.JPanel panelDadosPessoais;
	private javax.swing.JPanel panelInfoComplementares;
	private javax.swing.JPanel panelFiltroVagas;
	private javax.swing.JPanel panelPerfil;
	private javax.swing.JPanel panelVagas;
	private javax.swing.JScrollPane scrollPaneInfoComplementares;
	private javax.swing.JScrollPane scrollpaneVagas;
	private javax.swing.JTable tableVagas;
	private javax.swing.JTextField txtComplemento;
	private javax.swing.JTextField txtEndereco;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtTituloFiltroVagas;
	private JDateChooser dateChooserDataNascimento;
	private JDateChooser dateChooserDataPublicacaoFiltroVagas;
	private VoluntarioController voluntarioController = new VoluntarioController();
	private FuncaoController funcaoController = new FuncaoController();
	private List<String> listHorarios;
	private List<String> listAreasInteresse;

	// End of variables declaration

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PrincipalVoluntarioUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PrincipalVoluntarioUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PrincipalVoluntarioUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PrincipalVoluntarioUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PrincipalVoluntarioUI(null).setVisible(true);
			}
		});
	}

	/**
	 * Creates new form PrincipalUI
	 */
	public PrincipalVoluntarioUI(Usuario usuario) {
		initComponents(usuario);
	}

	@SuppressWarnings("unchecked")
	private void initComponents(final Usuario usuario) {

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
		panelInfoComplementares = new javax.swing.JPanel();
		scrollPaneInfoComplementares = new javax.swing.JScrollPane();
		atxtInfoComplementares = new javax.swing.JTextArea();
		atxtInfoComplementares.setTabSize(6);
		btnAddAreaInteresse = new javax.swing.JButton();
		lblHorarioDisponivel = new javax.swing.JLabel();
		btnAddHorario = new javax.swing.JButton();
		cmbHorarioDisponivel = new javax.swing.JComboBox();
		lblAreaInteresse = new javax.swing.JLabel();
		lblInfoComplementares = new javax.swing.JLabel();
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
		dateChooserDataNascimento = new JDateChooser();
		dateChooserDataPublicacaoFiltroVagas = new JDateChooser();

		// desabilitando os campos
		cmbEstadoCivil.setEnabled(false);
		cmbSexo.setEnabled(false);
		dateChooserDataNascimento.setEnabled(false);
		cmbHorarioDisponivel.setEnabled(false);
		cmbAreasInteresse.setEnabled(false);
		jftxtCpf.setEnabled(false);
		jftxtCelular.setEnabled(false);
		jftxtTelefone.setEnabled(false);
		txtEndereco.setEnabled(false);
		jftxtEmail.setEnabled(false);
		txtNome.setEnabled(false);
		atxtInfoComplementares.setEnabled(false);
		txtComplemento.setEnabled(false);
		cmbEstadoCivil.setEnabled(false);
		dateChooserDataNascimento.setEnabled(false);
		cmbSexo.setEnabled(false);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(":: Sistema do Voluntário Ajude Aqui ::");
		setBounds(new java.awt.Rectangle(0, 0, 0, 0));
		setMaximumSize(new java.awt.Dimension(1300, 700));
		setMinimumSize(new java.awt.Dimension(1300, 700));
		setName("frameVoluntario"); // NOI18N
		getContentPane().setBackground(Color.black);

		menuPrincipalVoluntario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		menuPrincipalVoluntario.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
		menuPrincipalVoluntario.setMaximumSize(new java.awt.Dimension(1300, 750));
		menuPrincipalVoluntario.setMinimumSize(new java.awt.Dimension(1300, 750));
		menuPrincipalVoluntario.setPreferredSize(new java.awt.Dimension(1300, 750));

		panelPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		panelPerfil.setMaximumSize(new Dimension(1110, 730));
		panelPerfil.setMinimumSize(new Dimension(1110, 730));
		panelPerfil.setName(""); // NOI18N
		panelPerfil.setPreferredSize(new Dimension(900, 500));

		btnSalvarDadosPerfil.setIcon(new ImageIcon("img/salvar_16x16.png")); // NOI18N
		btnSalvarDadosPerfil.setText("Salvar");
		btnSalvarDadosPerfil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				btnSalvarAction(usuario);

			}

		});

		btnEditarDadosPerfil.setIcon(new ImageIcon("img/editar_usuario_16x16.png")); // NOI18N
		btnEditarDadosPerfil.setText("Editar");
		btnEditarDadosPerfil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// habilitando os campos
				cmbEstadoCivil.setEnabled(true);
				cmbSexo.setEnabled(true);
				dateChooserDataNascimento.setEnabled(true);
				cmbHorarioDisponivel.setEnabled(true);
				cmbAreasInteresse.setEnabled(true);
				jftxtCpf.setEnabled(true);
				jftxtCelular.setEnabled(true);
				jftxtTelefone.setEnabled(true);
				txtEndereco.setEnabled(true);
				jftxtEmail.setEnabled(true);
				txtNome.setEnabled(true);
				atxtInfoComplementares.setEnabled(true);
				txtComplemento.setEnabled(true);
				cmbEstadoCivil.setEnabled(true);
				dateChooserDataNascimento.setEnabled(true);
				cmbSexo.setEnabled(true);

				listHorarios = new ArrayList<>();
				listAreasInteresse = new ArrayList<>();

			}
		});

		panelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
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

		lblCpf.setText("CPF:");

		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblTelefone.setText("Telefone:");

		jftxtCelular.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

		lblEstadoCivil.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblEstadoCivil.setText("Estado Civil:");

		cmbEstadoCivil
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Solteiro", "Outro" }));

		jftxtTelefone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

		lblEndereco.setText("Endereço:");

		btnFoto.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
		btnFoto.setText("Upload Imagem");

		lblEmail.setText("E-mail:");

		lblDataNascimento.setText("Data Nascimento:");

		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblSexo.setText("Sexo:");

		cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Masculino", "Feminino" }));

		dateChooserDataNascimento.setSize(100, 19);

		javax.swing.GroupLayout panelDadosPessoaisLayout = new javax.swing.GroupLayout(panelDadosPessoais);
		panelDadosPessoaisLayout.setHorizontalGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnFoto, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
								.addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDataNascimento).addComponent(lblCpf).addComponent(lblEndereco)
								.addComponent(lblNome).addComponent(lblEstadoCivil))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addGap(1)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtEndereco, GroupLayout.DEFAULT_SIZE, 291,
														Short.MAX_VALUE)
												.addComponent(jftxtCpf, GroupLayout.PREFERRED_SIZE, 129,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtNome)))
								.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(dateChooserDataNascimento, Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cmbEstadoCivil, Alignment.LEADING, 0, 130, Short.MAX_VALUE)))
						.addGap(10)
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblComplemento).addComponent(lblTelefone).addComponent(lblSexo)
								.addComponent(lblEmail).addComponent(lblCelular))
						.addGap(6)
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(jftxtTelefone, GroupLayout.PREFERRED_SIZE, 110,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbSexo, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addComponent(jftxtEmail, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 116,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jftxtCelular, GroupLayout.PREFERRED_SIZE, 110,
										GroupLayout.PREFERRED_SIZE))
						.addGap(303)));
		panelDadosPessoaisLayout.setVerticalGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addComponent(lblAvatar)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnFoto))
						.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addGroup(panelDadosPessoaisLayout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
										.addComponent(jftxtTelefone, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jftxtCelular, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCelular))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jftxtEmail, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEmail))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(cmbSexo, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblSexo)))
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNome)
												.addGroup(panelDadosPessoaisLayout
														.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblTelefone)))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(jftxtCpf, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCpf))
										.addGap(7)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblDataNascimento).addComponent(dateChooserDataNascimento,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(cmbEstadoCivil, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEstadoCivil))))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblComplemento).addComponent(lblEndereco))))
						.addGap(24)));
		panelDadosPessoais.setLayout(panelDadosPessoaisLayout);

		panelInfoComplementares.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Complementares"));
		panelInfoComplementares.setMaximumSize(new java.awt.Dimension(1197, 233));
		panelInfoComplementares.setMinimumSize(new java.awt.Dimension(1197, 233));
		panelInfoComplementares.setPreferredSize(new java.awt.Dimension(1197, 233));

		atxtInfoComplementares.setColumns(20);
		atxtInfoComplementares.setRows(5);
		scrollPaneInfoComplementares.setViewportView(atxtInfoComplementares);

		btnAddAreaInteresse.setIcon(new ImageIcon("img/add_16x16.png")); // NOI18N
		btnAddAreaInteresse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listAreasInteresse.add(cmbAreasInteresse.getSelectedItem() + "");
				cmbAreasInteresse.setSelectedIndex(0);

			}
		});

		lblHorarioDisponivel.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblHorarioDisponivel.setText("Horário Disponível:");

		btnAddHorario.setIcon(new ImageIcon("img/add_16x16.png")); // NOI18N
		btnAddHorario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listHorarios.add(cmbHorarioDisponivel.getSelectedItem() + "");
				cmbHorarioDisponivel.setSelectedIndex(0);

			}
		});

		cmbHorarioDisponivel.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "", "Matutino", "Vespertino", "Noturno" }));

		lblAreaInteresse.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblAreaInteresse.setText("Área de Interesse em Ajudar:");

		btnHorariosDisponiveis.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnHorariosDisponiveis.setText("Horários Disponíveis");
		btnHorariosDisponiveis.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String horarios = "Horários Disponíveis\n\n";

				try {
					
					Voluntario vol = (Voluntario) voluntarioController.getPorIdUsuario(usuario.getId());
					HorarioVoluntarioController horarioVolController = new HorarioVoluntarioController();
					
					List<Entidade> list = horarioVolController.getPorIdVoluntario(vol.getId());

					JOptionPane.showMessageDialog(null, horarios);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				listHorarios.add(cmbHorarioDisponivel.getSelectedItem() + "");

			}
		});

		btnAreasInteresse.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnAreasInteresse.setText("Área de Interesse");
		btnAreasInteresse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String funcoes = "Áreas de Interesse em Ajudar\n\n";

				try {
					Voluntario vol = (Voluntario) voluntarioController.getPorIdUsuario(usuario.getId());
					FuncaoVoluntarioController funcaoVolController = new FuncaoVoluntarioController();
					
					List<Entidade> list = funcaoVolController.getListPorIdVoluntario(vol.getId());
					
					for(Entidade ent: list) {
						
						FuncaoVoluntario funcaoVoluntario = (FuncaoVoluntario) ent;
						Funcao funcao = (Funcao) funcaoController.getPorId(funcaoVoluntario.getIdFuncao());
						
						funcoes += funcao.getFuncao()+"\n";
					}
					
					JOptionPane.showMessageDialog(null, funcoes);

				} catch (Exception e1) {
					e1.printStackTrace();
				}

				listHorarios.add(cmbHorarioDisponivel.getSelectedItem() + "");

			}
		});

		lblInfoComplementares.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInfoComplementares.setText("Informações Complementares:");

		cmbAreasInteresse.addItem("");

		try {
			for (Entidade ent : funcaoController.listar()) {
				Funcao funcao = (Funcao) ent;

				cmbAreasInteresse.addItem(funcao.getFuncao());

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		javax.swing.GroupLayout panelExperienciasLayout = new javax.swing.GroupLayout(panelInfoComplementares);
		panelExperienciasLayout.setHorizontalGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelExperienciasLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHorarioDisponivel).addComponent(lblInfoComplementares)
								.addComponent(lblAreaInteresse))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelExperienciasLayout.createSequentialGroup()
										.addComponent(cmbAreasInteresse, GroupLayout.PREFERRED_SIZE, 190,
												GroupLayout.PREFERRED_SIZE)
										.addGap(12)
										.addComponent(btnAddAreaInteresse, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnAreasInteresse))
								.addComponent(scrollPaneInfoComplementares, GroupLayout.PREFERRED_SIZE, 375,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(panelExperienciasLayout.createSequentialGroup()
										.addComponent(cmbHorarioDisponivel, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btnAddHorario, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btnHorariosDisponiveis)))
						.addContainerGap(284, Short.MAX_VALUE)));
		panelExperienciasLayout.setVerticalGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelExperienciasLayout.createSequentialGroup()
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblHorarioDisponivel, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(cmbHorarioDisponivel, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAddHorario, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnHorariosDisponiveis, GroupLayout.PREFERRED_SIZE, 22,
								GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInfoComplementares).addComponent(scrollPaneInfoComplementares,
										GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGap(12)
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnAddAreaInteresse, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblAreaInteresse).addComponent(cmbAreasInteresse,
												GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnAreasInteresse, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(17, Short.MAX_VALUE)));
		panelInfoComplementares.setLayout(panelExperienciasLayout);

		javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
		panelPerfilLayout.setHorizontalGroup(panelPerfilLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelPerfilLayout.createSequentialGroup().addContainerGap().addGroup(panelPerfilLayout
						.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panelInfoComplementares, 0, 0, Short.MAX_VALUE)
						.addGroup(panelPerfilLayout.createSequentialGroup()
								.addComponent(btnSalvarDadosPerfil, GroupLayout.PREFERRED_SIZE, 116,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnEditarDadosPerfil,
										GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 935, Short.MAX_VALUE))
						.addContainerGap()));
		panelPerfilLayout.setVerticalGroup(panelPerfilLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelPerfilLayout.createSequentialGroup().addGap(8)
						.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelInfoComplementares, GroupLayout.PREFERRED_SIZE, 177,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelPerfilLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnEditarDadosPerfil, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSalvarDadosPerfil, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(320, Short.MAX_VALUE)));
		panelPerfil.setLayout(panelPerfilLayout);

		menuPrincipalVoluntario.addTab("Perfil", new ImageIcon("img/usuario_16x16.png"), panelPerfil); // NOI18N

		panelVagas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		panelVagas.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelVagas.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelVagas.setPreferredSize(new java.awt.Dimension(1110, 700));

		panelFiltroVagas.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro de Pesquisa"));
		panelFiltroVagas.setMaximumSize(new java.awt.Dimension(1197, 150));
		panelFiltroVagas.setMinimumSize(new java.awt.Dimension(1197, 150));
		panelFiltroVagas.setPreferredSize(new java.awt.Dimension(1197, 150));

		lblTituloFiltroVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTituloFiltroVagas.setText("Tï¿½tulo:");

		lblInstituicaoFiltroVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblInstituicaoFiltroVagas.setText("Instituição:");

		lblDataPublicacaoFiltroVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblDataPublicacaoFiltroVagas.setText("Data Publicação:");

		btnPesquisarFiltroVagas.setIcon(new ImageIcon("img/lupa_16x16.png")); // NOI18N
		btnPesquisarFiltroVagas.setText("Pesquisar");

		lblTipoServicoVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTipoServicoVagas.setText("Tipo de Serviço:");

		cmbTipoServicoVagas.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		btnPesquisarFiltroVagas1.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnPesquisarFiltroVagas1.setText("Gerar Relatório");

		dateChooserDataPublicacaoFiltroVagas = new JDateChooser();

		javax.swing.GroupLayout panelFiltroVagasLayout = new javax.swing.GroupLayout(panelFiltroVagas);
		panelFiltroVagasLayout.setHorizontalGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelFiltroVagasLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTituloFiltroVagas).addComponent(lblDataPublicacaoFiltroVagas)
								.addComponent(lblInstituicaoFiltroVagas).addComponent(lblTipoServicoVagas))
						.addGap(4)
						.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelFiltroVagasLayout.createSequentialGroup()
										.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(cmbTipoServicoVagas, GroupLayout.PREFERRED_SIZE, 258,
														GroupLayout.PREFERRED_SIZE)
										.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(cmbInstituicaoFiltroVagas, 0, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(txtTituloFiltroVagas, GroupLayout.PREFERRED_SIZE, 258,
														GroupLayout.PREFERRED_SIZE)))
										.addGap(18).addComponent(btnPesquisarFiltroVagas))
								.addComponent(dateChooserDataPublicacaoFiltroVagas, GroupLayout.PREFERRED_SIZE, 136,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(723, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING,
						panelFiltroVagasLayout.createSequentialGroup().addContainerGap(1070, Short.MAX_VALUE)
								.addComponent(btnPesquisarFiltroVagas1).addContainerGap()));
		panelFiltroVagasLayout.setVerticalGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(panelFiltroVagasLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTituloFiltroVagas)
								.addComponent(txtTituloFiltroVagas, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPesquisarFiltroVagas, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmbInstituicaoFiltroVagas, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInstituicaoFiltroVagas))
						.addGap(8)
						.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblDataPublicacaoFiltroVagas)
								.addComponent(dateChooserDataPublicacaoFiltroVagas, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmbTipoServicoVagas, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTipoServicoVagas))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(panelFiltroVagasLayout.createSequentialGroup().addContainerGap(118, Short.MAX_VALUE)
						.addComponent(btnPesquisarFiltroVagas1, GroupLayout.PREFERRED_SIZE, 22,
								GroupLayout.PREFERRED_SIZE)));
		panelFiltroVagas.setLayout(panelFiltroVagasLayout);

		scrollpaneVagas.setMaximumSize(new java.awt.Dimension(1197, 480));
		scrollpaneVagas.setMinimumSize(new java.awt.Dimension(1197, 480));
		scrollpaneVagas.setPreferredSize(new java.awt.Dimension(1197, 480));

		tableVagas.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Instituição", "Título", "Descrição" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class };
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

		javax.swing.GroupLayout panelVagasLayout = new javax.swing.GroupLayout(panelVagas);
		panelVagasLayout.setHorizontalGroup(panelVagasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelVagasLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelVagasLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelFiltroVagas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollpaneVagas, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(84, Short.MAX_VALUE)));
		panelVagasLayout.setVerticalGroup(panelVagasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelVagasLayout.createSequentialGroup().addGap(9)
						.addComponent(panelFiltroVagas, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(scrollpaneVagas,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(0)));
		panelVagas.setLayout(panelVagasLayout);

		menuPrincipalVoluntario.addTab("Vagas", new ImageIcon(("img/lupa_16x16.png")), panelVagas);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				menuPrincipalVoluntario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				menuPrincipalVoluntario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		/**
		 * Cria a entidade Voluntário a partir do usuário logado
		 */
		Voluntario vol = null;
		try {
			vol = (Voluntario) voluntarioController.getPorIdUsuario(usuario.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		/**
		 * No caso sempre vai ser diferente de nulo pois ao criar o usuário e
		 * escolher o perfil de instituição ele já cria um registro na tabela
		 * instituição.
		 * 
		 * Verifica todos os campos, caso sejam diferentes de nulo ele preenche
		 * os dados do voluntï¿½rio.
		 */
		if (vol != null) {

			if (vol.getNome() != null)
				txtNome.setText(vol.getNome());

			if (vol.getTelefone() != null)
				jftxtTelefone.setText(vol.getTelefone());

			if (vol.getCpf() != null)
				jftxtCpf.setText(vol.getCpf());

			if (vol.getEndereco() != null)
				txtEndereco.setText(vol.getEndereco());

			if (vol.getEmail() != null)
				jftxtEmail.setText(vol.getEmail());

			if (vol.getDataNascimento() != null)
				dateChooserDataNascimento.setDate(vol.getDataNascimento());

			if (vol.getSexo() != null) {

				if (vol.getSexo().equals("Masculino")) {
					cmbSexo.setSelectedIndex(1);

				} else if (vol.getSexo().equals("Feminino")) {
					cmbSexo.setSelectedIndex(2);
				}

			}

			if (vol.getEstadoCivil() != null) {

				if (vol.getEstadoCivil().equals("Casado")) {
					cmbEstadoCivil.setSelectedIndex(1);

				} else if (vol.getEstadoCivil().equals("Solteiro")) {
					cmbEstadoCivil.setSelectedIndex(2);

				} else if (vol.getEstadoCivil().equals("Outro")) {
					cmbEstadoCivil.setSelectedIndex(3);
				}

			}

			if (vol.getComplemento() != null)
				txtComplemento.setText(vol.getComplemento());

			if (vol.getCelular() != null)
				jftxtCelular.setText(vol.getCelular());

			if (vol.getInformacoesComplementares() != null)
				atxtInfoComplementares.setText(vol.getInformacoesComplementares());

		}
		pack();
	}

	private void btnSalvarAction(Usuario user) {

		VoluntarioController volController = new VoluntarioController();

		String sexo = "";
		String estadoCivil = "";

		if (cmbSexo.getSelectedIndex() == 1) {
			sexo = "Masculino";
		} else if (cmbSexo.getSelectedIndex() == 2) {
			sexo = "Feminino";
		}

		if (cmbEstadoCivil.getSelectedIndex() == 1) {
			estadoCivil = "Casado";

		} else if (cmbEstadoCivil.getSelectedIndex() == 2) {
			estadoCivil = "Solteiro";

		} else if (cmbEstadoCivil.getSelectedIndex() == 3) {
			estadoCivil = "Outro";
		}

		try {

			Voluntario voluntario = (Voluntario) volController.getPorIdUsuario(user.getId());
			voluntario.setNome(txtNome.getText());
			voluntario.setTelefone(jftxtTelefone.getText());
			voluntario.setCpf(jftxtCpf.getText());
			voluntario.setEndereco(txtEndereco.getText());
			voluntario.setEmail(jftxtEmail.getText());
			voluntario.setDataNascimento(dateChooserDataNascimento.getDate());
			voluntario.setUsuario(user);
			voluntario.setSexo(sexo);
			voluntario.setEstadoCivil(estadoCivil);
			voluntario.setComplemento(txtComplemento.getText());
			voluntario.setCelular(jftxtCelular.getText());
			voluntario.setInformacoesComplementares(atxtInfoComplementares.getText());

			volController.editar(voluntario);

			if (listHorarios != null) {

				HorarioVoluntarioController horarioVolController = new HorarioVoluntarioController();
				HorarioController horarioController = new HorarioController();

				for (int i = 0; i < listHorarios.size(); i++) {

					Horario horario = (Horario) horarioController.getPorHorario(listHorarios.get(i));

					// se não existir na lista adiciona
					if (!horarioVolController.getPorIdHorarioVoluntario(horario.getId(), voluntario.getId())) {
						HorarioVoluntario horarioVoluntario = new HorarioVoluntario(horario, voluntario);

						horarioVolController.salvar(horarioVoluntario);
					}
				}

			}

			if (listAreasInteresse != null) {

				FuncaoController funcaoController = new FuncaoController();
				FuncaoVoluntarioController funcaoVolController = new FuncaoVoluntarioController();

				for (int i = 0; i < listAreasInteresse.size(); i++) {

					Funcao funcao = (Funcao) funcaoController.getPorFuncao(listAreasInteresse.get(i));

					// se não existir na lista adiciona
					if (!funcaoVolController.getPorIdFuncaoVoluntario(funcao.getId(), voluntario.getId())) {
						FuncaoVoluntario funcaoVoluntario = new FuncaoVoluntario(funcao.getId(), voluntario.getId());

						funcaoVolController.salvar(funcaoVoluntario);
					}
				}

			}

			JOptionPane.showMessageDialog(null, "Voluntário editado com sucesso.");

		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar dados.");
			e.printStackTrace();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}

	}

}
