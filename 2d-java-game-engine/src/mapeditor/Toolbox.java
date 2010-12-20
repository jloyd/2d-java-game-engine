/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Toolbox.java
 *
 * Created on 15.12.2010, 15:59:10
 */

package mapeditor;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
import engine.game.*;
import javax.imageio.*;

/**
 *
 * @author Philipp
 */
public class Toolbox extends javax.swing.JFrame {

    /** Creates new form Toolbox */
    public Toolbox() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolboxTab = new javax.swing.JTabbedPane();
        TileTabPanel = new javax.swing.JPanel();
        TilesetPanel = new tileChooser();
        ImportButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        prefHeightButton = new javax.swing.JButton();
        prefHeightLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bg0TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        browseButtonBG0 = new javax.swing.JButton();
        browseButtonBG1 = new javax.swing.JButton();
        bg1TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        browseButtonFG = new javax.swing.JButton();
        fgTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Toolbox");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ToolboxTab.setName("ToolboxTab"); // NOI18N

        TileTabPanel.setName("TileTabPanel"); // NOI18N

        TilesetPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TilesetPanel.setName("TilesetPanel"); // NOI18N
        TilesetPanel.setPreferredSize(new java.awt.Dimension(128, 128));

        org.jdesktop.layout.GroupLayout TilesetPanelLayout = new org.jdesktop.layout.GroupLayout(TilesetPanel);
        TilesetPanel.setLayout(TilesetPanelLayout);
        TilesetPanelLayout.setHorizontalGroup(
            TilesetPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 289, Short.MAX_VALUE)
        );
        TilesetPanelLayout.setVerticalGroup(
            TilesetPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 194, Short.MAX_VALUE)
        );

        ImportButton.setText("Import");
        ImportButton.setName("ImportButton"); // NOI18N
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout TileTabPanelLayout = new org.jdesktop.layout.GroupLayout(TileTabPanel);
        TileTabPanel.setLayout(TileTabPanelLayout);
        TileTabPanelLayout.setHorizontalGroup(
            TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TilesetPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, TileTabPanelLayout.createSequentialGroup()
                .add(83, 83, 83)
                .add(ImportButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .add(92, 92, 92))
        );
        TileTabPanelLayout.setVerticalGroup(
            TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, TileTabPanelLayout.createSequentialGroup()
                .add(TilesetPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(ImportButton)
                .addContainerGap())
        );

        ToolboxTab.addTab("Tiles", TileTabPanel);

        jPanel1.setName("jPanel1"); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Camera"));
        jPanel3.setName("jPanel3"); // NOI18N

        prefHeightButton.setText("Preferred Height");
        prefHeightButton.setName("prefHeightButton"); // NOI18N

        prefHeightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prefHeightLabel.setText("no Preferred Height set");
        prefHeightLabel.setName("prefHeightLabel"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prefHeightLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .add(prefHeightButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(prefHeightButton)
                .add(11, 11, 11)
                .add(prefHeightLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButton4.setText("Mario Spawn Point");
        jButton4.setName("jButton4"); // NOI18N

        jButton1.setText("Change Map Size");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(55, 55, 55)
                        .add(jButton4))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 47, Short.MAX_VALUE)
                .add(jButton1)
                .addContainerGap())
        );

        ToolboxTab.addTab("Properties", jPanel1);

        jPanel2.setName("jPanel2"); // NOI18N

        bg0TextField.setName("bg0TextField"); // NOI18N

        jLabel1.setText("Background Layer 0");
        jLabel1.setName("jLabel1"); // NOI18N

        browseButtonBG0.setText("Browse");
        browseButtonBG0.setName("browseButtonBG0"); // NOI18N
        browseButtonBG0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonBG0ActionPerformed(evt);
            }
        });

        browseButtonBG1.setText("Browse");
        browseButtonBG1.setName("browseButtonBG1"); // NOI18N
        browseButtonBG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonBG1ActionPerformed(evt);
            }
        });

        bg1TextField.setName("bg1TextField"); // NOI18N

        jLabel2.setText("Background Layer 1");
        jLabel2.setName("jLabel2"); // NOI18N

        browseButtonFG.setText("Browse");
        browseButtonFG.setName("browseButtonFG"); // NOI18N

        fgTextField.setName("fgTextField"); // NOI18N

        jLabel3.setText("Foreground Layer");
        jLabel3.setName("jLabel3"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(bg0TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButtonBG0))
                    .add(jLabel1)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(bg1TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButtonBG1))
                    .add(jLabel2)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(fgTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButtonFG))
                    .add(jLabel3))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bg0TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonBG0))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bg1TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonBG1))
                .add(18, 18, 18)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fgTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonFG))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        ToolboxTab.addTab("Background", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(ToolboxTab, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(ToolboxTab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButtonActionPerformed
        
        javax.swing.JFileChooser jFileChooser1 = new javax.swing.JFileChooser();
        
        int value = jFileChooser1.showOpenDialog(null);
        File tilefile = jFileChooser1.getSelectedFile();
        MapEditorView.tilepath = tilefile.getPath();
        MapEditorView.tiles = Toolkit.getDefaultToolkit().getImage(tilefile.getAbsolutePath());
        ImageIcon tileicon = new ImageIcon(MapEditorView.tiles);
        tileChooser.image = MapEditorView.tiles;
        Map.img = MapEditorView.tiles;
        while(MapEditorView.tiles.getWidth(ImportButton) == -1){} //wait till image is loaded
        TilesetPanel.setPreferredSize(new Dimension(MapEditorView.tiles.getWidth(ImportButton), MapEditorView.tiles.getHeight(ImportButton)));

    }//GEN-LAST:event_ImportButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MapEditorView.toolsCheckBox.setState(false);
    }//GEN-LAST:event_formWindowClosing

    private void browseButtonBG0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonBG0ActionPerformed
        
        javax.swing.JFileChooser jfc =  new javax.swing.JFileChooser();
        jfc.showOpenDialog(null);
        bg0TextField.setText(jfc.getSelectedFile().getPath());
        
        try{
           gameMain.background_layer0 = ImageIO.read(jfc.getSelectedFile());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_browseButtonBG0ActionPerformed

    private void browseButtonBG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonBG1ActionPerformed

        javax.swing.JFileChooser jfc =  new javax.swing.JFileChooser();
        jfc.showOpenDialog(null);
        bg1TextField.setText(jfc.getSelectedFile().getPath());

        try{
           gameMain.background_layer1 = ImageIO.read(jfc.getSelectedFile());
        }
        catch(Exception e){
        }

    }//GEN-LAST:event_browseButtonBG1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MapEditorView.jFrame1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ImportButton;
    public static javax.swing.JPanel TileTabPanel;
    public static javax.swing.JPanel TilesetPanel;
    public static javax.swing.JTabbedPane ToolboxTab;
    public static javax.swing.JTextField bg0TextField;
    public static javax.swing.JTextField bg1TextField;
    private javax.swing.JButton browseButtonBG0;
    private javax.swing.JButton browseButtonBG1;
    private javax.swing.JButton browseButtonFG;
    public static javax.swing.JTextField fgTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton prefHeightButton;
    private javax.swing.JLabel prefHeightLabel;
    // End of variables declaration//GEN-END:variables

}
