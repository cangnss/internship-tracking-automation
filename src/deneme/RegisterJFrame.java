/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Can
 */
public class RegisterJFrame extends javax.swing.JFrame {

    byte[] photo = null;
    String filename = null;
    private Hashtable hash = new Hashtable();
    private Hashtable hash2 = new Hashtable();

    /**
     * Creates new form RegisterJFrame
     */
    public RegisterJFrame() {
        initComponents();
        studentRegisterPanel.setVisible(true);
        instructorRegisterPanel.setVisible(false);
        corporationRegisterPanel.setVisible(false);
        URL iconURL3 = getClass().getResource("/icon/studentRegister.png");
        ImageIcon icon3 = new ImageIcon(new ImageIcon(iconURL3).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        generalLabel.setIcon(icon3);

        ArrayList<Corporation> corporations = CorporationController.getAllCorporation();
        if (corporations.isEmpty()) {
            studentCorporationNameCB.addItem("Corporation yok");
        } else {
            for (int i = 0; i < corporations.size(); i++) {
                studentCorporationNameCB.addItem(corporations.get(i).getC_name());
            }
        }

        String[] faculty = {"Select an item", "Faculty of Aeronautics and Space", "Faculty of Engineering and Natural Sciences", "Faculty of Health Sciences", "Faculty of Architecture and Fine Arts"};
        studentFacultyCB.setModel(new DefaultComboBoxModel<>(faculty));
        studentFacultyCB.addItemListener(studentItemIC);

        String[] facultyInstructor = {"Select an item", "Faculty of Aeronautics and Space", "Faculty of Engineering and Natural Sciences", "Faculty of Health Sciences", "Faculty of Architecture and Fine Arts"};
        instructorFacultyCB.setModel(new DefaultComboBoxModel<>(facultyInstructor));
        instructorFacultyCB.addItemListener(instructorItemIC);

        studentDepartmentCB.addItemListener(sc);
    }
    ItemListener sc = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            ArrayList<Instructor> instructors = UserController.displayInstructor();
            String item = "";
            instructorCB.removeAllItems();
            instructorCB.addItem("Select an item");
            for (int i = 0; i < instructors.size(); i++) {
                
                if (instructors.get(i).getDepartment_name().equals(e.getItem())) {
                    item = instructors.get(i).getFirstname() + " " + instructors.get(i).getLastname();
                     
                    instructorCB.addItem(item);
                }
            }
        }
    };

    ItemListener instructorItemIC = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem() == "Faculty of Aeronautics and Space") {
                instructorDepartmentCB.removeAllItems();
                instructorDepartmentCB.addItem("Select an item");
                instructorDepartmentCB.addItem("Aircraft Engineering");
            } else if (e.getItem() == "Faculty of Engineering and Natural Sciences") {
                instructorDepartmentCB.removeAllItems();
                instructorDepartmentCB.addItem("Select an item");
                instructorDepartmentCB.addItem("Computer Engineering");
            } else if (e.getItem() == "Faculty of Health Sciences") {
                instructorDepartmentCB.removeAllItems();
                instructorDepartmentCB.addItem("Select an item");
                instructorDepartmentCB.addItem("Nutrition and Dietetics");
            } else if (e.getItem() == "Faculty of Architecture and Fine Arts") {
                instructorDepartmentCB.removeAllItems();
                instructorDepartmentCB.addItem("Select an item");
                instructorDepartmentCB.addItem("Architecture");
            }
        }
    };
    ItemListener studentItemIC = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem() == "Faculty of Aeronautics and Space") {
                studentDepartmentCB.removeAllItems();
                studentDepartmentCB.addItem("Select an item");
                studentDepartmentCB.addItem("Aircraft Engineering");
            } else if (e.getItem() == "Faculty of Engineering and Natural Sciences") {
                studentDepartmentCB.removeAllItems();
                studentDepartmentCB.addItem("Select an item");
                studentDepartmentCB.addItem("Computer Engineering");
            } else if (e.getItem() == "Faculty of Health Sciences") {
                studentDepartmentCB.removeAllItems();
                studentDepartmentCB.addItem("Select an item");
                studentDepartmentCB.addItem("Nutrition and Dietetics");
            } else if (e.getItem() == "Faculty of Architecture and Fine Arts") {
                studentDepartmentCB.removeAllItems();
                studentDepartmentCB.addItem("Select an item");
                studentDepartmentCB.addItem("Architecture");
            }
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        studentRegisterRB = new javax.swing.JRadioButton();
        instructorRegisterRB = new javax.swing.JRadioButton();
        corporationRegisterRB = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        studentRegisterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentFirstnameTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        studentLastnameTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        studentBirthdayTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        studentFacultyCB = new javax.swing.JComboBox<>();
        studentDepartmentCB = new javax.swing.JComboBox<>();
        instructorCB = new javax.swing.JComboBox<>();
        studentEmailTf = new javax.swing.JTextField();
        studentGanoTf = new javax.swing.JTextField();
        studentAddressTf = new javax.swing.JTextField();
        studentPhoneTf = new javax.swing.JTextField();
        studentPhotoTf = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        studentNoTf = new javax.swing.JTextField();
        uploadPhotoBtn = new javax.swing.JButton();
        studentPasswordTf = new javax.swing.JPasswordField();
        jLabel33 = new javax.swing.JLabel();
        studentCorporationNameCB = new javax.swing.JComboBox<>();
        instructorRegisterPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        instructorFacultyCB = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        instructorDepartmentCB = new javax.swing.JComboBox<>();
        instructorFirstnameTf = new javax.swing.JTextField();
        instructorLastnameTf = new javax.swing.JTextField();
        instructorBirthdayTf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        usernameTf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        instructorEmailTf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        instructorPhoneTf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        instructorAddressTf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        instructorPhotoTf = new javax.swing.JTextField();
        uploadPhotoInstructorBtn = new javax.swing.JButton();
        instructorPasswordTf = new javax.swing.JPasswordField();
        corporationRegisterPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        corporationNameTf = new javax.swing.JTextField();
        corporationEmailTf = new javax.swing.JTextField();
        corporationPhoneTf = new javax.swing.JTextField();
        corporationTypeCB = new javax.swing.JComboBox<>();
        corporationAddressTf = new javax.swing.JTextField();
        corporationSector = new javax.swing.JComboBox<>();
        corporationPhoto = new javax.swing.JTextField();
        corporationUploadPhotoBtn = new javax.swing.JButton();
        corporationPasswordTf = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        generalLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(studentRegisterRB);
        studentRegisterRB.setSelected(true);
        studentRegisterRB.setText("Student");
        studentRegisterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRegisterRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(instructorRegisterRB);
        instructorRegisterRB.setText("Instructor");
        instructorRegisterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorRegisterRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(corporationRegisterRB);
        corporationRegisterRB.setText("Corporation");
        corporationRegisterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corporationRegisterRBActionPerformed(evt);
            }
        });

        studentRegisterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Student"));

        jLabel1.setText("Firstname: ");

        jLabel2.setText("Lastname:");

        jLabel3.setText("Birthday: ");

        jLabel4.setText("Faculty: ");

        jLabel5.setText("Department: ");

        jLabel6.setText("Instructor: ");

        jLabel7.setText("E-mail: ");

        jLabel8.setText("Password: ");

        jLabel9.setText("Gano: ");

        jLabel10.setText("Address: ");

        jLabel11.setText("Phone: ");

        jLabel12.setText("Photo: ");

        jLabel32.setText("Student No: ");

        uploadPhotoBtn.setText("UPLOAD PHOTO");
        uploadPhotoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadPhotoBtnMouseClicked(evt);
            }
        });

        jLabel33.setText("Corporation:");

        studentCorporationNameCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Item", "AYBU", "CENG" }));

        javax.swing.GroupLayout studentRegisterPanelLayout = new javax.swing.GroupLayout(studentRegisterPanel);
        studentRegisterPanel.setLayout(studentRegisterPanelLayout);
        studentRegisterPanelLayout.setHorizontalGroup(
            studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentFirstnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentLastnameTf)
                        .addContainerGap())
                    .addGroup(studentRegisterPanelLayout.createSequentialGroup()
                        .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentRegisterPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentCorporationNameCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentRegisterPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(studentPhoneTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                            .addComponent(studentAddressTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(studentPhotoTf)))))
                            .addGroup(studentRegisterPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(studentGanoTf))))
                    .addGroup(studentRegisterPanelLayout.createSequentialGroup()
                        .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(instructorCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, 185, Short.MAX_VALUE)
                                .addComponent(studentEmailTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(studentPasswordTf)
                                .addComponent(studentDepartmentCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(studentFacultyCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentBirthdayTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNoTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentRegisterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uploadPhotoBtn)
                .addContainerGap())
        );
        studentRegisterPanelLayout.setVerticalGroup(
            studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studentFirstnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(studentLastnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentBirthdayTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(studentFacultyCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(studentDepartmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(instructorCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(studentEmailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(studentPasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(studentGanoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(studentCorporationNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(studentPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentPhotoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uploadPhotoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(studentNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        instructorRegisterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Instructor"));

        jLabel13.setText("Firstname: ");

        jLabel14.setText("Lastname: ");

        jLabel15.setText("Birthday: ");

        jLabel16.setText("Faculty: ");

        jLabel17.setText("Department: ");

        jLabel18.setText("Username: ");

        jLabel19.setText("E-mail: ");

        jLabel20.setText("Password: ");

        jLabel21.setText("Address: ");

        jLabel22.setText("Phone: ");

        jLabel23.setText("Photo: ");

        uploadPhotoInstructorBtn.setText("UPLOAD PHOTO");
        uploadPhotoInstructorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadPhotoInstructorBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout instructorRegisterPanelLayout = new javax.swing.GroupLayout(instructorRegisterPanel);
        instructorRegisterPanel.setLayout(instructorRegisterPanelLayout);
        instructorRegisterPanelLayout.setHorizontalGroup(
            instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(instructorPhotoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(instructorDepartmentCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(instructorFirstnameTf))
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(instructorLastnameTf))
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(24, 24, 24)
                        .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructorBirthdayTf)
                            .addComponent(instructorFacultyCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTf))
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(38, 38, 38)
                        .addComponent(instructorEmailTf))
                    .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                        .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructorAddressTf)
                            .addComponent(instructorPhoneTf)
                            .addComponent(instructorPasswordTf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, instructorRegisterPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(uploadPhotoInstructorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        instructorRegisterPanelLayout.setVerticalGroup(
            instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructorRegisterPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(instructorFirstnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(instructorLastnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(instructorBirthdayTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(instructorFacultyCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(instructorDepartmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(usernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(instructorEmailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(instructorPasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructorAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(instructorPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(instructorRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instructorPhotoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addComponent(uploadPhotoInstructorBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        corporationRegisterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Corporation"));

        jLabel24.setText("Corporation Name: ");

        jLabel25.setText("Corporation E-mail: ");

        jLabel26.setText("Corporation Password: ");

        jLabel27.setText("Corporation Phone: ");

        jLabel28.setText("Corporation Type: ");

        jLabel29.setText("Corporation Address: ");

        jLabel30.setText("Corporation Sector: ");

        jLabel31.setText("Corporation Photo: ");

        corporationTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        corporationSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        corporationUploadPhotoBtn.setText("UPLOAD PHOTO");
        corporationUploadPhotoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corporationUploadPhotoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout corporationRegisterPanelLayout = new javax.swing.GroupLayout(corporationRegisterPanel);
        corporationRegisterPanel.setLayout(corporationRegisterPanelLayout);
        corporationRegisterPanelLayout.setHorizontalGroup(
            corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corporationRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(corporationRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(corporationNameTf))
                    .addGroup(corporationRegisterPanelLayout.createSequentialGroup()
                        .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corporationEmailTf)
                            .addComponent(corporationPhoneTf)
                            .addComponent(corporationTypeCB, 0, 193, Short.MAX_VALUE)
                            .addComponent(corporationAddressTf)
                            .addComponent(corporationSector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(corporationPhoto)
                            .addComponent(corporationPasswordTf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corporationRegisterPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(corporationUploadPhotoBtn)))
                .addContainerGap())
        );
        corporationRegisterPanelLayout.setVerticalGroup(
            corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corporationRegisterPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(corporationNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(corporationEmailTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(corporationPasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(corporationPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(corporationTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(corporationAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(corporationSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(corporationRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(corporationPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(corporationUploadPhotoBtn)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        registerBtn.setText("Register");
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });

        messageLabel.setText("jLabel33");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(messageLabel)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(studentRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructorRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(corporationRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(generalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructorRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corporationRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messageLabel)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(studentRegisterRB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(instructorRegisterRB)
                .addGap(28, 28, 28)
                .addComponent(corporationRegisterRB))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corporationRegisterRB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentRegisterRB)
                        .addComponent(instructorRegisterRB)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentRegisterRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRegisterRBActionPerformed
        URL iconURL3 = getClass().getResource("/icon/studentRegister.png");
        ImageIcon icon3 = new ImageIcon(new ImageIcon(iconURL3).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        generalLabel.setIcon(icon3);
        studentRegisterPanel.setVisible(true);
        instructorRegisterPanel.setVisible(false);
        corporationRegisterPanel.setVisible(false);
    }//GEN-LAST:event_studentRegisterRBActionPerformed

    private void instructorRegisterRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorRegisterRBActionPerformed
        URL iconURL1 = getClass().getResource("/icon/teacherRegister.png");
        ImageIcon icon2 = new ImageIcon(new ImageIcon(iconURL1).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        generalLabel.setIcon(icon2);
        studentRegisterPanel.setVisible(false);
        instructorRegisterPanel.setVisible(true);
        corporationRegisterPanel.setVisible(false);
    }//GEN-LAST:event_instructorRegisterRBActionPerformed

    private void corporationRegisterRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corporationRegisterRBActionPerformed
        URL iconURL1 = getClass().getResource("/icon/corporationRegister.png");
        ImageIcon icon2 = new ImageIcon(new ImageIcon(iconURL1).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        generalLabel.setIcon(icon2);
        studentRegisterPanel.setVisible(false);
        instructorRegisterPanel.setVisible(false);
        corporationRegisterPanel.setVisible(true);
    }//GEN-LAST:event_corporationRegisterRBActionPerformed

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
        // TODO add your handling code here:

        if (studentRegisterRB.isSelected()) {
            String firstname = studentFirstnameTf.getText();
            String lastname = studentLastnameTf.getText();
            String birthday = studentBirthdayTf.getText();
            String faculty_name = studentFacultyCB.getSelectedItem().toString();
            String department_name = studentDepartmentCB.getSelectedItem().toString();
            String instructor = instructorCB.getSelectedItem().toString();
            String email = studentEmailTf.getText();
            String password = studentPasswordTf.getText();
            double gano = Double.parseDouble(studentGanoTf.getText());
            String address = studentAddressTf.getText();
            String phone = studentPhoneTf.getText();
            String photo = studentPhotoTf.getText();
            int studentNo = Integer.parseInt(studentNoTf.getText());
            String corporationName = studentCorporationNameCB.getSelectedItem().toString();

            Student student = new Student(studentNo, firstname, lastname, birthday, faculty_name, department_name, email, password, address, phone, photo, gano, corporationName);
            UserController.registerUser(student);
            messageLabel.setText("Student added");
            System.out.println(password);
            studentFirstnameTf.setText("");
            studentLastnameTf.setText("");
            studentBirthdayTf.setText("");
            studentEmailTf.setText("");
            studentPasswordTf.setText("");
            studentGanoTf.setText("");
            studentAddressTf.setText("");
            studentPhoneTf.setText("");
            studentPhotoTf.setText("");
            studentNoTf.setText("");

        }

        if (instructorRegisterRB.isSelected()) {
            String firstname = instructorFirstnameTf.getText();
            String lastname = instructorLastnameTf.getText();
            String birthday = instructorBirthdayTf.getText();
            String faculty_name = instructorFacultyCB.getSelectedItem().toString();
            String department_name = instructorDepartmentCB.getSelectedItem().toString();
            String username = usernameTf.getText();
            String email = instructorFirstnameTf.getText();
            String password = instructorPasswordTf.getText();
            String address = instructorAddressTf.getText();
            String phone = instructorPhoneTf.getText();
            String photo = instructorPhotoTf.getText();
            Instructor instructor = new Instructor(firstname, lastname, birthday, faculty_name, department_name, email, password, address, phone, photo, username);
            UserController.registerUser(instructor);
            messageLabel.setText("Instructor added");
            System.out.println(password);

            instructorFirstnameTf.setText("");
            instructorLastnameTf.setText("");
            instructorBirthdayTf.setText("");
            usernameTf.setText("");
            instructorEmailTf.setText("");
            instructorPasswordTf.setText("");
            instructorAddressTf.setText("");
            instructorPhoneTf.setText("");
            instructorPhotoTf.setText("");

        }

        if (corporationRegisterRB.isSelected()) {
            String c_name = corporationNameTf.getText();
            String c_email = corporationEmailTf.getText();
            String c_password = new String(corporationPasswordTf.getPassword());
            String c_phone = corporationPhoneTf.getText();
            String c_type = corporationTypeCB.getSelectedItem().toString();
            String c_address = corporationAddressTf.getText();
            String c_sector = corporationSector.getSelectedItem().toString();
            String c_photo = corporationPhoto.getText();

            Corporation corporation = new Corporation(c_name, c_email, c_password, c_phone, c_type, c_address, c_sector, c_photo);
            CorporationController.registerCorporation(corporation);
            messageLabel.setText("Corporation added");

        }
        this.dispose();


    }//GEN-LAST:event_registerBtnMouseClicked

    private void uploadPhotoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadPhotoBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        //jLabel1.setIcon(new ImageIcon(f.toString()));
        filename = f.getAbsolutePath();
        studentPhotoTf.setText(filename);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int i; (i = fis.read(buf)) != -1;) {
                bos.write(buf, 0, i);
            }
            photo = bos.toByteArray();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_uploadPhotoBtnMouseClicked

    private void uploadPhotoInstructorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadPhotoInstructorBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        jLabel1.setIcon(new ImageIcon(f.toString()));
        filename = f.getAbsolutePath();
        instructorPhotoTf.setText(filename);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int i; (i = fis.read(buf)) != -1;) {
                bos.write(buf, 0, i);
            }
            photo = bos.toByteArray();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_uploadPhotoInstructorBtnMouseClicked

    private void corporationUploadPhotoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corporationUploadPhotoBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        jLabel1.setIcon(new ImageIcon(f.toString()));
        filename = f.getAbsolutePath();
        corporationPhoto.setText(filename);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int i; (i = fis.read(buf)) != -1;) {
                bos.write(buf, 0, i);
            }
            photo = bos.toByteArray();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_corporationUploadPhotoBtnMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField corporationAddressTf;
    private javax.swing.JTextField corporationEmailTf;
    private javax.swing.JTextField corporationNameTf;
    private javax.swing.JPasswordField corporationPasswordTf;
    private javax.swing.JTextField corporationPhoneTf;
    private javax.swing.JTextField corporationPhoto;
    private javax.swing.JPanel corporationRegisterPanel;
    private javax.swing.JRadioButton corporationRegisterRB;
    private javax.swing.JComboBox<String> corporationSector;
    private javax.swing.JComboBox<String> corporationTypeCB;
    private javax.swing.JButton corporationUploadPhotoBtn;
    private javax.swing.JLabel generalLabel;
    private javax.swing.JTextField instructorAddressTf;
    private javax.swing.JTextField instructorBirthdayTf;
    private javax.swing.JComboBox<String> instructorCB;
    private javax.swing.JComboBox<String> instructorDepartmentCB;
    private javax.swing.JTextField instructorEmailTf;
    private javax.swing.JComboBox<String> instructorFacultyCB;
    private javax.swing.JTextField instructorFirstnameTf;
    private javax.swing.JTextField instructorLastnameTf;
    private javax.swing.JPasswordField instructorPasswordTf;
    private javax.swing.JTextField instructorPhoneTf;
    private javax.swing.JTextField instructorPhotoTf;
    private javax.swing.JPanel instructorRegisterPanel;
    private javax.swing.JRadioButton instructorRegisterRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField studentAddressTf;
    private javax.swing.JTextField studentBirthdayTf;
    private javax.swing.JComboBox<String> studentCorporationNameCB;
    private javax.swing.JComboBox<String> studentDepartmentCB;
    private javax.swing.JTextField studentEmailTf;
    private javax.swing.JComboBox<String> studentFacultyCB;
    private javax.swing.JTextField studentFirstnameTf;
    private javax.swing.JTextField studentGanoTf;
    private javax.swing.JTextField studentLastnameTf;
    private javax.swing.JTextField studentNoTf;
    private javax.swing.JPasswordField studentPasswordTf;
    private javax.swing.JTextField studentPhoneTf;
    private javax.swing.JTextField studentPhotoTf;
    private javax.swing.JPanel studentRegisterPanel;
    private javax.swing.JRadioButton studentRegisterRB;
    private javax.swing.JButton uploadPhotoBtn;
    private javax.swing.JButton uploadPhotoInstructorBtn;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables

}
