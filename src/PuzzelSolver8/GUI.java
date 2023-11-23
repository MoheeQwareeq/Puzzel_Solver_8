package PuzzelSolver8;

import java.awt.Color;
import java.util.Stack;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    Integer count = -1;
    int[][] startPoint = new int[3][3];
    int[][] endPoint = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    boolean checkCount[] = new boolean[9];
    Stack<int[][]> stack;
    private Thread gui;
    boolean S = false;
    boolean E = false;

    public GUI() {
        initComponents();
        Cover.setVisible(true);
        Cover1.setVisible(false);
        Cover2.setVisible(false);
        this.setLocationRelativeTo(null);
        setTitle("Puzzle Solver 8");
        A_star.setSelected(false);
        heuristic2.setSelected(false);
        algorithem.add(greedy);
        algorithem.add(A_star);
        heuristics.add(heuristic1);
        heuristics.add(heuristic2);
        Next.setVisible(false);
        Default.setSelected(true);
        With_end_point.add(Default);
        With_end_point.add(Custom);
        save_end.setVisible(false);
        Select_end_label.setVisible(false);
        Solve_it.setVisible(true);
        Algorithm1.setVisible(false);
        jPanel1.setVisible(false);
        jSlider2.setValue(1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        algorithem = new javax.swing.ButtonGroup();
        heuristics = new javax.swing.ButtonGroup();
        With_end_point = new javax.swing.ButtonGroup();
        Cover = new javax.swing.JPanel();
        Start = new javax.swing.JButton();
        Custom = new javax.swing.JRadioButton();
        Default = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Cover1 = new javax.swing.JPanel();
        lego1 = new javax.swing.JPanel();
        T1 = new javax.swing.JLabel();
        lego2 = new javax.swing.JPanel();
        T2 = new javax.swing.JLabel();
        lego3 = new javax.swing.JPanel();
        T3 = new javax.swing.JLabel();
        lego4 = new javax.swing.JPanel();
        T4 = new javax.swing.JLabel();
        lego5 = new javax.swing.JPanel();
        T5 = new javax.swing.JLabel();
        lego6 = new javax.swing.JPanel();
        T6 = new javax.swing.JLabel();
        lego7 = new javax.swing.JPanel();
        T7 = new javax.swing.JLabel();
        lego8 = new javax.swing.JPanel();
        T8 = new javax.swing.JLabel();
        lego9 = new javax.swing.JPanel();
        T9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSlider2 = new javax.swing.JSlider();
        frame = new javax.swing.JLabel();
        icon8 = new javax.swing.JLabel();
        Solve_it = new javax.swing.JButton();
        greedy = new javax.swing.JRadioButton();
        A_star = new javax.swing.JRadioButton();
        Puzzle_solver1 = new javax.swing.JLabel();
        heuristic1 = new javax.swing.JRadioButton();
        heuristic2 = new javax.swing.JRadioButton();
        Algorithm = new javax.swing.JLabel();
        Heuristics1 = new javax.swing.JLabel();
        Start_and_end_points = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Algorithm1 = new javax.swing.JLabel();
        Cover2 = new javax.swing.JPanel();
        leg1 = new javax.swing.JPanel();
        t1 = new javax.swing.JLabel();
        leg2 = new javax.swing.JPanel();
        t2 = new javax.swing.JLabel();
        leg3 = new javax.swing.JPanel();
        t3 = new javax.swing.JLabel();
        leg4 = new javax.swing.JPanel();
        t4 = new javax.swing.JLabel();
        leg5 = new javax.swing.JPanel();
        t5 = new javax.swing.JLabel();
        leg6 = new javax.swing.JPanel();
        t6 = new javax.swing.JLabel();
        leg7 = new javax.swing.JPanel();
        t7 = new javax.swing.JLabel();
        leg8 = new javax.swing.JPanel();
        t8 = new javax.swing.JLabel();
        leg9 = new javax.swing.JPanel();
        t9 = new javax.swing.JLabel();
        frame1 = new javax.swing.JLabel();
        icon9 = new javax.swing.JLabel();
        Puzzle_solver2 = new javax.swing.JLabel();
        Select_end_label = new javax.swing.JLabel();
        Heuristics3 = new javax.swing.JLabel();
        save_start = new javax.swing.JButton();
        Next = new javax.swing.JLabel();
        clear_start = new javax.swing.JButton();
        save_end = new javax.swing.JButton();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cover.setBackground(new java.awt.Color(0, 11, 66));
        Cover.setPreferredSize(new java.awt.Dimension(850, 600));
        Cover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Start.setFont(new java.awt.Font("Luminari", 1, 36)); // NOI18N
        Start.setForeground(new java.awt.Color(0, 51, 153));
        Start.setText("Let's Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        Cover.add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 210, 60));

        Custom.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Custom.setForeground(new java.awt.Color(0, 51, 153));
        Custom.setText("Custom");
        Custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomActionPerformed(evt);
            }
        });
        Cover.add(Custom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        Default.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Default.setForeground(new java.awt.Color(0, 51, 153));
        Default.setText("Default");
        Default.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultActionPerformed(evt);
            }
        });
        Cover.add(Default, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cover.jpg"))); // NOI18N
        Cover.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        getContentPane().add(Cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Cover1.setBackground(new java.awt.Color(0, 11, 66));
        Cover1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 205)));
        Cover1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lego1.setBackground(new java.awt.Color(255, 255, 205));
        lego1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        lego1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T1.setForeground(new java.awt.Color(222, 37, 38));
        lego1.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        Cover1.add(lego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 110, 100));

        lego2.setBackground(new java.awt.Color(255, 255, 205));
        lego2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T2.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T2.setForeground(new java.awt.Color(222, 37, 38));
        lego2.add(T2);

        Cover1.add(lego2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 110, 100));

        lego3.setBackground(new java.awt.Color(255, 255, 205));
        lego3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T3.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T3.setForeground(new java.awt.Color(222, 37, 38));
        lego3.add(T3);

        Cover1.add(lego3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 110, 100));

        lego4.setBackground(new java.awt.Color(255, 255, 205));
        lego4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T4.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T4.setForeground(new java.awt.Color(222, 37, 38));
        lego4.add(T4);

        Cover1.add(lego4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 110, 100));

        lego5.setBackground(new java.awt.Color(255, 255, 205));
        lego5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T5.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T5.setForeground(new java.awt.Color(222, 37, 38));
        lego5.add(T5);

        Cover1.add(lego5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 110, 100));

        lego6.setBackground(new java.awt.Color(255, 255, 205));
        lego6.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T6.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T6.setForeground(new java.awt.Color(222, 37, 38));
        lego6.add(T6);

        Cover1.add(lego6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 110, 100));

        lego7.setBackground(new java.awt.Color(255, 255, 205));
        lego7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T7.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T7.setForeground(new java.awt.Color(222, 37, 38));
        lego7.add(T7);

        Cover1.add(lego7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 110, 100));

        lego8.setBackground(new java.awt.Color(255, 255, 205));
        lego8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T8.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T8.setForeground(new java.awt.Color(222, 37, 38));
        lego8.add(T8);

        Cover1.add(lego8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 110, 100));

        lego9.setBackground(new java.awt.Color(255, 255, 205));
        lego9.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));

        T9.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        T9.setForeground(new java.awt.Color(222, 37, 38));
        lego9.add(T9);

        Cover1.add(lego9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 110, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(222, 37, 38)));
        jPanel1.setLayout(null);

        jSlider2.setMaximum(2000);
        jPanel1.add(jSlider2);
        jSlider2.setBounds(0, 0, 200, 30);

        Cover1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 200, 30));

        frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/frame.png"))); // NOI18N
        Cover1.add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 450, 490));

        icon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        Cover1.add(icon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 180, 170));

        Solve_it.setFont(new java.awt.Font("Luminari", 1, 36)); // NOI18N
        Solve_it.setForeground(new java.awt.Color(222, 37, 38));
        Solve_it.setText("Solve it");
        Solve_it.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Solve_itActionPerformed(evt);
            }
        });
        Cover1.add(Solve_it, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 140, 50));

        greedy.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        greedy.setForeground(new java.awt.Color(255, 255, 205));
        greedy.setSelected(true);
        greedy.setText(" Greedy");
        Cover1.add(greedy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, -1));

        A_star.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        A_star.setForeground(new java.awt.Color(255, 255, 205));
        A_star.setText(" A star");
        Cover1.add(A_star, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        Puzzle_solver1.setFont(new java.awt.Font("Luminari", 3, 36)); // NOI18N
        Puzzle_solver1.setForeground(new java.awt.Color(255, 255, 205));
        Puzzle_solver1.setText("Puzzle solver");
        Cover1.add(Puzzle_solver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 250, 50));

        heuristic1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        heuristic1.setForeground(new java.awt.Color(255, 255, 205));
        heuristic1.setSelected(true);
        heuristic1.setText(" heuristic 1");
        Cover1.add(heuristic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, -1));

        heuristic2.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        heuristic2.setForeground(new java.awt.Color(255, 255, 205));
        heuristic2.setText("heuristic 2");
        Cover1.add(heuristic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        Algorithm.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Algorithm.setForeground(new java.awt.Color(222, 37, 38));
        Algorithm.setText("Algorithm");
        Cover1.add(Algorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 100, 50));

        Heuristics1.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Heuristics1.setForeground(new java.awt.Color(222, 37, 38));
        Heuristics1.setText("Heuristics");
        Cover1.add(Heuristics1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, 40));

        Start_and_end_points.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Start_and_end_points.setForeground(new java.awt.Color(222, 37, 38));
        Start_and_end_points.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/setting.png"))); // NOI18N
        Start_and_end_points.setText("Setting");
        Start_and_end_points.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start_and_end_pointsMouseClicked(evt);
            }
        });
        Cover1.add(Start_and_end_points, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 150, 70));

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 37, 38));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/restart.png"))); // NOI18N
        jLabel1.setText("Restart");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Cover1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        Algorithm1.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Algorithm1.setForeground(new java.awt.Color(222, 37, 38));
        Algorithm1.setText("Speed");
        Cover1.add(Algorithm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 60, 30));

        getContentPane().add(Cover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        Cover2.setBackground(new java.awt.Color(0, 11, 66));
        Cover2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 205)));
        Cover2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leg1.setBackground(new java.awt.Color(255, 255, 205));
        leg1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg1MouseExited(evt);
            }
        });
        leg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t1.setForeground(new java.awt.Color(222, 37, 38));
        leg1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        Cover2.add(leg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 110, 100));

        leg2.setBackground(new java.awt.Color(255, 255, 205));
        leg2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg2MouseExited(evt);
            }
        });

        t2.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t2.setForeground(new java.awt.Color(222, 37, 38));
        leg2.add(t2);

        Cover2.add(leg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 110, 100));

        leg3.setBackground(new java.awt.Color(255, 255, 205));
        leg3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg3MouseExited(evt);
            }
        });

        t3.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t3.setForeground(new java.awt.Color(222, 37, 38));
        leg3.add(t3);

        Cover2.add(leg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 110, 100));

        leg4.setBackground(new java.awt.Color(255, 255, 205));
        leg4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg4MouseExited(evt);
            }
        });

        t4.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t4.setForeground(new java.awt.Color(222, 37, 38));
        leg4.add(t4);

        Cover2.add(leg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 110, 100));

        leg5.setBackground(new java.awt.Color(255, 255, 205));
        leg5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg5MouseExited(evt);
            }
        });

        t5.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t5.setForeground(new java.awt.Color(222, 37, 38));
        leg5.add(t5);

        Cover2.add(leg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 110, 100));

        leg6.setBackground(new java.awt.Color(255, 255, 205));
        leg6.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg6MouseExited(evt);
            }
        });

        t6.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t6.setForeground(new java.awt.Color(222, 37, 38));
        leg6.add(t6);

        Cover2.add(leg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 110, 100));

        leg7.setBackground(new java.awt.Color(255, 255, 205));
        leg7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg7MouseExited(evt);
            }
        });

        t7.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t7.setForeground(new java.awt.Color(222, 37, 38));
        leg7.add(t7);

        Cover2.add(leg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 110, 100));

        leg8.setBackground(new java.awt.Color(255, 255, 205));
        leg8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg8MouseExited(evt);
            }
        });

        t8.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t8.setForeground(new java.awt.Color(222, 37, 38));
        leg8.add(t8);

        Cover2.add(leg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 110, 100));

        leg9.setBackground(new java.awt.Color(255, 255, 205));
        leg9.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
        leg9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lego9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leg9MouseExited(evt);
            }
        });

        t9.setFont(new java.awt.Font("Luminari", 1, 60)); // NOI18N
        t9.setForeground(new java.awt.Color(222, 37, 38));
        leg9.add(t9);

        Cover2.add(leg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 110, 100));

        frame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/frame.png"))); // NOI18N
        Cover2.add(frame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 450, 490));

        icon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        Cover2.add(icon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 180, 170));

        Puzzle_solver2.setFont(new java.awt.Font("Luminari", 3, 36)); // NOI18N
        Puzzle_solver2.setForeground(new java.awt.Color(255, 255, 205));
        Puzzle_solver2.setText("Puzzle solver");
        Cover2.add(Puzzle_solver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 220, 50));

        Select_end_label.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Select_end_label.setForeground(new java.awt.Color(222, 37, 38));
        Select_end_label.setText("Select end point");
        Cover2.add(Select_end_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 170, 40));

        Heuristics3.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        Heuristics3.setForeground(new java.awt.Color(222, 37, 38));
        Heuristics3.setText("Select start point");
        Cover2.add(Heuristics3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 170, 40));

        save_start.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        save_start.setForeground(new java.awt.Color(222, 37, 38));
        save_start.setText("Save");
        save_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_startActionPerformed(evt);
            }
        });
        Cover2.add(save_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 40));

        Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/next.png"))); // NOI18N
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        Cover2.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 80, 90));

        clear_start.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        clear_start.setForeground(new java.awt.Color(222, 37, 38));
        clear_start.setText("clear");
        clear_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_startActionPerformed(evt);
            }
        });
        Cover2.add(clear_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 120, 40));

        save_end.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        save_end.setForeground(new java.awt.Color(222, 37, 38));
        save_end.setText("Save");
        save_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_endActionPerformed(evt);
            }
        });
        Cover2.add(save_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 120, 40));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Cover2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 80, 90));

        getContentPane().add(Cover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        Cover1.setVisible(false);
        Cover.setVisible(false);
        Cover2.setVisible(true);
    }//GEN-LAST:event_StartActionPerformed
    int getInvCount(int[] arr) {
        int inv_count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) // Value 0 is used for empty space
            {
                if (arr[i] > 0 && arr[j] > 0 && arr[i] > arr[j]) {
                    inv_count++;
                }
            }
        }

        return inv_count;
    }

    boolean isSolvable(int[][] puzzle) {
        int linearPuzzle[];
        linearPuzzle = new int[9];
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                linearPuzzle[k++] = puzzle[i][j];
            }
        }

        int invCount = getInvCount(linearPuzzle);

        return (invCount % 2 == 0);
    }

    boolean isSolvable(int[][] start, int[][] end) {
        int[] linearStart = new int[9];
        int[] linearEnd = new int[9];
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                linearStart[k] = start[i][j];
                linearEnd[k] = end[i][j];
                k++;
            }
        }

        int startInvCount = getInvCount(linearStart);
        int endInvCount = getInvCount(linearEnd);
        return (startInvCount % 2 == endInvCount % 2);
    }

    private void Solve_itActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Solve_itActionPerformed
        Node start = null;
        Node end = null;
        int r = 0, c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (startPoint[i][j] == 0) {
                    r = i;
                    c = j;
                }
            }
        }

        if (A_star.isSelected()) {

            start = new Node(startPoint, endPoint, r, c, 0);
            int h = -1;
            if (heuristic1.isSelected()) {
                h = 1;
                System.out.println("heuristic1 : manhatnis : A*");

            } else if (heuristic2.isSelected()) {
                System.out.println("heuristic2 : count node that not in there possiton : A*");
                h = 2;
            }
            end = Node.solutionAstar(start, h);
        } else if (greedy.isSelected()) {

            start = new Node(startPoint, endPoint, r, c, 0);
            int h = -1;
            if (heuristic1.isSelected()) {
                System.out.println("heuristic1 : manhatnis : Gready");

                h = 1;
            } else if (heuristic2.isSelected()) {
                h = 2;
                System.out.println("heuristic2 : count node that not in there possiton : Gready");
            }
            end = Node.solutionGready(start, h);
        }

        try {
            printPath(end);
            printPathGUI(end);
        } catch (Exception ex) {
        }

        Move print = new Move();
        gui = new Thread(print);
        gui.start();

    }//GEN-LAST:event_Solve_itActionPerformed

    private void Start_and_end_pointsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start_and_end_pointsMouseClicked

        try {
            gui.stop();
        } catch (Exception e) {
        }
        Solve_it.setVisible(false);
        Algorithm1.setVisible(true);
        jPanel1.setVisible(true);
        Cover2.setVisible(true);
        Cover1.setVisible(false);
        Cover.setVisible(false);
        clear();
        Next.setVisible(false);
        Solve_it.setEnabled(true);
        jSlider2.setValue(1000);
        E = false;
        S = false;
    }//GEN-LAST:event_Start_and_end_pointsMouseClicked

    private void save_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_startActionPerformed

        try {
            startPoint[0][0] = Integer.parseInt(t1.getText());
            startPoint[0][1] = Integer.parseInt(t2.getText());
            startPoint[0][2] = Integer.parseInt(t3.getText());
            startPoint[1][0] = Integer.parseInt(t4.getText());
            startPoint[1][1] = Integer.parseInt(t5.getText());
            startPoint[1][2] = Integer.parseInt(t6.getText());
            startPoint[2][0] = Integer.parseInt(t7.getText());
            startPoint[2][1] = Integer.parseInt(t8.getText());
            startPoint[2][2] = Integer.parseInt(t9.getText());

            if (isSolvable(startPoint) && Default.isSelected()) {

                System.out.println("Start point :-");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(startPoint[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("*****************************************");

                if (Default.isSelected()) {
                    Next.setVisible(true);
                }

                putStart(startPoint);
            } else if (!Default.isSelected()) {

                System.out.println("Start point :-");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(startPoint[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("*****************************************");

                putStart(startPoint);
                JOptionPane.showMessageDialog(null, "Start point is selected Successfully", "Done!", JOptionPane.INFORMATION_MESSAGE);
                clear();
                S = true;
                if (S && E) {
                    if (isSolvable(startPoint, endPoint)) {
                        Next.setVisible(true);
                    } else {
                        E = false;
                        S = false;
                        JOptionPane.showMessageDialog(null, "Imposible to Solve it", "Erorr!", JOptionPane.ERROR_MESSAGE);
                        clear();
                        return;
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Imposible to Solve it", "Erorr!", JOptionPane.ERROR_MESSAGE);
                clear();
                return;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input ", "Erorr!", JOptionPane.ERROR_MESSAGE);
            clear();
            return;
        }


    }//GEN-LAST:event_save_startActionPerformed
    private void setLegoProperties(JPanel legoPanel, JLabel label, int value) {
        if (value == 0) {
            legoPanel.setBackground(new Color(0, 11, 66));
            legoPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 11, 66)));
            label.setText("0");
            label.setForeground(new Color(0, 11, 66));
        } else {
            legoPanel.setBackground(new Color(255, 255, 205));
            legoPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
            label.setText(String.valueOf(value));
            label.setForeground(new Color(222, 37, 38));
        }
    }

    void putStart(int[][] start_point) {
        setLegoProperties(lego1, T1, start_point[0][0]);
        setLegoProperties(lego2, T2, start_point[0][1]);
        setLegoProperties(lego3, T3, start_point[0][2]);
        setLegoProperties(lego4, T4, start_point[1][0]);
        setLegoProperties(lego5, T5, start_point[1][1]);
        setLegoProperties(lego6, T6, start_point[1][2]);
        setLegoProperties(lego7, T7, start_point[2][0]);
        setLegoProperties(lego8, T8, start_point[2][1]);
        setLegoProperties(lego9, T9, start_point[2][2]);
    }

    void printPath(Node n) {
        int Count = 1;
        Node m = n;
        Stack<int[][]> stack = new Stack<int[][]>();
        while (m.parent != null) {
            stack.push(m.st);
            m = m.parent;
        }
        while (!stack.empty()) {
            int[][] ma = stack.pop();
            System.out.println("Move " + Count);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(ma[i][j]);
                }
                System.out.print("\n");
            }
            Count++;
        }
        System.out.println("*****************************************");
    }

    void printPathGUI(Node n) {
        Node m = n;
        stack = new Stack<int[][]>();
        while (m.parent != null) {
            stack.push(m.st);
            m = m.parent;
        }
    }
    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        Solve_it.setVisible(true);
        Algorithm1.setVisible(false);
        jPanel1.setVisible(false);

        Cover1.setVisible(true);
        Cover2.setVisible(false);
        Cover.setVisible(false); 
		}//GEN-LAST:event_NextMouseClicked

    private void legoMouseClicked(java.awt.event.MouseEvent evt, JLabel label, JPanel legPanel) {
        changeCheckCountTofalse(label.getText());
        count++;
        if (count >= 9) 
            count = 0;

        while (checkCount[count]) {
            count++;
            if (count > 8) 
                count = 0;
        }

        if (count > 0) {
            legPanel.setBackground(new Color(255, 255, 205));
            legPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
            label.setText(String.valueOf(count));
            label.setForeground(new Color(222, 37, 38));
        } else if (count == 0) {
            legPanel.setBackground(new Color(0, 11, 66));
            legPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 11, 66)));
            label.setText("0");
            label.setForeground(new Color(0, 11, 66));
        }
    }


    private void lego1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego1MouseClicked
        legoMouseClicked(evt, t1, leg1);
    }//GEN-LAST:event_lego1MouseClicked

    private void lego2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego2MouseClicked
        legoMouseClicked(evt, t2, leg2);
    }//GEN-LAST:event_lego2MouseClicked

    private void lego3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego3MouseClicked
        legoMouseClicked(evt, t3, leg3);
    }//GEN-LAST:event_lego3MouseClicked

    private void lego4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego4MouseClicked
        legoMouseClicked(evt, t4, leg4);
    }//GEN-LAST:event_lego4MouseClicked

    private void lego5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego5MouseClicked
        legoMouseClicked(evt, t5, leg5);
    }//GEN-LAST:event_lego5MouseClicked

    private void lego6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego6MouseClicked
        legoMouseClicked(evt, t6, leg6);
    }//GEN-LAST:event_lego6MouseClicked

    private void lego7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego7MouseClicked
        legoMouseClicked(evt, t7, leg7);
    }//GEN-LAST:event_lego7MouseClicked

    private void lego8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego8MouseClicked
        legoMouseClicked(evt, t8, leg8);
    }//GEN-LAST:event_lego8MouseClicked

    private void lego9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lego9MouseClicked
        legoMouseClicked(evt, t9, leg9);
    }//GEN-LAST:event_lego9MouseClicked

    private void clear_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_startActionPerformed
        clear();
    }//GEN-LAST:event_clear_startActionPerformed
    void clear() {
        count = -1;
        for (int i = 0; i < checkCount.length; i++) 
            checkCount[i] = false;

        JPanel[] legPanels = {leg1, leg2, leg3, leg4, leg5, leg6, leg7, leg8, leg9};
        JLabel[] label = {t1, t2, t3, t4, t5, t6, t7, t8, t9};

        for (int i = 0; i < legPanels.length; i++) {
            legPanels[i].setBackground(new Color(255, 255, 205));
            legPanels[i].setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(222, 37, 38)));
            label[i].setText("");
            label[i].setForeground(new Color(222, 37, 38));
        }

        Next.setVisible(false);
    }
    private void save_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_endActionPerformed
        try {
            endPoint[0][0] = Integer.parseInt(t1.getText());
            endPoint[0][1] = Integer.parseInt(t2.getText());
            endPoint[0][2] = Integer.parseInt(t3.getText());
            endPoint[1][0] = Integer.parseInt(t4.getText());
            endPoint[1][1] = Integer.parseInt(t5.getText());
            endPoint[1][2] = Integer.parseInt(t6.getText());
            endPoint[2][0] = Integer.parseInt(t7.getText());
            endPoint[2][1] = Integer.parseInt(t8.getText());
            endPoint[2][2] = Integer.parseInt(t9.getText());

            System.out.println("End point :-");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.print(endPoint[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("*****************************************");

            JOptionPane.showMessageDialog(null, "End point is selected Successfully", "Done!", JOptionPane.INFORMATION_MESSAGE);
            clear();
            E = true;

            if (S && E) {
                if (isSolvable(startPoint, endPoint)) {
                    Next.setVisible(true);
                } else {
                    E = false;
                    S = false;
                    JOptionPane.showMessageDialog(null, "Imposible to Solve it", "Erorr!", JOptionPane.ERROR_MESSAGE);
                    clear();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input ", "Erorr!", JOptionPane.ERROR_MESSAGE);
            clear();
        }
    }//GEN-LAST:event_save_endActionPerformed

    private void legMouseExited(java.awt.event.MouseEvent evt, JLabel label) {
        int index = -1;
        if (label.getText().trim().equals("")) 
            return;
   
        if (label.getText().trim().equals("0"))
            index = 0;
         else 
            index = Integer.parseInt(label.getText().trim());
        checkCount[index] = true;
    }

    private void leg1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg1MouseExited
        legMouseExited(evt, t1);
    }//GEN-LAST:event_leg1MouseExited

    private void leg2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg2MouseExited
        legMouseExited(evt, t2);
    }//GEN-LAST:event_leg2MouseExited

    private void leg3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg3MouseExited
        legMouseExited(evt, t3);
    }//GEN-LAST:event_leg3MouseExited

    private void leg4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg4MouseExited
        legMouseExited(evt, t4);
    }//GEN-LAST:event_leg4MouseExited

    private void leg5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg5MouseExited
        legMouseExited(evt, t5);
    }//GEN-LAST:event_leg5MouseExited

    private void leg6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg6MouseExited
        legMouseExited(evt, t6);
    }//GEN-LAST:event_leg6MouseExited

    private void leg7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg7MouseExited
        legMouseExited(evt, t7);
    }//GEN-LAST:event_leg7MouseExited

    private void leg8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg8MouseExited
        legMouseExited(evt, t8);
    }//GEN-LAST:event_leg8MouseExited

    private void leg9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leg9MouseExited
        legMouseExited(evt, t9);
    }//GEN-LAST:event_leg9MouseExited

    private void DefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaultActionPerformed
        save_end.setVisible(false);
        Select_end_label.setVisible(false);
    }//GEN-LAST:event_DefaultActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        Cover.setVisible(true);
        Cover1.setVisible(false);
        Cover2.setVisible(false);
        endPoint[0][0] = 1;
        endPoint[0][1] = 2;
        endPoint[0][2] = 3;
        endPoint[1][0] = 4;
        endPoint[1][1] = 5;
        endPoint[1][2] = 6;
        endPoint[2][0] = 7;
        endPoint[2][1] = 8;
        endPoint[2][2] = 0;
        clear();
    }//GEN-LAST:event_BackMouseClicked

    private void CustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomActionPerformed
        save_end.setVisible(true);
        Select_end_label.setVisible(true);
    }//GEN-LAST:event_CustomActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        try {
            gui.stop();
        } catch (Exception e) {}
        Solve_it.setVisible(true);
        Solve_it.setEnabled(true);
        jSlider2.setValue(1000);
        Algorithm1.setVisible(false);
        jPanel1.setVisible(false);
        putStart(startPoint); 
       }//GEN-LAST:event_jLabel1MouseClicked

    void changeCheckCountTofalse(String ss) {
        int index = -1;
        if (ss.trim().equals("")) 
            return;
        if (ss.trim().equals("0")) 
            index = 0;
         else 
            index = Integer.parseInt(ss);
        
        checkCount[index] = false;

    }

    public class Move implements Runnable {

        @Override
        public void run() {
            Solve_it.setVisible(false);
            Algorithm1.setVisible(true);
            jPanel1.setVisible(true);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {}
            while (!stack.empty()) {
                try {
                    Thread.sleep(2200 - jSlider2.getValue());
                    int[][] ma = stack.pop();
                    putStart(ma);

                } catch (Exception ex) {}
            }
            Solve_it.setVisible(true);
            Solve_it.setEnabled(false);
            Algorithm1.setVisible(false);
            jPanel1.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A_star;
    private javax.swing.JLabel Algorithm;
    private javax.swing.JLabel Algorithm1;
    private javax.swing.JLabel Back;
    private javax.swing.JPanel Cover;
    private javax.swing.JPanel Cover1;
    private javax.swing.JPanel Cover2;
    private javax.swing.JRadioButton Custom;
    private javax.swing.JRadioButton Default;
    private javax.swing.JLabel Heuristics1;
    private javax.swing.JLabel Heuristics3;
    private javax.swing.JLabel Next;
    private javax.swing.JLabel Puzzle_solver1;
    private javax.swing.JLabel Puzzle_solver2;
    private javax.swing.JLabel Select_end_label;
    private javax.swing.JButton Solve_it;
    private javax.swing.JButton Start;
    private javax.swing.JLabel Start_and_end_points;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T5;
    private javax.swing.JLabel T6;
    private javax.swing.JLabel T7;
    private javax.swing.JLabel T8;
    private javax.swing.JLabel T9;
    private javax.swing.ButtonGroup With_end_point;
    private javax.swing.ButtonGroup algorithem;
    private javax.swing.JButton clear_start;
    private javax.swing.JLabel frame;
    private javax.swing.JLabel frame1;
    private javax.swing.JRadioButton greedy;
    private javax.swing.JRadioButton heuristic1;
    private javax.swing.JRadioButton heuristic2;
    private javax.swing.ButtonGroup heuristics;
    private javax.swing.JLabel icon8;
    private javax.swing.JLabel icon9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JPanel leg1;
    private javax.swing.JPanel leg2;
    private javax.swing.JPanel leg3;
    private javax.swing.JPanel leg4;
    private javax.swing.JPanel leg5;
    private javax.swing.JPanel leg6;
    private javax.swing.JPanel leg7;
    private javax.swing.JPanel leg8;
    private javax.swing.JPanel leg9;
    private javax.swing.JPanel lego1;
    private javax.swing.JPanel lego2;
    private javax.swing.JPanel lego3;
    private javax.swing.JPanel lego4;
    private javax.swing.JPanel lego5;
    private javax.swing.JPanel lego6;
    private javax.swing.JPanel lego7;
    private javax.swing.JPanel lego8;
    private javax.swing.JPanel lego9;
    private javax.swing.JButton save_end;
    private javax.swing.JButton save_start;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    // End of variables declaration//GEN-END:variables
}
