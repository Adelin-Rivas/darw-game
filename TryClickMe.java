
import javax.swing.*;
import java.awt.*;
import java.awt.Color;


public class TryClickMe extends JFrame {
    private JButton buttonCounter, ButtonReset;
    private JLabel labelCount;
    private int clicks=0;









    public TryClickMe(){

        setSize(900, 900);
        setTitle("Drwonme");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        creteteView();




    }

    private void creteteView(){
        JPanel menu= new JPanel();
        JPanel panel= new JPanel();
        JPanel canvas=new JPanel();
        JPanel size=new JPanel();
        size.setSize(500,100);
         menu.setBackground(Color.GRAY);
        canvas.setBackground(Color.BLUE);
        canvas.setSize(500, 500);


        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);
        // buttonms
        JButton pen = new JButton("pen");
        JButton text= new JButton("text");
        JButton circle=new JButton("circle");
        JButton oval=new JButton("circle");
        JButton robox= new JButton("rombo");
        JButton squere= new JButton("squere");

        menu.add(pen);
        menu.add(text);
        menu.add(squere);
        menu.add(robox);


        panel.add(menu,BorderLayout.NORTH);
        panel.add(canvas,BorderLayout.CENTER);




        JSlider slider = new JSlider(JSlider.VERTICAL, 0, 60, 3);
        slider.setMinorTickSpacing(40);
        slider.setMajorTickSpacing(40);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);


        slider.setLabelTable(slider.createStandardLabels(10));
        size.add(slider);
        panel.add(slider,BorderLayout.WEST);



        canvas.addMouseListener(new Drawing());

        //JTextField field = new JTextField(8);
       // panel.add(field,BorderLayout.NORTH);




    }




    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new TryClickMe();

                new TryClickMe().setVisible(true);

            }
        });



    }
}

