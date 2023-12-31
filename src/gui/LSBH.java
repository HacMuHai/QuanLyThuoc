/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dao.ChiTietHD_DAO;
import dao.HoaDon_DAO;
import dao.Thuoc_DAO;
import entity.ChiTietHD;
import entity.HoaDon;
import entity.Thuoc;

/**
 *
 * @author bohie
 */
public class LSBH extends javax.swing.JPanel implements ActionListener,
		MouseListener {

	/**
	 * Creates new form LSBH
	 */
	public LSBH() {
		try {
			dao_Thuoc = new Thuoc_DAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane2 = new javax.swing.JScrollPane();
		tableLSBH = new javax.swing.JTable();
		lblTieuDe = new javax.swing.JLabel();
		btnleft = new javax.swing.JButton();
		btnLeftAll = new javax.swing.JButton();
		btnright = new javax.swing.JButton();
		btnrightall = new javax.swing.JButton();
		btnUX = new javax.swing.JButton();
		lblMauTin = new javax.swing.JLabel();

		tableLSBH.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		tableLSBH.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "Mã hóa đơn", "Tên Thuốc", "Ngày thanh toán",
						"Giá bán", "Số lượng", "VAT", "Thành tiền" }));
		jScrollPane2.setViewportView(tableLSBH);
		if (tableLSBH.getColumnModel().getColumnCount() > 0) {
			tableLSBH.getColumnModel().getColumn(0).setResizable(false);
			tableLSBH.getColumnModel().getColumn(0).setPreferredWidth(35);
			tableLSBH.getColumnModel().getColumn(1).setResizable(false);
			tableLSBH.getColumnModel().getColumn(1).setPreferredWidth(110);
			tableLSBH.getColumnModel().getColumn(2).setResizable(false);
			tableLSBH.getColumnModel().getColumn(3).setResizable(false);
			tableLSBH.getColumnModel().getColumn(4).setResizable(false);
			tableLSBH.getColumnModel().getColumn(4).setPreferredWidth(50);
			tableLSBH.getColumnModel().getColumn(5).setResizable(false);
			tableLSBH.getColumnModel().getColumn(6).setResizable(false);
		}

		lblTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		lblTieuDe.setForeground(new java.awt.Color(51, 0, 204));
		lblTieuDe.setText("LỊCH SỬ BÁN HÀNG");

		btnleft.setIcon(new ImageIcon("img/left.png")); // NOI18N

		btnLeftAll
				.setIcon(new ImageIcon("img/leftall.png")); // NOI18N

		btnright.setIcon(new ImageIcon("img/right.png")); // NOI18N

		btnrightall.setIcon(new ImageIcon("img/rightall.png")); // NOI18N

		btnUX.setIcon(new ImageIcon("img/upEX.png")); // NOI18N
		btnUX.setText("Xuất file");
		btnUX.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUXActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(56, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		lblTieuDe)
																.addGap(397,
																		397,
																		397))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jScrollPane2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		920,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(54, 54,
																		54))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		btnLeftAll)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		btnleft)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		lblMauTin,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		35,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		btnright)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		btnrightall)
																.addGap(87, 87,
																		87)
																.addComponent(
																		btnUX)
																.addGap(258,
																		258,
																		258)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblTieuDe,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										331,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(16, 16, 16)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
																.addComponent(
																		btnLeftAll,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		btnleft,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		btnright,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		btnrightall,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		lblMauTin,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addComponent(
														btnUX,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														40,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(73, Short.MAX_VALUE)));
		// Dọc dữ liệu vào table
		DocDuLieuVaoTB();

		mauTinHienHanh = -1;
		tongSoMauTin = tableLSBH.getRowCount();
		if (tongSoMauTin > 0) {
			mauTinHienHanh = 0; // Khởi tạo là mẫu tin đầu tiên
			capNhatThongTinMauTin(mauTinHienHanh);
		}
		btnleft.addActionListener(this);
		btnLeftAll.addActionListener(this);
		btnright.addActionListener(this);
		btnrightall.addActionListener(this);
		btnUX.addActionListener(this);
		tableLSBH.addMouseListener(this);

	}// </editor-fold>//GEN-END:initComponents

	private void btnUXActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUXActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnUXActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnLeftAll;
	private javax.swing.JButton btnUX;
	private javax.swing.JButton btnleft;
	private javax.swing.JButton btnright;
	private javax.swing.JButton btnrightall;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel lblMauTin;
	private javax.swing.JLabel lblTieuDe;
	private javax.swing.JTable tableLSBH;
	// End of variables declaration//GEN-END:variables
	private Thuoc_DAO dao_Thuoc;
	private ChiTietHD_DAO dao_CTHD = new ChiTietHD_DAO();
	private HoaDon_DAO dao_HD = new HoaDon_DAO();
	// End of variables declaration//GEN-END:variables
	private DefaultTableModel modelThuoc;
	private int tongSoMauTin;
	private int mauTinHienHanh;
	private DecimalFormat df = new DecimalFormat("#.##");
	


	// Đưa dữ liệu vào table
	public void DocDuLieuVaoTB() {
		ChiTietHD cthd = new ChiTietHD();
		ArrayList<Thuoc> dsT = dao_Thuoc.getAllThuoc();
		ArrayList<ChiTietHD> dsCTHD = dao_CTHD.getAllCTHD_LSBH();
		ArrayList<HoaDon> dsHD = dao_HD.getAllHoaDon();
		modelThuoc = (DefaultTableModel) tableLSBH.getModel();
		
		for (ChiTietHD chiTietHD : dsCTHD) {

			modelThuoc.addRow(new Object[] { chiTietHD.getMaCTHD(),
					chiTietHD.getThuoc().getTenThuoc(),
					chiTietHD.getHoaDon().getNgayThanhToan(),
					chiTietHD.getGiaBan(), chiTietHD.getSoLuong(), df.format(chiTietHD.getVAT())
					, df.format(chiTietHD.thanhTien()) });
		}
	}

	private void capNhatThongTinMauTin(int n) {
		tableLSBH.setRowSelectionInterval(n, n);
		lblMauTin.setText(mauTinHienHanh + 1 + "/" + tongSoMauTin);
		// napLopHocVaoTextfields();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (tongSoMauTin > 0) { // Cho các nút duyệt
			if (o.equals(btnLeftAll))
				mauTinHienHanh = 0;
			else if (o.equals(btnrightall))
				mauTinHienHanh = tongSoMauTin - 1;
			else if (o.equals(btnright) && mauTinHienHanh < tongSoMauTin - 1)
				mauTinHienHanh++;
			else if (o.equals(btnleft) && mauTinHienHanh > 0)
				mauTinHienHanh--;
			capNhatThongTinMauTin(mauTinHienHanh);
		}
		if (o.equals(btnUX)) {
			try {
				XSSFWorkbook workbook = new XSSFWorkbook();
				XSSFSheet sheet = workbook.createSheet("Lịch sử bán ");

				XSSFRow row = null;
				Cell cell = null;
				row = sheet.createRow(3);

				cell = row.createCell(0, CellType.STRING);
				cell.setCellValue("Mã hóa đơn");

				cell = row.createCell(1, CellType.STRING);
				cell.setCellValue("Tên thuốc");

				cell = row.createCell(2, CellType.STRING);
				cell.setCellValue("Ngày thanh toán");

				cell = row.createCell(3, CellType.STRING);
				cell.setCellValue("Giá bán");

				cell = row.createCell(4, CellType.STRING);
				cell.setCellValue("Số lượng");

				cell = row.createCell(5, CellType.STRING);
				cell.setCellValue("VAT");

				cell = row.createCell(6, CellType.STRING);
				cell.setCellValue("Thành tiền");

				ArrayList<ChiTietHD> dsCTHD = dao_CTHD.getAllCTHD_LSBH();
				for (int i = 0; i < dsCTHD.size(); i++) {
					row = sheet.createRow(4 + i);
					cell = row.createCell(0, CellType.STRING);
					cell.setCellValue(dsCTHD.get(i).getHoaDon().getMaHD());

					cell = row.createCell(1, CellType.STRING);
					cell.setCellValue(dsCTHD.get(i).getThuoc().getTenThuoc());

					CellStyle cellStyle = workbook.createCellStyle();
					CreationHelper createHelper = workbook.getCreationHelper();
					cellStyle.setDataFormat(createHelper.createDataFormat()
							.getFormat("yyyy-MM-dd"));
					cell = row.createCell(2);
					cell.setCellValue( dsCTHD.get(i).getHoaDon()
							.getNgayThanhToan());
					cell.setCellStyle(cellStyle);

					// cell = row.createCell(2,CellType.NUMERIC);
					// cell.setCellValue(dsCTHD.get(i).getHoaDon().getNgayThanhToan());

					cell = row.createCell(3, CellType.STRING);
					cell.setCellValue(dsCTHD.get(i).getGiaBan());

					cell = row.createCell(4, CellType.STRING);
					cell.setCellValue(dsCTHD.get(i).getSoLuong());

					cell = row.createCell(5, CellType.STRING);
					cell.setCellValue(df.format(dsCTHD.get(i).getVAT()) );

					cell = row.createCell(6, CellType.STRING);
					cell.setCellValue(df.format(dsCTHD.get(i).thanhTien()) );
				}
				File f = new File("file/danhsach.xlsx");
				try {
					FileOutputStream file = new FileOutputStream(f);
					workbook.write(file);
					file.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Xuất file thành công");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		int row = tableLSBH.getSelectedRow();
		if (row >= 0) {
			mauTinHienHanh = row;
			capNhatThongTinMauTin(mauTinHienHanh);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
