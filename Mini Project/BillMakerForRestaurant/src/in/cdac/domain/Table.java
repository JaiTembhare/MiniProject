package in.cdac.domain;

public class Table {
	private int tableNo;
	private String customerName;
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Table(int tableNo, String customerName) {
		this.tableNo = tableNo;
		this.customerName = customerName;
	}
}
