import java.awt.*;
import javax.swing.*;

public class HasilForm extends JFrame {
    public HasilForm(String nama, String tglLahir, String noPendaftaran, String noTelp, String alamat, String email) {
        setTitle("Data Mahasiswa");

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Poppins", Font.PLAIN, 14));
        textArea.setText(String.format(
            "%-20s: %s\n%-20s: %s\n%-20s: %s\n%-20s: %s\n%-20s: %s\n%-20s: %s",
            "Nama", nama,
            "Tanggal Lahir", tglLahir,
            "No. Pendaftaran", noPendaftaran,
            "No. Telp", noTelp,
            "Alamat", alamat,
            "E-mail", email
        ));

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        add(panel);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
