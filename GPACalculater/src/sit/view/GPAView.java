package sit.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sit.controller.GPAListener;

public class GPAView {

    private JFrame gpaFrame;
    private JLabel headCourse;
    private JLabel headGrade;
    private JLabel headCredit;
    private JLabel courseLabel[] ;
    private JLabel creditLabel[];
    private JTextField gradeTxtField[];
    private JLabel gpaLabel;
    private JTextField gpaTxtField;
    private JButton CalculateBtn;
    
    public GPAView(){ 
        courseLabel = new JLabel[6];
        creditLabel = new JLabel[6];
        gradeTxtField = new JTextField[6];
        initGui();

    }

    public void initGui() {
        gpaFrame = new JFrame("GPA Calculater");
        //Head
        headCourse = new JLabel("Courses"); 
        headGrade = new JLabel("Grade");
        headCredit = new JLabel("Credit");
        
        //Courses
        courseLabel[0] = new JLabel("INT105");
        courseLabel[1] = new JLabel("INT106");
        courseLabel[2] = new JLabel("MTH111");
        courseLabel[3] = new JLabel("INT107");
        courseLabel[4] = new JLabel("GEN111");
        courseLabel[5] = new JLabel("LNG103");
        gpaLabel = new JLabel("GPA");
        
        //Grade
        gradeTxtField[0] = new JTextField("");
        gradeTxtField[1] = new JTextField("");
        gradeTxtField[2] = new JTextField("");
        gradeTxtField[3] = new JTextField("");
        gradeTxtField[4] = new JTextField("");
        gradeTxtField[5] = new JTextField("");
        
        //Credit        
        creditLabel[0] = new JLabel("3");
        creditLabel[1] = new JLabel("3");
        creditLabel[2] = new JLabel("3");
        creditLabel[3] = new JLabel("3");
        creditLabel[4] = new JLabel("3");
        creditLabel[5] = new JLabel("3");
        gpaTxtField = new JTextField("X.XX");
        
        CalculateBtn = new JButton("Calculate");
    }
    
    public void loadGPAForm() {
        
        JPanel headPanel = new JPanel();
        GridLayout grid = new GridLayout(7,3);
        headPanel.setLayout(grid);
        
        //head Panel
        headPanel.add(headCourse);
        headPanel.add(headGrade);
        headPanel.add(headCredit);
        
        headPanel.add(courseLabel[0]);
        headPanel.add(gradeTxtField[0]);
        headPanel.add(creditLabel[0]);
        
        headPanel.add(courseLabel[1]);
        headPanel.add(gradeTxtField[1]);
        headPanel.add(creditLabel[1]);
        
        headPanel.add(courseLabel[2]);
        headPanel.add(gradeTxtField[2]);
        headPanel.add(creditLabel[2]);
        
        headPanel.add(courseLabel[3]);
        headPanel.add(gradeTxtField[3]);
        headPanel.add(creditLabel[3]);
        
        headPanel.add(courseLabel[4]);
        headPanel.add(gradeTxtField[4]);
        headPanel.add(creditLabel[4]);
        
        headPanel.add(courseLabel[5]);
        headPanel.add(gradeTxtField[5]);
        headPanel.add(creditLabel[5]);
        
        gpaFrame.add(headPanel, BorderLayout.NORTH);
        
        //GPA Panel
        JPanel gpaPanel1 = new JPanel();
        FlowLayout flow = new FlowLayout();
        flow.setAlignment(FlowLayout.CENTER);
        
        gpaPanel1.setLayout(flow);
        gpaPanel1.add(gpaLabel);
        
        
        JPanel gpaPanel2 = new JPanel();
        flow.setAlignment(FlowLayout.CENTER);
        
        gpaPanel2.setLayout(flow);
        gpaPanel2.add(gpaTxtField);
        
        
        
        gpaFrame.add(gpaPanel1, BorderLayout.WEST);
        gpaFrame.add(gpaPanel2, BorderLayout.CENTER);
        
        //Calculate Panel
        JPanel calculatePanel = new JPanel();
        FlowLayout flow2 = new FlowLayout();
        flow2.setAlignment(FlowLayout.TRAILING);
        
        calculatePanel.setLayout(flow2);
        calculatePanel.add(CalculateBtn);
        
        gpaFrame.add(calculatePanel, BorderLayout.EAST);
        
        GPAListener gpaList = new GPAListener(gradeTxtField, creditLabel, gpaTxtField);
        CalculateBtn.addActionListener(gpaList);
        
        
        
        gpaFrame.setSize(700, 700);
        gpaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gpaFrame.pack();
        gpaFrame.setVisible(true);
    }

}
