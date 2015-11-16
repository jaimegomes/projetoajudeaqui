package br.senai.sc.ajudeaqui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.senai.sc.ajudeaqui.controller.UsuarioController;
import br.senai.sc.ajudeaqui.model.Usuario;

/**
 *
 * @author Jaime Gomes
 */
@SuppressWarnings("rawtypes")
public class RegistroUI extends javax.swing.JInternalFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btnCancelar;
	private javax.swing.JButton btnCadastrar;
	private javax.swing.JComboBox cmbPerfil;
	private javax.swing.JLabel lblConfirmarSenha;
	private javax.swing.JLabel lblLogin;
	private javax.swing.JLabel lblSenha;
	private javax.swing.JLabel lblPerfil;
	private javax.swing.JPanel panelFormCadastro;
	private javax.swing.JPasswordField pwdConfirmarSenha;
	private javax.swing.JTextField txtLogin;
	private javax.swing.JPasswordField pwdSenha;
	// End of variables declaration

	/**
	 * Creates new form RegistroUI
	 */
	public RegistroUI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		panelFormCadastro = new javax.swing.JPanel();
		lblLogin = new javax.swing.JLabel();
		lblSenha = new javax.swing.JLabel();
		lblPerfil = new javax.swing.JLabel();
		lblConfirmarSenha = new javax.swing.JLabel();
		txtLogin = new javax.swing.JTextField();
		pwdSenha = new javax.swing.JPasswordField();
		pwdConfirmarSenha = new javax.swing.JPasswordField();
		cmbPerfil = new javax.swing.JComboBox();
		btnCancelar = new javax.swing.JButton();
		btnCadastrar = new javax.swing.JButton();

		setTitle("Cadastro de Usu�rios");

		panelFormCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Formul�rio de Cadastro"));

		lblLogin.setText("Login:");

		lblSenha.setText("Senha:");

		lblPerfil.setText("Perfil:");

		lblConfirmarSenha.setText("Confirmar Senha:");

		cmbPerfil.setModel(new DefaultComboBoxModel(new String[] { "", "Volunt\u00E1rio", "Institui\u00E7\u00E3o" }));

		javax.swing.GroupLayout panelFormCadastroLayout = new javax.swing.GroupLayout(panelFormCadastro);
		panelFormCadastroLayout.setHorizontalGroup(panelFormCadastroLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelFormCadastroLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelFormCadastroLayout.createParallelGroup(Alignment.LEADING).addComponent(lblPerfil)
								.addGroup(panelFormCadastroLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(panelFormCadastroLayout.createSequentialGroup().addComponent(lblLogin)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, 141,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(panelFormCadastroLayout.createSequentialGroup()
												.addGroup(panelFormCadastroLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblConfirmarSenha).addComponent(lblSenha))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(panelFormCadastroLayout
														.createParallelGroup(Alignment.LEADING, false)
														.addComponent(pwdSenha, GroupLayout.DEFAULT_SIZE, 142,
																Short.MAX_VALUE)
														.addComponent(pwdConfirmarSenha, GroupLayout.DEFAULT_SIZE, 142,
																Short.MAX_VALUE)
														.addComponent(cmbPerfil, 0, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)))))
						.addContainerGap(34, Short.MAX_VALUE)));
		panelFormCadastroLayout.setVerticalGroup(panelFormCadastroLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelFormCadastroLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelFormCadastroLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblLogin)
								.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelFormCadastroLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblSenha)
								.addComponent(pwdSenha, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelFormCadastroLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConfirmarSenha).addComponent(pwdConfirmarSenha,
										GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(panelFormCadastroLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPerfil)
								.addComponent(cmbPerfil, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(37, Short.MAX_VALUE)));
		panelFormCadastro.setLayout(panelFormCadastroLayout);

		btnCancelar.setIcon(new javax.swing.ImageIcon("img/cancelar_16x16.png")); // NOI18N
		btnCancelar.setText("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});

		btnCadastrar.setIcon(new javax.swing.ImageIcon("img/salvar_16x16.png")); // NOI18N
		btnCadastrar.setText("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					registrar();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}

			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(panelFormCadastro,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING,
								layout.createSequentialGroup().addGap(53)
										.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 137,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addComponent(panelFormCadastro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 19,
												GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}

	private void registrar() throws Exception {
		UsuarioController controller = new UsuarioController();
		Usuario user = null;
		String senha = null;
		String confirmacaoSenha = null;

		if (controller.getPorLogin(txtLogin.getText()) == null) {
			String perfil = "";

			if (!pwdSenha.getPassword().equals(null) && !pwdSenha.getPassword().equals("")) {
				senha = new String(pwdSenha.getPassword());
			}

			if (!pwdConfirmarSenha.getPassword().equals(null) && !pwdConfirmarSenha.getPassword().equals("")) {
				confirmacaoSenha = new String(pwdConfirmarSenha.getPassword());
			}

			if (cmbPerfil.getSelectedIndex() == 1) {
				perfil = "Volunt�rio";
			} else if (cmbPerfil.getSelectedIndex() == 2) {
				perfil = "Institui��o";
			}

			if (senha.equals(confirmacaoSenha)) {
				user = new Usuario(txtLogin.getText(), senha, perfil);

				try {
					controller.salvar(user);
					dispose();
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao registrar usu�rio. \n" + e.getMessage());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Os campos senha e confirmar senha devem ser iguais.");
				pwdSenha.setText(null);
				pwdConfirmarSenha.setText(null);
			}
		} else {
			throw new Exception("Erro ao registrar usu�rio, login j� existe.");
		}

	}

}
