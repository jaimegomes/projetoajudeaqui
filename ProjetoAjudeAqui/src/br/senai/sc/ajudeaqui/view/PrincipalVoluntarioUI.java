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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.controller.AnuncioController;
import br.senai.sc.ajudeaqui.controller.FuncaoController;
import br.senai.sc.ajudeaqui.controller.FuncaoVoluntarioController;
import br.senai.sc.ajudeaqui.controller.HorarioController;
import br.senai.sc.ajudeaqui.controller.HorarioVoluntarioController;
import br.senai.sc.ajudeaqui.controller.InstituicaoController;
import br.senai.sc.ajudeaqui.controller.VoluntarioAnuncioController;
import br.senai.sc.ajudeaqui.controller.VoluntarioController;
import br.senai.sc.ajudeaqui.model.Anuncio;
import br.senai.sc.ajudeaqui.model.Funcao;
import br.senai.sc.ajudeaqui.model.FuncaoVoluntario;
import br.senai.sc.ajudeaqui.model.Horario;
import br.senai.sc.ajudeaqui.model.HorarioVoluntario;
import br.senai.sc.ajudeaqui.model.Instituicao;
import br.senai.sc.ajudeaqui.model.Usuario;
import br.senai.sc.ajudeaqui.model.Voluntario;
import br.senai.sc.ajudeaqui.model.VoluntarioAnuncio;
import br.senai.sc.ajudeaqui.tablemodel.AnuncioTableModel;

/**
 * Classe que contém a tela principal do perfil de voluntário
 * 
 * @author Jaime Gomes
 *
 */
@SuppressWarnings("rawtypes")
public class PrincipalVoluntarioUI extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JTextArea atxtInfoComplementares;
	private javax.swing.JButton btnAddAreaInteresse;
	private javax.swing.JButton btnAddHorario;
	private javax.swing.JButton btnHorariosDisponiveis;
	private javax.swing.JButton btnAreasInteresse;
	private javax.swing.JButton btnEditarDadosPerfil;
	private javax.swing.JButton btnPesquisarFiltroVagas;
	private javax.swing.JButton btnGerarRelatorio;
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
	private javax.swing.JLabel lblCelular;
	private javax.swing.JLabel lblComplemento;
	private javax.swing.JLabel lblCpf;
	private javax.swing.JLabel lblDataNascimento;
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
	private List<String> listHorarios;
	private List<String> listAreasInteresse;

	private VoluntarioController voluntarioController = new VoluntarioController();
	private FuncaoController funcaoController = new FuncaoController();
	private InstituicaoController instituicaoController = new InstituicaoController();
	private HorarioController horarioController;
	private HorarioVoluntarioController horarioVolController;
	private AnuncioController anuncioController = new AnuncioController();

	private Voluntario vol = new Voluntario();
	private JMenuBar menuBar;
	private JMenuItem mntmDeslogar;

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
		panelVagas = new javax.swing.JPanel();
		panelFiltroVagas = new javax.swing.JPanel();
		lblTituloFiltroVagas = new javax.swing.JLabel();
		lblInstituicaoFiltroVagas = new javax.swing.JLabel();
		txtTituloFiltroVagas = new javax.swing.JTextField();
		cmbInstituicaoFiltroVagas = new javax.swing.JComboBox();
		btnPesquisarFiltroVagas = new javax.swing.JButton();
		lblTipoServicoVagas = new javax.swing.JLabel();
		cmbTipoServicoVagas = new javax.swing.JComboBox();
		btnGerarRelatorio = new javax.swing.JButton();
		scrollpaneVagas = new javax.swing.JScrollPane();
		tableVagas = new javax.swing.JTable();
		panelPerfil = new javax.swing.JPanel();
		btnSalvarDadosPerfil = new javax.swing.JButton();
		btnEditarDadosPerfil = new javax.swing.JButton();
		panelDadosPessoais = new javax.swing.JPanel();
		txtComplemento = new javax.swing.JTextField();
		lblCelular = new javax.swing.JLabel();
		lblNome = new javax.swing.JLabel();
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 12));
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
		dateChooserDataNascimento = new JDateChooser();

		desabilitarCampos();

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

		try {

			cmbAreasInteresse.addItem("");
			for (Entidade ent : funcaoController.listar()) {
				Funcao funcao = (Funcao) ent;

				cmbAreasInteresse.addItem(funcao.getFuncao());

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		panelVagas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		panelVagas.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelVagas.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelVagas.setPreferredSize(new java.awt.Dimension(1110, 700));

		panelFiltroVagas.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro de Pesquisa"));
		panelFiltroVagas.setMaximumSize(new java.awt.Dimension(1197, 150));
		panelFiltroVagas.setMinimumSize(new java.awt.Dimension(1197, 150));
		panelFiltroVagas.setPreferredSize(new java.awt.Dimension(1197, 150));

		lblTituloFiltroVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTituloFiltroVagas.setText("Título:");

		lblInstituicaoFiltroVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblInstituicaoFiltroVagas.setText("Instituição:");

		btnPesquisarFiltroVagas.setIcon(new ImageIcon("img/lupa_16x16.png")); // NOI18N
		btnPesquisarFiltroVagas.setText("Pesquisar");
		btnPesquisarFiltroVagas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				InstituicaoController instController = new InstituicaoController();
				Instituicao instituicao = null;
				Funcao tipoServico = null;
				List<Entidade> list = null;

				try {
					instituicao = (Instituicao) instController
							.getPorNome(cmbInstituicaoFiltroVagas.getSelectedItem() + "", usuario);

					tipoServico = (Funcao) funcaoController.getPorFuncao(cmbTipoServicoVagas.getSelectedItem() + "");

					list = btnPesquisarAnuncioAction(txtTituloFiltroVagas.getText(), instituicao, tipoServico);

					if (list != null)
						tableVagas.setModel(new AnuncioTableModel(list));

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}

		});

		lblTipoServicoVagas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		lblTipoServicoVagas.setText("Tipo de Serviço:");

		cmbTipoServicoVagas.addItem("");

		try {
			for (Entidade ent : funcaoController.listar()) {
				Funcao funcao = (Funcao) ent;

				cmbTipoServicoVagas.addItem(funcao.getFuncao());

			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		cmbInstituicaoFiltroVagas.addItem("");
		try {
			for (Entidade ent : instituicaoController.listar()) {
				Instituicao i = (Instituicao) ent;
				cmbInstituicaoFiltroVagas.addItem(i.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

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
				dateChooserDataNascimento.setEnabled(true);
				cmbSexo.setEnabled(true);
				btnAddAreaInteresse.setEnabled(true);
				btnAddHorario.setEnabled(true);

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

		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblComplemento.setText("Complemento:");

		jftxtCpf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		try {
			jftxtCpf.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
		} catch (ParseException e3) {
			e3.printStackTrace();
		}

		jftxtCpf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String caracteres = "0987654321";

				if (!caracteres.contains(e.getKeyChar() + "")) {
					e.consume();
				}
			}
		});

		lblCpf.setText("CPF:");

		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblTelefone.setText("Telefone:");

		jftxtCelular.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		try {
			jftxtCelular.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##)####-####")));
		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		jftxtCelular.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String caracteres = "0987654321";

				if (!caracteres.contains(e.getKeyChar() + "")) {
					e.consume();
				}
			}
		});

		lblEstadoCivil.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblEstadoCivil.setText("Estado Civil:");

		cmbEstadoCivil
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Solteiro", "Outro" }));

		jftxtTelefone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		try {
			jftxtTelefone.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##)####-####")));
		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		jftxtTelefone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String caracteres = "0987654321";

				if (!caracteres.contains(e.getKeyChar() + "")) {
					e.consume();
				}
			}
		});

		lblEndereco.setText("Endereço:");

		lblEmail.setText("E-mail:");

		lblDataNascimento.setText("Data Nascimento:");

		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblSexo.setText("Sexo:");

		cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Masculino", "Feminino" }));

		dateChooserDataNascimento.setSize(100, 19);

		/**
		 * Cria a entidade Voluntário a partir do usuário logado
		 */
		try {
			vol = (Voluntario) voluntarioController.getPorIdUsuario(usuario.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

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

		javax.swing.GroupLayout panelDadosPessoaisLayout = new javax.swing.GroupLayout(panelDadosPessoais);
		panelDadosPessoaisLayout.setHorizontalGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING).addComponent(lblNome)
								.addComponent(lblEndereco).addComponent(lblEstadoCivil).addComponent(lblCpf)
								.addComponent(lblDataNascimento))
						.addGap(54)
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addGap(1).addComponent(
										txtEndereco, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
								.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(dateChooserDataNascimento, Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cmbEstadoCivil, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
												130, GroupLayout.PREFERRED_SIZE)
										.addComponent(jftxtCpf, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 129,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING).addComponent(lblEmail)
								.addComponent(lblCelular).addComponent(lblSexo).addComponent(lblComplemento)
								.addComponent(lblTelefone))
						.addGap(12)
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 116,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jftxtTelefone, GroupLayout.PREFERRED_SIZE, 110,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jftxtEmail, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
								.addComponent(jftxtCelular, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbSexo, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGap(144)));
		panelDadosPessoaisLayout
				.setVerticalGroup(
						panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addContainerGap()
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNome)
										.addComponent(jftxtTelefone, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE).addComponent(lblTelefone))
						.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addGap(7)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jftxtCpf, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCpf))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(dateChooserDataNascimento, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblDataNascimento))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(cmbEstadoCivil, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEstadoCivil)))
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup().addGap(6)
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
												.addComponent(lblSexo))))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 22,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEndereco).addComponent(txtComplemento,
														GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblComplemento))));
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

				if (cmbAreasInteresse.getSelectedIndex() > 0) {
					listAreasInteresse.add(cmbAreasInteresse.getSelectedItem() + "");
					cmbAreasInteresse.setSelectedIndex(0);
					JOptionPane.showMessageDialog(null, "Área de interesse adicionada com sucesso.");
				}

			}
		});

		lblHorarioDisponivel.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblHorarioDisponivel.setText("Horário Disponível:");

		btnAddHorario.setIcon(new ImageIcon("img/add_16x16.png")); // NOI18N
		btnAddHorario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (cmbHorarioDisponivel.getSelectedIndex() > 0) {
					listHorarios.add(cmbHorarioDisponivel.getSelectedItem() + "");
					cmbHorarioDisponivel.setSelectedIndex(0);
					JOptionPane.showMessageDialog(null, "Horário adicionado com sucesso.");
				}

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
					horarioVolController = new HorarioVoluntarioController();
					horarioController = new HorarioController();

					List<Entidade> list = horarioVolController.getListPorIdVoluntario(vol.getId());

					for (Entidade ent : list) {

						HorarioVoluntario horarioVoluntario = (HorarioVoluntario) ent;
						Horario horario = (Horario) horarioController.getPorId(horarioVoluntario.getHorario().getId());

						horarios += horario.getHorario() + "\n";
					}

					JOptionPane.showMessageDialog(null, horarios);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
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

					for (Entidade ent : list) {

						FuncaoVoluntario funcaoVoluntario = (FuncaoVoluntario) ent;
						Funcao funcao = (Funcao) funcaoController.getPorId(funcaoVoluntario.getFuncao().getId());

						funcoes += funcao.getFuncao() + "\n";
					}

					JOptionPane.showMessageDialog(null, funcoes);

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		lblInfoComplementares.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInfoComplementares.setText("Informações Complementares:");

		cmbAreasInteresse.addItem("");

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
						.createParallelGroup(Alignment.LEADING)
						.addGroup(panelPerfilLayout.createSequentialGroup()
								.addGroup(panelPerfilLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(panelPerfilLayout.createSequentialGroup()
												.addComponent(btnSalvarDadosPerfil, GroupLayout.PREFERRED_SIZE, 116,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnEditarDadosPerfil, GroupLayout.PREFERRED_SIZE, 116,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 935,
												Short.MAX_VALUE))
								.addContainerGap())
						.addGroup(panelPerfilLayout.createSequentialGroup()
								.addComponent(panelInfoComplementares, 0, 0, Short.MAX_VALUE).addGap(344)))));
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

		btnGerarRelatorio.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnGerarRelatorio.setText("Gerar Relatório");
		btnGerarRelatorio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				VoluntarioAnuncioController voluntarioAnuncioController = new VoluntarioAnuncioController();
				List<Entidade> list;
				List<Entidade> listAnuncios = new ArrayList<Entidade>();
				try {
					list = voluntarioAnuncioController.getPorIdVoluntario(vol.getId());

					for (Entidade en : list) {
						VoluntarioAnuncio volAnuncio = (VoluntarioAnuncio) en;

						listAnuncios.add(anuncioController.getPorId(volAnuncio.getIdAnuncio()));
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				CandidaturasUI candidaturasUI = new CandidaturasUI(listAnuncios);
				candidaturasUI.setFocusable(true);
				candidaturasUI.moveToFront();
				getContentPane().add(candidaturasUI, 0);
				candidaturasUI.setVisible(true);

			}
		});

		javax.swing.GroupLayout panelFiltroVagasLayout = new javax.swing.GroupLayout(panelFiltroVagas);
		panelFiltroVagasLayout.setHorizontalGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelFiltroVagasLayout.createSequentialGroup().addContainerGap(1032, Short.MAX_VALUE)
						.addComponent(btnGerarRelatorio).addContainerGap())
				.addGroup(
						panelFiltroVagasLayout.createSequentialGroup().addContainerGap()
								.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTituloFiltroVagas).addComponent(lblInstituicaoFiltroVagas)
										.addComponent(lblTipoServicoVagas))
								.addGap(8)
								.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(cmbInstituicaoFiltroVagas, 0, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(cmbTipoServicoVagas, 0, 267, Short.MAX_VALUE)
										.addComponent(txtTituloFiltroVagas, Alignment.TRAILING))
								.addGap(9).addComponent(btnPesquisarFiltroVagas)
								.addContainerGap(687, Short.MAX_VALUE)));
		panelFiltroVagasLayout.setVerticalGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.LEADING)
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
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelFiltroVagasLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTipoServicoVagas).addComponent(cmbTipoServicoVagas,
										GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(panelFiltroVagasLayout.createSequentialGroup().addContainerGap(119, Short.MAX_VALUE)
						.addComponent(btnGerarRelatorio, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)));
		panelFiltroVagas.setLayout(panelFiltroVagasLayout);

		scrollpaneVagas.setMaximumSize(new java.awt.Dimension(1197, 480));
		scrollpaneVagas.setMinimumSize(new java.awt.Dimension(1197, 480));
		scrollpaneVagas.setPreferredSize(new java.awt.Dimension(1197, 480));

		try {
			tableVagas.setModel(new AnuncioTableModel(anuncioController.getAbertos()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		tableVagas.setAutoscrolls(false);
		tableVagas.setMaximumSize(new java.awt.Dimension(1197, 480));
		tableVagas.setMinimumSize(new java.awt.Dimension(1197, 480));
		tableVagas.setPreferredSize(new java.awt.Dimension(1197, 480));
		tableVagas.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {

					int linhaSelecionada = tableVagas.getSelectedRow();

					int idAnuncio = Integer.parseInt(tableVagas.getValueAt(linhaSelecionada, 0).toString());

					Anuncio anuncio = null;
					try {
						anuncio = (Anuncio) anuncioController.getPorId(idAnuncio);
					} catch (Exception e1) {
						e1.printStackTrace();
					}

					AnuncioUI anuncioUI = new AnuncioUI(anuncio, vol);
					anuncioUI.setFocusable(true);
					anuncioUI.moveToFront();
					getContentPane().add(anuncioUI, 0);
					anuncioUI.setVisible(true);
				}
			}
		});

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

	/**
	 * 
	 * @param user
	 */
	private void btnSalvarAction(Usuario user) {

		try {

			Voluntario voluntario = (Voluntario) voluntarioController.getPorIdUsuario(user.getId());

			editVoluntario(user, voluntario);

			saveHorarioVoluntario(voluntario, listHorarios);

			saveFuncaoVoluntario(voluntario, listAreasInteresse);

			JOptionPane.showMessageDialog(null, "Voluntário editado com sucesso.");

		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * Método que edita o voluntário.
	 * 
	 * @param user
	 * @param sexo
	 * @param estadoCivil
	 * @param voluntario
	 * @throws Exception
	 */
	private void editVoluntario(Usuario user, Voluntario voluntario) throws Exception {

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

		voluntarioController.editar(voluntario);

		desabilitarCampos();
	}

	/**
	 * Método que desabilita todos os campos da tela de perfil de voluntário.
	 */
	private void desabilitarCampos() {
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
		dateChooserDataNascimento.setEnabled(false);
		cmbSexo.setEnabled(false);
		btnAddAreaInteresse.setEnabled(false);
		btnAddHorario.setEnabled(false);
	}

	/**
	 * Método utilizado para salvar a área de interesse em ajudar selecionado
	 * pelo voluntário.
	 * 
	 * @param voluntario
	 * @throws Exception
	 */
	private void saveFuncaoVoluntario(Voluntario voluntario, List<String> listaFuncoes) throws Exception {
		if (listaFuncoes != null) {

			FuncaoVoluntarioController funcaoVolController = new FuncaoVoluntarioController();

			for (int i = 0; i < listaFuncoes.size(); i++) {

				Funcao funcao = (Funcao) funcaoController.getPorFuncao(listaFuncoes.get(i));

				// se não existir na lista adiciona
				if (!funcaoVolController.getPorIdFuncaoVoluntario(funcao.getId(), voluntario.getId())) {
					FuncaoVoluntario funcaoVoluntario = new FuncaoVoluntario(funcao, voluntario);

					funcaoVolController.salvar(funcaoVoluntario);
				}
			}

		}
	}

	/**
	 * Método utilizado para salvar horario disponível do voluntário.
	 * 
	 * @param voluntario
	 * @throws Exception
	 */
	private void saveHorarioVoluntario(Voluntario voluntario, List<String> listaHorarios) throws Exception {

		if (listaHorarios != null) {

			horarioVolController = new HorarioVoluntarioController();
			horarioController = new HorarioController();

			for (int i = 0; i < listaHorarios.size(); i++) {

				Horario horario = (Horario) horarioController.getPorHorario(listaHorarios.get(i));

				// se não existir na lista adiciona
				if (!horarioVolController.getPorIdHorarioVoluntario(horario.getId(), voluntario.getId())) {
					HorarioVoluntario horarioVoluntario = new HorarioVoluntario(horario, voluntario);

					horarioVolController.salvar(horarioVoluntario);
				}
			}

		}
	}

	/**
	 * Método que executa a ação do botão pesquisar do filtro da tela de vagas
	 * do perfil voluntário
	 * 
	 * @param titulo
	 * @param instituicao
	 * @param dataPublicacao
	 * @param tipoServico
	 * @return listAnuncios
	 * @throws Exception
	 */
	private List<Entidade> btnPesquisarAnuncioAction(String titulo, Instituicao instituicao, Funcao tipoServico)
			throws Exception {

		AnuncioController anuncioController = new AnuncioController();
		StringBuilder sql = new StringBuilder();

		if ((titulo == null || titulo.trim().equals("")) && instituicao == null && tipoServico == null) {
			sql.append(
					"SELECT a.id, a.titulo, a.descricao, a.qtdVagas, a.dataPublicacao, a.idFuncao, a.status, a.idInstituicao FROM anuncio a WHERE status = 'Aberto'");

		} else {
			sql.append(
					"SELECT a.id, a.titulo, a.descricao, a.qtdVagas, a.dataPublicacao, a.idFuncao, a.status, a.idInstituicao FROM anuncio a WHERE ");

			if (instituicao != null)
				sql.append(" idInstituicao= " + instituicao.getId() + "");

			if (titulo != null && !titulo.trim().equals("")) {
				if (instituicao != null) {
					sql.append(" AND");
				}
				sql.append(" titulo LIKE '%" + titulo + "%'");
			}

			if (tipoServico != null) {
				if ((titulo != null && !titulo.trim().equals("")) || instituicao != null) {
					sql.append(" AND");
				}

				sql.append(" idFuncao= " + tipoServico.getId() + "");
			}

			if ((titulo != null && !titulo.trim().equals("")) || instituicao != null || tipoServico != null) {
				sql.append(" AND");
			}
			sql.append(" status = 'Aberto'");

		}

		// System.out.println("PrincipalVoluntario\nSQL BTN PESQUISA: " +
		// sql.toString());

		List<Entidade> listAnuncios = anuncioController.pesquisarAnuncio(sql.toString());

		return listAnuncios;

	}

}
