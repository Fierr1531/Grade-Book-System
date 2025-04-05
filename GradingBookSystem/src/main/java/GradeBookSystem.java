import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
public class GradeBookSystem extends javax.swing.JFrame {
    
    public GradeBookSystem() { 
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel Textstudentfullname = new javax.swing.JLabel();
        TextFieldstudentfullname = new javax.swing.JTextField();
        javax.swing.JLabel StudentIDLabel = new javax.swing.JLabel();
        TextFieldstudentID = new javax.swing.JTextField();
        javax.swing.JLabel Textsubject = new javax.swing.JLabel();
        TextFieldsubject = new javax.swing.JTextField();
        javax.swing.JLabel Textp1grade = new javax.swing.JLabel();
        TFp1grade = new javax.swing.JTextField();
        TFp2grade = new javax.swing.JTextField();
        javax.swing.JLabel Textp2grade = new javax.swing.JLabel();
        javax.swing.JLabel Textp3grade = new javax.swing.JLabel();
        TFp3grade = new javax.swing.JTextField();
        javax.swing.JButton CalculateFinalGrade = new javax.swing.JButton();
        javax.swing.JButton ButtonSubmit = new javax.swing.JButton();
        javax.swing.JButton Clearbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        upside = new javax.swing.JPanel();
        searchbutton = new javax.swing.JButton();
        textfieldbuttonsearch = new javax.swing.JTextField();
        deletebutton = new javax.swing.JButton();
        TITLE = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(158, 223, 156));

        jPanel2.setBackground(new java.awt.Color(158, 223, 156));

        Textstudentfullname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Textstudentfullname.setText("Student Full Name");
        Textstudentfullname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TextFieldstudentfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldstudentfullnameActionPerformed(evt);
            }
        });

        StudentIDLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        StudentIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentIDLabel.setText("Student ID");

        TextFieldstudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldstudentIDActionPerformed(evt);
            }
        });

        Textsubject.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Textsubject.setText("Subject:");
        Textsubject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TextFieldsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldsubjectActionPerformed(evt);
            }
        });

        Textp1grade.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Textp1grade.setText("P1 - Grade:");
        Textp1grade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TFp1grade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TFp1grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFp1gradeActionPerformed(evt);
            }
        });

        TFp2grade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TFp2grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFp2gradeActionPerformed(evt);
            }
        });

        Textp2grade.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Textp2grade.setText("P2 - Grade:");
        Textp2grade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Textp3grade.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Textp3grade.setText("P3 - Grade:");
        Textp3grade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TFp3grade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TFp3grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFp3gradeActionPerformed(evt);
            }
        });

        CalculateFinalGrade.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        CalculateFinalGrade.setText("Calculate");
        CalculateFinalGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateFinalGradeActionPerformed(evt);
            }
        });

        ButtonSubmit.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        ButtonSubmit.setText("Submit");
        ButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubmitActionPerformed(evt);
            }
        });

        Clearbutton.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Clearbutton.setText("Clear");
        Clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Textstudentfullname)
                            .addComponent(TextFieldstudentfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(Clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Textp1grade)
                                            .addComponent(Textp2grade)
                                            .addComponent(Textp3grade))
                                        .addComponent(Textsubject))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextFieldsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TFp3grade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(TFp2grade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(TFp1grade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(CalculateFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(StudentIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Textstudentfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldstudentfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(StudentIDLabel)
                .addGap(8, 8, 8)
                .addComponent(TextFieldstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textsubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Textp1grade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFp1grade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Textp2grade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFp2grade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Textp3grade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(TFp3grade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(CalculateFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student ID", "Subject", "P1 Grade", "P2 Grade", "P3 Grade", "Final Grade", "Letter Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        upside.setBackground(new java.awt.Color(158, 223, 156));

        searchbutton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        searchbutton.setText("SEARCH");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        textfieldbuttonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldbuttonsearchActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(204, 0, 51));
        deletebutton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        deletebutton.setText("DELETE");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        TITLE.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        TITLE.setText("GRADE BOOK SYSTEM");

        javax.swing.GroupLayout upsideLayout = new javax.swing.GroupLayout(upside);
        upside.setLayout(upsideLayout);
        upsideLayout.setHorizontalGroup(
            upsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upsideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(upsideLayout.createSequentialGroup()
                        .addComponent(textfieldbuttonsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(deletebutton)
                .addGap(243, 243, 243))
        );
        upsideLayout.setVerticalGroup(
            upsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upsideLayout.createSequentialGroup()
                .addComponent(TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(upsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfieldbuttonsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(upsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deletebutton)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldstudentfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldstudentfullnameActionPerformed
        //macode 2
        String fullname = TextFieldstudentfullname.getText().trim();
        if (fullname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student Full Name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            TextFieldstudentfullname.requestFocus(); // Focus back on the field
            
        }
    }//GEN-LAST:event_TextFieldstudentfullnameActionPerformed

    private void TextFieldstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldstudentIDActionPerformed
        // Macode 3
        String StudentID = TextFieldstudentID.getText().trim();
        
        String Pattern = "02-\\d{4}-\\d{4,6}";
        
        if (!StudentID.matches(Pattern)) {
            JOptionPane.showMessageDialog(this, "Student ID must start with '00-' and follow the format 00-0000-0000 or 02-0000-00000.", "Error", JOptionPane.ERROR_MESSAGE);
            TextFieldstudentID.setText("");
            TextFieldstudentID.requestFocus();
        }
    }//GEN-LAST:event_TextFieldstudentIDActionPerformed

    private void TextFieldsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldsubjectActionPerformed
        //macode 4
        String Subject = TextFieldsubject.getText().trim();
        
        if (Subject.isEmpty()){
            JOptionPane.showMessageDialog(this, "Subject cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            TextFieldsubject.requestFocus();
            return;
        }
        
        
        
        if (Subject.matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Do not use numbers", "Error", JOptionPane.ERROR_MESSAGE);
            TextFieldsubject.setText("");
            TextFieldsubject.requestFocus();
            return;
        }
        
        if (!Subject.matches("[a-zA-Z\\s]+")){
            JOptionPane.showMessageDialog(this, "Subject must contain only letters and spaces.", "Error", JOptionPane.ERROR_MESSAGE);
            TextFieldsubject.setText("");
            TextFieldsubject.requestFocus();
        }
    }//GEN-LAST:event_TextFieldsubjectActionPerformed

    private void TFp1gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFp1gradeActionPerformed
        // Macode 6
        validateGradeField(TFp1grade);
    }//GEN-LAST:event_TFp1gradeActionPerformed

    private void TFp2gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFp2gradeActionPerformed
        // macode 7
        validateGradeField(TFp2grade);
    }//GEN-LAST:event_TFp2gradeActionPerformed

    private void TFp3gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFp3gradeActionPerformed
        // MAcode 8
        validateGradeField(TFp3grade);
    }//GEN-LAST:event_TFp3gradeActionPerformed

    private void CalculateFinalGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateFinalGradeActionPerformed
        // macode 9
         try {
            double p1 = Double.parseDouble(TFp1grade.getText());
            double p2 = Double.parseDouble(TFp2grade.getText());
            double p3 = Double.parseDouble(TFp3grade.getText());

            if (p1 > 100 || p2 > 100 || p3 > 100) {
                JOptionPane.showMessageDialog(this, "Grades should not exceed 100.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double finalGrade = (p1 + p2 + p3) / 3.0f;
            JOptionPane.showMessageDialog(this, "Final Grade: " + finalGrade, "Grade Calculation", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for grades.", "Error", JOptionPane.ERROR_MESSAGE);
        }                 
    }//GEN-LAST:event_CalculateFinalGradeActionPerformed

    private void ButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubmitActionPerformed
         // macode 10
        String fullname = TextFieldstudentfullname.getText();
        String StudentID = TextFieldstudentID.getText();
        String Subject = TextFieldsubject.getText();
        String p1 = TFp1grade.getText();
        String p2 = TFp2grade.getText();
        String p3 = TFp3grade.getText();
  

        if (fullname.isEmpty() || StudentID.isEmpty() || Subject.isEmpty() || p1.isEmpty() || p2.isEmpty() || p3.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        if (!StudentID.matches("02-\\d{4}-\\d{4,6}")) {
            JOptionPane.showMessageDialog(this, "Student ID must be in the format 02-2222-2222 or 02-2222-22222.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         
        try {
            double p1GradeValue = Double.parseDouble(p1);
            double p2GradeValue = Double.parseDouble(p2);
            double p3GradeValue = Double.parseDouble(p3);

            if (p1GradeValue > 100 || p2GradeValue > 100 || p3GradeValue > 100) {
                JOptionPane.showMessageDialog(this, "Grades should not exceed 100.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            
            double finalGrade = (p1GradeValue + p2GradeValue + p3GradeValue) / 3.0f;
            String letterGrade = LetterGradeConverter(finalGrade);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{fullname, StudentID, Subject, p1GradeValue, p2GradeValue, p3GradeValue, finalGrade, letterGrade});
            
            TextFieldstudentfullname.setText("");
            TextFieldstudentID.setText("");
            TextFieldsubject.setText("");
            TFp1grade.setText("");
            TFp2grade.setText("");
            TFp3grade.setText("");
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Please enter valid numbers for grades.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_ButtonSubmitActionPerformed

    private void ClearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbuttonActionPerformed
        //macode 1
        TextFieldstudentfullname.setText("");
        TextFieldstudentID.setText("");
        TextFieldsubject.setText("");
        TFp1grade.setText("");
        TFp2grade.setText("");
        TFp3grade.setText("");
        
    }//GEN-LAST:event_ClearbuttonActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        //macode 12
        String searchText = textfieldbuttonsearch.getText().trim().toLowerCase();
        
       if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name or Student ID to search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
       } 
       
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       boolean found = false;
       
       jTable1.clearSelection();
       
       
        for (int i = 0; i < model.getRowCount(); i++) {
            String studentName = model.getValueAt(i, 0).toString().toLowerCase(); // Student Name
            String studentID = model.getValueAt(i, 1).toString().toLowerCase(); // Student ID

             
            if (studentName.contains(searchText) || studentID.contains(searchText)) {
                jTable1.addRowSelectionInterval(i, i); // Select the matching row
                found = true;

            }
        }
        
        if (!found) {
        JOptionPane.showMessageDialog(this, "No matching records found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
    }

       
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void textfieldbuttonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldbuttonsearchActionPerformed
        searchbuttonActionPerformed(evt);
    }//GEN-LAST:event_textfieldbuttonsearchActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        //macode 13
        int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) {
        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
  
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, "Record deleted successfully.", "Deletion Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
    
        JOptionPane.showMessageDialog(this, "Please select a record to delete.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_deletebuttonActionPerformed

   
    private void validateGradeField(JTextField gradeField) {
        //macode 5
         try {
            double grade = Double.parseDouble(gradeField.getText());
            if (grade < 0 || grade > 100) {
                JOptionPane.showMessageDialog(this, "Grade must be between 0 and 100.", "Error", JOptionPane.ERROR_MESSAGE);
                gradeField.setText(""); // Clear the field if invalid
                gradeField.requestFocus(); // Focus back on the field
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the grade.", "Error", JOptionPane.ERROR_MESSAGE);
            gradeField.setText(""); // Clear the field if invalid
            gradeField.requestFocus(); // Focus back on the field
        }
    }    

    private String LetterGradeConverter(double finalGrade){
        if (finalGrade >= 100){
            return "A+";
        } else if (finalGrade > 95){
            return "A";      
        } else if (finalGrade > 90){
            return "A-";    
        } else if (finalGrade > 85){
            return "B+";    
        } else if (finalGrade > 80){
            return "B";
        } else if (finalGrade > 75){
            return "B-";
        } else if (finalGrade > 70){
            return "C+";
        } else if (finalGrade > 65){
            return "C";
        } else if (finalGrade > 60){
            return "C-";
        } else if (finalGrade > 55){
            return "D+";
        } else if (finalGrade > 49){
            return "D";
        } else {
            return "F";
        }
    }
            
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
            java.util.logging.Logger.getLogger(GradeBookSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeBookSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeBookSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeBookSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeBookSystem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFp1grade;
    private javax.swing.JTextField TFp2grade;
    private javax.swing.JTextField TFp3grade;
    private javax.swing.JLabel TITLE;
    private javax.swing.JTextField TextFieldstudentID;
    private javax.swing.JTextField TextFieldstudentfullname;
    private javax.swing.JTextField TextFieldsubject;
    private javax.swing.JButton deletebutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField textfieldbuttonsearch;
    private javax.swing.JPanel upside;
    // End of variables declaration//GEN-END:variables
}
