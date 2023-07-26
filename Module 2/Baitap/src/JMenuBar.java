import javax.swing.*;
import java.util.Scanner;

public class JMenuBar {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        JFrame frame = new JFrame("Furama Resort");

        javax.swing.JMenuBar jMenuBar = new javax.swing.JMenuBar();
        //Tao doi tuong
        //JMenuItem jMenuItem_BM_display = new JMenuItem("Display list booking");
        //Them doi tuong vao trong menu
        //jMenu_BM.add(jMenuItem_BM_display);


        //Menu 1 : Employee Management
        JMenu jMenu_EM = new JMenu("1.\tEmployee Management");
        JMenuItem jMenuItem_EM_display = new JMenuItem("1.Display list employees");
        jMenu_EM.add(jMenuItem_EM_display);
        JMenuItem jMenuItem_EM_add = new JMenuItem("2.Add list employees");
        jMenu_EM.add(jMenuItem_EM_add);
        JMenuItem jMenuItem_EM_edit = new JMenuItem("3.Edit list employees");
        jMenu_EM.add(jMenuItem_EM_edit);
        JMenuItem jMenuItem_EM_delete = new JMenuItem("4.Delete employees");
        jMenu_EM.add(jMenuItem_EM_delete);
        JMenuItem jMenuItem_EM_search = new JMenuItem("5.Search by name employees");
        jMenu_EM.add(jMenuItem_EM_search);
        JMenuItem jMenuItem_EM_return = new JMenuItem("6.Return main menu");
        jMenu_EM.add(jMenuItem_EM_return);


        //Thanh gach ngang
        jMenu_EM.addSeparator();
        //Them menu con vao menu bar
        jMenuBar.add(jMenu_EM);


        //Menu 2 : Customer Management
        JMenu jMenu_CM = new JMenu("2.\tCustomer Management");
        JMenuItem jMenuItem_CM_display = new JMenuItem("1.Display list customers");
        jMenu_CM.add(jMenuItem_CM_display);
        JMenuItem jMenuItem_CM_add = new JMenuItem("2.Add list customers");
        jMenu_CM.add(jMenuItem_CM_add);
        JMenuItem jMenuItem_CM_edit = new JMenuItem("3.Edit list customers");
        jMenu_CM.add(jMenuItem_CM_edit);
        JMenuItem jMenuItem_CM_delete = new JMenuItem("4.Delete customers");
        jMenu_CM.add(jMenuItem_CM_delete);
        JMenuItem jMenuItem_CM_search = new JMenuItem("5.Search by name customers");
        jMenu_CM.add(jMenuItem_CM_search);
        JMenuItem jMenuItem_CM_return = new JMenuItem("6.Return main menu");
        jMenu_CM.add(jMenuItem_CM_return);
        //Thanh gach ngang
        jMenu_CM.addSeparator();
        //Them menu con vao menu bar
        jMenuBar.add(jMenu_CM);


        //Menu 3 : Facility Management
        JMenu jMenu_FM = new JMenu("3.\tFacility Management");
        JMenuItem jMenuItem_FM_display = new JMenuItem("1.Display list customers");
        jMenu_FM.add(jMenuItem_FM_display);
        JMenuItem jMenuItem_FM_add = new JMenuItem("2.Add list customers");
        jMenu_FM.add(jMenuItem_FM_add);
        JMenuItem jMenuItem_FM_displayMaintenance = new JMenuItem("3.Edit list customers");
        jMenu_FM.add(jMenuItem_FM_displayMaintenance);
        JMenuItem jMenuItem_FM_delete = new JMenuItem("4.Delete customers");
        jMenu_FM.add(jMenuItem_FM_delete);
        JMenuItem jMenuItem_FM_return = new JMenuItem("5.Return main menu");
        jMenu_FM.add(jMenuItem_FM_return);
        //Thanh gach ngang
        jMenu_FM.addSeparator();
        //Them menu con vao menu bar
        jMenuBar.add(jMenu_FM);

        //Menu 4 : Booking Management
        JMenu jMenu_BM = new JMenu("4.\tBooking Management");
        JMenuItem jMenuItem_BM_display = new JMenuItem("Display list booking");
        jMenu_BM.add(jMenuItem_BM_display);
        JMenuItem jMenuItem_BM_add = new JMenuItem("Add new booking");
        jMenu_BM.add(jMenuItem_BM_add);
        JMenuItem jMenuItem_BM_createContracts = new JMenuItem("3.Create new contracts");
        jMenu_BM.add(jMenuItem_BM_createContracts);
        JMenuItem jMenuItem_BM_displayContracts = new JMenuItem("4.Display list contracts");
        jMenu_BM.add(jMenuItem_BM_displayContracts);
        JMenuItem jMenuItem_BM_edit = new JMenuItem("5.Edit contracts");
        jMenu_BM.add(jMenuItem_BM_edit);
        JMenuItem jMenuItem_BM_return = new JMenuItem("6.Return main menu");
        jMenu_BM.add(jMenuItem_BM_return);
        //Thanh gach ngang
        jMenu_BM.addSeparator();
        //Them menu con vao menu bar
        jMenuBar.add(jMenu_BM);


        // Menu 5 : Promotion Management
        JMenu jMenu_PM = new JMenu("5.\tPromotion Management");
        JMenuItem jMenuItem_PM_displayService = new JMenuItem("1.Display list customers use service ");
        jMenu_PM.add(jMenuItem_PM_displayService);
        JMenuItem jMenuItem_PM_displayVoucher = new JMenuItem("2.Display list customers use voucher");
        jMenu_PM.add(jMenuItem_PM_displayVoucher);
        JMenuItem jMenuItem_PM_return = new JMenuItem("3.Return main menu");
        jMenu_PM.add(jMenuItem_PM_return);
        //Thanh gach ngang
        jMenu_PM.addSeparator();
        //Them menu con vao menu bar
        jMenuBar.add(jMenu_PM);

        frame.setJMenuBar(jMenuBar);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
