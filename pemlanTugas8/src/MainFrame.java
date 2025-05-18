import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Montserrat", Font.PLAIN, 14);
    JTextField tfNamaLengkap, tfTanggalLahir, tfNoPendaftaran, tfNoTelp, tfAlamat, tfEmail;

    public void initialize() {
        // Label & TextField
        tfNamaLengkap = createTextField();
        tfTanggalLahir = createTextField();
        tfNoPendaftaran = createTextField();
        tfNoTelp = createTextField();
        tfAlamat = createTextField();
        tfEmail = createTextField();

        // Grid panel
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setFont(mainFont);
        formPanel.add(new JLabel("Nama Lengkap"));
        formPanel.add(wrapField(tfNamaLengkap));
        formPanel.add(new JLabel("Tanggal Lahir"));
        formPanel.add(wrapField(tfTanggalLahir));
        formPanel.add(new JLabel("Nomor Pendaftaran"));
        formPanel.add(wrapField(tfNoPendaftaran));
        formPanel.add(new JLabel("No. Telp"));
        formPanel.add(wrapField(tfNoTelp));
        formPanel.add(new JLabel("Alamat"));
        formPanel.add(wrapField(tfAlamat));
        formPanel.add(new JLabel("E-mail"));
        formPanel.add(wrapField(tfEmail));

        // Submit Button
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(mainFont);
        btnSubmit.addActionListener(e -> handleSubmit());

        JPanel btnPanel = new JPanel();
        btnPanel.add(btnSubmit);

        // Main Panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(240, 240, 255));
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(btnPanel, BorderLayout.SOUTH);

        // Frame settings
        setTitle("Form Daftar Ulang");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    private JTextField createTextField() {
        JTextField tf = new JTextField();
        tf.setPreferredSize(new Dimension(200, 25));
        tf.setFont(mainFont);
        return tf;
    }

    private JPanel wrapField(JTextField tf) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(tf);
        return panel;
    }

    private void handleSubmit() {
        // Validasi semua field
        if (tfNamaLengkap.getText().isEmpty() || tfTanggalLahir.getText().isEmpty()
                || tfNoPendaftaran.getText().isEmpty() || tfNoTelp.getText().isEmpty()
                || tfAlamat.getText().isEmpty() || tfEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Konfirmasi
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah anda yakin data yang Anda isi sudah benar?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            showResultWindow();
        }
    }

    private void showResultWindow() {
        new HasilForm(
            tfNamaLengkap.getText(),
            tfTanggalLahir.getText(),
            tfNoPendaftaran.getText(),
            tfNoTelp.getText(),
            tfAlamat.getText(),
            tfEmail.getText()
        );
    }
}

