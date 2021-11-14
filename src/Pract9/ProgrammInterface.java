import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgrammInterface extends JFrame{

    private String full_name_clients;
    private String TIN;
    private String[][] arr_TIN = {{"124557869912","4657883490","112326647587","1126477592","0093456108","1128657493","1122167485"},{"Y A R"," B B B", "A C B", "M M M", "F U C", "K M Y", "A S S"}};

    public ProgrammInterface() {
        setTitle("Buying");
        setLayout(new FlowLayout());
        setSize(400, 400);
        setLayout(null);
        JButton buttonEnterData = new JButton("Enter");
        JLabel fullNameLabel = new JLabel("Full name");
        JLabel TINLabel = new JLabel("TIN");
        JTextField fullNameField = new JTextField(40);
        JTextField TINField = new JTextField(12);
        fullNameLabel.setBounds(50,100,100,30);
        fullNameField.setBounds(50,130,200,30);
        TINLabel.setBounds(50,160,100,30);
        TINField.setBounds(50,190,200,30);
        buttonEnterData.setBounds(100,250,100,30);
        add(buttonEnterData);
        add(fullNameField);
        add(fullNameLabel);
        add(TINField);
        add(TINLabel);

//        buttonEnterData.setActionCommand("enterName");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo (null);


        buttonEnterData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                full_name_clients = fullNameField.getText();
                TIN = TINField.getText();
                resultBuy();
//                try {
//                    for (int i = 0; i < 7; ++i) {
//                        if (arr_TIN[1][i].equals(full_name_clients)) {
//                            if (!arr_TIN[0][i].equals(TIN))
//                                throw new InvalidTIN("Incorrect TIN!");
//                        }
//                    }
//                }
//                catch (InvalidTIN err) {
//                    JLabel errorText = new JLabel("Purchase failed: " + err);
//                    errorText.setBounds(100,70,100,30);
//                    add(errorText);
//                }
//            }
            }
        });

    }

    private void resultBuy() {
        try {
            for (int i = 0; i < 7; ++i) {
                if (arr_TIN[1][i].equals(full_name_clients)) {
                    if (!arr_TIN[0][i].equals(TIN))
                        throw new InvalidTIN("Incorrect TIN!");
                }
            }
        }
        catch (InvalidTIN err) {
            JLabel errorText = new JLabel("Purchase failed: " + err);
            errorText.setBounds(100,70,1000,30);
            add(errorText);
        }
    }


}
