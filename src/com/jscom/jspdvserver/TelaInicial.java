/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jscom.jspdvserver;

import java.awt.Color;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import javax.swing.JFrame;


public class TelaInicial extends javax.swing.JFrame {
    public static List<Produto> listaProdutos;
        
    
   
    public TelaInicial() {
       
        initComponents();
        listaProdutos = carregarProdutosDoBancoDeDadosOuOutraFonte();
        TelaInicial telaVendaPdv = this;
        telaVendaPdv.setLocationRelativeTo(null);
        telaVendaPdv.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telaVendaPdv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
      Preferences prefs = Preferences.userNodeForPackage(ConfiguracaoBancoDados.class);
        String urlBanco = prefs.get("urlBanco", "");
        String host = prefs.get("host", "");
        String porta = prefs.get ("porta", "");
        String nomebd = prefs.get("nomeBanco","" );
        String usuario = prefs.get("usuario", "");
        String senha = prefs.get("senha", "");
        private File arquivoSelecionado; 
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVenda = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnConsulta1 = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnVenda1 = new javax.swing.JButton();
        btnConsulta5 = new javax.swing.JButton();
        btnEstoque1 = new javax.swing.JButton();
        btnConsulta8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnConsulta6 = new javax.swing.JButton();
        btnConsulta7 = new javax.swing.JButton();
        btnConsulta3 = new javax.swing.JButton();
        btnConsulta9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO - JSPDV");
        setPreferredSize(new java.awt.Dimension(1398, 695));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setText("JS PDV SERVER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(578, 578, 578))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUTO"));

        btnVenda.setText("CADASTAR PRODUTO");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnConsulta.setText("CONSULTAR PRODUTO");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnConsulta1.setText("ALTERAÇÃO DE PREÇO");
        btnConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta1ActionPerformed(evt);
            }
        });

        btnEstoque.setText("ESTOQUE");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(btnConsulta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("RELATÓRIOS"));

        btnVenda1.setText("RELATÓRIO DE VENDAS");
        btnVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenda1ActionPerformed(evt);
            }
        });

        btnConsulta5.setText("---");
        btnConsulta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta5ActionPerformed(evt);
            }
        });

        btnEstoque1.setText("----");
        btnEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoque1ActionPerformed(evt);
            }
        });

        btnConsulta8.setText("---");
        btnConsulta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEstoque1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(btnConsulta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsulta8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnVenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnConsulta8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnConsulta5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEstoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("LOJA"));

        btnConsulta6.setText("ALTERAR NOME DA LOJA");
        btnConsulta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta6ActionPerformed(evt);
            }
        });

        btnConsulta7.setText("---");
        btnConsulta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta7ActionPerformed(evt);
            }
        });

        btnConsulta3.setText("ADICIONAR USUÁRIO");
        btnConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta3ActionPerformed(evt);
            }
        });

        btnConsulta9.setText("ALTERAR LOGO");
        btnConsulta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsulta6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsulta7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnConsulta3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnConsulta9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnConsulta3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnConsulta6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnConsulta9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnConsulta7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        TelaConsultaProd telaConsulta = new TelaConsultaProd(listaProdutos);
        telaConsulta.setLocationRelativeTo(null);
        telaConsulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
                TelaCadProd telaCadProd = new TelaCadProd();
                telaCadProd.setLocationRelativeTo(null); // Centralize a tela
                telaCadProd.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsulta1ActionPerformed

    private void btnConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta3ActionPerformed
         TelaCadUsuario telacaduser = new TelaCadUsuario();
         telacaduser.setLocationRelativeTo(null); // Centralize a tela
         telacaduser.setVisible(true);
         dispose(); // Feche a tela de login
    }//GEN-LAST:event_btnConsulta3ActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVenda1ActionPerformed

    private void btnConsulta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsulta5ActionPerformed

    private void btnEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoque1ActionPerformed

    private void btnConsulta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta6ActionPerformed
              TelaAlterarNomeLoja telanome = new TelaAlterarNomeLoja();
               telanome.setLocationRelativeTo(null); // Centralize a tela
               telanome.setVisible(true);
               dispose(); // Feche a tela de login
    }//GEN-LAST:event_btnConsulta6ActionPerformed

    private void btnConsulta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsulta7ActionPerformed

    private void btnConsulta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsulta8ActionPerformed

    private void btnConsulta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta9ActionPerformed
      TelaAlterarLogo logo = new TelaAlterarLogo();
      logo.setVisible(true);
      logo.setLocationRelativeTo(null);
      dispose();
    }//GEN-LAST:event_btnConsulta9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
         listaProdutos = carregarProdutosDoBancoDeDadosOuOutraFonte();
         java.awt.EventQueue.invokeLater(() -> {
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.setLocationRelativeTo(null); // Centralize a tela
            telaInicial.setVisible(true);
         });
    }
     
   public static List<Produto> carregarProdutosDoBancoDeDadosOuOutraFonte() {
    List<Produto> produtos = new ArrayList<>();
        Preferences prefs = Preferences.userNodeForPackage(ConfiguracaoBancoDados.class);
        String urlBanco = prefs.get("urlBanco", "");
        String host = prefs.get("host", "");
        String porta = prefs.get ("porta", "");
        String nomebd = prefs.get("nomeBanco","" );
        String usuario = prefs.get("usuario", "");
        String senha = prefs.get("senha", "");
   
        try {
        Connection conexao = DriverManager.getConnection(urlBanco, usuario, senha);
        String sql = "SELECT * FROM produtos";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int codigo = rs.getInt("id");
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");

            Produto produto = new Produto(codigo, nome, preco);
            produtos.add(produto);
        }

        rs.close();
        stmt.close();
        conexao.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return produtos;
}
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsulta;
    public javax.swing.JButton btnConsulta1;
    public javax.swing.JButton btnConsulta3;
    public javax.swing.JButton btnConsulta5;
    public javax.swing.JButton btnConsulta6;
    public javax.swing.JButton btnConsulta7;
    public javax.swing.JButton btnConsulta8;
    public javax.swing.JButton btnConsulta9;
    public javax.swing.JButton btnEstoque;
    public javax.swing.JButton btnEstoque1;
    public javax.swing.JButton btnVenda;
    public javax.swing.JButton btnVenda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
