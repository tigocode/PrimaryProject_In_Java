/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import Conection.ConectionBD;
import Controle.ControladorExcel;
import Controle.ControladorExcel_01;
import Controle.ControladorExcel_02;
import Controle.ControladorExcel_03;
import Controle.ControladorExcel_04;
import Controle.ControladorExcel_05;
import ModeloBeans.ModeloExcel;
import Visão.VistaExcel;



/**
 *
 * @author Tiago Dantas
 */
public class TelaAdmin extends javax.swing.JFrame {
    
    ConectionBD con = new ConectionBD();

    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_LogoNet = new javax.swing.JLabel();
        lbl_LogoFlex = new javax.swing.JLabel();
        lbl_Admin = new javax.swing.JLabel();
        bar_MenuGeral = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        MenuCadastro = new javax.swing.JMenu();
        MenuItem_New = new javax.swing.JMenuItem();
        MenuGereciador = new javax.swing.JMenu();
        MenuItem_Finalização = new javax.swing.JMenuItem();
        MenuItem_AuditoriaOS = new javax.swing.JMenuItem();
        MenuItem_RevDesc = new javax.swing.JMenuItem();
        MenuItem_OSSemLead = new javax.swing.JMenuItem();
        MenuItem_Adequação = new javax.swing.JMenuItem();
        MenuItem_Portabilidade = new javax.swing.JMenuItem();
        ImportBase = new javax.swing.JMenu();
        BasesGeral = new javax.swing.JMenuItem();
        BasesExtras = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        MenuExibir = new javax.swing.JMenu();
        MenuRelatorios = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();
        MenuItem_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gereciamento Administrativo");
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_LogoNet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Selo Net - Geral.png"))); // NOI18N
        getContentPane().add(lbl_LogoNet);
        lbl_LogoNet.setBounds(690, 460, 290, 150);

        lbl_LogoFlex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Selo Flex - Geral.png"))); // NOI18N
        getContentPane().add(lbl_LogoFlex);
        lbl_LogoFlex.setBounds(10, 500, 300, 100);

        lbl_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo - Tela Principal Ta.jpg"))); // NOI18N
        getContentPane().add(lbl_Admin);
        lbl_Admin.setBounds(0, -20, 1000, 650);

        MenuArquivo.setText("Arquivo");

        MenuCadastro.setText("Cadastro de Usuário");
        MenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroActionPerformed(evt);
            }
        });

        MenuItem_New.setText("New");
        MenuItem_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_NewActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItem_New);

        MenuArquivo.add(MenuCadastro);

        MenuGereciador.setText("Importação de Bases");

        MenuItem_Finalização.setText("Finalização");
        MenuItem_Finalização.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_FinalizaçãoActionPerformed(evt);
            }
        });
        MenuGereciador.add(MenuItem_Finalização);

        MenuItem_AuditoriaOS.setText("Auditoria - OS");
        MenuItem_AuditoriaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AuditoriaOSActionPerformed(evt);
            }
        });
        MenuGereciador.add(MenuItem_AuditoriaOS);

        MenuItem_RevDesc.setText("Auditoria - Rev/Desc");
        MenuItem_RevDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_RevDescActionPerformed(evt);
            }
        });
        MenuGereciador.add(MenuItem_RevDesc);

        MenuItem_OSSemLead.setText("OS Sem Lead");
        MenuItem_OSSemLead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_OSSemLeadActionPerformed(evt);
            }
        });
        MenuGereciador.add(MenuItem_OSSemLead);

        MenuItem_Adequação.setText("Adequação");
        MenuItem_Adequação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AdequaçãoActionPerformed(evt);
            }
        });
        MenuGereciador.add(MenuItem_Adequação);

        MenuItem_Portabilidade.setText("Portabilidade");
        MenuItem_Portabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_PortabilidadeActionPerformed(evt);
            }
        });
        MenuGereciador.add(MenuItem_Portabilidade);

        MenuArquivo.add(MenuGereciador);

        ImportBase.setText("Importação");

        BasesGeral.setText("Bases - Geral");
        BasesGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasesGeralActionPerformed(evt);
            }
        });
        ImportBase.add(BasesGeral);

        BasesExtras.setText("Bases - Extras");
        ImportBase.add(BasesExtras);

        MenuArquivo.add(ImportBase);

        bar_MenuGeral.add(MenuArquivo);

        MenuEditar.setText("Editar");
        bar_MenuGeral.add(MenuEditar);

        MenuExibir.setText("Exibir");
        bar_MenuGeral.add(MenuExibir);

        MenuRelatorios.setText("Relatório");
        bar_MenuGeral.add(MenuRelatorios);

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });

        MenuItem_Sair.setText("Sair");
        MenuItem_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_SairActionPerformed(evt);
            }
        });
        MenuSair.add(MenuItem_Sair);

        bar_MenuGeral.add(MenuSair);

        setJMenuBar(bar_MenuGeral);

        setSize(new java.awt.Dimension(999, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroActionPerformed

    }//GEN-LAST:event_MenuCadastroActionPerformed

    private void MenuItem_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_NewActionPerformed
FormUsuários tela = new FormUsuários();
        tela.setVisible(true);
    }//GEN-LAST:event_MenuItem_NewActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed

    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuItem_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_SairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_MenuItem_SairActionPerformed

    private void BasesGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasesGeralActionPerformed

        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel contraControladorExcel = new ControladorExcel(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);    
    }//GEN-LAST:event_BasesGeralActionPerformed

    private void MenuItem_FinalizaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_FinalizaçãoActionPerformed
        
        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel contraControladorExcel = new ControladorExcel(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);  
    }//GEN-LAST:event_MenuItem_FinalizaçãoActionPerformed

    private void MenuItem_AuditoriaOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AuditoriaOSActionPerformed

        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel_01 contraControladorExcel = new ControladorExcel_01(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);  
    }//GEN-LAST:event_MenuItem_AuditoriaOSActionPerformed

    private void MenuItem_RevDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_RevDescActionPerformed
          ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel_02 contraControladorExcel = new ControladorExcel_02(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);  
    }//GEN-LAST:event_MenuItem_RevDescActionPerformed

    private void MenuItem_OSSemLeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_OSSemLeadActionPerformed
        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel_03 contraControladorExcel = new ControladorExcel_03(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);  
    }//GEN-LAST:event_MenuItem_OSSemLeadActionPerformed

    private void MenuItem_AdequaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AdequaçãoActionPerformed
        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel_04 contraControladorExcel = new ControladorExcel_04(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);  
    }//GEN-LAST:event_MenuItem_AdequaçãoActionPerformed

    private void MenuItem_PortabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_PortabilidadeActionPerformed
        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel_05 contraControladorExcel = new ControladorExcel_05(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);  
    }//GEN-LAST:event_MenuItem_PortabilidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BasesExtras;
    private javax.swing.JMenuItem BasesGeral;
    private javax.swing.JMenu ImportBase;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenu MenuExibir;
    private javax.swing.JMenu MenuGereciador;
    private javax.swing.JMenuItem MenuItem_Adequação;
    private javax.swing.JMenuItem MenuItem_AuditoriaOS;
    private javax.swing.JMenuItem MenuItem_Finalização;
    private javax.swing.JMenuItem MenuItem_New;
    private javax.swing.JMenuItem MenuItem_OSSemLead;
    private javax.swing.JMenuItem MenuItem_Portabilidade;
    private javax.swing.JMenuItem MenuItem_RevDesc;
    private javax.swing.JMenuItem MenuItem_Sair;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenuBar bar_MenuGeral;
    private javax.swing.JLabel lbl_Admin;
    private javax.swing.JLabel lbl_LogoFlex;
    private javax.swing.JLabel lbl_LogoNet;
    // End of variables declaration//GEN-END:variables

}
