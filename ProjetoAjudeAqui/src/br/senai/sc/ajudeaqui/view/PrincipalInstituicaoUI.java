/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.ajudeaqui.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.controller.AnuncioController;
import br.senai.sc.ajudeaqui.controller.FuncaoController;
import br.senai.sc.ajudeaqui.controller.InstituicaoController;
import br.senai.sc.ajudeaqui.controller.VoluntarioController;
import br.senai.sc.ajudeaqui.model.Anuncio;
import br.senai.sc.ajudeaqui.model.Funcao;
import br.senai.sc.ajudeaqui.model.Instituicao;
import br.senai.sc.ajudeaqui.model.Usuario;
import br.senai.sc.ajudeaqui.model.Voluntario;
import br.senai.sc.ajudeaqui.tablemodel.AnuncioTableModel;
import br.senai.sc.ajudeaqui.tablemodel.VoluntarioTableModel;

/**
 *
 * @author Jaime Gomes
 */
@SuppressWarnings("rawtypes")
public class PrincipalInstituicaoUI extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JTextArea atxtDescricaoCadAnuncio;
	private javax.swing.JTextArea atxtObservacoes;
	private javax.swing.JButton btnEditarAnuncio;
	private javax.swing.JButton btnEditarDadosInstituicao;
	private javax.swing.JButton btnEncerrarAnuncio;
	private javax.swing.JButton btnPesquisarAnunciosPublicados;
	private javax.swing.JButton btnPesquisarFiltroVoluntarios;
	private javax.swing.JButton btnSalvarCadAnuncio;
	private javax.swing.JButton btnSalvarDadosInstituicao;
	private javax.swing.JComboBox cmbTipoServicoAnuncio;
	private javax.swing.JLabel lblCnpj;
	private javax.swing.JLabel lblDescricaoCadAnuncio;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblEmailFiltroVoluntarios;
	private javax.swing.JLabel lblEndereco;
	private javax.swing.JLabel lblFiltroTituloAnunciosPublicados;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblNomeFiltroVoluntarios;
	private javax.swing.JLabel lblObservacoes;
	private javax.swing.JLabel lblRazaoSocial;
	private javax.swing.JLabel lblResponsavel;
	private javax.swing.JLabel lblSite;
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JLabel lblTipoServicoAnuncio;
	private javax.swing.JLabel lblTituloCadAnuncio;
	private javax.swing.JLabel lblVagasCadAnuncio;
	private javax.swing.JTabbedPane menuPrincipalInstituicao;
	private javax.swing.JPanel panelAnuncio;
	private javax.swing.JPanel panelAnunciosPublicados;
	private javax.swing.JPanel panelCadAnuncio;
	private javax.swing.JPanel panelDadosInstituicao;
	private javax.swing.JPanel panelFiltroVoluntarios;
	private javax.swing.JPanel panelInstituicao;
	private javax.swing.JPanel panelVoluntarios;
	private javax.swing.JScrollPane scrollpaneAnunciosPublicados;
	private javax.swing.JScrollPane scrollpaneDescricaoCadAnuncio;
	private javax.swing.JScrollPane scrollpaneObservacoes;
	private javax.swing.JScrollPane scrollpaneVoluntarios;
	private javax.swing.JSpinner spinnerVagasCadAnuncio;
	private javax.swing.JTable tableAnunciosPublicados;
	private javax.swing.JTable tableVoluntarios;
	private javax.swing.JFormattedTextField txtCnpj;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtEmailFiltroVoluntarios;
	private javax.swing.JTextField txtEndereco;
	private javax.swing.JTextField txtFiltroTituloAnunciosPublicados;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtNomeFiltroVoluntarios;
	private javax.swing.JTextField txtRazaoSocial;
	private javax.swing.JTextField txtResponsavel;
	private javax.swing.JTextField txtSite;
	private javax.swing.JFormattedTextField txtTelefone;
	private javax.swing.JTextField txtTituloCadAnuncio;
	// End of variables declaration

	private InstituicaoController controller = new InstituicaoController();
	private VoluntarioController volController = new VoluntarioController();
	private FuncaoController funcaoController = new FuncaoController();
	private List<Entidade> listVoluntarios = new ArrayList<>();
	private Instituicao instituicao = new Instituicao();
	private AnuncioController anuncioController = new AnuncioController();
	private JMenuBar menuBar;
	private JMenuItem mntmDeslogar;

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
			java.util.logging.Logger.getLogger(PrincipalInstituicaoUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PrincipalInstituicaoUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PrincipalInstituicaoUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PrincipalInstituicaoUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PrincipalInstituicaoUI(null).setVisible(true);
			}
		});

	}

	/**
	 * Creates new form PrincipalInstituicaoUI
	 */
	public PrincipalInstituicaoUI(Usuario usuario) {
		initComponents(usuario);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents(final Usuario usuario) {

		menuPrincipalInstituicao = new javax.swing.JTabbedPane();
		panelVoluntarios = new javax.swing.JPanel();
		panelFiltroVoluntarios = new javax.swing.JPanel();
		lblNomeFiltroVoluntarios = new javax.swing.JLabel();
		lblEmailFiltroVoluntarios = new javax.swing.JLabel();
		txtNomeFiltroVoluntarios = new javax.swing.JTextField();
		txtEmailFiltroVoluntarios = new javax.swing.JTextField();
		btnPesquisarFiltroVoluntarios = new javax.swing.JButton();
		scrollpaneVoluntarios = new javax.swing.JScrollPane();
		tableVoluntarios = new javax.swing.JTable();
		panelAnuncio = new javax.swing.JPanel();
		panelAnunciosPublicados = new javax.swing.JPanel();
		scrollpaneAnunciosPublicados = new javax.swing.JScrollPane();
		tableAnunciosPublicados = new javax.swing.JTable();
		btnPesquisarAnunciosPublicados = new javax.swing.JButton();
		lblFiltroTituloAnunciosPublicados = new javax.swing.JLabel();
		txtFiltroTituloAnunciosPublicados = new javax.swing.JTextField();
		btnEditarAnuncio = new javax.swing.JButton();
		btnEncerrarAnuncio = new javax.swing.JButton();
		panelCadAnuncio = new javax.swing.JPanel();
		lblTituloCadAnuncio = new javax.swing.JLabel();
		spinnerVagasCadAnuncio = new javax.swing.JSpinner();
		spinnerVagasCadAnuncio.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		lblVagasCadAnuncio = new javax.swing.JLabel();
		txtTituloCadAnuncio = new javax.swing.JTextField();
		lblDescricaoCadAnuncio = new javax.swing.JLabel();
		scrollpaneDescricaoCadAnuncio = new javax.swing.JScrollPane();
		atxtDescricaoCadAnuncio = new javax.swing.JTextArea();
		btnSalvarCadAnuncio = new javax.swing.JButton();
		lblTipoServicoAnuncio = new javax.swing.JLabel();
		cmbTipoServicoAnuncio = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(":: Sistema do Voluntário Ajude Aqui ::");
		setMaximumSize(new java.awt.Dimension(1300, 700));
		setMinimumSize(new java.awt.Dimension(1300, 700));
		setName("frameInstituicao"); // NOI18N
		getContentPane().setBackground(Color.black);
		cmbTipoServicoAnuncio.addItem("");

		// carrega as funções para os combobox tipo de serviço
		try {
			for (Entidade e : funcaoController.listar()) {
				Funcao f = (Funcao) e;
				cmbTipoServicoAnuncio.addItem(f.getFuncao());
			}
		} catch (Exception e3) {
			e3.printStackTrace();
		}

		menuPrincipalInstituicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		menuPrincipalInstituicao.setMaximumSize(new java.awt.Dimension(1300, 700));
		menuPrincipalInstituicao.setMinimumSize(new java.awt.Dimension(1300, 700));
		menuPrincipalInstituicao.setPreferredSize(new java.awt.Dimension(1300, 700));
		panelInstituicao = new javax.swing.JPanel();
		panelDadosInstituicao = new javax.swing.JPanel();
		btnSalvarDadosInstituicao = new javax.swing.JButton();
		txtNome = new javax.swing.JTextField();
		txtCnpj = new javax.swing.JFormattedTextField();
		txtEndereco = new javax.swing.JTextField();
		lblRazaoSocial = new javax.swing.JLabel();
		lblTelefone = new javax.swing.JLabel();
		lblEndereco = new javax.swing.JLabel();
		lblCnpj = new javax.swing.JLabel();
		lblEmail = new javax.swing.JLabel();
		txtSite = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		lblObservacoes = new javax.swing.JLabel();
		lblResponsavel = new javax.swing.JLabel();
		scrollpaneObservacoes = new javax.swing.JScrollPane();
		atxtObservacoes = new javax.swing.JTextArea();
		txtTelefone = new javax.swing.JFormattedTextField();
		txtRazaoSocial = new javax.swing.JTextField();
		lblSite = new javax.swing.JLabel();
		lblNome = new javax.swing.JLabel();
		txtResponsavel = new javax.swing.JTextField();
		btnEditarDadosInstituicao = new javax.swing.JButton();

		try {
			txtCnpj.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###/####-##")));
		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		txtCnpj.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String caracteres = "0987654321";

				if (!caracteres.contains(e.getKeyChar() + "")) {
					e.consume();
				}
			}
		});

		txtTelefone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		try {
			txtTelefone.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##)####-####")));

		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		txtTelefone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String caracteres = "0987654321";

				if (!caracteres.contains(e.getKeyChar() + "")) {
					e.consume();
				}
			}
		});

		desabilitaCampos();

		panelInstituicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		panelInstituicao.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelInstituicao.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelInstituicao.setPreferredSize(new java.awt.Dimension(1110, 700));

		panelDadosInstituicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Instituição"));

		btnSalvarDadosInstituicao.setIcon(new javax.swing.ImageIcon("img/salvar_16x16.png")); // NOI18N
		btnSalvarDadosInstituicao.setText("Salvar");
		btnSalvarDadosInstituicao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					btnSalvarAction(usuario, instituicao);

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}

		});

		lblRazaoSocial.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblRazaoSocial.setText("Razão Social:");

		lblTelefone.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTelefone.setText("Telefone:");

		lblEndereco.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblEndereco.setText("Endereço:");

		lblCnpj.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblCnpj.setText("CNPJ:");

		lblEmail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblEmail.setText("Email:");

		lblObservacoes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblObservacoes.setText("Observações:");

		lblResponsavel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblResponsavel.setText("Responsável:");

		atxtObservacoes.setColumns(20);
		atxtObservacoes.setRows(5);
		scrollpaneObservacoes.setViewportView(atxtObservacoes);

		lblSite.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblSite.setText("Site:");

		lblNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblNome.setText("Nome:");

		btnEditarDadosInstituicao.setIcon(new javax.swing.ImageIcon("img/editar_usuario_16x16.png")); // NOI18N
		btnEditarDadosInstituicao.setText("Editar");
		btnEditarDadosInstituicao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtNome.setEnabled(true);
				txtCnpj.setEnabled(true);
				txtEndereco.setEnabled(true);
				txtSite.setEnabled(true);
				txtEmail.setEnabled(true);
				atxtObservacoes.setEnabled(true);
				txtTelefone.setEnabled(true);
				txtRazaoSocial.setEnabled(true);
				txtResponsavel.setEnabled(true);

			}
		});

		/**
		 * Cria a entidade Instituição a partir do usuário logado
		 */
		try {
			instituicao = (Instituicao) controller.getPorIdUsuario(usuario.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (instituicao.getNome() != null)
			txtNome.setText(instituicao.getNome());

		if (instituicao.getCnpj() != null)
			txtCnpj.setText(instituicao.getCnpj());

		if (instituicao.getEmail() != null)
			txtEmail.setText(instituicao.getEmail());

		if (instituicao.getEndereco() != null)
			txtEndereco.setText(instituicao.getEndereco());

		if (instituicao.getRazaoSocial() != null)
			txtRazaoSocial.setText(instituicao.getRazaoSocial());

		if (instituicao.getSite() != null)
			txtSite.setText(instituicao.getSite());

		if (instituicao.getTelefone() != null)
			txtTelefone.setText(instituicao.getTelefone());

		if (instituicao.getTelefone() != null)
			txtResponsavel.setText(instituicao.getResponsavel());

		if (instituicao.getObservacoes() != null)
			atxtObservacoes.setText(instituicao.getObservacoes());

		javax.swing.GroupLayout panelDadosInstituicaoLayout = new javax.swing.GroupLayout(panelDadosInstituicao);
		panelDadosInstituicaoLayout
				.setHorizontalGroup(
						panelDadosInstituicaoLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(
										panelDadosInstituicaoLayout.createSequentialGroup().addContainerGap()
												.addGroup(panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelDadosInstituicaoLayout.createSequentialGroup()
																		.addGroup(
																				panelDadosInstituicaoLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(lblNome)
																						.addComponent(lblRazaoSocial)
																						.addComponent(lblSite)
																						.addComponent(lblEndereco)
																						.addComponent(lblTelefone)
																						.addComponent(lblEmail)
																						.addComponent(lblCnpj)
																						.addComponent(lblObservacoes))
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
										.addGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 353,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtSite, GroupLayout.PREFERRED_SIZE, 230,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 353,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 139,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 230,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtCnpj, GroupLayout.PREFERRED_SIZE, 141,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtRazaoSocial, GroupLayout.PREFERRED_SIZE, 353,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtResponsavel, GroupLayout.PREFERRED_SIZE, 242,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(panelDadosInstituicaoLayout
														.createParallelGroup(Alignment.TRAILING)
														.addGroup(panelDadosInstituicaoLayout.createSequentialGroup()
																.addComponent(btnSalvarDadosInstituicao,
																		GroupLayout.PREFERRED_SIZE, 116,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(btnEditarDadosInstituicao,
																		GroupLayout.PREFERRED_SIZE, 116,
																		GroupLayout.PREFERRED_SIZE))
														.addComponent(scrollpaneObservacoes, GroupLayout.PREFERRED_SIZE,
																353, GroupLayout.PREFERRED_SIZE))))
								.addComponent(lblResponsavel)).addContainerGap(84, Short.MAX_VALUE)));
		panelDadosInstituicaoLayout.setVerticalGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelDadosInstituicaoLayout.createSequentialGroup()
						.addGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNome)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(panelDadosInstituicaoLayout.createSequentialGroup()
										.addComponent(txtRazaoSocial, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtCnpj, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCnpj)))
								.addComponent(lblRazaoSocial, Alignment.LEADING))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEmail))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTelefone))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEndereco))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtSite, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSite))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblResponsavel).addComponent(txtResponsavel, GroupLayout.PREFERRED_SIZE,
										22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblObservacoes).addComponent(scrollpaneObservacoes,
										GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(panelDadosInstituicaoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnEditarDadosInstituicao, GroupLayout.PREFERRED_SIZE, 19,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSalvarDadosInstituicao, GroupLayout.PREFERRED_SIZE, 19,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(23, Short.MAX_VALUE)));
		panelDadosInstituicao.setLayout(panelDadosInstituicaoLayout);

		javax.swing.GroupLayout panelInstituicaoLayout = new javax.swing.GroupLayout(panelInstituicao);
		panelInstituicaoLayout.setHorizontalGroup(panelInstituicaoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelInstituicaoLayout
						.createSequentialGroup().addContainerGap().addComponent(panelDadosInstituicao,
								GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(734, Short.MAX_VALUE)));
		panelInstituicaoLayout.setVerticalGroup(panelInstituicaoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelInstituicaoLayout
						.createSequentialGroup().addContainerGap().addComponent(panelDadosInstituicao,
								GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(223, Short.MAX_VALUE)));
		panelInstituicao.setLayout(panelInstituicaoLayout);

		menuPrincipalInstituicao.addTab("Instituição", new javax.swing.ImageIcon("img/home_16x16.png.png"),
				panelInstituicao); // NOI18N

		menuPrincipalInstituicao.addTab("Voluntários", new javax.swing.ImageIcon("img/usuarios_16x16.png"),
				panelVoluntarios);

		panelAnuncio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		panelAnuncio.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelAnuncio.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelAnuncio.setPreferredSize(new java.awt.Dimension(1110, 700));
		panelAnuncio.setRequestFocusEnabled(false);

		panelAnunciosPublicados.setBorder(javax.swing.BorderFactory.createTitledBorder("Anúncios Publicados"));
		panelAnunciosPublicados.setMaximumSize(new java.awt.Dimension(1197, 399));
		panelAnunciosPublicados.setMinimumSize(new java.awt.Dimension(1197, 399));
		panelAnunciosPublicados.setPreferredSize(new java.awt.Dimension(1197, 399));

		scrollpaneAnunciosPublicados.setMaximumSize(new java.awt.Dimension(1197, 346));
		scrollpaneAnunciosPublicados.setMinimumSize(new java.awt.Dimension(1197, 346));
		scrollpaneAnunciosPublicados.setPreferredSize(new java.awt.Dimension(1197, 346));

		panelVoluntarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		panelVoluntarios.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelVoluntarios.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelVoluntarios.setPreferredSize(new java.awt.Dimension(1110, 700));

		panelFiltroVoluntarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro de Pesquisa"));
		panelFiltroVoluntarios.setMaximumSize(new java.awt.Dimension(1197, 115));
		panelFiltroVoluntarios.setMinimumSize(new java.awt.Dimension(1197, 115));
		panelFiltroVoluntarios.setPreferredSize(new java.awt.Dimension(1197, 115));

		lblNomeFiltroVoluntarios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblNomeFiltroVoluntarios.setText("Nome:");

		lblEmailFiltroVoluntarios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblEmailFiltroVoluntarios.setText("Email:");

		btnPesquisarFiltroVoluntarios.setIcon(new javax.swing.ImageIcon("img/lupa_16x16.png")); // NOI18N
		btnPesquisarFiltroVoluntarios.setText("Pesquisar");
		btnPesquisarFiltroVoluntarios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					listVoluntarios = btnPesquisarVoluntarioAction(txtNomeFiltroVoluntarios.getText(),
							txtEmailFiltroVoluntarios.getText());

					tableVoluntarios.setModel(new VoluntarioTableModel(listVoluntarios));

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		scrollpaneVoluntarios.setMaximumSize(new java.awt.Dimension(1197, 520));
		scrollpaneVoluntarios.setMinimumSize(new java.awt.Dimension(1197, 520));
		scrollpaneVoluntarios.setPreferredSize(new java.awt.Dimension(1197, 520));

		try {
			List<Entidade> listVol = volController.listar();

			tableVoluntarios.setModel(new VoluntarioTableModel(listVol));

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		tableVoluntarios.setAutoscrolls(false);
		tableVoluntarios.setMaximumSize(new java.awt.Dimension(1197, 520));
		tableVoluntarios.setMinimumSize(new java.awt.Dimension(1197, 520));
		tableVoluntarios.setPreferredSize(new java.awt.Dimension(1197, 520));
		tableVoluntarios.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {

					int linhaSelecionada = tableVoluntarios.getSelectedRow();

					int idVoluntario = Integer.parseInt(tableVoluntarios.getValueAt(linhaSelecionada, 0).toString());

					Voluntario voluntario = null;
					try {
						voluntario = (Voluntario) volController.getPorId(idVoluntario);
					} catch (Exception e1) {
						e1.printStackTrace();
					}

					VoluntarioUI volUI = new VoluntarioUI(voluntario);
					volUI.setFocusable(true);
					volUI.moveToFront();
					getContentPane().add(volUI, 0);
					volUI.setVisible(true);
				}
			}
		});

		scrollpaneVoluntarios.setViewportView(tableVoluntarios);

		try {
			List<Entidade> listAnuncio = anuncioController.getPorIdInstituicao(instituicao.getId());

			tableAnunciosPublicados.setModel(new AnuncioTableModel(listAnuncio));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		tableAnunciosPublicados.setMaximumSize(new java.awt.Dimension(1197, 347));
		tableAnunciosPublicados.setMinimumSize(new java.awt.Dimension(1197, 347));
		tableAnunciosPublicados.setPreferredSize(new java.awt.Dimension(1197, 347));
		tableAnunciosPublicados.setRowHeight(30);
		tableAnunciosPublicados.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {

					int linhaSelecionada = tableAnunciosPublicados.getSelectedRow();

					int idAnuncio = Integer
							.parseInt(tableAnunciosPublicados.getValueAt(linhaSelecionada, 0).toString());

					Anuncio anuncio = null;
					try {
						anuncio = (Anuncio) anuncioController.getPorId(idAnuncio);
					} catch (Exception e1) {
						e1.printStackTrace();
					}

					AnuncioUI anuncioUI = new AnuncioUI(anuncio, instituicao);
					anuncioUI.setFocusable(true);
					anuncioUI.moveToFront();
					getContentPane().add(anuncioUI, 0);
					anuncioUI.setVisible(true);
				}
			}
		});

		scrollpaneAnunciosPublicados.setViewportView(tableAnunciosPublicados);

		btnPesquisarAnunciosPublicados.setIcon(new javax.swing.ImageIcon("img/lupa_16x16.png")); // NOI18N
		btnPesquisarAnunciosPublicados.setText("Pesquisar");
		btnPesquisarAnunciosPublicados.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String titulo = txtFiltroTituloAnunciosPublicados.getText();

					if (titulo.trim().equals("") || titulo == null) {

						tableAnunciosPublicados.setModel(
								new AnuncioTableModel(anuncioController.getPorIdInstituicao(instituicao.getId())));
					} else {

						tableAnunciosPublicados.setModel(new AnuncioTableModel(
								anuncioController.getPorTituloEIdInstituicao(titulo, instituicao.getId())));
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});

		lblFiltroTituloAnunciosPublicados.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblFiltroTituloAnunciosPublicados.setText("Título:");

		btnEditarAnuncio.setIcon(new javax.swing.ImageIcon("img/editar_usuario_16x16.png")); // NOI18N
		btnEditarAnuncio.setText("Editar");
		btnEditarAnuncio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int linhaSelecionada = tableAnunciosPublicados.getSelectedRow();

				int idAnuncio = Integer.parseInt(tableAnunciosPublicados.getValueAt(linhaSelecionada, 0).toString());

				Anuncio anuncio = null;
				Funcao funcao = null;

				try {

					anuncio = (Anuncio) anuncioController.getPorId(idAnuncio);

					funcao = (Funcao) funcaoController.getPorFuncao(anuncio.getFuncao().getFuncao());

					txtTituloCadAnuncio.setText(anuncio.getTitulo());
					atxtDescricaoCadAnuncio.setText(anuncio.getDescricao());
					cmbTipoServicoAnuncio.setSelectedItem(funcao.getFuncao());
					spinnerVagasCadAnuncio.setValue(anuncio.getQtdVagas());

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		btnEncerrarAnuncio.setIcon(new javax.swing.ImageIcon("img/cancelar_16x16.png")); // NOI18N
		btnEncerrarAnuncio.setText("Encerrar");
		btnEncerrarAnuncio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int linhaSelecionada = tableAnunciosPublicados.getSelectedRow();

				int idAnuncio = Integer.parseInt(tableAnunciosPublicados.getValueAt(linhaSelecionada, 0).toString());

				Anuncio anuncio = null;
				try {
					anuncio = (Anuncio) anuncioController.getPorId(idAnuncio);

				} catch (Exception e1) {
					e1.printStackTrace();
				}

				anuncio.setStatus("Encerrado");

				try {
					anuncioController.editar(anuncio);
					JOptionPane.showMessageDialog(null, "Anúncio encerrado com sucesso.");

					List<Entidade> listAnuncio = anuncioController.getPorIdInstituicao(instituicao.getId());

					tableAnunciosPublicados.setModel(new AnuncioTableModel(listAnuncio));
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		panelCadAnuncio.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Anuncios"));
		panelCadAnuncio.setMaximumSize(new java.awt.Dimension(1197, 240));
		panelCadAnuncio.setMinimumSize(new java.awt.Dimension(1197, 240));
		panelCadAnuncio.setPreferredSize(new java.awt.Dimension(1197, 240));

		lblTituloCadAnuncio.setText("Título:");

		lblVagasCadAnuncio.setText("Vagas:");

		lblDescricaoCadAnuncio.setText("Descrição:");

		atxtDescricaoCadAnuncio.setColumns(20);
		atxtDescricaoCadAnuncio.setRows(5);
		scrollpaneDescricaoCadAnuncio.setViewportView(atxtDescricaoCadAnuncio);

		btnSalvarCadAnuncio.setIcon(new javax.swing.ImageIcon("img/salvar_16x16.png")); // NOI18N
		btnSalvarCadAnuncio.setText("Salvar");
		btnSalvarCadAnuncio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Funcao funcao = null;
				Anuncio anuncio = null;

				try {
					int linhaSelecionada = tableAnunciosPublicados.getSelectedRow();

					if (linhaSelecionada >= 0) {

						int idAnuncio = Integer
								.parseInt(tableAnunciosPublicados.getValueAt(linhaSelecionada, 0).toString());

						anuncio = (Anuncio) anuncioController.getPorId(idAnuncio);
					}

					if (anuncio == null) {
						funcao = (Funcao) funcaoController.getPorFuncao(cmbTipoServicoAnuncio.getSelectedItem() + "");

						anuncio = new Anuncio(txtTituloCadAnuncio.getText(), atxtDescricaoCadAnuncio.getText(),
								(Integer) spinnerVagasCadAnuncio.getValue(), new Date(), funcao, "Aberto", instituicao);

						btnCadastrarAnuncioAction(anuncio, false);

						List<Entidade> listAnuncio = anuncioController.getPorIdInstituicao(instituicao.getId());

						tableAnunciosPublicados.setModel(new AnuncioTableModel(listAnuncio));
					} else {

						funcao = (Funcao) funcaoController.getPorFuncao(anuncio.getFuncao().getFuncao());

						anuncio.setTitulo(txtTituloCadAnuncio.getText());
						anuncio.setDescricao(atxtDescricaoCadAnuncio.getText());
						anuncio.setFuncao(funcao);
						anuncio.setQtdVagas((Integer) spinnerVagasCadAnuncio.getValue());

						btnCadastrarAnuncioAction(anuncio, true);

						List<Entidade> listAnuncio = anuncioController.getPorIdInstituicao(instituicao.getId());

						tableAnunciosPublicados.setModel(new AnuncioTableModel(listAnuncio));

					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				}
			}

		});

		lblTipoServicoAnuncio.setText("Tipo de Serviço:");

		javax.swing.GroupLayout panelFiltroVoluntariosLayout = new javax.swing.GroupLayout(panelFiltroVoluntarios);
		panelFiltroVoluntariosLayout
				.setHorizontalGroup(panelFiltroVoluntariosLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(panelFiltroVoluntariosLayout.createSequentialGroup().addContainerGap()
								.addGroup(panelFiltroVoluntariosLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNomeFiltroVoluntarios).addComponent(lblEmailFiltroVoluntarios))
						.addGap(54)
						.addGroup(panelFiltroVoluntariosLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtEmailFiltroVoluntarios)
								.addComponent(txtNomeFiltroVoluntarios, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnPesquisarFiltroVoluntarios)
						.addGap(749)));
		panelFiltroVoluntariosLayout.setVerticalGroup(panelFiltroVoluntariosLayout
				.createParallelGroup(Alignment.LEADING)
				.addGroup(panelFiltroVoluntariosLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelFiltroVoluntariosLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelFiltroVoluntariosLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtNomeFiltroVoluntarios, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnPesquisarFiltroVoluntarios, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNomeFiltroVoluntarios))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelFiltroVoluntariosLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEmailFiltroVoluntarios, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmailFiltroVoluntarios))
						.addContainerGap(51, Short.MAX_VALUE)));
		panelFiltroVoluntarios.setLayout(panelFiltroVoluntariosLayout);

		javax.swing.GroupLayout panelVoluntariosLayout = new javax.swing.GroupLayout(panelVoluntarios);
		panelVoluntariosLayout.setHorizontalGroup(panelVoluntariosLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelVoluntariosLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelVoluntariosLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelFiltroVoluntarios, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollpaneVoluntarios, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(84, Short.MAX_VALUE)));
		panelVoluntariosLayout
				.setVerticalGroup(panelVoluntariosLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, panelVoluntariosLayout.createSequentialGroup().addContainerGap()
								.addComponent(panelFiltroVoluntarios, GroupLayout.PREFERRED_SIZE, 136,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollpaneVoluntarios, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(45)));
		panelVoluntarios.setLayout(panelVoluntariosLayout);

		javax.swing.GroupLayout panelAnunciosPublicadosLayout = new javax.swing.GroupLayout(panelAnunciosPublicados);
		panelAnunciosPublicadosLayout.setHorizontalGroup(panelAnunciosPublicadosLayout
				.createParallelGroup(Alignment.LEADING)
				.addGroup(panelAnunciosPublicadosLayout.createSequentialGroup().addGroup(panelAnunciosPublicadosLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(panelAnunciosPublicadosLayout.createSequentialGroup()
								.addComponent(lblFiltroTituloAnunciosPublicados)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtFiltroTituloAnunciosPublicados, GroupLayout.PREFERRED_SIZE, 140,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnPesquisarAnunciosPublicados)
								.addPreferredGap(ComponentPlacement.RELATED, 639, Short.MAX_VALUE)
								.addComponent(btnEditarAnuncio, GroupLayout.PREFERRED_SIZE, 116,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(btnEncerrarAnuncio, GroupLayout.PREFERRED_SIZE, 116,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollpaneAnunciosPublicados, GroupLayout.PREFERRED_SIZE, 1190, Short.MAX_VALUE))
						.addContainerGap()));
		panelAnunciosPublicadosLayout.setVerticalGroup(panelAnunciosPublicadosLayout
				.createParallelGroup(Alignment.LEADING)
				.addGroup(panelAnunciosPublicadosLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelAnunciosPublicadosLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(panelAnunciosPublicadosLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFiltroTituloAnunciosPublicados)
										.addComponent(txtFiltroTituloAnunciosPublicados, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnPesquisarAnunciosPublicados, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(panelAnunciosPublicadosLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnEditarAnuncio, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnEncerrarAnuncio, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(scrollpaneAnunciosPublicados,
								GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(13, Short.MAX_VALUE)));
		panelAnunciosPublicados.setLayout(panelAnunciosPublicadosLayout);

		javax.swing.GroupLayout panelCadAnuncioLayout = new javax.swing.GroupLayout(panelCadAnuncio);
		panelCadAnuncio.setLayout(panelCadAnuncioLayout);
		panelCadAnuncioLayout.setHorizontalGroup(panelCadAnuncioLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadAnuncioLayout.createSequentialGroup()
						.addGroup(panelCadAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(panelCadAnuncioLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(btnSalvarCadAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panelCadAnuncioLayout.createSequentialGroup()
										.addGroup(panelCadAnuncioLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblTituloCadAnuncio).addComponent(lblDescricaoCadAnuncio)
												.addComponent(lblVagasCadAnuncio))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(panelCadAnuncioLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(scrollpaneDescricaoCadAnuncio)
												.addComponent(txtTituloCadAnuncio)
												.addGroup(panelCadAnuncioLayout.createSequentialGroup()
														.addComponent(spinnerVagasCadAnuncio,
																javax.swing.GroupLayout.PREFERRED_SIZE, 56,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(lblTipoServicoAnuncio)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(cmbTipoServicoAnuncio,
																javax.swing.GroupLayout.PREFERRED_SIZE, 210,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 81, Short.MAX_VALUE)))))
						.addGap(687, 687, 687)));
		panelCadAnuncioLayout.setVerticalGroup(panelCadAnuncioLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelCadAnuncioLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(panelCadAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTituloCadAnuncio).addComponent(txtTituloCadAnuncio,
										javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelCadAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cmbTipoServicoAnuncio, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(panelCadAnuncioLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblVagasCadAnuncio)
										.addComponent(spinnerVagasCadAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE,
												22, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTipoServicoAnuncio)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelCadAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblDescricaoCadAnuncio).addComponent(scrollpaneDescricaoCadAnuncio,
										javax.swing.GroupLayout.PREFERRED_SIZE, 127,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnSalvarCadAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)));

		javax.swing.GroupLayout panelAnuncioLayout = new javax.swing.GroupLayout(panelAnuncio);
		panelAnuncioLayout.setHorizontalGroup(panelAnuncioLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelAnuncioLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelAnuncioLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panelAnunciosPublicados, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panelCadAnuncio, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1212,
										Short.MAX_VALUE))
						.addContainerGap(69, Short.MAX_VALUE)));
		panelAnuncioLayout
				.setVerticalGroup(panelAnuncioLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(panelAnuncioLayout.createSequentialGroup().addContainerGap()
								.addComponent(panelCadAnuncio, GroupLayout.PREFERRED_SIZE, 256,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panelAnunciosPublicados, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panelAnuncio.setLayout(panelAnuncioLayout);

		menuPrincipalInstituicao.addTab("Anúncio", new javax.swing.ImageIcon("img/aviso_16x16.png"), panelAnuncio); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(menuPrincipalInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				menuPrincipalInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mntmDeslogar = new JMenuItem("");
		mntmDeslogar.setHorizontalAlignment(SwingConstants.TRAILING);
		mntmDeslogar.setIcon(new ImageIcon("img/power_16x16.png"));
		mntmDeslogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int opcao = JOptionPane.showConfirmDialog(null, "Deseja encerrar o sistema?");

				if (opcao == 0) {
					dispose();
					LoginUI loginUI = new LoginUI();
					loginUI.setVisible(true);

				}

			}
		});
		menuBar.add(mntmDeslogar);
	}

	protected void btnCadastrarAnuncioAction(Anuncio anuncio, boolean flagEditar) throws Exception {

		if (flagEditar) {
			anuncioController.editar(anuncio);
			JOptionPane.showMessageDialog(null, "Anúncio editado com sucesso.");
		} else {
			anuncioController.salvar(anuncio);
			JOptionPane.showMessageDialog(null, "Anúncio salvo com sucesso.");
		}

		txtTituloCadAnuncio.setText("");
		spinnerVagasCadAnuncio.setValue(0);
		atxtDescricaoCadAnuncio.setText("");
		cmbTipoServicoAnuncio.setSelectedIndex(0);

	}

	/**
	 * Método utilizado pelo botão de salvar do perfil da instituição
	 * 
	 * @param instituicao
	 * @param usuario
	 * @throws Exception
	 */
	public void btnSalvarAction(Usuario usuario, Instituicao instituicao) throws Exception {

		String nome = txtNome.getText();
		String razaoSocial = txtRazaoSocial.getText();
		String cnpj = txtCnpj.getText();
		String endereco = txtEndereco.getText();
		String site = txtSite.getText();
		String email = txtEmail.getText();
		String telefone = txtTelefone.getText();
		String responsavel = txtResponsavel.getText();
		String observacoes = atxtObservacoes.getText();

		instituicao.setNome(nome);
		instituicao.setRazaoSocial(razaoSocial);
		instituicao.setCnpj(cnpj);
		instituicao.setEndereco(endereco);
		instituicao.setSite(site);
		instituicao.setEmail(email);
		instituicao.setTelefone(telefone);
		instituicao.setResponsavel(responsavel);
		instituicao.setObservacoes(observacoes);

		controller.editar(instituicao);

		JOptionPane.showMessageDialog(null, "Instituição editada com sucesso.");

		desabilitaCampos();

	}

	/**
	 * Método que desabilita todos os campos da tela de perfil da instituição.
	 */
	private void desabilitaCampos() {
		txtNome.setEnabled(false);
		txtCnpj.setEnabled(false);
		txtEndereco.setEnabled(false);
		txtSite.setEnabled(false);
		txtEmail.setEnabled(false);
		atxtObservacoes.setEnabled(false);
		txtTelefone.setEnabled(false);
		txtRazaoSocial.setEnabled(false);
		txtResponsavel.setEnabled(false);
	}

	/**
	 * Método que executa a ação do botão pesquisar do filtro da tela de
	 * voluntários do perfil instituição
	 * 
	 * @param nome
	 * @param email
	 * @param tipoServico
	 * @return
	 * @throws Exception
	 */
	private List<Entidade> btnPesquisarVoluntarioAction(String nome, String email) throws Exception {

		VoluntarioController voluntarioController = new VoluntarioController();
		StringBuilder sql = new StringBuilder();

		if ((nome == null || nome.equals("")) && (email == null || email.equals(""))) {
			sql.append(
					"SELECT v.id, v.nome, v.telefone, v.cpf, v.endereco, v.email, v.dataNasc, v.idUsuario, v.sexo, v.estadoCivil, v.complemento, v.celular, v.informacoesComplementares FROM voluntario v");

		} else {
			sql.append(
					"SELECT v.id, v.nome, v.telefone, v.cpf, v.endereco, v.email, v.dataNasc, v.idUsuario, v.sexo, v.estadoCivil, v.complemento, v.celular, v.informacoesComplementares FROM voluntario v WHERE");

			if (nome != null) {
				if (!nome.trim().equals("")) {
					sql.append(" nome LIKE '%" + nome + "%'");
				}
			}

			if (email != null) {
				if (!email.trim().equals("")) {
					if (nome != null) {
						if (!nome.trim().equals("")) {
							sql.append(" AND");
						}
					}
					sql.append(" email LIKE '%" + email + "%'");
				}

			}

		}

//		System.out.println("PrincipalInstituicao\nSQL BTN PESQUISA: " + sql.toString());

		List<Entidade> listVoluntarios = voluntarioController.pesquisarVoluntario(sql.toString());

		return listVoluntarios;

	}

}
