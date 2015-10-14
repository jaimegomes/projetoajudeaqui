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

/**
 *
 * @author Jaime Gomes
 */
public class PrincipalVoluntarioUI extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JTextArea atxtInfoComplementares;
	private javax.swing.JButton btnAddAreaInteresse;
	private javax.swing.JButton btnAddCurso;
	private javax.swing.JButton btnAddExperiencia;
	private javax.swing.JButton btnAddHorario;
	private javax.swing.JButton btnCursosInseridos;
	private javax.swing.JButton btnHorariosDisponiveis;
	private javax.swing.JButton btnAreasInteresse;
	private javax.swing.JButton btnEditarDadosPerfil;
	private javax.swing.JButton btnFoto;
	private javax.swing.JButton btnPesquisarFiltroAvisos;
	private javax.swing.JButton btnPesquisarFiltroVagas;
	private javax.swing.JButton btnPesquisarFiltroVagas1;
	private javax.swing.JButton btnSalvarDadosPerfil;
	private javax.swing.JComboBox cmbAreasInteresse;
	private javax.swing.JComboBox cmbAtuouComoVoluntario;
	private javax.swing.JComboBox cmbEstadoCivil;
	private javax.swing.JComboBox cmbHorarioDisponivel;
	private javax.swing.JComboBox cmbInstituicaoFiltroAvisos;
	private javax.swing.JComboBox cmbInstituicaoFiltroVagas;
	private javax.swing.JComboBox cmbNivelCurso;
	private javax.swing.JComboBox cmbSexo;
	private javax.swing.JComboBox cmbSituacao;
	private javax.swing.JComboBox cmbTipOServicoAvisos;
	private javax.swing.JComboBox cmbTipoServicoVagas;
	private datechooser.beans.DateChooserCombo datechooserDataNascimento;
	private datechooser.beans.DateChooserCombo datechooserDataPublicacaoAvisos;
	private datechooser.beans.DateChooserCombo datechooserDataPublicacaoVagas;
	private datechooser.beans.DateChooserCombo datechooserEntrada;
	private datechooser.beans.DateChooserCombo datechooserInicioCurso;
	private datechooser.beans.DateChooserCombo datechooserFimCurso;
	private datechooser.beans.DateChooserCombo datechooserSaida;
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
	private javax.swing.JLabel lblDataPublicacaoFiltroAvisos;
	private javax.swing.JLabel lblDataPublicacaoFiltroVagas;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblEndereco;
	private javax.swing.JLabel lblEntrada;
	private javax.swing.JLabel lblEstadoCivil;
	private javax.swing.JLabel lblFimCurso;
	private javax.swing.JLabel lblFuncao;
	private javax.swing.JLabel lblHorarioDisponivel;
	private javax.swing.JLabel lblInfoComplementares;
	private javax.swing.JLabel lblInicioCurso;
	private javax.swing.JLabel lblInstituicaoExp;
	private javax.swing.JLabel lblInstituicaoFiltroAvisos;
	private javax.swing.JLabel lblInstituicaoFiltroVagas;
	private javax.swing.JLabel lblInstituicaoFormacao;
	private javax.swing.JLabel lblLembreteSenha;
	private javax.swing.JLabel lblNivelCurso;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblNomeCurso;
	private javax.swing.JLabel lblNovaSenha;
	private javax.swing.JLabel lblSaida;
	private javax.swing.JLabel lblSenhaAtual;
	private javax.swing.JLabel lblSexo;
	private javax.swing.JLabel lblSituacao;
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JLabel lblTipoServicoAvisos;
	private javax.swing.JLabel lblTipoServicoVagas;
	private javax.swing.JLabel lblTituloFiltroAvisos;
	private javax.swing.JLabel lblTituloFiltroVagas;
	private javax.swing.JTabbedPane menuPrincipalVoluntario;
	private javax.swing.JPanel panelAlterarSenha;
	private javax.swing.JPanel panelAvisos;
	private javax.swing.JPanel panelDadosPessoais;
	private javax.swing.JPanel panelExperiencias;
	private javax.swing.JPanel panelFiltroAvisos;
	private javax.swing.JPanel panelFiltroVagas;
	private javax.swing.JPanel panelFormacaoAcademica;
	private javax.swing.JPanel panelPerfil;
	private javax.swing.JPanel panelVagas;
	private javax.swing.JPasswordField ptxtNovaSenha;
	private javax.swing.JPasswordField ptxtSenhaAtual;
	private javax.swing.JScrollPane scrollPaneInfoComplementares;
	private javax.swing.JScrollPane scrollpaneAvisos;
	private javax.swing.JScrollPane scrollpaneVagas;
	private javax.swing.JTable tableAvisos;
	private javax.swing.JTable tableVagas;
	private javax.swing.JTextField txtComplemento;
	private javax.swing.JTextField txtEndereco;
	private javax.swing.JTextField txtFuncao;
	private javax.swing.JTextField txtInstituicao;
	private javax.swing.JTextField txtInstituicaoFormacao;
	private javax.swing.JTextField txtLembreteSenha;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtNomeCurso;
	private javax.swing.JTextField txtTituloFiltroAvisos;
	private javax.swing.JTextField txtTituloFiltroVagas;

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
		datechooserDataNascimento = new datechooser.beans.DateChooserCombo();
		panelFormacaoAcademica = new javax.swing.JPanel();
		lblNivelCurso = new javax.swing.JLabel();
		cmbNivelCurso = new javax.swing.JComboBox();
		lblInstituicaoFormacao = new javax.swing.JLabel();
		txtInstituicaoFormacao = new javax.swing.JTextField();
		lblNomeCurso = new javax.swing.JLabel();
		lblInicioCurso = new javax.swing.JLabel();
		txtNomeCurso = new javax.swing.JTextField();
		lblFimCurso = new javax.swing.JLabel();
		lblSituacao = new javax.swing.JLabel();
		cmbSituacao = new javax.swing.JComboBox();
		btnCursosInseridos = new javax.swing.JButton();
		btnHorariosDisponiveis = new javax.swing.JButton();
		btnAreasInteresse = new javax.swing.JButton();
		datechooserInicioCurso = new datechooser.beans.DateChooserCombo();
		datechooserFimCurso = new datechooser.beans.DateChooserCombo();
		panelExperiencias = new javax.swing.JPanel();
		lblInstituicaoExp = new javax.swing.JLabel();
		txtFuncao = new javax.swing.JTextField();
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
		datechooserEntrada = new datechooser.beans.DateChooserCombo();
		lblSaida = new javax.swing.JLabel();
		datechooserSaida = new datechooser.beans.DateChooserCombo();
		cmbAreasInteresse = new javax.swing.JComboBox();
		panelAlterarSenha = new javax.swing.JPanel();
		lblSenhaAtual = new javax.swing.JLabel();
		lblNovaSenha = new javax.swing.JLabel();
		lblLembreteSenha = new javax.swing.JLabel();
		txtLembreteSenha = new javax.swing.JTextField();
		ptxtSenhaAtual = new javax.swing.JPasswordField();
		ptxtNovaSenha = new javax.swing.JPasswordField();
		panelVagas = new javax.swing.JPanel();
		panelFiltroVagas = new javax.swing.JPanel();
		lblTituloFiltroVagas = new javax.swing.JLabel();
		lblInstituicaoFiltroVagas = new javax.swing.JLabel();
		lblDataPublicacaoFiltroVagas = new javax.swing.JLabel();
		txtTituloFiltroVagas = new javax.swing.JTextField();
		cmbInstituicaoFiltroVagas = new javax.swing.JComboBox();
		btnPesquisarFiltroVagas = new javax.swing.JButton();
		datechooserDataPublicacaoVagas = new datechooser.beans.DateChooserCombo();
		lblTipoServicoVagas = new javax.swing.JLabel();
		cmbTipoServicoVagas = new javax.swing.JComboBox();
		btnPesquisarFiltroVagas1 = new javax.swing.JButton();
		scrollpaneVagas = new javax.swing.JScrollPane();
		tableVagas = new javax.swing.JTable();
		panelAvisos = new javax.swing.JPanel();
		scrollpaneAvisos = new javax.swing.JScrollPane();
		tableAvisos = new javax.swing.JTable();
		panelFiltroAvisos = new javax.swing.JPanel();
		lblTituloFiltroAvisos = new javax.swing.JLabel();
		lblInstituicaoFiltroAvisos = new javax.swing.JLabel();
		lblDataPublicacaoFiltroAvisos = new javax.swing.JLabel();
		txtTituloFiltroAvisos = new javax.swing.JTextField();
		cmbInstituicaoFiltroAvisos = new javax.swing.JComboBox();
		btnPesquisarFiltroAvisos = new javax.swing.JButton();
		datechooserDataPublicacaoAvisos = new datechooser.beans.DateChooserCombo();
		lblTipoServicoAvisos = new javax.swing.JLabel();
		cmbTipOServicoAvisos = new javax.swing.JComboBox();

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
		panelPerfil.setMaximumSize(new java.awt.Dimension(1110, 730));
		panelPerfil.setMinimumSize(new java.awt.Dimension(1110, 730));
		panelPerfil.setName(""); // NOI18N
		panelPerfil.setPreferredSize(new java.awt.Dimension(1110, 730));

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

		javax.swing.GroupLayout panelDadosPessoaisLayout = new javax.swing.GroupLayout(
				panelDadosPessoais);
		panelDadosPessoaisLayout.setHorizontalGroup(
			panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFoto, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDataNascimento)
						.addComponent(lblCpf)
						.addComponent(lblEndereco)
						.addComponent(lblNome)
						.addComponent(lblEstadoCivil))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
							.addGap(1)
							.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtEndereco, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
								.addComponent(jftxtCpf, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNome)))
						.addComponent(cmbEstadoCivil, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addComponent(datechooserDataNascimento, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblComplemento)
						.addComponent(lblTelefone)
						.addComponent(lblSexo)
						.addComponent(lblEmail)
						.addComponent(lblCelular))
					.addGap(6)
					.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jftxtTelefone, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbSexo, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(jftxtEmail, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(jftxtCelular, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(303))
		);
		panelDadosPessoaisLayout.setVerticalGroup(
			panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
					.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
							.addComponent(lblAvatar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFoto))
						.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
							.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
									.addComponent(jftxtTelefone, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jftxtCelular, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCelular))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jftxtEmail, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEmail))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(cmbSexo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSexo)))
								.addGroup(panelDadosPessoaisLayout.createSequentialGroup()
									.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNome)
										.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblTelefone)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(jftxtCpf, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCpf))
									.addGap(5)
									.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblDataNascimento)
										.addComponent(datechooserDataNascimento, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(cmbEstadoCivil, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEstadoCivil))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(panelDadosPessoaisLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblComplemento)
								.addComponent(lblEndereco))))
					.addGap(24))
		);
		panelDadosPessoais.setLayout(panelDadosPessoaisLayout);

		panelFormacaoAcademica.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Formação Acadêmica"));
		panelFormacaoAcademica
				.setMaximumSize(new java.awt.Dimension(1197, 117));
		panelFormacaoAcademica
				.setMinimumSize(new java.awt.Dimension(1197, 117));
		panelFormacaoAcademica.setPreferredSize(new java.awt.Dimension(1197,
				117));

		lblNivelCurso.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblNivelCurso.setText("Nível Curso:");

		cmbNivelCurso.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "...", "Curso extracurricular",
						"Ensino fundamental ", "Ensino médio ",
						"Ensino superior", "Pós-graduação ", "Doutorado" }));

		lblInstituicaoFormacao.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInstituicaoFormacao.setText("Instituição:");

		lblNomeCurso.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblNomeCurso.setText("Curso:");

		lblInicioCurso.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInicioCurso.setText("Início:");

		lblFimCurso.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblFimCurso.setText("Fim:");

		lblSituacao.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblSituacao.setText("Situação:");

		cmbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"...", "Cursando", "Trancado", "Concluído" }));
		cmbSituacao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbSituacaoActionPerformed(evt);
			}
		});

		btnCursosInseridos.setIcon(new ImageIcon("img/agenda_16x16.png")); // NOI18N
		btnCursosInseridos.setText("Cursos");
		btnAddCurso = new javax.swing.JButton();

		btnAddCurso.setIcon(new ImageIcon("img/add_16x16.png"));

		javax.swing.GroupLayout panelFormacaoAcademicaLayout = new javax.swing.GroupLayout(
				panelFormacaoAcademica);
		panelFormacaoAcademicaLayout
				.setHorizontalGroup(panelFormacaoAcademicaLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelFormacaoAcademicaLayout
										.createSequentialGroup()
										.addGroup(
												panelFormacaoAcademicaLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNivelCurso)
														.addComponent(
																lblInstituicaoFormacao))
										.addGap(4)
										.addGroup(
												panelFormacaoAcademicaLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																txtInstituicaoFormacao,
																GroupLayout.PREFERRED_SIZE,
																171,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																cmbNivelCurso,
																GroupLayout.PREFERRED_SIZE,
																171,
																GroupLayout.PREFERRED_SIZE))
										.addGap(32)
										.addGroup(
												panelFormacaoAcademicaLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblInicioCurso)
														.addComponent(
																lblNomeCurso))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												panelFormacaoAcademicaLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																panelFormacaoAcademicaLayout
																		.createSequentialGroup()
																		.addComponent(
																				txtNomeCurso,
																				GroupLayout.PREFERRED_SIZE,
																				194,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(46)
																		.addComponent(
																				lblSituacao)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				cmbSituacao,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnCursosInseridos))
														.addGroup(
																panelFormacaoAcademicaLayout
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				datechooserInicioCurso,
																				GroupLayout.PREFERRED_SIZE,
																				100,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblFimCurso)
																		.addGap(6)
																		.addComponent(
																				datechooserFimCurso,
																				GroupLayout.PREFERRED_SIZE,
																				100,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnAddCurso,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(408, Short.MAX_VALUE)));
		panelFormacaoAcademicaLayout
				.setVerticalGroup(panelFormacaoAcademicaLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								panelFormacaoAcademicaLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelFormacaoAcademicaLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																txtNomeCurso,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																panelFormacaoAcademicaLayout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				lblNivelCurso)
																		.addComponent(
																				cmbNivelCurso,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblNomeCurso)
																		.addComponent(
																				lblSituacao)
																		.addComponent(
																				cmbSituacao,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				btnCursosInseridos,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												panelFormacaoAcademicaLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																btnAddCurso,
																GroupLayout.PREFERRED_SIZE,
																22,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																panelFormacaoAcademicaLayout
																		.createParallelGroup(
																				Alignment.LEADING,
																				false)
																		.addComponent(
																				datechooserInicioCurso,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				panelFormacaoAcademicaLayout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								txtInstituicaoFormacao,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								lblInicioCurso)
																						.addComponent(
																								lblInstituicaoFormacao))
																		.addGroup(
																				panelFormacaoAcademicaLayout
																						.createSequentialGroup()
																						.addGap(2)
																						.addComponent(
																								lblFimCurso))
																		.addComponent(
																				datechooserFimCurso,
																				GroupLayout.PREFERRED_SIZE,
																				22,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(25, Short.MAX_VALUE)));
		panelFormacaoAcademica.setLayout(panelFormacaoAcademicaLayout);

		panelExperiencias.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Experiências"));
		panelExperiencias.setMaximumSize(new java.awt.Dimension(1197, 233));
		panelExperiencias.setMinimumSize(new java.awt.Dimension(1197, 233));
		panelExperiencias.setPreferredSize(new java.awt.Dimension(1197, 233));

		lblInstituicaoExp.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInstituicaoExp.setText("Instituição:");

		txtFuncao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

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
		panelExperienciasLayout.setHorizontalGroup(
			panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelExperienciasLayout.createSequentialGroup()
					.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInfoComplementares)
						.addComponent(lblHorarioDisponivel)
						.addComponent(lblAtuouComoVoluntario))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(panelExperienciasLayout.createSequentialGroup()
							.addComponent(cmbAtuouComoVoluntario, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblInstituicaoExp)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtInstituicao, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblFuncao)
							.addGap(9)
							.addComponent(txtFuncao, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEntrada)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(datechooserEntrada, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSaida)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(datechooserSaida, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddExperiencia, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(panelExperienciasLayout.createSequentialGroup()
							.addComponent(cmbHorarioDisponivel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddHorario, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnHorariosDisponiveis))
						.addComponent(scrollPaneInfoComplementares, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))
					.addGap(53))
				.addGroup(panelExperienciasLayout.createSequentialGroup()
					.addComponent(lblAreaInteresse)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cmbAreasInteresse, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddAreaInteresse, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAreasInteresse)
					.addContainerGap())
		);
		panelExperienciasLayout.setVerticalGroup(
			panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelExperienciasLayout.createSequentialGroup()
					.addGap(13)
					.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtInstituicao, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblInstituicaoExp)
							.addComponent(txtFuncao, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblFuncao)
							.addComponent(lblEntrada))
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAtuouComoVoluntario)
							.addComponent(cmbAtuouComoVoluntario, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAddExperiencia, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(datechooserSaida, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblSaida, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(datechooserEntrada, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblHorarioDisponivel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbHorarioDisponivel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(panelExperienciasLayout.createSequentialGroup()
							.addGap(1)
							.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnHorariosDisponiveis, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAddHorario, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
					.addGap(6)
					.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInfoComplementares)
						.addComponent(scrollPaneInfoComplementares, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, panelExperienciasLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(panelExperienciasLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAreaInteresse)
								.addComponent(cmbAreasInteresse, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
							.addComponent(btnAddAreaInteresse, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAreasInteresse, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panelExperiencias.setLayout(panelExperienciasLayout);

		panelAlterarSenha.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Alterar Senha"));
		panelAlterarSenha.setMaximumSize(new java.awt.Dimension(1197, 142));
		panelAlterarSenha.setMinimumSize(new java.awt.Dimension(1197, 142));
		panelAlterarSenha.setPreferredSize(new java.awt.Dimension(1197, 142));

		lblSenhaAtual.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblSenhaAtual.setText("Senha Atual:");

		lblNovaSenha.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblNovaSenha.setText("Nova Senha:");

		lblLembreteSenha.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblLembreteSenha.setText("Lembrete de Senha:");

		javax.swing.GroupLayout panelAlterarSenhaLayout = new javax.swing.GroupLayout(
				panelAlterarSenha);
		panelAlterarSenhaLayout.setHorizontalGroup(
			panelAlterarSenhaLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelAlterarSenhaLayout.createSequentialGroup()
					.addGroup(panelAlterarSenhaLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSenhaAtual)
						.addComponent(lblNovaSenha)
						.addComponent(lblLembreteSenha))
					.addGap(10)
					.addGroup(panelAlterarSenhaLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(panelAlterarSenhaLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(ptxtNovaSenha, Alignment.LEADING)
							.addComponent(ptxtSenhaAtual, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtLembreteSenha, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(822, Short.MAX_VALUE))
		);
		panelAlterarSenhaLayout.setVerticalGroup(
			panelAlterarSenhaLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelAlterarSenhaLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelAlterarSenhaLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenhaAtual)
						.addComponent(ptxtSenhaAtual, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(panelAlterarSenhaLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNovaSenha)
						.addComponent(ptxtNovaSenha, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(panelAlterarSenhaLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLembreteSenha)
						.addComponent(txtLembreteSenha, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		panelAlterarSenha.setLayout(panelAlterarSenhaLayout);

		javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(
				panelPerfil);
		panelPerfilLayout.setHorizontalGroup(
			panelPerfilLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(panelPerfilLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelPerfilLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(panelPerfilLayout.createSequentialGroup()
							.addComponent(btnSalvarDadosPerfil, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEditarDadosPerfil, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelAlterarSenha, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelExperiencias, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, panelPerfilLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(panelFormacaoAcademica, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panelDadosPessoais, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(84))
		);
		panelPerfilLayout.setVerticalGroup(
			panelPerfilLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelPerfilLayout.createSequentialGroup()
					.addGap(8)
					.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelFormacaoAcademica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelExperiencias, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelAlterarSenha, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(panelPerfilLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditarDadosPerfil, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvarDadosPerfil, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
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

		javax.swing.GroupLayout panelFiltroVagasLayout = new javax.swing.GroupLayout(
				panelFiltroVagas);
		panelFiltroVagas.setLayout(panelFiltroVagasLayout);
		panelFiltroVagasLayout
				.setHorizontalGroup(panelFiltroVagasLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelFiltroVagasLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelFiltroVagasLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																panelFiltroVagasLayout
																		.createSequentialGroup()
																		.addGroup(
																				panelFiltroVagasLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								lblTituloFiltroVagas)
																						.addComponent(
																								lblDataPublicacaoFiltroVagas)
																						.addComponent(
																								lblInstituicaoFiltroVagas))
																		.addGap(4,
																				4,
																				4)
																		.addGroup(
																				panelFiltroVagasLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								datechooserDataPublicacaoVagas,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								100,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								panelFiltroVagasLayout
																										.createSequentialGroup()
																										.addGroup(
																												panelFiltroVagasLayout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																cmbTipoServicoVagas,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																258,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																panelFiltroVagasLayout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				false)
																																		.addComponent(
																																				cmbInstituicaoFiltroVagas,
																																				0,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				txtTituloFiltroVagas,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				258,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												btnPesquisarFiltroVagas))))
														.addComponent(
																lblTipoServicoVagas))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnPesquisarFiltroVagas1)
										.addContainerGap()));
		panelFiltroVagasLayout
				.setVerticalGroup(panelFiltroVagasLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelFiltroVagasLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelFiltroVagasLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lblTituloFiltroVagas)
														.addComponent(
																txtTituloFiltroVagas,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btnPesquisarFiltroVagas,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroVagasLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																cmbInstituicaoFiltroVagas,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblInstituicaoFiltroVagas))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroVagasLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																lblDataPublicacaoFiltroVagas)
														.addComponent(
																datechooserDataPublicacaoVagas,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroVagasLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																cmbTipoServicoVagas,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblTipoServicoVagas))
										.addContainerGap(20, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								panelFiltroVagasLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												btnPesquisarFiltroVagas1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												22,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

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
				("img/lupa_16x16.png")), panelVagas); // NOI18N

		panelAvisos.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		panelAvisos.setMaximumSize(new java.awt.Dimension(1110, 700));
		panelAvisos.setMinimumSize(new java.awt.Dimension(1110, 700));
		panelAvisos.setPreferredSize(new java.awt.Dimension(1110, 700));

		scrollpaneAvisos.setMaximumSize(new java.awt.Dimension(1197, 480));
		scrollpaneAvisos.setMinimumSize(new java.awt.Dimension(1197, 480));
		scrollpaneAvisos.setPreferredSize(new java.awt.Dimension(1197, 480));

		tableAvisos.setModel(new javax.swing.table.DefaultTableModel(
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
		tableAvisos.setAutoscrolls(false);
		tableAvisos.setMaximumSize(new java.awt.Dimension(1197, 480));
		tableAvisos.setMinimumSize(new java.awt.Dimension(1197, 480));
		tableAvisos.setPreferredSize(new java.awt.Dimension(1197, 480));
		scrollpaneAvisos.setViewportView(tableAvisos);

		panelFiltroAvisos.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Filtro de Pesquisa"));
		panelFiltroAvisos.setMaximumSize(new java.awt.Dimension(1197, 150));
		panelFiltroAvisos.setMinimumSize(new java.awt.Dimension(1197, 150));
		panelFiltroAvisos.setPreferredSize(new java.awt.Dimension(1197, 150));

		lblTituloFiltroAvisos.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblTituloFiltroAvisos.setText("Título:");

		lblInstituicaoFiltroAvisos.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblInstituicaoFiltroAvisos.setText("Instituição:");

		lblDataPublicacaoFiltroAvisos
				.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblDataPublicacaoFiltroAvisos.setText("Data Publicação:");

		btnPesquisarFiltroAvisos.setIcon(new ImageIcon("img/lupa_16x16.png")); // NOI18N
		btnPesquisarFiltroAvisos.setText("Pesquisar");

		lblTipoServicoAvisos.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		lblTipoServicoAvisos.setText("Tipo de Serviço:");

		cmbTipOServicoAvisos.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		javax.swing.GroupLayout panelFiltroAvisosLayout = new javax.swing.GroupLayout(
				panelFiltroAvisos);
		panelFiltroAvisos.setLayout(panelFiltroAvisosLayout);
		panelFiltroAvisosLayout
				.setHorizontalGroup(panelFiltroAvisosLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelFiltroAvisosLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelFiltroAvisosLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																panelFiltroAvisosLayout
																		.createSequentialGroup()
																		.addGroup(
																				panelFiltroAvisosLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								lblTituloFiltroAvisos)
																						.addComponent(
																								lblInstituicaoFiltroAvisos)
																						.addComponent(
																								lblDataPublicacaoFiltroAvisos))
																		.addGap(4,
																				4,
																				4)
																		.addGroup(
																				panelFiltroAvisosLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								panelFiltroAvisosLayout
																										.createSequentialGroup()
																										.addComponent(
																												txtTituloFiltroAvisos,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												258,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												btnPesquisarFiltroAvisos))
																						.addGroup(
																								panelFiltroAvisosLayout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addComponent(
																												cmbTipOServicoAvisos,
																												0,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												datechooserDataPublicacaoAvisos,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												100,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												cmbInstituicaoFiltroAvisos,
																												0,
																												258,
																												Short.MAX_VALUE))))
														.addComponent(
																lblTipoServicoAvisos))
										.addGap(664, 703, Short.MAX_VALUE)));
		panelFiltroAvisosLayout
				.setVerticalGroup(panelFiltroAvisosLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelFiltroAvisosLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelFiltroAvisosLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lblTituloFiltroAvisos)
														.addComponent(
																txtTituloFiltroAvisos,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btnPesquisarFiltroAvisos,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroAvisosLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lblInstituicaoFiltroAvisos)
														.addComponent(
																cmbInstituicaoFiltroAvisos,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroAvisosLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																lblDataPublicacaoFiltroAvisos)
														.addComponent(
																datechooserDataPublicacaoAvisos,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelFiltroAvisosLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																cmbTipOServicoAvisos,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblTipoServicoAvisos))
										.addContainerGap(20, Short.MAX_VALUE)));

		javax.swing.GroupLayout panelAvisosLayout = new javax.swing.GroupLayout(
				panelAvisos);
		panelAvisos.setLayout(panelAvisosLayout);
		panelAvisosLayout
				.setHorizontalGroup(panelAvisosLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelAvisosLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelAvisosLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																scrollpaneAvisos,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																panelFiltroAvisos,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(84, Short.MAX_VALUE)));
		panelAvisosLayout
				.setVerticalGroup(panelAvisosLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelAvisosLayout
										.createSequentialGroup()
										.addGap(6, 6, 6)
										.addComponent(
												panelFiltroAvisos,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												scrollpaneAvisos,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(56, Short.MAX_VALUE)));

		menuPrincipalVoluntario.addTab("Avisos", new ImageIcon(
				("img/aviso_16x16.png")), panelAvisos); // NOI18N

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

	private void cmbSituacaoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

}
