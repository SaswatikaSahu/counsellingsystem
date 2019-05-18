/*
 * java programme to select college and department..........
 */
package cousellingsystem;
import javax.swing.*;
import java.sql.*;


public class selection extends javax.swing.JFrame {

    /**
     * Creates new form selection
     */
    public selection() {
        initComponents();
        
        
    }

    public selection(String msg,String msg2,String msg3)
    {
        initComponents();
        System.out.println(msg+ " "+ msg2+" "+msg3);
        sname.setText(msg);
        sscore.setText(msg2);
        srank.setText(msg3);
         try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/testing", "Saswatika","Saswatika21*"); 
        String st= "select cname from COLLEGE";
        PreparedStatement pstmt= conn.prepareStatement(st);
        ResultSet rel=pstmt.executeQuery(st);
        while(rel.next())
        {
            collegeCombo.addItem(rel.getString(1));
            System.out.println(rel.getString(1));
        }
        String st2="select dname from university";
        PreparedStatement pstmt2= conn.prepareStatement(st2);
        ResultSet rel2=pstmt.executeQuery(st2);
        while(rel2.next())
        {
            deptCombo.addItem(rel2.getString(1));
            System.out.println(rel2.getString(1));
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        collegeCombo = new javax.swing.JComboBox();
        deptCombo = new javax.swing.JComboBox();
        sname = new javax.swing.JLabel();
        sscore = new javax.swing.JLabel();
        srank = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Hello, ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Institute");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Department");

        collegeCombo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        collegeCombo.setForeground(new java.awt.Color(51, 0, 51));

        deptCombo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deptCombo.setForeground(new java.awt.Color(51, 0, 51));

        sname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sname.setForeground(new java.awt.Color(51, 0, 51));

        sscore.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sscore.setForeground(new java.awt.Color(51, 0, 51));

        srank.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        srank.setForeground(new java.awt.Color(51, 0, 51));
        srank.setText("  ");

        submit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(51, 0, 51));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Mr/Miss.");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Your Score is:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Your Rank is:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(collegeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(srank, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(sscore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submit)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(deptCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 379, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(sname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sscore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(srank)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collegeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>                        

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String sql= "select * from  college where cname = ";
        String sql2="select * from university where dname= ";
       
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/testing", "Saswatika","Saswatika21*"); 
            
            String cmb= collegeCombo.getSelectedItem().toString();
            sql= sql+"\"" +cmb + "\"";
            PreparedStatement ps= conn.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs=ps.executeQuery();
            
              while(rs.next())
            {
            
            System.out.println(rs.getString(2));
            }
           
            
            String cmb2= deptCombo.getSelectedItem().toString();
            sql2=sql2+"\""+cmb2 +"\"";
            PreparedStatement ps2= conn.prepareStatement(sql2);
             System.out.println(sql2);
            ResultSet rs2=ps2.executeQuery();
             
                while(rs2.next())
            {
            
            System.out.println(rs2.getString(1));
            }
            
            String sql3="update  student_db set scollege = "+"\""+cmb+"\""+
                    ",sdept= "+"\""+cmb2+"\""+" where name= " +"\""+sname.getText()+"\"";
            
            System.out.println(sql3);
            PreparedStatement ps3=conn.prepareStatement(sql3);
            ps3.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Submitted");
           /* for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    String sql4="insert into col_dept (college_name,dept_name) values ("+"\""+rs.next()+
                            "\""+rs2.next()+"\"";
                            
                    PreparedStatement ps4=conn.prepareStatement(sql4);
                    ps4.executeUpdate();
                    
                }
            }*/
           
            
              String sql4="update col_dept set seat_no=seat_no-1 where college_name="+"\""+cmb+"\""+"and dept_name="+"\""
                        +cmb2+"\"";
              System.out.println(sql4);
              PreparedStatement ps4=conn.prepareStatement(sql4);
              ps4.executeUpdate();
              JOptionPane.showMessageDialog(null,"Successfully updated");
              
              
          
             conn.close(); 
            
        }catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,e);
        }
    }                                      

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
            java.util.logging.Logger.getLogger(selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox collegeCombo;
    private javax.swing.JComboBox deptCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel sname;
    private javax.swing.JLabel srank;
    private javax.swing.JLabel sscore;
    private javax.swing.JButton submit;
    // End of variables declaration                   
}
