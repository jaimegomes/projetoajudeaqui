/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.ajudeaqui.view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.senai.sc.ajudeaqui.controller.InstituicaoController;
import br.senai.sc.es4dof.dao.InstituicaoDAO;
import br.senai.sc.es4dof.model.Instituicao;
import br.senai.sc.es4dof.model.Usuario;

/**
 *
 * @author Jaime Gomes
 */
public class PrincipalInstituicaoUI extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JTextArea atxtDescricaoCadAnuncio;
	private javax.swing.JTextArea atxtObservacoes;
	private javax.swing.JButton btnEditarAnuncio;
	private javax.swing.JButton btnEditarDadosInstituicao;
	private javax.swing.JButton btnExcluirAnuncio;
	private javax.swing.JButton btnFiltroVoluntarios;
	private javax.swing.JButton btnGerarRelatorioVoluntarios;
	private javax.swing.JButton btnPesquisarAnunciosPublicados;
	private javax.swing.JButton btnPesquisarFiltroVoluntarios;
	private javax.swing.JButton btnSalvarCadAnuncio;
	private javax.swing.JButton btnSalvarDadosInstituicao;
	private javax.swing.JComboBox cmbTipoServicoAnuncio;
	private javax.swing.JComboBox cmbTipoServicoFiltroVoluntarios;
	private javax.swing.JLabel lblTipoServicoFiltroVoluntario;
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
	private javax.swing.JTextField txtCnpj;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtEmailFiltroVoluntarios;
	private javax.swing.JTextField txtEndereco;
	private javax.swing.JTextField txtFiltroTituloAnunciosPublicados;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtNomeFiltroVoluntarios;
	private javax.swing.JTextField txtRazaoSocial;
	private javax.swing.JTextField txtResponsavel;
	private javax.swing.JTextField txtSite;
	private javax.swing.JTextField txtTelefone;
	private javax.swing.JTextField txtTituloCadAnuncio;
	// End of variables declaration

	private InstituicaoController controller = new InstituicaoController();

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

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
					PrincipalInstituicaoUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					PrincipalInstituicaoUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					PrincipalInstituicaoUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					PrincipalInstituicaoUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
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
	private void initComponents(Usuario usuario) {

		menuPrincipalInstituicao = new javax.swing.JTabbedPane();
		panelInstituicao = new javax.swing.JPanel();
		panelDadosInstituicao = new javax.swing.JPanel();
		btnSalvarDadosInstituicao = new javax.swing.JButton();
		txtNome = new javax.swing.JTextField();
		txtCnpj = new javax.swing.JTextField();
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
		txtTelefone = new javax.swing.JTextField();
		txtRazaoSocial = new javax.swing.JTextField();
		lblSite = new javax.swing.JLabel();
		lblNome = new javax.swing.JLabel();
		txtResponsavel = new javax.swing.JTextField();
		btnEditarDadosInstituicao = new javax.swing.JButton();
		panelVoluntarios = new javax.swing.JPanel();
		panelFiltroVoluntarios = new javax.swing.JPanel();
		lblNomeFiltroVoluntarios = new javax.swing.JLabel();
		lblEmailFiltroVoluntarios = new javax.swing.JLabel();
		txtNomeFiltroVoluntarios = new javax.swing.JTextField();
		txtEmailFiltroVoluntarios = new javax.swing.JTextField();
		btnPesquisarFiltroVoluntarios = new javax.swing.JButton();
		lblTipoServicoFiltroVoluntario = new javax.swing.JLabel();
		cmbTipoServicoFiltroVoluntarios = new javax.swing.JComboBox();
		btnFiltroVoluntarios = new javax.swing.JButton();
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
		btnExcluirAnuncio = new javax.swing.JButton();
		btnGerarRelatorioVoluntarios = new javax.swing.JButton();
		panelCadAnuncio = new javax.swing.JPanel();
		lblTituloCadAnuncio = new javax.swing.JLabel();
		spinnerVagasCadAnuncio = new javax.swing.JSpinner();
		lblVagasCadAnuncio = new javax.swing.JLabel();
		txtTituloCadAnuncio = new javax.swing.JTextField();
		lblDescricaoCadAnuncio = new javax.swing.JLabel();
		scrollpaneDescricaoCadAnuncio = new javax.swing.JScrollPane();
		atxtDescricaoCadAnuncio = new javax.swing.JTextArea();
		btnSalvarCadAnuncio = new javax.swing.JButton();
		lblTipoServicoAnuncio = new javax.swing.JLabel();
		cmbTipoServicoAnuncio = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(":: Sistema do Volunt�rio Ajude Aqui ::");
		setMaximumSize(new java.awt.Dimension(1300, 700));
		setMinimumSize(new java.awt.Dimension(1300, 700));
		setName("frameInstituicao"); // NOI18N

		menuPrincipalInstituicao.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		menuPrincipalInstituicao.setMaximumSize(new java.awt.Dimension(1300,
				700));
		menuPrincipalInstituicao.setMinimumSize(new java.awt.Dimension(1300,
				700));
		menuPrincipalInstituicao.setPreferredSize(new java.awt.Dimension(1300,
				700));

		panelInstituicao.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		panelInstituicao.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelInstituicao.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelInstituicao.setPreferredSize(new java.awt.Dimension(1110, 700));

		panelDadosInstituicao.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Dados da Institui��o"));

		btnSalvarDadosInstituicao.setIcon(new javax.swing.ImageIcon(
				"img/salvar_16x16.png")); // NOI18N
		btnSalvarDadosInstituicao.setText("Salvar");

		lblRazaoSocial.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblRazaoSocial.setText("Raz�o Social:");

		lblTelefone.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTelefone.setText("Telefone:");

		lblEndereco.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblEndereco.setText("Endere�o:");

		lblCnpj.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblCnpj.setText("CNPJ:");

		lblEmail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblEmail.setText("Email:");

		lblObservacoes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblObservacoes.setText("Observa��es:");

		lblResponsavel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblResponsavel.setText("Respons�vel:");

		atxtObservacoes.setColumns(20);
		atxtObservacoes.setRows(5);
		scrollpaneObservacoes.setViewportView(atxtObservacoes);

		lblSite.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblSite.setText("Site:");

		lblNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblNome.setText("Nome:");

		btnEditarDadosInstituicao.setIcon(new javax.swing.ImageIcon(
				"img/editar_usuario_16x16.png")); // NOI18N
		btnEditarDadosInstituicao.setText("Editar");

		/**
		 * Cria a entidade Institui��o a partir do usu�rio logado
		 */
		Instituicao inst = null;
		try {
			inst = (Instituicao) controller.getPorIdUsuario(usuario.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		/**
		 * No caso sempre vai ser diferente de nulo pois ao criar o usu�rio e
		 * escolher o perfil de institui��o ele j� cria um registro na tabela
		 * institui��o.
		 * 
		 * Verifica todos os campos, caso sejam diferentes de nulo ele preenche
		 * os dados da institui��o.
		 */
		if (inst != null) {

			if (inst.getNome() != null)
				txtNome.setText(inst.getNome());

			if (inst.getCnpj() != null)
				txtCnpj.setText(inst.getCnpj());

			if (inst.getEmail() != null)
				txtEmail.setText(inst.getEmail());

			if (inst.getEndereco() != null)
				txtEndereco.setText(inst.getEndereco());

			if (inst.getRazaoSocial() != null)
				txtRazaoSocial.setText(inst.getRazaoSocial());

			if (inst.getSite() != null)
				txtSite.setText(inst.getSite());

			if (inst.getTelefone() != null)
				txtTelefone.setText(inst.getTelefone());

			if (inst.getTelefone() != null)
				txtResponsavel.setText(inst.getResponsavel());

			if (inst.getObservacoes() != null)
				atxtObservacoes.setText(inst.getObservacoes());

		}

		javax.swing.GroupLayout panelDadosInstituicaoLayout = new javax.swing.GroupLayout(
				panelDadosInstituicao);
		panelDadosInstituicaoLayout
				.setHorizontalGroup(panelDadosInstituicaoLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelDadosInstituicaoLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																panelDadosInstituicaoLayout
																		.createSequentialGroup()
																		.addComponent(
																				btnEditarDadosInstituicao,
																				GroupLayout.PREFERRED_SIZE,
																				116,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				btnSalvarDadosInstituicao,
																				GroupLayout.PREFERRED_SIZE,
																				116,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																panelDadosInstituicaoLayout
																		.createSequentialGroup()
																		.addGroup(
																				panelDadosInstituicaoLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								panelDadosInstituicaoLayout
																										.createSequentialGroup()
																										.addGroup(
																												panelDadosInstituicaoLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																lblNome)
																														.addComponent(
																																lblRazaoSocial))
																										.addGap(5))
																						.addComponent(
																								lblSite)
																						.addComponent(
																								lblEndereco)
																						.addComponent(
																								lblTelefone)
																						.addComponent(
																								lblEmail)
																						.addComponent(
																								lblCnpj)
																						.addComponent(
																								lblObservacoes)
																						.addComponent(
																								lblResponsavel))
																		.addGap(8)
																		.addGroup(
																				panelDadosInstituicaoLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								Alignment.TRAILING,
																								panelDadosInstituicaoLayout
																										.createParallelGroup(
																												Alignment.LEADING)
																										.addComponent(
																												txtNome,
																												GroupLayout.PREFERRED_SIZE,
																												353,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												txtSite,
																												GroupLayout.PREFERRED_SIZE,
																												230,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												txtEndereco,
																												GroupLayout.PREFERRED_SIZE,
																												353,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												txtTelefone,
																												GroupLayout.PREFERRED_SIZE,
																												139,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												txtEmail,
																												GroupLayout.PREFERRED_SIZE,
																												230,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												txtCnpj,
																												GroupLayout.PREFERRED_SIZE,
																												141,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												txtRazaoSocial,
																												GroupLayout.PREFERRED_SIZE,
																												353,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												txtResponsavel,
																												GroupLayout.PREFERRED_SIZE,
																												230,
																												GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								scrollpaneObservacoes,
																								Alignment.TRAILING,
																								GroupLayout.PREFERRED_SIZE,
																								353,
																								GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(86, Short.MAX_VALUE)));
		panelDadosInstituicaoLayout
				.setVerticalGroup(panelDadosInstituicaoLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelDadosInstituicaoLayout
										.createSequentialGroup()
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblNome)
														.addComponent(
																txtNome,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																panelDadosInstituicaoLayout
																		.createSequentialGroup()
																		.addComponent(
																				txtRazaoSocial,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				panelDadosInstituicaoLayout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								txtCnpj,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								lblCnpj)))
														.addComponent(
																lblRazaoSocial,
																Alignment.LEADING))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																txtEmail,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblEmail))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																txtTelefone,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblTelefone))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																txtEndereco,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblEndereco))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																txtSite,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblSite))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												panelDadosInstituicaoLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelDadosInstituicaoLayout
																		.createSequentialGroup()
																		.addComponent(
																				txtResponsavel,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				scrollpaneObservacoes,
																				GroupLayout.PREFERRED_SIZE,
																				127,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				panelDadosInstituicaoLayout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								btnSalvarDadosInstituicao,
																								GroupLayout.PREFERRED_SIZE,
																								19,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								btnEditarDadosInstituicao,
																								GroupLayout.PREFERRED_SIZE,
																								19,
																								GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																panelDadosInstituicaoLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblResponsavel)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblObservacoes)))
										.addContainerGap(54, Short.MAX_VALUE)));
		panelDadosInstituicao.setLayout(panelDadosInstituicaoLayout);

		javax.swing.GroupLayout panelInstituicaoLayout = new javax.swing.GroupLayout(
				panelInstituicao);
		panelInstituicao.setLayout(panelInstituicaoLayout);
		panelInstituicaoLayout.setHorizontalGroup(panelInstituicaoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						panelInstituicaoLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(panelDadosInstituicao,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										545,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(734, Short.MAX_VALUE)));
		panelInstituicaoLayout.setVerticalGroup(panelInstituicaoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						panelInstituicaoLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(panelDadosInstituicao,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(259, Short.MAX_VALUE)));

		menuPrincipalInstituicao.addTab("Institui��o",
				new javax.swing.ImageIcon("img/home_16x16.png.png"),
				panelInstituicao); // NOI18N

		panelVoluntarios.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		panelVoluntarios.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelVoluntarios.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelVoluntarios.setPreferredSize(new java.awt.Dimension(1110, 700));

		panelFiltroVoluntarios.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Filtro de Pesquisa"));
		panelFiltroVoluntarios
				.setMaximumSize(new java.awt.Dimension(1197, 115));
		panelFiltroVoluntarios
				.setMinimumSize(new java.awt.Dimension(1197, 115));
		panelFiltroVoluntarios.setPreferredSize(new java.awt.Dimension(1197,
				115));

		lblNomeFiltroVoluntarios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblNomeFiltroVoluntarios.setText("Nome:");

		lblEmailFiltroVoluntarios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblEmailFiltroVoluntarios.setText("Email:");

		btnPesquisarFiltroVoluntarios.setIcon(new javax.swing.ImageIcon(
				"img/lupa_16x16.png")); // NOI18N
		btnPesquisarFiltroVoluntarios.setText("Pesquisar");

		lblTipoServicoFiltroVoluntario.setFont(new java.awt.Font("Dialog", 0,
				12)); // NOI18N
		lblTipoServicoFiltroVoluntario.setText("Tipo de Servi�o:");

		cmbTipoServicoFiltroVoluntarios
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"Item 1", "Item 2", "Item 3", "Item 4" }));

		btnFiltroVoluntarios.setIcon(new javax.swing.ImageIcon(
				"img/agenda_16x16.png")); // NOI18N
		btnFiltroVoluntarios.setText("Gerar Relat�rio");

		javax.swing.GroupLayout panelFiltroVoluntariosLayout = new javax.swing.GroupLayout(
				panelFiltroVoluntarios);
		panelFiltroVoluntariosLayout
				.setHorizontalGroup(panelFiltroVoluntariosLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								panelFiltroVoluntariosLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelFiltroVoluntariosLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblTipoServicoFiltroVoluntario)
														.addComponent(
																lblNomeFiltroVoluntarios)
														.addComponent(
																lblEmailFiltroVoluntarios))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroVoluntariosLayout
														.createParallelGroup(
																Alignment.LEADING,
																false)
														.addComponent(
																txtNomeFiltroVoluntarios,
																Alignment.TRAILING)
														.addComponent(
																txtEmailFiltroVoluntarios,
																Alignment.TRAILING)
														.addComponent(
																cmbTipoServicoFiltroVoluntarios,
																0, 258,
																Short.MAX_VALUE))
										.addGroup(
												panelFiltroVoluntariosLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																panelFiltroVoluntariosLayout
																		.createSequentialGroup()
																		.addGap(28)
																		.addComponent(
																				btnPesquisarFiltroVoluntarios)
																		.addContainerGap(
																				719,
																				Short.MAX_VALUE))
														.addGroup(
																panelFiltroVoluntariosLayout
																		.createSequentialGroup()
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnFiltroVoluntarios)
																		.addContainerGap()))));
		panelFiltroVoluntariosLayout
				.setVerticalGroup(panelFiltroVoluntariosLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelFiltroVoluntariosLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelFiltroVoluntariosLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelFiltroVoluntariosLayout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				txtNomeFiltroVoluntarios,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				btnPesquisarFiltroVoluntarios,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																lblNomeFiltroVoluntarios))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroVoluntariosLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																txtEmailFiltroVoluntarios,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblEmailFiltroVoluntarios))
										.addGap(7)
										.addGroup(
												panelFiltroVoluntariosLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																cmbTipoServicoFiltroVoluntarios,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblTipoServicoFiltroVoluntario))
										.addContainerGap(28, Short.MAX_VALUE))
						.addGroup(
								Alignment.TRAILING,
								panelFiltroVoluntariosLayout
										.createSequentialGroup()
										.addContainerGap(85, Short.MAX_VALUE)
										.addComponent(btnFiltroVoluntarios,
												GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		panelFiltroVoluntarios.setLayout(panelFiltroVoluntariosLayout);

		scrollpaneVoluntarios.setMaximumSize(new java.awt.Dimension(1197, 520));
		scrollpaneVoluntarios.setMinimumSize(new java.awt.Dimension(1197, 520));
		scrollpaneVoluntarios
				.setPreferredSize(new java.awt.Dimension(1197, 520));

		tableVoluntarios.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "Nome", "Data Nascimento", "Endere�o",
						"Celular", "Email" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tableVoluntarios.setAutoscrolls(false);
		tableVoluntarios.setMaximumSize(new java.awt.Dimension(1197, 520));
		tableVoluntarios.setMinimumSize(new java.awt.Dimension(1197, 520));
		tableVoluntarios.setPreferredSize(new java.awt.Dimension(1197, 520));
		scrollpaneVoluntarios.setViewportView(tableVoluntarios);

		javax.swing.GroupLayout panelVoluntariosLayout = new javax.swing.GroupLayout(
				panelVoluntarios);
		panelVoluntariosLayout
				.setHorizontalGroup(panelVoluntariosLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelVoluntariosLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelVoluntariosLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																panelFiltroVoluntarios,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																scrollpaneVoluntarios,
																Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(84, Short.MAX_VALUE)));
		panelVoluntariosLayout
				.setVerticalGroup(panelVoluntariosLayout.createParallelGroup(
						Alignment.LEADING).addGroup(
						Alignment.TRAILING,
						panelVoluntariosLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(panelFiltroVoluntarios,
										GroupLayout.PREFERRED_SIZE, 136,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED,
										GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(scrollpaneVoluntarios,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE).addGap(45)));
		panelVoluntarios.setLayout(panelVoluntariosLayout);

		menuPrincipalInstituicao.addTab("Volunt�rios",
				new javax.swing.ImageIcon("img/usuarios_16x16.png"),
				panelVoluntarios);

		panelAnuncio.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		panelAnuncio.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelAnuncio.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelAnuncio.setPreferredSize(new java.awt.Dimension(1110, 700));
		panelAnuncio.setRequestFocusEnabled(false);

		panelAnunciosPublicados.setBorder(javax.swing.BorderFactory
				.createTitledBorder("An�ncios Publicados"));
		panelAnunciosPublicados
				.setMaximumSize(new java.awt.Dimension(1197, 399));
		panelAnunciosPublicados
				.setMinimumSize(new java.awt.Dimension(1197, 399));
		panelAnunciosPublicados.setPreferredSize(new java.awt.Dimension(1197,
				399));

		scrollpaneAnunciosPublicados.setMaximumSize(new java.awt.Dimension(
				1197, 346));
		scrollpaneAnunciosPublicados.setMinimumSize(new java.awt.Dimension(
				1197, 346));
		scrollpaneAnunciosPublicados.setPreferredSize(new java.awt.Dimension(
				1197, 346));

		tableAnunciosPublicados
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] {

						}, new String[] { "T�tulo", "Vagas Dispon�veis",
								"Descri��o" }) {
					Class[] types = new Class[] { java.lang.String.class,
							java.lang.Integer.class, java.lang.String.class };

					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}
				});
		tableAnunciosPublicados
				.setMaximumSize(new java.awt.Dimension(1197, 347));
		tableAnunciosPublicados
				.setMinimumSize(new java.awt.Dimension(1197, 347));
		tableAnunciosPublicados.setPreferredSize(new java.awt.Dimension(1197,
				347));
		tableAnunciosPublicados.setRowHeight(30);
		scrollpaneAnunciosPublicados.setViewportView(tableAnunciosPublicados);

		btnPesquisarAnunciosPublicados.setIcon(new javax.swing.ImageIcon(
				"img/lupa_16x16.png")); // NOI18N
		btnPesquisarAnunciosPublicados.setText("Pesquisar");

		lblFiltroTituloAnunciosPublicados.setFont(new java.awt.Font("Dialog",
				0, 12)); // NOI18N
		lblFiltroTituloAnunciosPublicados.setText("T�tulo:");

		btnEditarAnuncio.setIcon(new javax.swing.ImageIcon(
				"img/editar_usuario_16x16.png")); // NOI18N
		btnEditarAnuncio.setText("Editar");

		btnExcluirAnuncio.setIcon(new javax.swing.ImageIcon(
				"img/cancelar_16x16.png")); // NOI18N
		btnExcluirAnuncio.setText("Excluir");

		btnGerarRelatorioVoluntarios.setIcon(new javax.swing.ImageIcon(
				"img/agenda_16x16.png")); // NOI18N
		btnGerarRelatorioVoluntarios.setText("Gerar Relat�rio");

		javax.swing.GroupLayout panelAnunciosPublicadosLayout = new javax.swing.GroupLayout(
				panelAnunciosPublicados);
		panelAnunciosPublicadosLayout
				.setHorizontalGroup(panelAnunciosPublicadosLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelAnunciosPublicadosLayout
										.createSequentialGroup()
										.addGroup(
												panelAnunciosPublicadosLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelAnunciosPublicadosLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblFiltroTituloAnunciosPublicados)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				txtFiltroTituloAnunciosPublicados,
																				GroupLayout.PREFERRED_SIZE,
																				140,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnPesquisarAnunciosPublicados)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				555,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnGerarRelatorioVoluntarios)
																		.addGap(18)
																		.addComponent(
																				btnEditarAnuncio,
																				GroupLayout.PREFERRED_SIZE,
																				116,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(
																				btnExcluirAnuncio,
																				GroupLayout.PREFERRED_SIZE,
																				116,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																scrollpaneAnunciosPublicados,
																GroupLayout.PREFERRED_SIZE,
																1190,
																Short.MAX_VALUE))
										.addContainerGap()));
		panelAnunciosPublicadosLayout
				.setVerticalGroup(panelAnunciosPublicadosLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelAnunciosPublicadosLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelAnunciosPublicadosLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																panelAnunciosPublicadosLayout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				lblFiltroTituloAnunciosPublicados)
																		.addComponent(
																				txtFiltroTituloAnunciosPublicados,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				btnPesquisarAnunciosPublicados,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																panelAnunciosPublicadosLayout
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addComponent(
																				btnGerarRelatorioVoluntarios,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				panelAnunciosPublicadosLayout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								btnEditarAnuncio,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								btnExcluirAnuncio,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(
												scrollpaneAnunciosPublicados,
												GroupLayout.PREFERRED_SIZE,
												323, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(19, Short.MAX_VALUE)));
		panelAnunciosPublicados.setLayout(panelAnunciosPublicadosLayout);

		panelCadAnuncio.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Cadastro de Anuncios"));
		panelCadAnuncio.setMaximumSize(new java.awt.Dimension(1197, 240));
		panelCadAnuncio.setMinimumSize(new java.awt.Dimension(1197, 240));
		panelCadAnuncio.setPreferredSize(new java.awt.Dimension(1197, 240));

		lblTituloCadAnuncio.setText("T�tulo:");

		lblVagasCadAnuncio.setText("Vagas:");

		lblDescricaoCadAnuncio.setText("Descri��o:");

		atxtDescricaoCadAnuncio.setColumns(20);
		atxtDescricaoCadAnuncio.setRows(5);
		scrollpaneDescricaoCadAnuncio.setViewportView(atxtDescricaoCadAnuncio);

		btnSalvarCadAnuncio.setIcon(new javax.swing.ImageIcon(
				"img/salvar_16x16.png")); // NOI18N
		btnSalvarCadAnuncio.setText("Salvar");

		lblTipoServicoAnuncio.setText("Tipo de Servi�o:");

		cmbTipoServicoAnuncio.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		javax.swing.GroupLayout panelCadAnuncioLayout = new javax.swing.GroupLayout(
				panelCadAnuncio);
		panelCadAnuncio.setLayout(panelCadAnuncioLayout);
		panelCadAnuncioLayout
				.setHorizontalGroup(panelCadAnuncioLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								panelCadAnuncioLayout
										.createSequentialGroup()
										.addGroup(
												panelCadAnuncioLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																panelCadAnuncioLayout
																		.createSequentialGroup()
																		.addGap(0,
																				0,
																				Short.MAX_VALUE)
																		.addComponent(
																				btnSalvarCadAnuncio,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				116,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																panelCadAnuncioLayout
																		.createSequentialGroup()
																		.addGroup(
																				panelCadAnuncioLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								lblTituloCadAnuncio)
																						.addComponent(
																								lblDescricaoCadAnuncio)
																						.addComponent(
																								lblVagasCadAnuncio))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				panelCadAnuncioLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								scrollpaneDescricaoCadAnuncio)
																						.addComponent(
																								txtTituloCadAnuncio)
																						.addGroup(
																								panelCadAnuncioLayout
																										.createSequentialGroup()
																										.addComponent(
																												spinnerVagasCadAnuncio,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												56,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												lblTipoServicoAnuncio)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												cmbTipoServicoAnuncio,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												210,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(0,
																												81,
																												Short.MAX_VALUE)))))
										.addGap(687, 687, 687)));
		panelCadAnuncioLayout
				.setVerticalGroup(panelCadAnuncioLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelCadAnuncioLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												panelCadAnuncioLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lblTituloCadAnuncio)
														.addComponent(
																txtTituloCadAnuncio,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelCadAnuncioLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																cmbTipoServicoAnuncio,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																panelCadAnuncioLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				lblVagasCadAnuncio)
																		.addComponent(
																				spinnerVagasCadAnuncio,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				22,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblTipoServicoAnuncio)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelCadAnuncioLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																lblDescricaoCadAnuncio)
														.addComponent(
																scrollpaneDescricaoCadAnuncio,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																127,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												btnSalvarCadAnuncio,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												22,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(40, 40, 40)));

		javax.swing.GroupLayout panelAnuncioLayout = new javax.swing.GroupLayout(
				panelAnuncio);
		panelAnuncioLayout
				.setHorizontalGroup(panelAnuncioLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelAnuncioLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelAnuncioLayout
														.createParallelGroup(
																Alignment.TRAILING,
																false)
														.addComponent(
																panelAnunciosPublicados,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																panelCadAnuncio,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																1212,
																Short.MAX_VALUE))
										.addContainerGap(69, Short.MAX_VALUE)));
		panelAnuncioLayout.setVerticalGroup(panelAnuncioLayout
				.createParallelGroup(Alignment.LEADING).addGroup(
						panelAnuncioLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(panelCadAnuncio,
										GroupLayout.PREFERRED_SIZE, 256,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panelAnunciosPublicados,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		panelAnuncio.setLayout(panelAnuncioLayout);

		menuPrincipalInstituicao.addTab("An�ncio", new javax.swing.ImageIcon(
				"img/aviso_16x16.png"), panelAnuncio); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(menuPrincipalInstituicao,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				menuPrincipalInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		menuPrincipalInstituicao.getAccessibleContext().setAccessibleName("");

		pack();
	}

	/**
	 * M�todo utilizado pelos bot�es de salvar e editar da tela de perfil da
	 * institui��o
	 * 
	 * @param instituicao
	 * @param usuario
	 * @throws Exception
	 */
	public void salvarEditarAction(Instituicao instituicao, Usuario usuario)
			throws Exception {

		if (instituicao == null) {

			String nome = txtNome.getText();
			String razaoSocial = txtRazaoSocial.getText();
			String cnpj = txtCnpj.getText();
			String endereco = txtEndereco.getText();
			String site = txtSite.getText();
			String email = txtEmail.getText();
			String telefone = txtTelefone.getText();
			String responsavel = txtResponsavel.getText();
			String observacoes = atxtObservacoes.getText();

			Instituicao inst = new Instituicao(razaoSocial, cnpj, nome, email,
					telefone, endereco, site, responsavel, observacoes, usuario);

			InstituicaoDAO dao = new InstituicaoDAO();

			dao.salvar(inst);

		} else {

		}

	}
}
