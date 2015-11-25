package br.senai.sc.ajudeaqui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.senai.sc.ajudeaqui.controller.UsuarioController;
import br.senai.sc.ajudeaqui.model.Usuario;

/**
 * Classe que contém a tela de login do sistema.
 * 
 * @author Jaime Gomes
 *
 */
public class LoginUI extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btnEntrar;
	private javax.swing.JButton btnRegistrarse;
	private javax.swing.JLabel lblBackground;
	private javax.swing.JLabel lblBemVindo;
	private javax.swing.JLabel lblErroLogin;
	private javax.swing.JLabel lblLogin;
	private javax.swing.JLabel lblSenha;
	private javax.swing.JPasswordField pwdSenha;
	private javax.swing.JTextField txtLogin;
	// End of variables declaration

	/**
	 * Creates new form LoginView
	 */
	public LoginUI() {
		initComponents();
	}

	public static void main(String args[]) {

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginUI().setVisible(true);
			}
		});
	}

	private void initComponents() {

		lblLogin = new javax.swing.JLabel();
		txtLogin = new javax.swing.JTextField();
		lblSenha = new javax.swing.JLabel();
		pwdSenha = new javax.swing.JPasswordField();
		btnEntrar = new javax.swing.JButton();
		lblBemVindo = new javax.swing.JLabel();
		lblErroLogin = new javax.swing.JLabel();
		btnRegistrarse = new javax.swing.JButton();
		lblBackground = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(":: Sistema do Voluntário Ajude Aqui ::");
		setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
		setForeground(new java.awt.Color(0, 0, 0));
		setMaximumSize(new java.awt.Dimension(800, 600));
		setMinimumSize(new java.awt.Dimension(800, 600));
		setName("frame"); // NOI18N
		setPreferredSize(new java.awt.Dimension(800, 600));
		setResizable(false);
		getContentPane().setLayout(null);

		lblLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
		lblLogin.setText("Login:");
		getContentPane().add(lblLogin);
		lblLogin.setBounds(260, 410, 110, 32);

		txtLogin.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
		txtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(txtLogin);
		txtLogin.setBounds(360, 410, 150, 30);

		lblSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
		lblSenha.setText("Senha:");
		getContentPane().add(lblSenha);
		lblSenha.setBounds(260, 460, 110, 32);

		pwdSenha.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
		pwdSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(pwdSenha);
		pwdSenha.setBounds(360, 460, 150, 30);

		btnEntrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
		btnEntrar.setIcon(new javax.swing.ImageIcon(("img/ok_16x16.png"))); // NOI18N
		btnEntrar.setText("Entrar");
		btnEntrar.setBorder(new javax.swing.border.MatteBorder(null));
		btnEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEntrarActionPerformed(evt);
			}
		});
		getContentPane().add(btnEntrar);
		btnEntrar.setBounds(520, 460, 120, 30);

		lblBemVindo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
		lblBemVindo.setText("Seja Bem Vindo ao Portal do Voluntário :: Ajude Aqui :: ");
		getContentPane().add(lblBemVindo);
		lblBemVindo.setBounds(110, 360, 660, 50);

		lblErroLogin.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
		lblErroLogin.setForeground(new java.awt.Color(255, 0, 0));
		getContentPane().add(lblErroLogin);
		lblErroLogin.setBounds(140, 558, 550, 0);

		btnRegistrarse.setIcon(new javax.swing.ImageIcon(("img/editar_usuario_16x16.png"))); // NOI18N
		btnRegistrarse.setText("Registrar-se");
		getContentPane().add(btnRegistrarse);
		btnRegistrarse.setBounds(360, 510, 150, 25);
		btnRegistrarse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RegistroUI registro = new RegistroUI();
				registro.setFocusable(true);
				registro.moveToFront();
				getContentPane().add(registro, 0);
				registro.setVisible(true);

			}
		});

		lblBackground.setIcon(new javax.swing.ImageIcon(("img/background.png"))); // NOI18N
		getContentPane().add(lblBackground);
		lblBackground.setBounds(0, 0, 810, 610);

		pack();
	}

	private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {
		UsuarioController controller = new UsuarioController();

		String senha = new String(pwdSenha.getPassword());

		try {
			Usuario usuario = (Usuario) controller.getPorLogin(txtLogin.getText());

			if (usuario == null) {
				JOptionPane.showMessageDialog(null, "Login não encontrado.");
				txtLogin.setText("");
				pwdSenha.setText("");

			} else {
				if (usuario.getSenha().equals(senha)) {
					if (usuario.getPerfil().equals("Voluntário")) {
						dispose();
						PrincipalVoluntarioUI principal = new PrincipalVoluntarioUI(usuario);
						principal.setVisible(true);
					} else {
						dispose();
						PrincipalInstituicaoUI principal = new PrincipalInstituicaoUI(usuario);
						principal.setVisible(true);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Senha incorreta.");
					pwdSenha.setText("");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
