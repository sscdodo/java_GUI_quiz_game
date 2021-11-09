import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Quiz extends javax.swing.JFrame {

    int min = 0,sec;
    Timer timer;
    int quiz_num = 0;
    int score = 0;
    int numer_label = 1;   
    
    String[] question = {
                                    "Which of the following for loop declaration is not valid?",
                                    "         Which of these is returned by operator '&' ?",
                                    "       Which of the following are not Java modifiers?",
                                    "      Which of these are selection statements in Java?",
                                    "          Which of the following does not compile?",
                                    "         What do you mean by >>> operator in Java",
                                    "                Recursion in Java applies to _______.",
                                    "     Which keyword is used to inherit a class in Java?",
                                    "                      Which doesn’t have a body?",
                                    "                       OOPs is invented by _______."
			};
    String[] btn1 = {
                                    "for ( int i = 99; i >= 0; i / 9 )",        //correct question 1
                                    "Integer",
                                    "public",
                                    "break",
                                    "double num = 2.718;",
                                    "Left Shift Operator",
                                    "Constructors",
                                    "inherit",
                                    "Abstract Method",                          //correct question 9 
                                    "Alan Kay"                                  // correct question 10
			};
    String[] btn2 = {               
                                    "for ( int i = 7; i <= 77; i += 7 )",
                                    "Character",                                //correct question 2
                                    "private",
                                    "for()",
                                    "double num = 2._718",                       //correct question 5
                                    "Right Shift Operator",
                                    "Variables",
                                    "implement",
                                    "Class",
                                    "James Gosling"
			};
    String[] btn3 = {
                                    "for ( int i = 30; i >= 3; - -i )",
                                    "Float",                                
                                    "transient",
                                    "if()",                                     // correct question 4
                                    "double num = 2.7_1_8",
                                    "Zero Fill Right Shift",                    // correct question 6
                                    "Methods" ,                                 // correct question 7
                                    "extend",
                                    "Method",
                                    "Rasmus Lerdorf"
			};
    String[] btn4 = {
                                    "for ( int i = 2; i <= 20; i = 2* i )",
                                    "Boolean",
                                    "friendly",                                 //correct question 3
                                    "continue",
                                    "None of the above.",
                                    "Zero Fill Left Shift",
                                    "Blocks",
                                    "extends",                                  // correct question 8
                                    "Interface",
                                    "Tim Berners-Lee"
			};
    
    public Quiz() {
        initComponents();
        count_timer();    
    }
    
    //timer
    private void count_timer(){
        for(int i=0;i<60;i++){
            lbsec.setText(""+i);
        }
        sec = Integer.parseInt(lbsec.getText());
        timer = new Timer(1000, new ActionListener() {         
           @Override
           public void actionPerformed(ActionEvent e) {
               lbsec.setForeground(Color.WHITE);
               if(sec==0){
                   sec = 60;
                   min--;
               }
                if(min < 0){
                    new Main().setVisible(true);
                    dispose();
                    timer.stop();
                } else {
                    sec--;
                    if(sec<10){
                        lbsec.setForeground(Color.red);
                        lbsec.setText("0"+sec);
                    } else {
                        lbsec.setText(""+sec);
                    } 
                }
            }
        });
        timer.start();
    }
    
    //quiz num & visible
    private void count_num(){
        quiz_num++;
        lbQuiz.setText(" " + ++numer_label);
        if(numer_label > question.length ){
            timer.stop();
            onePanel.setVisible(false);
            twoPanel.setVisible(false);
            choicePanel.setVisible(false);
            scorePanel.setVisible(true);
            bottomPanel.setVisible(true);
        } 
     }
    
    // show text question and choice
    private void showQ(){
        for(int i=0;i<question.length;i++){
            if(quiz_num == i){
                lbQues.setText(question[i]);
            }
        }
        for(int i=0;i<btn1.length;i++){
            if(quiz_num == i){
                btn_1.setText(btn1[i]); 
            }
        }
        for(int i=0;i<btn2.length;i++){
            if(quiz_num == i){
                btn_2.setText(btn2[i]); 
            }
        }
        for(int i=0;i<btn3.length;i++){
            if(quiz_num == i){
                btn_3.setText(btn3[i]); 
            }
        }
        for(int i=0;i<btn4.length;i++){
            if(quiz_num == i){
                btn_4.setText(btn4[i]); 
            }
        }
        
    }
    
    //count score correct choice_1
   private void choice_1(){
       //for ( int i = 99; i >= 0; i / 9 )
        if (btn1[1].equals(btn_1.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
        // Abstract Method and Alan Kay
        if (btn1[9].equals(btn_1.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        } 
    }
    
    private void choice_2(){
        //Character
        if (btn2[2].equals(btn_2.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
        //double num = 2._718
        if (btn2[5].equals(btn_2.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
    }
    
    private void choice_3(){
        //if()
        if (btn3[4].equals(btn_3.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
        //Zero Fill Right Shift
        if (btn3[6].equals(btn_3.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
        //Methods
        if (btn3[7].equals(btn_3.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
    }
    
    private void choice_4(){
        //friendly
        if (btn4[3].equals(btn_4.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
        //extends
        if (btn4[8].equals(btn_4.getText())) {
            ++score;
            lbScore.setText("" + score);
            lbScoreShow.setText(""+score);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllPanel = new javax.swing.JPanel();
        twoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbQuiz = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbQues = new javax.swing.JLabel();
        scorePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbScoreShow1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbScoreShow = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        choicePanel = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        onePanel = new javax.swing.JPanel();
        lbsec = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbScore = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        btnPlayAgain = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        AllPanel.setBackground(new java.awt.Color(243, 222, 202));
        AllPanel.setPreferredSize(new java.awt.Dimension(900, 580));

        twoPanel.setBackground(new java.awt.Color(226, 236, 233));

        jLabel1.setFont(new java.awt.Font("LetterOMatic!", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 58, 75));
        jLabel1.setText("ROUND");

        jLabel3.setFont(new java.awt.Font("LetterOMatic!", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 109, 119));
        jLabel3.setText("/   10");

        lbQuiz.setBackground(new java.awt.Color(250, 210, 225));
        lbQuiz.setFont(new java.awt.Font("LetterOMatic!", 1, 24)); // NOI18N
        lbQuiz.setForeground(new java.awt.Color(51, 92, 103));
        lbQuiz.setText(" 1");
        lbQuiz.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbQuizAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel6.setBackground(new java.awt.Color(64, 151, 170));
        jPanel6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbQues.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        lbQues.setForeground(new java.awt.Color(243, 222, 202));
        lbQues.setText("Which of the following for loop declaration is not valid?");
        lbQues.setAlignmentY(0.0F);
        lbQues.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbQuesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lbQues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(lbQues, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout twoPanelLayout = new javax.swing.GroupLayout(twoPanel);
        twoPanel.setLayout(twoPanelLayout);
        twoPanelLayout.setHorizontalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoPanelLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(lbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        twoPanelLayout.setVerticalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lbQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        scorePanel.setBackground(new java.awt.Color(243, 222, 202));
        scorePanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                scorePanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel5.setBackground(new java.awt.Color(188, 204, 154));

        jLabel5.setFont(new java.awt.Font("LetterOMatic!", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("Total Question  :");

        lbScoreShow1.setBackground(new java.awt.Color(255, 81, 81));
        lbScoreShow1.setFont(new java.awt.Font("LetterOMatic!", 0, 25)); // NOI18N
        lbScoreShow1.setForeground(new java.awt.Color(33, 33, 33));
        lbScoreShow1.setText("10");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(93, 93, 93)
                .addComponent(lbScoreShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbScoreShow1))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(209, 232, 228));
        jPanel8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbScoreShow.setFont(new java.awt.Font("LetterOMatic!", 0, 25)); // NOI18N
        lbScoreShow.setForeground(new java.awt.Color(195, 123, 137));
        lbScoreShow.setText("1");
        lbScoreShow.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbScoreShowAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("LetterOMatic!", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(195, 123, 137));
        jLabel6.setText("Total Score  :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(146, 146, 146)
                .addComponent(lbScoreShow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbScoreShow))
                .addContainerGap())
        );

        javax.swing.GroupLayout scorePanelLayout = new javax.swing.GroupLayout(scorePanel);
        scorePanel.setLayout(scorePanelLayout);
        scorePanelLayout.setHorizontalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scorePanelLayout.setVerticalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        choicePanel.setBackground(new java.awt.Color(243, 222, 202));
        choicePanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choicePanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btn_1.setBackground(new java.awt.Color(250, 148, 131));
        btn_1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        btn_1.setText("for ( int i = 99; i >= 0; i / 9 )");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(250, 148, 131));
        btn_2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        btn_2.setText("for ( int i = 7; i <= 77; i += 7 )");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(250, 148, 131));
        btn_4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(45, 64, 87));
        btn_4.setText("for ( int i = 2; i <= 20; i = 2* i )");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(250, 148, 131));
        btn_3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        btn_3.setText("for ( int i = 30; i >= 3; - -i )");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choicePanelLayout = new javax.swing.GroupLayout(choicePanel);
        choicePanel.setLayout(choicePanelLayout);
        choicePanelLayout.setHorizontalGroup(
            choicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choicePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(choicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(choicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        choicePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_1, btn_2, btn_3, btn_4});

        choicePanelLayout.setVerticalGroup(
            choicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choicePanelLayout.createSequentialGroup()
                .addGroup(choicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(choicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        choicePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_1, btn_2, btn_3, btn_4});

        topPanel.setBackground(new java.awt.Color(243, 222, 202));

        onePanel.setBackground(new java.awt.Color(45, 64, 87));

        lbsec.setFont(new java.awt.Font("LetterOMatic!", 1, 24)); // NOI18N
        lbsec.setForeground(new java.awt.Color(255, 255, 255));
        lbsec.setText("00");
        lbsec.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbsecAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("LetterOMatic!", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Timer");

        jLabel4.setFont(new java.awt.Font("LetterOMatic!", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SCORE");

        lbScore.setFont(new java.awt.Font("LetterOMatic!", 1, 24)); // NOI18N
        lbScore.setForeground(new java.awt.Color(255, 255, 255));
        lbScore.setText("0");
        lbScore.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbScoreAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout onePanelLayout = new javax.swing.GroupLayout(onePanel);
        onePanel.setLayout(onePanelLayout);
        onePanelLayout.setHorizontalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(lbScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbsec)
                .addGap(134, 134, 134))
        );
        onePanelLayout.setVerticalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(lbScore)
                    .addComponent(lbsec))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bottomPanel.setBackground(new java.awt.Color(243, 222, 202));
        bottomPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bottomPanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnPlayAgain.setBackground(new java.awt.Color(45, 64, 87));
        btnPlayAgain.setFont(new java.awt.Font("LetterOMatic!", 1, 20)); // NOI18N
        btnPlayAgain.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayAgain.setText("PLAY AGIAN");
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(45, 64, 87));
        btnExit.setFont(new java.awt.Font("LetterOMatic!", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addComponent(btnPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout AllPanelLayout = new javax.swing.GroupLayout(AllPanel);
        AllPanel.setLayout(AllPanelLayout);
        AllPanelLayout.setHorizontalGroup(
            AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(twoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addGroup(AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AllPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(choicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AllPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(scorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AllPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AllPanelLayout.setVerticalGroup(
            AllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(scorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(choicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        timer.stop();
        count_timer();
        count_num();
        showQ();
        choice_3();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        timer.stop();
        count_timer();
        count_num();
        showQ();
        choice_4();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        timer.stop();
        count_timer();
        count_num();
        showQ();
        choice_2();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        timer.stop();
        count_timer();
        count_num();
        showQ();
        choice_1();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void lbQuizAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbQuizAncestorAdded

    }//GEN-LAST:event_lbQuizAncestorAdded

    private void jPanel6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6AncestorAdded

    private void lbQuesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbQuesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbQuesAncestorAdded

    private void lbScoreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbScoreAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbScoreAncestorAdded

    private void scorePanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_scorePanelAncestorAdded
       if(numer_label < question.length ){
            scorePanel.setVisible(false);
       }
    }//GEN-LAST:event_scorePanelAncestorAdded

    private void choicePanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choicePanelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_choicePanelAncestorAdded

    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        new Quiz().setVisible(true);
        this.setVisible(false);            
    }//GEN-LAST:event_btnPlayAgainActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void bottomPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bottomPanelAncestorAdded
       if(numer_label < question.length ){
            bottomPanel.setVisible(false);
       }
    }//GEN-LAST:event_bottomPanelAncestorAdded

    private void lbScoreShowAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbScoreShowAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbScoreShowAncestorAdded

    private void jPanel8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel8AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8AncestorAdded

    private void lbsecAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbsecAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbsecAncestorAdded

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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPlayAgain;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JPanel choicePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbQues;
    private javax.swing.JLabel lbQuiz;
    private javax.swing.JLabel lbScore;
    private javax.swing.JLabel lbScoreShow;
    private javax.swing.JLabel lbScoreShow1;
    private javax.swing.JLabel lbsec;
    private javax.swing.JPanel onePanel;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel twoPanel;
    // End of variables declaration//GEN-END:variables
}
