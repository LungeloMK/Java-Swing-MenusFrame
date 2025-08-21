
package za.ac.tut.ui;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenusFrame extends JFrame {
    
    // Jmenu Bar
    private JMenuBar menuBar;
    // Jmenu
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu ViewMenu;
    private JMenu editorsSubMenu;
    private JMenu splitSubMenu;
    
    // menu items for Files
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentProjectMenuItem;
    private JMenuItem closeAllProjectsMenuItem;
    
    // menu items for edit
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pastMenuItem;
    
    // sub menu for editors
    private JMenuItem sourceSubMenuItem;
    
    //sub menu for split
    private JMenuItem horizontalSubMenuItem;
    private JMenuItem verticallySubMenuItem;
    private JMenuItem clearSubMenuItem;
    

    public MenusFrame(){
        
        setTitle("Menus Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setSize(700, 800);
        setForeground(Color.red);
        
        // Jmenus for Files
        fileMenu = new JMenu("File");
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileMenuItem = new JMenuItem("new File...");
        openProjectMenuItem = new JMenuItem("Open Project...");
        openRecentProjectMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectsMenuItem = new JMenuItem("Close All Projects");
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);
        fileMenu.add(closeAllProjectsMenuItem);
        
        
        // Jmenus for Editors
        editMenu = new JMenu("Edit");
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pastMenuItem = new JMenuItem("Paste");
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pastMenuItem);
        
        
        // J Sub menus for editors
        editorsSubMenu = new JMenu("Editors");
        sourceSubMenuItem = new JMenuItem("Source");
        editorsSubMenu.add(sourceSubMenuItem);
        
        // J Sub menus for Split
        splitSubMenu = new JMenu("Split");
        horizontalSubMenuItem = new JMenuItem("Horizontally");
        verticallySubMenuItem = new JMenuItem("Vertically");
        clearSubMenuItem = new JMenuItem("Clear");
        splitSubMenu.add(horizontalSubMenuItem);
        splitSubMenu.add(verticallySubMenuItem);
        splitSubMenu.add(clearSubMenuItem);
        
        // JMenu for View
        ViewMenu = new JMenu("View");
        ViewMenu.add(editorsSubMenu);
        ViewMenu.add(splitSubMenu);
        
        //MenuBar
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(ViewMenu);
        
        // JFrame 
        setJMenuBar(menuBar);
        
        
        
        setVisible(true);
    }
    
    
}
