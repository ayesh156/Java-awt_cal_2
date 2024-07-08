
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    TextField tf;

    private MenuItem mi5, mi6;

    private Panel p1, p2;

    String fv, sv, op, num, ntext;

    double fdv, sdv, tot, dnum, memory;

    boolean isPositive = true;

    cal() {

        Frame f1 = new Frame();

        f1.setBackground(Color.lightGray);  // Set background color
        f1.addWindowListener(new close()); // window close
        f1.setBounds(700, 250, 400, 500); // window opening position
        f1.setTitle("My Cal"); // Set Title

        MenuBar mbar = new MenuBar();

        MenuItem mi1 = new MenuItem("Standard");
        MenuItem mi2 = new MenuItem("Scientific");
        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Paste");
        mi5 = new MenuItem("Light");
        mi6 = new MenuItem("Dark");
        MenuItem mi7 = new MenuItem("View Help");
        MenuItem mi8 = new MenuItem("About");

        Menu m1 = new Menu("File");
        m1.add(mi1);
        m1.add(mi2);

        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        m2.add(mi4);

        Menu m3 = new Menu("Theme");
        m3.add(mi5);
        m3.add(mi6);
        
        Menu m4 = new Menu("Help");
        m4.add(mi7);
        m4.add(mi8);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        mbar.add(m4);

        f1.setMenuBar(mbar);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button(".");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("x");
        b15 = new Button("/");
        b16 = new Button("=");
        b17 = new Button("C");
        b18 = new Button("CE");
        b19 = new Button("%");
        b20 = new Button("√");
        b21 = new Button("+/-");
        b22 = new Button("<--");
        b23 = new Button("M+");
        b24 = new Button("MR");

        Font font1 = new Font("Cambria Math", Font.BOLD, 26);
        Font font2 = new Font("Courier New", Font.BOLD, 24);

        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font2);
        b12.setFont(font2);
        b13.setFont(font2);
        b14.setFont(font2);
        b15.setFont(font2);
        b16.setFont(font2);
        b17.setFont(font2);
        b18.setFont(font2);
        b19.setFont(font2);
        b20.setFont(font2);
        b21.setFont(font2);
        b22.setFont(font2);
        b23.setFont(font2);
        b24.setFont(font2);

        b16.setBackground(Color.cyan);

        Component[] components = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b17, b18, b19, b20, b21, b22, b23, b24};
        for (Component c : components) {
            c.setBackground(Color.white);
            c.setForeground(Color.black);
        }

        Component[] components3 = {b12, b13, b14, b15};
        for (Component c3 : components3) {
            c3.setBackground(Color.orange);
            c3.setForeground(Color.black);
        }

        tf = new TextField(14);

        Font font = new Font("Cambria Math", Font.BOLD, 40);

        tf.setFont(font);
        tf.setEditable(false);

        tf.setForeground(Color.black);
        tf.setBackground(Color.white);

        p1 = new Panel();

        p2 = new Panel();

        GridLayout g1 = new GridLayout(6, 4, 3, 3);

        p1.add(tf);
        p1.setBackground(Color.lightGray);

        p2.setLayout(g1);

        p2.setBackground(Color.lightGray);

        p2.add(b18);
        p2.add(b17);
        p2.add(b23);
        p2.add(b24);
        p2.add(b19);
        p2.add(b20);
        p2.add(b22);
        p2.add(b13);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b15);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b14);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b12);
        p2.add(b21);
        p2.add(b10);
        p2.add(b11);
        p2.add(b16);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);

        f1.setVisible(true);  // window visible

    }

    @Override
    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (d.getSource() == mi5) {
            // Change the color of the menu item
            Component[] components = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b17, b18, b19, b20, b21, b22, b23, b24};
            for (Component c : components) {
                c.setBackground(Color.white);
                c.setForeground(Color.black);
            }

            b16.setBackground(Color.cyan);
            b16.setForeground(Color.black);

            Component[] components2 = {p1, p2};
            for (Component c2 : components2) {
                c2.setBackground(Color.lightGray);
            }

            Component[] components3 = {b12, b13, b14, b15};
            for (Component c3 : components3) {
                c3.setBackground(Color.orange);
                c3.setForeground(Color.black);
            }

            tf.setForeground(Color.black);
            tf.setBackground(Color.white);

        }

        if (d.getSource() == mi6) {

            // Change the color of the menu item
            Component[] components = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b17, b18, b19, b20, b21, b22, b23, b24};
            for (Component c : components) {
                c.setBackground(Color.black);
                c.setForeground(Color.white);
            }

            b16.setBackground(Color.blue);
            b16.setForeground(Color.white);

            Component[] components3 = {b12, b13, b14, b15};
            for (Component c3 : components3) {
                c3.setBackground(Color.red);
                c3.setForeground(Color.white);
            }

            Component[] components2 = {p1, p2};
            for (Component c2 : components2) {
                c2.setBackground(Color.darkGray);
            }

            tf.setForeground(Color.white);
            tf.setBackground(Color.decode("#2c2c61"));

        }

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b21)) {
            isPositive = !isPositive;

            // Get the current display text
            sv = tf.getText();

            // Convert the display text to a double
            dnum = Double.parseDouble(sv);

            // Update the number to be positive or negative based on the isPositive flag
            if (isPositive) {
                dnum = Math.abs(dnum);
            } else {
                dnum = -Math.abs(dnum);
            }

            // Update the display text with the new number
            tf.setText(Double.toString(dnum));

        } else if (o.equals(b11)) {

            // Get the current text from the text field
            sv = tf.getText();

            // Append a "." to the end of the text
            ntext = sv + ".";

            // Set the updated text on the text field
            tf.setText(ntext);

        } else if (o.equals(b17)) {

            tf.setText(""); // clear the calculator screen
            fdv = sdv = tot = dnum = memory = 0; // reset the stored number
            op = ""; // reset the operator
            isPositive = true; // reset the positive/negative flag

        } else if (o.equals(b18)) {

            tf.setText("");

        } else if (o.equals(b23)) {

            sv = tf.getText();
            dnum = Double.parseDouble(sv);
            memory = dnum;

        } else if (o.equals(b24)) {

            tf.setText("");
            tf.setText(Double.toString(memory));

        } else if (o.equals(b19)) {

            double percentage = Double.parseDouble(tf.getText()) / 100;
            tf.setText(Double.toString(percentage));

        } else if (o.equals(b20)) {

            // Convert the string to a double
            double currentValue = Double.parseDouble(tf.getText());

            // Calculate the square root
            double sqrtValue = Math.sqrt(currentValue);

            // Update the text field with the result
            tf.setText(Double.toString(sqrtValue));

        } else if (o.equals(b22)) {

            String displayText = tf.getText();
            if (displayText.length() > 0) {
                displayText = displayText.substring(0, displayText.length() - 1);
                tf.setText(displayText);
            }

        } else if (o.equals(b12)) {

            fv = tf.getText();
            tf.setText("");;

            op = b12.getLabel();
        } else if (o.equals(b13)) {

            fv = tf.getText();
            tf.setText("");;

            op = b13.getLabel();
        } else if (o.equals(b14)) {

            fv = tf.getText();
            tf.setText("");;

            op = b14.getLabel();

        } else if (o.equals(b15)) {

            fv = tf.getText();
            tf.setText("");;

            op = b15.getLabel();

        } else if (o.equals(b16)) {

            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("+")) {

                tot = fdv + sdv;

            } else if (op.equals("-")) {

                tot = fdv - sdv;

            } else if (op.equals("x")) {

                tot = fdv * sdv;

            } else if (op.equals("/")) {

                tot = fdv / sdv;

            }

            tf.setText(tot + "");

        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

public class Calculator {

    public static void main(String[] args) {

        new cal();

    }

}
