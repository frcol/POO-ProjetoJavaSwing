/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import entity.Usuario;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author rafae
 */
public class FMenu extends javax.swing.JFrame {
    private Usuario usuarioLogado;
    /**
     * Creates new form FMenu
     */
    public FMenu() {
        Login login = new Login(this, true);
        login.setVisible(true);
        usuarioLogado = login.getUsuarioLogado();
        
        initComponents();
        
        lblUsuario.setText(usuarioLogado.getUsername());
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        alterarSenha = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSair = new javax.swing.JMenuItem();
        imTest = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        imCadProd = new javax.swing.JMenuItem();
        imProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("jLabel1");

        jMenu1.setText("Arquivo");

        jMenu5.setText("Usuário");

        alterarSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        alterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/download-icon-avatar+person+profile+user+icon-1320166578424287581_32.png"))); // NOI18N
        alterarSenha.setText("Alterar Senha");
        alterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaActionPerformed(evt);
            }
        });
        jMenu5.add(alterarSenha);

        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator1);

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        imTest.setText("Test");
        imTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imTestActionPerformed(evt);
            }
        });
        jMenu1.add(imTest);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastros");

        imCadProd.setText("Categoria");
        imCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadProdActionPerformed(evt);
            }
        });
        jMenu2.add(imCadProd);

        imProduto.setText("Produto");
        imProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(imProduto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario))
        );

        setSize(new java.awt.Dimension(458, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaActionPerformed
        // TODO add your handling code here:
        DAlterarSenha dAlterarSenha = new DAlterarSenha(this, true);
        dAlterarSenha.setVisible(true);
        
    }//GEN-LAST:event_alterarSenhaActionPerformed

    private void imCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadProdActionPerformed
        // TODO add your handling code here:
        IConsultarCategoria categoria = new IConsultarCategoria();
        jDesktopPane1.add(categoria);
        categoria.setVisible(true);
    }//GEN-LAST:event_imCadProdActionPerformed

    private void imProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imProdutoActionPerformed
        // TODO add your handling code here:
        IConsultarProduto produto = IConsultarProduto.getMyInstance();
        produto.pack();
        if(!produto.isVisible()){
            jDesktopPane1.add(produto);
            produto.setVisible(true);
        }
        else{
            produto.moveToFront();
        }
    }//GEN-LAST:event_imProdutoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        WindowEvent windowEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowEvent);
    }//GEN-LAST:event_menuSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "Tem certeza?", "Cuiado...", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        } else {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void imTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imTestActionPerformed
        Test w = Test.getMyInstance();
        w.pack();
        if(!w.isVisible()){
            jDesktopPane1.add(w);
            w.setVisible(true);
        }
        else{
            w.moveToFront();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_imTestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarSenha;
    private javax.swing.JMenuItem imCadProd;
    private javax.swing.JMenuItem imProduto;
    private javax.swing.JMenuItem imTest;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menuSair;
    // End of variables declaration//GEN-END:variables
}
