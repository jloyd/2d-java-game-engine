/*
 * MapEditorView.java
 */

package mapeditor;

import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.zip.*;
import engine.game.*;
import javax.swing.ImageIcon;

/**
 * The application's main frame.
 */
public class MapEditorView extends FrameView {
        
        public static Image tiles;
        public static Image sprites;
        public static int tab;
        public static String tilepath="";
        public static String spritepath="";

        public static boolean toolboxVisible = false;

    public MapEditorView(SingleFrameApplication app) {

        super(app);

        initComponents();

        tiles = Toolkit.getDefaultToolkit().getImage("newsmb.png");
        tilepath = "newsmb.png";
        tileChooser.image = tiles;

        sprites = Toolkit.getDefaultToolkit().getImage("mario.gif");
        spritepath = "mario.gif";
        spriteChooser.image = sprites;

    }

     @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = MapEditorApp.getApplication().getMainFrame();
            aboutBox = new MapEditorAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        MapEditorApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new Map();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        jFileChooser1 = new javax.swing.JFileChooser();

        mainPanel.setName("mainPanel");

        jScrollPane3.setName("jScrollPane3");

        jPanel3.setName("jPanel3"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        menuBar.setName("menuBar"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance().getContext().getActionMap(MapEditorView.class, this);
        fileMenu.setAction(actionMap.get("saveFile")); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(MapEditorView.class);
        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText(resourceMap.getString("jMenuItem2.text")); // NOI18N
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText(resourceMap.getString("jCheckBoxMenuItem1.text")); // NOI18N
        jCheckBoxMenuItem1.setName("jCheckBoxMenuItem1"); // NOI18N
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        menuBar.add(jMenu1);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jFileChooser1.setName("jFileChooser1"); // NOI18N

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

    //Import Tiles
    //Import Sprites

    // save file
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //System.out.println("Save - gedrückt!");
        int ow=0;
        int value = jFileChooser1.showSaveDialog(null);
        if (value == jFileChooser1.APPROVE_OPTION){
            Map.maxHeight = Map.Height();
            Map.maxWidth = Map.Width();
        File file = jFileChooser1.getSelectedFile();

        //Check if file already exists
        if (file.exists()){
            ow = JOptionPane.showConfirmDialog(null,"File already exists - overwrite?", "Error", JOptionPane.YES_NO_OPTION);
            if (ow == 0){
                file.delete();
            }
        }

        //Create the level file
        File levelFile = new File("level");
        if(levelFile.exists()){
            System.out.println("level already exists");
        }
        if (ow == 0){
            String str="";
            try{
                FileWriter fw = new FileWriter(levelFile);
                for (int y=0;y<=Map.maxHeight;y+=16){
                    for (int x=0;x<=Map.maxWidth;x+=16){
                        if (Map.tile[x/16][y/16].x>-16){
                            str += ""+(char)(48+Map.tile[x/16][y/16].x/16);
                        }
                        else{
                            str += " ";
                        }
                    }
                    str += "\n";
                }
                fw.write(str);
                fw.close();
            }
            catch(Exception e){
                System.out.println("ERROR saving level file: " + e);
            }

            new File(Toolbox.bg0TextField.getText()).renameTo(new File("bg0.png"));
            new File(Toolbox.bg1TextField.getText()).renameTo(new File("bg1.png"));
            new File(tilepath).renameTo(new File("tilesheet.png"));

            //Add files to Achrive
            String filenames[] = {
                "level",
                "tilesheet.png",
                "bg0.png",
                "bg1.png",
            };

            // Create a buffer for reading the files
            byte[] buf = new byte[1024];

            try {
                // Create the ZIP file
                String outFilename = file.getPath();
                ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));

                // Compress the files
                for (int i=0; i<filenames.length; i++) {
                    FileInputStream in = new FileInputStream(filenames[i]);

                    // Add ZIP entry to output stream.
                    out.putNextEntry(new ZipEntry(filenames[i]));

                    // Transfer bytes from the file to the ZIP file
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }

                    // Complete the entry
                    out.closeEntry();
                    in.close();
                }

                // Complete the ZIP file
                out.close();

                // Delete the created level file
                levelFile.delete();
            } 
            catch (IOException e) {
                System.out.println("ERROR saving level archive: " + e);
            }

        }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //System.out.println("Open - gedrückt!");
        int value = jFileChooser1.showOpenDialog(null);
        if (value == jFileChooser1.APPROVE_OPTION){
        File file = jFileChooser1.getSelectedFile();

        new Level(file.getPath()).load();

        //load images into editor:
        Toolbox.bg1TextField.setText(new File("bg1.png").getPath());
        Toolbox.bg0TextField.setText(new File("bg0.png").getPath());

        //load tile sheet into editor:
        MapEditorView.tilepath = "tilesheet.png";
        MapEditorView.tiles = Toolkit.getDefaultToolkit().getImage("tilesheet.png");
        ImageIcon tileicon = new ImageIcon(MapEditorView.tiles);
        tileChooser.image = MapEditorView.tiles;
        Map.img = MapEditorView.tiles;
        Toolbox.TilesetPanel.setPreferredSize(new Dimension(MapEditorView.tiles.getWidth(Toolbox.ImportButton), MapEditorView.tiles.getHeight(Toolbox.ImportButton)));
        tileChooser.image = tiles;
        Map.img = tiles;
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
            MapEditorApp.toolbox.setVisible(jCheckBoxMenuItem1.getState());       
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
            new Level("").clean();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    private final Timer messageTimer = null;
    private final Timer busyIconTimer = null;
    private final Icon idleIcon = null;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;

    private JDialog aboutBox;
}