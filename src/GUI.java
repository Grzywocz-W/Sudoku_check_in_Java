import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame {
    private JTextField poleTekstowe;
    public String plik;

    // Tworzenie okna aplikacji
    public GUI() {
        setTitle("Podawanie pliku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(150, 50, 150, 50));

        JLabel tekst = new JLabel("Podaj nazwe pliku z Sudoku (np. dane.txt): ");
        tekst.setAlignmentX(Component.CENTER_ALIGNMENT);
        poleTekstowe = new JTextField(15);
        poleTekstowe.setMaximumSize(new Dimension(200, 30));
        JButton przycisk = new JButton("Zatwierdz");
        przycisk.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(tekst);
        panel.add(Box.createVerticalStrut(10));
        panel.add(poleTekstowe);
        panel.add(Box.createVerticalStrut(20));
        panel.add(przycisk);


        // Obsługa kliknięcia przycisku
        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plik = poleTekstowe.getText().trim();
                if (!plik.isEmpty()) {
                    dispose(); // Zamknięcie okna po zatwierdzeniu
                } else {
                    JOptionPane.showMessageDialog(null, "Wprowadź poprawną nazwę pliku!", "Błąd", JOptionPane.ERROR_MESSAGE);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException blad) {
                        blad.printStackTrace();
                    }
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public String getPlik() {
        return plik;
    }
}
