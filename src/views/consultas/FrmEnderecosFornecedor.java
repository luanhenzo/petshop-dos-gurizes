/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.consultas;

/**
 *
 * @author luansinh0
 */
public class FrmEnderecosFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form FrmEnderecosFornecedor
     */
    public FrmEnderecosFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnNumero = new javax.swing.JPanel();
        JtfNumero = new javax.swing.JTextField();
        JpnCidade = new javax.swing.JPanel();
        JtfCidade = new javax.swing.JTextField();
        JpnCep = new javax.swing.JPanel();
        JtfCep = new javax.swing.JTextField();
        JpnEstado = new javax.swing.JPanel();
        JtfEstado = new javax.swing.JTextField();
        JpnId = new javax.swing.JPanel();
        JtfId = new javax.swing.JTextField();
        JpnFornecedor = new javax.swing.JPanel();
        JcmbFornecedor = new javax.swing.JComboBox<>();
        JbtnSair = new javax.swing.JButton();
        JpnBairro = new javax.swing.JPanel();
        JtfBairro = new javax.swing.JTextField();
        JpnRua = new javax.swing.JPanel();
        JtfRua = new javax.swing.JTextField();
        JbtnLimpar = new javax.swing.JButton();
        JbtnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpnNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));

        javax.swing.GroupLayout JpnNumeroLayout = new javax.swing.GroupLayout(JpnNumero);
        JpnNumero.setLayout(JpnNumeroLayout);
        JpnNumeroLayout.setHorizontalGroup(
            JpnNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfNumero)
                .addContainerGap())
        );
        JpnNumeroLayout.setVerticalGroup(
            JpnNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnCidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));

        javax.swing.GroupLayout JpnCidadeLayout = new javax.swing.GroupLayout(JpnCidade);
        JpnCidade.setLayout(JpnCidadeLayout);
        JpnCidadeLayout.setHorizontalGroup(
            JpnCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCidade)
                .addContainerGap())
        );
        JpnCidadeLayout.setVerticalGroup(
            JpnCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnCep.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));

        javax.swing.GroupLayout JpnCepLayout = new javax.swing.GroupLayout(JpnCep);
        JpnCep.setLayout(JpnCepLayout);
        JpnCepLayout.setHorizontalGroup(
            JpnCepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCep)
                .addContainerGap())
        );
        JpnCepLayout.setVerticalGroup(
            JpnCepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnCepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        javax.swing.GroupLayout JpnEstadoLayout = new javax.swing.GroupLayout(JpnEstado);
        JpnEstado.setLayout(JpnEstadoLayout);
        JpnEstadoLayout.setHorizontalGroup(
            JpnEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfEstado)
                .addContainerGap())
        );
        JpnEstadoLayout.setVerticalGroup(
            JpnEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        javax.swing.GroupLayout JpnIdLayout = new javax.swing.GroupLayout(JpnId);
        JpnId.setLayout(JpnIdLayout);
        JpnIdLayout.setHorizontalGroup(
            JpnIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfId, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnIdLayout.setVerticalGroup(
            JpnIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        javax.swing.GroupLayout JpnFornecedorLayout = new javax.swing.GroupLayout(JpnFornecedor);
        JpnFornecedor.setLayout(JpnFornecedorLayout);
        JpnFornecedorLayout.setHorizontalGroup(
            JpnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnFornecedorLayout.setVerticalGroup(
            JpnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbFornecedor)
                .addContainerGap())
        );

        JbtnSair.setText("Sair");
        JbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSairActionPerformed(evt);
            }
        });

        JpnBairro.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro"));

        javax.swing.GroupLayout JpnBairroLayout = new javax.swing.GroupLayout(JpnBairro);
        JpnBairro.setLayout(JpnBairroLayout);
        JpnBairroLayout.setHorizontalGroup(
            JpnBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfBairro)
                .addContainerGap())
        );
        JpnBairroLayout.setVerticalGroup(
            JpnBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnRua.setBorder(javax.swing.BorderFactory.createTitledBorder("Rua"));

        javax.swing.GroupLayout JpnRuaLayout = new javax.swing.GroupLayout(JpnRua);
        JpnRua.setLayout(JpnRuaLayout);
        JpnRuaLayout.setHorizontalGroup(
            JpnRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfRua)
                .addContainerGap())
        );
        JpnRuaLayout.setVerticalGroup(
            JpnRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JbtnLimpar.setText("Limpar");

        JbtnListar.setText("Listar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JbtnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbtnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbtnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnSair)
                    .addComponent(JbtnLimpar)
                    .addComponent(JbtnListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmEnderecosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEnderecosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEnderecosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEnderecosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEnderecosFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnLimpar;
    private javax.swing.JButton JbtnListar;
    private javax.swing.JButton JbtnSair;
    private javax.swing.JComboBox<String> JcmbFornecedor;
    private javax.swing.JPanel JpnBairro;
    private javax.swing.JPanel JpnCep;
    private javax.swing.JPanel JpnCidade;
    private javax.swing.JPanel JpnEstado;
    private javax.swing.JPanel JpnFornecedor;
    private javax.swing.JPanel JpnId;
    private javax.swing.JPanel JpnNumero;
    private javax.swing.JPanel JpnRua;
    private javax.swing.JTextField JtfBairro;
    private javax.swing.JTextField JtfCep;
    private javax.swing.JTextField JtfCidade;
    private javax.swing.JTextField JtfEstado;
    private javax.swing.JTextField JtfId;
    private javax.swing.JTextField JtfNumero;
    private javax.swing.JTextField JtfRua;
    // End of variables declaration//GEN-END:variables
}
