
import Univ.*;
import javax.swing.*;
import java.awt.*;


public class Plannerf{

   private JFrame f1;
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private JPanel p4;
   private JPanel p5;
   private JButton b1;
   private JButton b12;
   private JButton b2;
   private JButton b22;
   private JButton b3;
   private JButton b32;
   private JButton b4;
   private JButton b42;
   private JLabel l1;
   private JLabel l2;
   private JLabel l3;
   private JLabel l32;
   private JLabel l33;
   private JLabel l34;
   private JLabel l4;
   private JLabel l5;
   private JTextField t3;
   private JTextField t32;
   private JTextField t33;
   private JComboBox petList;
   private JComboBox cb;
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenuItem m1;
   private JMenuItem m2;
   private JMenuItem m3;
   private JMenuItem m4;
   private JMenuItem m5;
   private JMenuItem m6;
   private JMenuItem m7;
   private JMenuItem m8;
   private JMenuItem m9;
   private JMenuItem m10;
   private JMenuItem m11;


   public Plannerf(){

     gui();
   }


   public void gui(){

     f1 = new JFrame("Plan your Studies");
     f1.setVisible(true);
     f1.setSize(1000,800);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     p1 = new JPanel();
     p1.setLayout(null);

     b1 = new JButton("Admin");

     b1.addActionListener(re->{

       JPanel p7 = new JPanel();
       p7.setLayout(null);

       JLabel l7 = new JLabel("Select one");
       l7.setBounds(450,50, 200,40);

       p1.setVisible(false);
       p7.setVisible(true);

       JButton b7 = new JButton("Connect to the database");
       b7.setBounds(300,100,400,50);

       JButton b72 = new JButton("Maintain list of degrees in database");
       b72.setBounds(300,350,400,50);

       JButton b73 = new JButton("Maintain list of courses in database");
       b73.setBounds(300,600,400,50);

       JButton b74 = new JButton("Go back");
       b74.setBounds(0,0, 200,50);


       p7.add(l7);
       p7.add(b7);
       p7.add(b72);
       p7.add(b73);
       p7.add(b74);
       f1.add(p7);


       b74.addActionListener(hi->{

         p7.setVisible(false);
         p1.setVisible(true);

       });


      b7.addActionListener(k->{

        CourseCatalog data = new CourseCatalog();

        JOptionPane.showMessageDialog(f1,
        "A new course catalog has been loaded",
        "",
        JOptionPane.PLAIN_MESSAGE);
     }); //panel 7


     b72.addActionListener(k->{

       JOptionPane.showMessageDialog(f1,
       "This hasn't been implemented.",
       "Well this is awkward...",
       JOptionPane.PLAIN_MESSAGE);
     }); //panel 7


    b73.addActionListener(k->{

      JOptionPane.showMessageDialog(f1,
      "This hasn't been implemented.",
      "Well this is awkward...",
      JOptionPane.PLAIN_MESSAGE);
    }); //panel 7

  });


     l1 = new JLabel("Are you a User or Admin?");
     l1.setBounds(420,100, 300,100);
     b1.setBounds(400,200,200,100);

     b12 = new JButton("Student");
     b12.setBounds(400,400,200,100);

     p1.add(l1);
     p1.add(b1);
     p1.add(b12);
     f1.add(p1);
     f1.setResizable(false);

    b12.addActionListener(ev->
    {
        p2 = new JPanel();
        p2.setLayout(null);

        b2 = new JButton("New Student");
        l2 = new JLabel("Please Select One");
        l2.setBounds(420,100, 300,100);
        b2.setBounds(400,200,200,100);

        b22 = new JButton("Returning Student");
        b22.setBounds(400,400,200,100);

        b22.addActionListener(ag->{


           JOptionPane.showMessageDialog(f1,
           "This hasn't been implemented.",
           "Well this is awkward...",
            JOptionPane.PLAIN_MESSAGE);

        });

        p2.add(l2);
        p2.add(b2);
        p2.add(b22);
        p2.setVisible(true);
        p1.setVisible(false);

        f1.add(p2);

         b2.addActionListener(e->
         {
             p2.setVisible(false);
             p3 = new JPanel();
             p3.setLayout(null);

             l3 = new JLabel("Please fill out the fields and select your degree");
             l3.setBounds(320,100,400,50);

             l32 = new JLabel("First name: ");
             l32.setBounds(200, 200, 100, 75);

             t3 = new JTextField();
             t3.setBounds(180,250,100,20);

             l33 = new JLabel("Last name: ");
             l33.setBounds(650, 200, 100, 75);

             t32 = new JTextField();
             t32.setBounds(630,250,100,20);

             l34 = new JLabel("Student ID: ");
             l34.setBounds(420, 300, 100, 75);

             t33 = new JTextField();
             t33.setBounds(400,350,100,20);


             b3 = new JButton("BCH");
             b3.setBounds(200,450,200,100);

             b32 = new JButton("BCG");
             b32.setBounds(500,450,200,100);

             p3.add(l3);
             p3.add(l32);
             p3.add(l33);
             p3.add(l34);
             p3.add(t3);
             p3.add(t32);
             p3.add(t33);
             p3.add(b3);
             p3.add(b3);
             p3.add(b32);
             f1.add(p3);
             p3.setVisible(true);


             b32.addActionListener(a->
             {
                Student student = new Student();
                boolean val = false;

               try{
                 int i = Integer.parseInt(t33.getText());
                 student.setStudentNumber(i);
                 student.setFirstName(t3.getText());
                 student.setLastName(t32.getText());
                 val = true;
               }
               catch(NumberFormatException et){
                 JOptionPane.showMessageDialog(f1,
                 "Student ID must be an int",
                  "",
                 JOptionPane.PLAIN_MESSAGE);
                 val =false;

               }



              JOptionPane.showMessageDialog(f1,
              "A new Student has been created: " + student.getFirstName() + " " +student.getLastName(),
               "",
              JOptionPane.PLAIN_MESSAGE);


              p4 = new JPanel();
              p4.setLayout(null);
              p3.setVisible(false);

              l4 = new JLabel("Select your Major");
              l4.setBounds(300,100,200,50);

              b4 = new JButton("Software Eng");
              b4.setBounds(400,200,300,100);

              b42 = new JButton("Comp Sci");
              b42.setBounds(400,400,300,100);

              b42.addActionListener(b->{

                p5 = new JPanel();
                p4.setVisible(false);
                p5.setVisible(true);


                l5 = new JLabel("Choose what you would like to do..");


               menuBar = new JMenuBar();
               fileMenu = new JMenu();




               m1 = new JMenuItem("Maintain Courses");
               m2 = new JMenuItem("Save my program");
               m3 = new JMenuItem("view a list of *required* courses for my degree and major that are *not* represented in my plan of study nor in my transcript ");
               m4 = new JMenuItem("view a list of *required* courses that are *not* represented in my transcript ");
               m5 = new JMenuItem("view the number of credits I must add to my plan of study in order to have a plan that allows me to complete my degree. ");
               m6 = new JMenuItem("view a list of the prerequisite courses for any required course for my degree and major.");
               m7 = new JMenuItem("view a list of prerequisite courses that I must take in order to take the courses currently in my plan of study.");
               m8 = new JMenuItem("view the number of credits I have completed in my program ");
               m9 = new JMenuItem("view the number of credits I have remaining to complete my program");
               m10 = new JMenuItem("determine if I have met the completion requirements of my chosen degree ");
               m11= new JMenuItem("View my GPA");




               fileMenu.add(m1);
               fileMenu.add(m2);
               fileMenu.add(m3);
               fileMenu.add(m4);
               fileMenu.add(m5);
               fileMenu.add(m6);
               fileMenu.add(m7);
               fileMenu.add(m8);
               fileMenu.add(m9);
               fileMenu.add(m10);
               fileMenu.add(m11);


               menuBar.add(fileMenu);
               p5.add(l5);
               p5.add(menuBar);
               f1.add(p5);


               m1.addActionListener(r->{

                 JOptionPane.showMessageDialog(f1,
                 "This hasn't been implemented.",
                  "Well this is awkward...",
                   JOptionPane.PLAIN_MESSAGE);
                }); //panel 5

               m2.addActionListener(r->{

                 JOptionPane.showMessageDialog(f1,
                 "This hasn't been implemented.",
                  "Well this is awkward...",
                   JOptionPane.PLAIN_MESSAGE);
                }); //panel 5


                 m3.addActionListener(r->{

                   JOptionPane.showMessageDialog(f1,
                   "This hasn't been implemented.",
                    "Well this is awkward...",
                     JOptionPane.PLAIN_MESSAGE);
                  }); //panel 5

                  m4.addActionListener(r->{

                    JOptionPane.showMessageDialog(f1,
                    "This hasn't been implemented.",
                     "Well this is awkward...",
                      JOptionPane.PLAIN_MESSAGE);
                   }); //panel 5

                  m5.addActionListener(r->{

                     JOptionPane.showMessageDialog(f1,
                     "This hasn't been implemented.",
                      "Well this is awkward...",
                       JOptionPane.PLAIN_MESSAGE);
                  }); //panel 5

                  m6.addActionListener(r->{

                    JOptionPane.showMessageDialog(f1,
                    "This hasn't been implemented.",
                     "Well this is awkward...",
                      JOptionPane.PLAIN_MESSAGE);
                   }); //panel 5


                  m7.addActionListener(r->{

                     JOptionPane.showMessageDialog(f1,
                     "This hasn't been implemented.",
                      "Well this is awkward...",
                       JOptionPane.PLAIN_MESSAGE);
                    }); //panel 5

                  m8.addActionListener(r->{

                    JOptionPane.showMessageDialog(f1,
                    "This hasn't been implemented.",
                    "Well this is awkward...",
                    JOptionPane.PLAIN_MESSAGE);
                  }); //panel 5


                  m9.addActionListener(r->{

                    JOptionPane.showMessageDialog(f1,
                    "This hasn't been implemented.",
                     "Well this is awkward...",
                      JOptionPane.PLAIN_MESSAGE);
                   }); //panel 5

                   m10.addActionListener(r->{

                     JOptionPane.showMessageDialog(f1,
                     "This hasn't been implemented.",
                      "Well this is awkward...",
                       JOptionPane.PLAIN_MESSAGE);
                    }); //panel 5

                    m11.addActionListener(r->{

                      JOptionPane.showMessageDialog(f1,
                      "This hasn't been implemented.",
                       "Well this is awkward...",
                        JOptionPane.PLAIN_MESSAGE);
                     }); //panel 5

            });   //panel 4

              p4.add(b4);
              p4.add(l4);
              p4.add(b42);
              f1.add(p4);


              b4.addActionListener(b->{

                p5 = new JPanel();
                p4.setVisible(false);
                p5.setVisible(true);


                l5 = new JLabel("Choose what you would like to do..");


               menuBar = new JMenuBar();
               fileMenu = new JMenu();




               m1 = new JMenuItem("Maintain Courses");
               m2 = new JMenuItem("Save my program");
               m3 = new JMenuItem("view a list of *required* courses for my degree and major that are *not* represented in my plan of study nor in my transcript ");
               m4 = new JMenuItem("view a list of *required* courses that are *not* represented in my transcript ");
               m5 = new JMenuItem("view the number of credits I must add to my plan of study in order to have a plan that allows me to complete my degree. ");
               m6 = new JMenuItem("view a list of the prerequisite courses for any required course for my degree and major.");
               m7 = new JMenuItem("view a list of prerequisite courses that I must take in order to take the courses currently in my plan of study.");
               m8 = new JMenuItem("view the number of credits I have completed in my program ");
               m9 = new JMenuItem("view the number of credits I have remaining to complete my program");
               m10 = new JMenuItem("determine if I have met the completion requirements of my chosen degree ");
               m11= new JMenuItem("View my GPA");




               fileMenu.add(m1);
               fileMenu.add(m2);
               fileMenu.add(m3);
               fileMenu.add(m4);
               fileMenu.add(m5);
               fileMenu.add(m6);
               fileMenu.add(m7);
               fileMenu.add(m8);
               fileMenu.add(m9);
               fileMenu.add(m10);
               fileMenu.add(m11);


               menuBar.add(fileMenu);
               p5.add(l5);
               p5.add(menuBar);
               f1.add(p5);

               m1.addActionListener(r->{

                 JOptionPane.showMessageDialog(f1,
                 "This hasn't been implemented.",
                 "Well this is awkward...",
                 JOptionPane.PLAIN_MESSAGE);

                }); //panel 5



                m2.addActionListener(r->{

                  JOptionPane.showMessageDialog(f1,
                  "This hasn't been implemented.",
                   "Well this is awkward...",
                    JOptionPane.PLAIN_MESSAGE);
                 }); //panel 5


                  m3.addActionListener(r->{

                    JOptionPane.showMessageDialog(f1,
                    "This hasn't been implemented.",
                     "Well this is awkward...",
                      JOptionPane.PLAIN_MESSAGE);
                   }); //panel 5

                   m4.addActionListener(r->{

                     JOptionPane.showMessageDialog(f1,
                     "This hasn't been implemented.",
                      "Well this is awkward...",
                       JOptionPane.PLAIN_MESSAGE);
                    }); //panel 5

                   m5.addActionListener(r->{

                      JOptionPane.showMessageDialog(f1,
                      "This hasn't been implemented.",
                       "Well this is awkward...",
                        JOptionPane.PLAIN_MESSAGE);
                   }); //panel 5

                   m6.addActionListener(r->{

                     JOptionPane.showMessageDialog(f1,
                     "This hasn't been implemented.",
                      "Well this is awkward...",
                       JOptionPane.PLAIN_MESSAGE);
                    }); //panel 5


                   m7.addActionListener(r->{

                      JOptionPane.showMessageDialog(f1,
                      "This hasn't been implemented.",
                       "Well this is awkward...",
                        JOptionPane.PLAIN_MESSAGE);
                     }); //panel 5

                   m8.addActionListener(r->{

                     JOptionPane.showMessageDialog(f1,
                     "This hasn't been implemented.",
                     "Well this is awkward...",
                     JOptionPane.PLAIN_MESSAGE);
                   }); //panel 5


                   m9.addActionListener(r->{

                     JOptionPane.showMessageDialog(f1,
                     "This hasn't been implemented.",
                      "Well this is awkward...",
                       JOptionPane.PLAIN_MESSAGE);
                    }); //panel 5

                    m10.addActionListener(r->{

                      JOptionPane.showMessageDialog(f1,
                      "This hasn't been implemented.",
                       "Well this is awkward...",
                        JOptionPane.PLAIN_MESSAGE);
                     }); //panel 5

                     m11.addActionListener(r->{

                       JOptionPane.showMessageDialog(f1,
                       "This hasn't been implemented.",
                        "Well this is awkward...",
                         JOptionPane.PLAIN_MESSAGE);
                      }); //panel 5

            });   //panel 4

       }); //panel 3

             b3.addActionListener(ab->
             {

                Student student = new Student(t3.getText(),t32.getText(),t33.getText());
                CS deg = new CS();
                deg.setDegreeTitle("CS");

                JOptionPane.showMessageDialog(f1,
                "A new Student has been created",
                "",
                JOptionPane.PLAIN_MESSAGE);

                p4 = new JPanel();
                p4.setLayout(null);
                p3.setVisible(false);

                l4 = new JLabel("Select your Major");
                l4.setBounds(300,100,200,50);

                b4 = new JButton("Software Eng");
                b4.setBounds(400,200,300,100);

                b42 = new JButton("Comp Sci");
                b42.setBounds(400,400,300,100);

                b42.addActionListener(b->{

                  p5 = new JPanel();
                  p4.setVisible(false);
                  p5.setVisible(true);


                  l5 = new JLabel("Choose what you would like to do..");


                 menuBar = new JMenuBar();
                 fileMenu = new JMenu();




                 m1 = new JMenuItem("Maintain Courses");
                 m2 = new JMenuItem("Save my program");
                 m3 = new JMenuItem("view a list of *required* courses for my degree and major that are *not* represented in my plan of study nor in my transcript ");
                 m4 = new JMenuItem("view a list of *required* courses that are *not* represented in my transcript ");
                 m5 = new JMenuItem("view the number of credits I must add to my plan of study in order to have a plan that allows me to complete my degree. ");
                 m6 = new JMenuItem("view a list of the prerequisite courses for any required course for my degree and major.");
                 m7 = new JMenuItem("view a list of prerequisite courses that I must take in order to take the courses currently in my plan of study.");
                 m8 = new JMenuItem("view the number of credits I have completed in my program ");
                 m9 = new JMenuItem("view the number of credits I have remaining to complete my program");
                 m10 = new JMenuItem("determine if I have met the completion requirements of my chosen degree ");
                 m11= new JMenuItem("View my GPA");




                 fileMenu.add(m1);
                 fileMenu.add(m2);
                 fileMenu.add(m3);
                 fileMenu.add(m4);
                 fileMenu.add(m5);
                 fileMenu.add(m6);
                 fileMenu.add(m7);
                 fileMenu.add(m8);
                 fileMenu.add(m9);
                 fileMenu.add(m10);
                 fileMenu.add(m11);


                 menuBar.add(fileMenu);
                 p5.add(l5);
                 p5.add(menuBar);
                 f1.add(p5);

                 m1.addActionListener(r->{

                   JOptionPane.showMessageDialog(f1,
                   "This hasn't been implemented.",
                    "Well this is awkward...",
                     JOptionPane.PLAIN_MESSAGE);
                  }); //panel 5

              });   //panel 4

                p4.add(b4);
                p4.add(l4);
                p4.add(b42);
                f1.add(p4);

                b4.addActionListener(b->{

                  p5 = new JPanel();
                  p4.setVisible(false);
                  p5.setVisible(true);


                  l5 = new JLabel("Choose what you would like to do..");


                 menuBar = new JMenuBar();
                 fileMenu = new JMenu();


                 m1 = new JMenuItem("Maintain Courses");
                 m2 = new JMenuItem("Save my program");
                 m3 = new JMenuItem("view a list of *required* courses for my degree and major that are *not* represented in my plan of study nor in my transcript ");
                 m4 = new JMenuItem("view a list of *required* courses that are *not* represented in my transcript ");
                 m5 = new JMenuItem("view the number of credits I must add to my plan of study in order to have a plan that allows me to complete my degree. ");
                 m6 = new JMenuItem("view a list of the prerequisite courses for any required course for my degree and major.");
                 m7 = new JMenuItem("view a list of prerequisite courses that I must take in order to take the courses currently in my plan of study.");
                 m8 = new JMenuItem("view the number of credits I have completed in my program ");
                 m9 = new JMenuItem("view the number of credits I have remaining to complete my program");
                 m10 = new JMenuItem("determine if I have met the completion requirements of my chosen degree ");
                 m11= new JMenuItem("View my GPA");




                 fileMenu.add(m1);
                 fileMenu.add(m2);
                 fileMenu.add(m3);
                 fileMenu.add(m4);
                 fileMenu.add(m5);
                 fileMenu.add(m6);
                 fileMenu.add(m7);
                 fileMenu.add(m8);
                 fileMenu.add(m9);
                 fileMenu.add(m10);
                 fileMenu.add(m11);


                 menuBar.add(fileMenu);
                 p5.add(l5);
                 p5.add(menuBar);
                 f1.add(p5);

                 m1.addActionListener(r->{

                   JOptionPane.showMessageDialog(f1,
                   "This hasn't been implemented.",
                    "Well this is awkward...",
                     JOptionPane.PLAIN_MESSAGE);
                  }); //panel 5

              });   //panel 4

           }); //panel 3

       }); //panel 2

    }); //panel 1
  }


     public static void main(String[] args){

       new Plannerf();
     }
}
