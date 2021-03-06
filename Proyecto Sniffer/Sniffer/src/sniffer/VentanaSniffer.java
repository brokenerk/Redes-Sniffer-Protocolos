/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sniffer;

import javax.swing.JFileChooser;
import java.util.List;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jnetpcap.Pcap;
import org.jnetpcap.PcapAddr;
import org.jnetpcap.PcapIf;
import org.jnetpcap.PcapSockAddr;
import static org.jnetpcap.packet.format.FormatUtils.asString;


public class VentanaSniffer extends javax.swing.JFrame {

    /**
     * Creates new form VentanaSniffer
     */
    public VentanaSniffer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        RdVuelo = new javax.swing.JRadioButton();
        RdPCAP = new javax.swing.JRadioButton();
        jCboDevices = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RdPromiscuo = new javax.swing.JRadioButton();
        RdNoPromiscuo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CboFiltro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TxtProtocolo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CbotipoFiltrado = new javax.swing.JComboBox<>();
        CbodireccionFiltrado = new javax.swing.JComboBox<>();
        TxtTamPaquetes = new javax.swing.JTextField();
        TxtTiempo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        TxtFiltrado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador de protocolos - Sniffer");
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("LECTURA");

        buttonGroup1.add(RdVuelo);
        RdVuelo.setText("Al vuelo");
        RdVuelo.setToolTipText("");
        RdVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdVueloActionPerformed(evt);
            }
        });

        buttonGroup1.add(RdPCAP);
        RdPCAP.setText("Desde archivo PCAP");
        RdPCAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdPCAPActionPerformed(evt);
            }
        });

        jCboDevices.setEnabled(false);
        jCboDevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboDevicesActionPerformed(evt);
            }
        });

        jLabel2.setText("INTERFAZ DE RED");

        jLabel3.setText("CONFIGURACION DE LA TARJETA DE RED");
        jLabel3.setToolTipText("");

        jLabel4.setText("Longitud de Paquetes (bytes) * 64");

        jLabel5.setText("Modo de Operacion");

        buttonGroup2.add(RdPromiscuo);
        RdPromiscuo.setText("Promiscuo");
        RdPromiscuo.setToolTipText("");

        buttonGroup2.add(RdNoPromiscuo);
        RdNoPromiscuo.setText("No Promiscuo");

        jButton1.setText("S N I F F !");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tiempo de espera (seg)");

        jLabel7.setText("FILTRADO");

        CboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Protocolo", "Por Tipo" }));
        CboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboFiltroActionPerformed(evt);
            }
        });

        jLabel8.setText("Filtrado por Protocolo");

        TxtProtocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProtocoloActionPerformed(evt);
            }
        });

        jLabel9.setText("Filtrado por Tipo");

        CbotipoFiltrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "host", "port", "net" }));

        CbodireccionFiltrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "src", "dst" }));

        TxtTamPaquetes.setText("1024");

        TxtTiempo.setText("10");

        jTextField1.setEditable(false);
        jTextField1.setToolTipText("");

        TxtFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFiltradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(RdVuelo)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RdPromiscuo)
                                        .addGap(30, 30, 30)
                                        .addComponent(RdNoPromiscuo))
                                    .addComponent(TxtTamPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CbotipoFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CbodireccionFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RdPCAP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1))
                                .addComponent(jCboDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RdVuelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdPCAP)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCboDevices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtTamPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RdPromiscuo)
                    .addComponent(RdNoPromiscuo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CbotipoFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CbodireccionFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int tamañoPaq, tiempo, promiscuo;
    String ruta="", filtrado="";
    StringBuilder errbuf;
    PcapIf dispositivo;
    List<PcapIf> alldevs=new ArrayList<>();
    
    private void jCboDevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboDevicesActionPerformed
        
        
    }//GEN-LAST:event_jCboDevicesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tramas sniff=new Tramas();
        
        if(RdVuelo.isSelected()){
            tamañoPaq=Integer.parseInt(TxtTamPaquetes.getText());
        tiempo=Integer.parseInt(TxtTiempo.getText());
        dispositivo=alldevs.get(jCboDevices.getSelectedIndex());
        
        if(RdPromiscuo.isSelected())
            promiscuo=1;
        else if (RdNoPromiscuo.isSelected())
            promiscuo=0;
        
        
        if(CboFiltro.getSelectedIndex()==0)
            filtrado=TxtProtocolo.getText();
        else if(CboFiltro.getSelectedIndex()==1)
            filtrado=CbodireccionFiltrado.getSelectedItem()+" "+CbotipoFiltrado.getSelectedItem()+" "+TxtFiltrado.getText();	
        
        
        sniff.alvuelo(dispositivo, tamañoPaq, tiempo, promiscuo, filtrado, errbuf);
        sniff.setVisible(true);
        }
        else if(RdPCAP.isSelected()){
            sniff.archivoPcap(ruta, errbuf);
            sniff.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtProtocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProtocoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProtocoloActionPerformed
    
    private static String asString(final byte[] mac) {
    final StringBuilder buf = new StringBuilder();
    for (byte b : mac) {
      if (buf.length() != 0) {
        buf.append(':');
      }
      if (b >= 0 && b < 16) {
        buf.append('0');
      }
      buf.append(Integer.toHexString((b < 0) ? b + 256 : b).toUpperCase());
    }

    return buf.toString();
  }

    
    public void cargaDevices(){ 
        errbuf = new StringBuilder(); // For any error msgs  
       Pcap.findAllDevs(alldevs, errbuf);
        try{
            for(PcapIf inter : alldevs){
                String descripcion = inter.getDescription();
                if(descripcion == null) descripcion = "";
                String mac = asString(inter.getHardwareAddress());
                String ip4 = "";
                Iterator<PcapAddr> it = inter.getAddresses().iterator();
                while(it.hasNext()){
                    PcapAddr dir = it.next();//dir, familia, mascara,bc
                 PcapSockAddr direccion =dir.getAddr();
                    byte[]d_ip = direccion.getData();
                    int familia=direccion.getFamily();
                    int[]ipv4 = new int[4];
                    if(familia==org.jnetpcap.PcapSockAddr.AF_INET){
                        ipv4[0]=((int)d_ip[0]<0)?((int)d_ip[0])+256:(int)d_ip[0];
                        ipv4[1]=((int)d_ip[1]<0)?((int)d_ip[1])+256:(int)d_ip[1];
                        ipv4[2]=((int)d_ip[2]<0)?((int)d_ip[2])+256:(int)d_ip[2];
                        ipv4[3]=((int)d_ip[3]<0)?((int)d_ip[3])+256:(int)d_ip[3];
                        ip4="IP4: ["+ipv4[0]+"."+ipv4[1]+"."+ipv4[2]+"."+ipv4[3]+"]";
                    }
                }
                jCboDevices.addItem(descripcion + "  MAC: [" + mac + "] " + ip4);  
            }
                              

        }catch(IOException io){
            JOptionPane.showMessageDialog(null, "No se pudieron cargar las interfaces de red.", "Error",JOptionPane.ERROR_MESSAGE);
            io.printStackTrace();
        }//catch
    }
    
    
    private void RdVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdVueloActionPerformed
        jCboDevices.setEnabled(true);
    }//GEN-LAST:event_RdVueloActionPerformed

    private void RdPCAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdPCAPActionPerformed
        ruta="";
        try
        { // LECTURA DEL ARCHIVO
          /* Caja de dialogo: Te muestra los archivos de la maquina. 
            Tiene el boton aceptar y cancelar*/
          JFileChooser jf = new JFileChooser();
          FileNameExtensionFilter extension = new FileNameExtensionFilter("archivos pcap (*.pcap)", "pcap");
          jf.setFileFilter(extension);
                        
          int r = jf.showOpenDialog(null);
          if(r == JFileChooser.APPROVE_OPTION)
          {

            ruta = jf.getSelectedFile().toString();
            jCboDevices.setEnabled(false);
            // Mostramos el nombre del archivo
            jTextField1.setText(ruta);
          }
        }
        catch(Exception ex)
        {   //
            JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo.", "Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_RdPCAPActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargaDevices();
    }//GEN-LAST:event_formWindowOpened

    private void TxtFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFiltradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFiltradoActionPerformed

    private void CboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboFiltroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CboFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSniffer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboFiltro;
    private javax.swing.JComboBox<String> CbodireccionFiltrado;
    private javax.swing.JComboBox<String> CbotipoFiltrado;
    private javax.swing.JRadioButton RdNoPromiscuo;
    private javax.swing.JRadioButton RdPCAP;
    private javax.swing.JRadioButton RdPromiscuo;
    private javax.swing.JRadioButton RdVuelo;
    private javax.swing.JTextField TxtFiltrado;
    private javax.swing.JTextField TxtProtocolo;
    private javax.swing.JTextField TxtTamPaquetes;
    private javax.swing.JTextField TxtTiempo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private static javax.swing.JComboBox<String> jCboDevices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
