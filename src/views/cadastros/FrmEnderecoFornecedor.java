/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package views.cadastros;

/**
 *
 * @author luansinh0
 */
public class FrmEnderecoFornecedor extends javax.swing.JFrame {

    /** Creates new form FrmEnderecoFornecedor */
    public FrmEnderecoFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnCidade = new javax.swing.JPanel();
        JtfCidade = new javax.swing.JTextField();
        JbtnSair = new javax.swing.JButton();
        JbtnSalvar = new javax.swing.JButton();
        JpnEstado = new javax.swing.JPanel();
        JtfEstado = new javax.swing.JTextField();
        JpnRua = new javax.swing.JPanel();
        JtfRua = new javax.swing.JTextField();
        JpnBairro = new javax.swing.JPanel();
        JtfBairro = new javax.swing.JTextField();
        JpnNumero = new javax.swing.JPanel();
        JtfNumero = new javax.swing.JTextField();
        JpnCep = new javax.swing.JPanel();
        JtfCep = new javax.swing.JTextField();
        JpnCliente = new javax.swing.JPanel();
        JcmbCliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpnCidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));

        javax.swing.GroupLayout JpnCidadeLayout = new javax.swing.GroupLayout(JpnCidade);
        JpnCidade.setLayout(JpnCidadeLayout);
        JpnCidadeLayout.setHorizontalGroup(
            JpnCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnCidadeLayout.setVerticalGroup(
            JpnCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JbtnSair.setText("Sair");
        JbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSairActionPerformed(evt);
            }
        });

        JbtnSalvar.setText("Salvar");
        JbtnSalvar.setEnabled(false);
        JbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSalvarActionPerformed(evt);
            }
        });

        JpnEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        javax.swing.GroupLayout JpnEstadoLayout = new javax.swing.GroupLayout(JpnEstado);
        JpnEstado.setLayout(JpnEstadoLayout);
        JpnEstadoLayout.setHorizontalGroup(
            JpnEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnEstadoLayout.setVerticalGroup(
            JpnEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnRua.setBorder(javax.swing.BorderFactory.createTitledBorder("Rua"));

        javax.swing.GroupLayout JpnRuaLayout = new javax.swing.GroupLayout(JpnRua);
        JpnRua.setLayout(JpnRuaLayout);
        JpnRuaLayout.setHorizontalGroup(
            JpnRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfRua, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnRuaLayout.setVerticalGroup(
            JpnRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnBairro.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro"));

        javax.swing.GroupLayout JpnBairroLayout = new javax.swing.GroupLayout(JpnBairro);
        JpnBairro.setLayout(JpnBairroLayout);
        JpnBairroLayout.setHorizontalGroup(
            JpnBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnBairroLayout.setVerticalGroup(
            JpnBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));

        javax.swing.GroupLayout JpnNumeroLayout = new javax.swing.GroupLayout(JpnNumero);
        JpnNumero.setLayout(JpnNumeroLayout);
        JpnNumeroLayout.setHorizontalGroup(
            JpnNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnNumeroLayout.setVerticalGroup(
            JpnNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnCep.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));

        javax.swing.GroupLayout JpnCepLayout = new javax.swing.GroupLayout(JpnCep);
        JpnCep.setLayout(JpnCepLayout);
        JpnCepLayout.setHorizontalGroup(
            JpnCepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCep, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnCepLayout.setVerticalGroup(
            JpnCepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        javax.swing.GroupLayout JpnClienteLayout = new javax.swing.GroupLayout(JpnCliente);
        JpnCliente.setLayout(JpnClienteLayout);
        JpnClienteLayout.setHorizontalGroup(
            JpnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnClienteLayout.setVerticalGroup(
            JpnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JbtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbtnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JpnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JpnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnSair)
                    .addComponent(JbtnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnSalvarActionPerformed

    private void JbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_JbtnSairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEnderecoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEnderecoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEnderecoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEnderecoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEnderecoFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnSair;
    private javax.swing.JButton JbtnSalvar;
    private javax.swing.JComboBox<String> JcmbCliente;
    private javax.swing.JPanel JpnBairro;
    private javax.swing.JPanel JpnCep;
    private javax.swing.JPanel JpnCidade;
    private javax.swing.JPanel JpnCliente;
    private javax.swing.JPanel JpnEstado;
    private javax.swing.JPanel JpnNumero;
    private javax.swing.JPanel JpnRua;
    private javax.swing.JTextField JtfBairro;
    private javax.swing.JTextField JtfCep;
    private javax.swing.JTextField JtfCidade;
    private javax.swing.JTextField JtfEstado;
    private javax.swing.JTextField JtfNumero;
    private javax.swing.JTextField JtfRua;
    // End of variables declaration//GEN-END:variables

}
