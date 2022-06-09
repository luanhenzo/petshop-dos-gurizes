/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.consultas;

/**
 *
 * @author luansinh0
 */
public class FrmProdutos extends javax.swing.JFrame {

    /**
     * Creates new form FrmProdutos
     */
    public FrmProdutos() {
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

        JpnId = new javax.swing.JPanel();
        JtfId = new javax.swing.JTextField();
        JpnDescricao = new javax.swing.JPanel();
        JtfDescricao = new javax.swing.JTextField();
        JpnValor = new javax.swing.JPanel();
        JtfValor = new javax.swing.JTextField();
        JpnFornecedor = new javax.swing.JPanel();
        JcmbFornecedor = new javax.swing.JComboBox<>();
        JbtnListar = new javax.swing.JButton();
        JbtnSair2 = new javax.swing.JButton();
        JbtnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpnId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        javax.swing.GroupLayout JpnIdLayout = new javax.swing.GroupLayout(JpnId);
        JpnId.setLayout(JpnIdLayout);
        JpnIdLayout.setHorizontalGroup(
            JpnIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfId)
                .addContainerGap())
        );
        JpnIdLayout.setVerticalGroup(
            JpnIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        javax.swing.GroupLayout JpnDescricaoLayout = new javax.swing.GroupLayout(JpnDescricao);
        JpnDescricao.setLayout(JpnDescricaoLayout);
        JpnDescricaoLayout.setHorizontalGroup(
            JpnDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnDescricaoLayout.setVerticalGroup(
            JpnDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        javax.swing.GroupLayout JpnValorLayout = new javax.swing.GroupLayout(JpnValor);
        JpnValor.setLayout(JpnValorLayout);
        JpnValorLayout.setHorizontalGroup(
            JpnValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfValor, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnValorLayout.setVerticalGroup(
            JpnValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        JcmbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcmbFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpnFornecedorLayout = new javax.swing.GroupLayout(JpnFornecedor);
        JpnFornecedor.setLayout(JpnFornecedorLayout);
        JpnFornecedorLayout.setHorizontalGroup(
            JpnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnFornecedorLayout.setVerticalGroup(
            JpnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JbtnListar.setText("Listar");

        JbtnSair2.setText("Sair");
        JbtnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSair2ActionPerformed(evt);
            }
        });

        JbtnLimpar.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpnId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JbtnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbtnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbtnSair2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnSair2)
                    .addComponent(JbtnLimpar)
                    .addComponent(JbtnListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcmbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcmbFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcmbFornecedorActionPerformed

    private void JbtnSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSair2ActionPerformed
        dispose();
    }//GEN-LAST:event_JbtnSair2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnLimpar;
    private javax.swing.JButton JbtnListar;
    private javax.swing.JButton JbtnSair;
    private javax.swing.JButton JbtnSair1;
    private javax.swing.JButton JbtnSair2;
    private javax.swing.JComboBox<String> JcmbFornecedor;
    private javax.swing.JPanel JpnDescricao;
    private javax.swing.JPanel JpnFornecedor;
    private javax.swing.JPanel JpnId;
    private javax.swing.JPanel JpnValor;
    private javax.swing.JTextField JtfDescricao;
    private javax.swing.JTextField JtfId;
    private javax.swing.JTextField JtfValor;
    // End of variables declaration//GEN-END:variables
}
