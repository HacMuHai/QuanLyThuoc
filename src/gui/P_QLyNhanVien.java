/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.NhanVien_DAO;
import entity.NhanVien;

/**
 *
 * @author Asus
 */
public class P_QLyNhanVien extends javax.swing.JPanel implements ActionListener, MouseListener {

	private DefaultComboBoxModel<String> cbxModel;

	/**
	 * Creates new form P_QLyNhanVien
	 */
	public P_QLyNhanVien() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		pThem = new javax.swing.JPanel();
		lblMa = new javax.swing.JLabel();
		lblTen = new javax.swing.JLabel();
		lblChucVu = new javax.swing.JLabel();
		lblNgaySinh = new javax.swing.JLabel();
		lblDiaChi = new javax.swing.JLabel();
		txtMa = new javax.swing.JTextField();
		txtTen = new javax.swing.JTextField();
		txtNgaySinh = new javax.swing.JTextField();
		txtChucVu = new javax.swing.JTextField();
		txtDiaChi = new javax.swing.JTextField();
		lblGioiTinh = new javax.swing.JLabel();
		cbxGioiTinh = new javax.swing.JComboBox<>();
		btnThem = new javax.swing.JButton();
		btnLuu = new javax.swing.JButton();
		btnSua = new javax.swing.JButton();
		btnXoa = new javax.swing.JButton();
		btnXoaTrang = new javax.swing.JButton();
		filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0),
				new java.awt.Dimension(32767, 0));
		jScrollPane3 = new javax.swing.JScrollPane();
		tList = new javax.swing.JTable();
		btnThoat = new javax.swing.JButton();
		btnDau = new javax.swing.JButton();
		btnTruoc = new javax.swing.JButton();
		lblDem = new javax.swing.JLabel();
		btnSau = new javax.swing.JButton();
		btnCuoi = new javax.swing.JButton();

		pThem.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhân viên"));

		lblMa.setBackground(new java.awt.Color(255, 255, 255));
		lblMa.setText("Mã nhân viên");

		lblTen.setText("Tên nhân viên");

		lblChucVu.setText("Chức vụ");

		lblNgaySinh.setText("Ngày sinh");

		lblDiaChi.setText("Địa chỉ");

		lblGioiTinh.setText("Giới tính");

		javax.swing.GroupLayout pThemLayout = new javax.swing.GroupLayout(pThem);
        pThem.setLayout(pThemLayout);
        pThemLayout.setHorizontalGroup(
            pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThemLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pThemLayout.createSequentialGroup()
                        .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtTen)))
                    .addGroup(pThemLayout.createSequentialGroup()
                        .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pThemLayout.setVerticalGroup(
            pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThemLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGioiTinh)
                        .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pThemLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pThemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pThemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

		btnThem.setBackground(new java.awt.Color(0, 255, 0));
		btnThem.setIcon(new ImageIcon("img/icons8-add-administrator-30.png")); // NOI18N
		btnThem.setText("Thêm");

		btnLuu.setBackground(new java.awt.Color(0, 255, 0));
		btnLuu.setIcon(new ImageIcon("img/icons8-save-30.png")); // NOI18N
		btnLuu.setText("Lưu");

		btnSua.setBackground(new java.awt.Color(0, 255, 0));
		btnSua.setIcon(new ImageIcon("img/icons8-hand-with-pen-30.png")); // NOI18N
		btnSua.setText("Sửa");

		btnXoa.setBackground(new java.awt.Color(0, 255, 0));
		btnXoa.setIcon(new ImageIcon("img/icons8-remove-administrator-30.png")); // NOI18N
		btnXoa.setText("Xóa");

		btnXoaTrang.setBackground(new java.awt.Color(0, 255, 0));
		btnXoaTrang.setIcon(new ImageIcon("img/icons8-delete-document-30.png")); // NOI18N
		btnXoaTrang.setText("Xóa trắng");

		btnThoat.setBackground(new java.awt.Color(0, 255, 0));
		btnThoat.setIcon(new ImageIcon("img/icons8-move-out-30.png")); // NOI18N
		btnThoat.setText("Thoát");

		btnDau.setIcon(new ImageIcon("img/icons8-left2-30.png")); // NOI18N
		btnTruoc.setIcon(new ImageIcon("img/icons8-left1-30.png")); // NOI18N

		lblDem.setText("0/0");

		btnSau.setIcon(new ImageIcon("img/icons8-right1-30.png")); // NOI18N

		btnCuoi.setIcon(new ImageIcon("img/icons8-right2-30.png")); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(178, 178, 178).addComponent(btnThem).addGap(30, 30, 30)
				.addComponent(btnLuu).addGap(30, 30, 30).addComponent(btnSua).addGap(30, 30, 30).addComponent(btnXoa)
				.addGap(30, 30, 30).addComponent(btnXoaTrang)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(48, 48, 48))
						.addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(btnThoat)
								.addContainerGap(148, Short.MAX_VALUE))))
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane3))
								.addGroup(layout.createSequentialGroup().addGap(5, 5, 5).addComponent(pThem,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
						.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(390, 390, 390).addComponent(btnDau).addGap(15, 15, 15)
						.addComponent(btnTruoc).addGap(10, 10, 10).addComponent(lblDem).addGap(10, 10, 10)
						.addComponent(btnSau).addGap(15, 15, 15).addComponent(btnCuoi)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(pThem, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnThem).addComponent(btnLuu).addComponent(btnSua).addComponent(btnXoa)
								.addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnXoaTrang).addComponent(btnThoat))
						.addGap(20, 20, 20)
						.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(13, 13, 13)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnDau).addComponent(btnTruoc)
								.addComponent(lblDem, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSau).addComponent(btnCuoi))
						.addContainerGap(21, Short.MAX_VALUE)));

		try {
			ConnectDB.getInstance().connect();
		} catch (Exception e) {
			e.printStackTrace();
		}

		nhanVien_DAO = new NhanVien_DAO();

		String[] heads = { "Mã", "Họ tên", "Ngày sinh", " Giới tính", "Địa chỉ", "Chức vụ" };
		tModel = new DefaultTableModel(heads, 0);
		tList.setModel(tModel);
		jScrollPane3.setViewportView(tList);

		docDLVaoTable();

		moKhoaTextfields(false);

		mauTinHienHanh = -1;
		tongSoMauTin = tList.getRowCount();
		if (tongSoMauTin > 0) {
			mauTinHienHanh = 0; // Khởi tạo là mẫu tin đầu tiên
			capNhatSoMauTin(mauTinHienHanh);
		}

		cbxModel = new DefaultComboBoxModel<String>(new String[] { "Nam", "Nữ" });
		cbxGioiTinh.setModel(cbxModel);
		cbxGioiTinh.setToolTipText("");

		btnLuu.setEnabled(false);

		btnThem.addActionListener(this);
		btnLuu.addActionListener(this);
		btnSua.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnThoat.addActionListener(this);

		btnDau.addActionListener(this);
		btnTruoc.addActionListener(this);
		btnSau.addActionListener(this);
		btnCuoi.addActionListener(this);

		tList.addMouseListener(this);

	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCuoi;
	private javax.swing.JButton btnDau;
	private javax.swing.JButton btnLuu;
	private javax.swing.JButton btnSau;
	private javax.swing.JButton btnSua;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnThoat;
	private javax.swing.JButton btnTruoc;
	private javax.swing.JButton btnXoa;
	private javax.swing.JButton btnXoaTrang;
	private javax.swing.JComboBox<String> cbxGioiTinh;
	private javax.swing.Box.Filler filler1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JLabel lblChucVu;
	private javax.swing.JLabel lblDem;
	private javax.swing.JLabel lblDiaChi;
	private javax.swing.JLabel lblGioiTinh;
	private javax.swing.JLabel lblMa;
	private javax.swing.JLabel lblNgaySinh;
	private javax.swing.JLabel lblTen;
	private javax.swing.JPanel pThem;
	private javax.swing.JTable tList;
	private javax.swing.JTextField txtChucVu;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtMa;
	private javax.swing.JTextField txtNgaySinh;
	private javax.swing.JTextField txtTen;
	// End of variables declaration//GEN-END:variables
	private DefaultTableModel tModel;
	private int mauTinHienHanh;
	private int tongSoMauTin;
	private NhanVien_DAO nhanVien_DAO;

	private void docDLVaoTable() {
		ArrayList<NhanVien> listNV = nhanVien_DAO.getAllNhanVien();
		for (NhanVien nv : listNV) {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate ngayS = nv.getNgaySinh();
			String ngaySinh = "";
			if (ngayS != null)
				ngaySinh = fmt.format(ngayS);
			tModel.addRow(new Object[] { nv.getUsername(), nv.getHoTen(), ngaySinh, nv.isGioiTinh() ? "Nam" : "Nữ",
					nv.getDiaChi(), nv.getChucVu() });
		}
	}

	private void moKhoaControls(boolean b) {
		btnDau.setEnabled(b);
		btnTruoc.setEnabled(b);
		btnSau.setEnabled(b);
		btnCuoi.setEnabled(b);
		btnThem.setEnabled(b);
		btnXoa.setEnabled(b);
		btnSua.setEnabled(b);
		btnLuu.setEnabled(b);
		btnXoaTrang.setEnabled(b);
		btnThoat.setEnabled(b);
	}

	private void moKhoaTextfields(boolean b) {
		txtMa.setEditable(b);
		txtTen.setEditable(b);
		txtNgaySinh.setEditable(b);
		txtDiaChi.setEditable(b);
		txtChucVu.setEditable(b);
	}

	private void capNhatSoMauTin(int n) {
		if (n < 0) {
			lblDem.setText(0 + "/" + 0);
		} else {
			tList.setRowSelectionInterval(n, n);
			tongSoMauTin = tList.getRowCount();
			lblDem.setText(mauTinHienHanh + 1 + "/" + tongSoMauTin);
			napDLLenTextF();
		}
	}

	private void napDLLenTextF() {
		int r = tList.getSelectedRow();
		if (r == -1)
			return;
		txtMa.setText(tModel.getValueAt(r, 0).toString());
		txtTen.setText(tModel.getValueAt(r, 1).toString());
		txtNgaySinh.setText(tModel.getValueAt(r, 2).toString());
		cbxGioiTinh.setSelectedItem(tModel.getValueAt(r, 3).toString());
		txtDiaChi.setText(tModel.getValueAt(r, 4).toString());
		txtChucVu.setText(tModel.getValueAt(r, 5).toString());

	}

	private void sh_Mes(String mes, JTextField txt) {
		JOptionPane.showMessageDialog(null, mes);
		if (txt == null)
			return;
		txt.requestFocus();
	}

	private void xoaTrang() {
		txtMa.setText("");
		txtTen.setText("");
		txtChucVu.setText("");
		txtNgaySinh.setText("");
		txtDiaChi.setText("");
		txtMa.requestFocus();
	}

	public NhanVien ktra_LayDL() {
		String ma = txtMa.getText();
		String ten = txtTen.getText();
		String ngaySinh = txtNgaySinh.getText();
		boolean gTinh = cbxModel.getSelectedItem() == "Nam";
		String diaChi = txtDiaChi.getText();
		String chucVu = txtChucVu.getText();

		if (ma.trim().equals("")) {
			sh_Mes("Mã không được để trống", txtMa);
			return null;
		}

		if (!ma.matches("^\\D.*$")) {
			sh_Mes("Mã phải bắt đầu bằng kí không phải số", txtMa);
			return null;
		}

		if (ten.trim().equals("")) {
			sh_Mes("Tên không được để trống", txtTen);
			return null;
		}

		if (!ten.matches("^([A-Z][a-z]+\s?)+$")) {
			sh_Mes("Tên gồm ít nhất 2 từ và bắt đầu bằng chữ hoa", txtTen);
			return null;
		}

		if (ngaySinh.trim().equals("")) {
			sh_Mes("Ngày sinh không được để trống", txtNgaySinh);
			return null;
		}

		LocalDate ngSinh_D = null;

		try {
			ngSinh_D = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		} catch (Exception e) {
			sh_Mes("Ngày sinh phải có định: dd/MM/yyyy", txtNgaySinh);
			return null;
		}

		if (diaChi.trim().equals("")) {
			sh_Mes("Địa chỉ không được để trống", txtDiaChi);
			return null;
		}

		if (chucVu.trim().equals("")) {
			sh_Mes("Chức vụ không được để trống", txtDiaChi);
			return null;
		}

		return new NhanVien(ma, null, ten, ngSinh_D, gTinh, diaChi, null, chucVu);
	}

	private String ktra_LayMatKhau() {
		JPasswordField pf = new JPasswordField();
		String matkhau = "";
		boolean flag = false;
		do {
			pf.setText(matkhau);
			int opt = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE);
			if(opt== JOptionPane.CANCEL_OPTION) {
				return "";
			}
			matkhau = new String(pf.getPassword());
			if (matkhau.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Mật khẩu trống");
				flag = false;
			} else if (!matkhau.matches("^[A-Za-z0-9(!@#$%^&*()_ d]{6,20}$")) {
				JOptionPane.showMessageDialog(null, "Mật khẩu gồm 6-20 kí tự chữ, con số hoặc kí tự đặt biệt");
				flag = false;
			} else {
				flag = true;
			}
		} while (!flag);
		return matkhau;
	}

	private void sua() {
		int r = tList.getSelectedRow();
		if (r == -1) {
			sh_Mes("Chọn dòng cần sửa", null);
			return;
		}
		NhanVien nvMoi = ktra_LayDL();
		if (nvMoi == null) {
			return;
		}

		tModel.removeRow(r);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngayS = nvMoi.getNgaySinh();
		String ngaySinh = "";
		if (ngayS != null)
			ngaySinh = fmt.format(ngayS);
		tModel.insertRow(r, new Object[] { nvMoi.getUsername(), nvMoi.getHoTen(), ngaySinh,
				nvMoi.isGioiTinh() ? "Nam" : "Nữ", nvMoi.getDiaChi(), nvMoi.getChucVu() });
		nhanVien_DAO.suaNhanVien(nvMoi);
		capNhatSoMauTin(mauTinHienHanh);
	}

	private void them() {
		NhanVien nv = ktra_LayDL();
		if (nv == null) {
			return;
		}
		if (nhanVien_DAO.getNhanVienTheoMa(nv.getUsername()) != null) {
			sh_Mes("Trùng mã nhân viên", txtMa);
			return;
		}

		String pass = "";
		pass = ktra_LayMatKhau();
		if (pass == "") {
			return;
		}
		nv.setPassword(pass);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngayS = nv.getNgaySinh();
		String ngaySinh = "";
		if (ngayS != null)
			ngaySinh = fmt.format(ngayS);
		tModel.addRow(new Object[] { nv.getUsername(), nv.getHoTen(), ngaySinh, nv.isGioiTinh() ? "Nam" : "Nữ",
				nv.getDiaChi(), nv.getChucVu() });
		nhanVien_DAO.themNhanVien(nv);
		if (tList.getRowCount() == 1)
			mauTinHienHanh++;
		capNhatSoMauTin(mauTinHienHanh);
		xoaTrang();
	}

	private void xoa() {
		int r = tList.getSelectedRow();
		if (r == -1) {
			sh_Mes("Chọn dòng cần xóa", null);
			return;
		}
		int opt = JOptionPane.showConfirmDialog(null, "Xác nhận", "Muốn xóa", JOptionPane.YES_NO_OPTION);
		if (opt == JOptionPane.YES_OPTION) {
			nhanVien_DAO.xoaNhanVien(tModel.getValueAt(r, 0).toString());
			if (r == tongSoMauTin - 1)
				mauTinHienHanh--;
			tModel.removeRow(r);
			capNhatSoMauTin(mauTinHienHanh);
			xoaTrang();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnThem)) {
			if (btnThem.getText().equalsIgnoreCase("Thêm")) {
				moKhoaTextfields(true);
				moKhoaControls(false);
				btnLuu.setEnabled(true);
				btnThem.setEnabled(true);
				xoaTrang();
				btnThem.setText("Hủy   ");
				btnThem.setIcon(new ImageIcon("img/icons8-xbox-x-30.png"));
			} else if (btnThem.getText().trim().equalsIgnoreCase("Hủy")) {
				moKhoaTextfields(false);
				moKhoaControls(true);
				btnLuu.setEnabled(false);
				btnThem.setText("Thêm");
				btnThem.setIcon(new ImageIcon("img/icons8-add-administrator-30.png"));
				napDLLenTextF();
			}
		} else if (obj.equals(btnSua)) {
			if (btnSua.getText().equalsIgnoreCase("Sửa")) {
				moKhoaTextfields(true);
				txtMa.setEditable(false);
				moKhoaControls(false);
				btnLuu.setEnabled(true);
				btnSua.setEnabled(true);
				btnSua.setText("Hủy");
				btnSua.setIcon(new ImageIcon("img/icons8-xbox-x-30.png"));
			} else if (btnSua.getText().equalsIgnoreCase("Hủy")) {
				moKhoaTextfields(false);
				moKhoaControls(true);
				btnLuu.setEnabled(false);
				btnSua.setText("Sửa");
				btnSua.setIcon(new ImageIcon("img/icons8-hand-with-pen-30.png"));
				napDLLenTextF();
			}
		} else if (obj.equals(btnLuu)) {
			if (btnThem.getText().trim().equalsIgnoreCase("Hủy")) {
				them();
			}
			if (btnSua.getText().trim().equalsIgnoreCase("Hủy")) {
				sua();
			}
		} else if (obj.equals(btnXoa))
			xoa();
		else if (obj.equals(btnXoaTrang))
			xoaTrang();
		else if (obj.equals(btnThoat)) {
			MainGui.getPnSlider().removeAll();
			MainGui.getPnSlider().repaint();
			MainGui.getPnSlider().revalidate();
//			System.exit(0);
		} else if (tongSoMauTin > 0) {
			if (obj.equals(btnDau))
				mauTinHienHanh = 0;
			else if (obj.equals(btnCuoi))
				mauTinHienHanh = tongSoMauTin - 1;
			else if (obj.equals(btnSau) && mauTinHienHanh < tongSoMauTin - 1)
				mauTinHienHanh++;
			else if (obj.equals(btnTruoc) && mauTinHienHanh > 0)
				mauTinHienHanh--;
			capNhatSoMauTin(mauTinHienHanh);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int r = tList.getSelectedRow();
		mauTinHienHanh = r;
		capNhatSoMauTin(mauTinHienHanh);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
