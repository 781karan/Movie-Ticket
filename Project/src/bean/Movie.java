package bean;
import java.time.LocalDate;

public class Movie {
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(int num) {
		this.adminContact = num;
	}
	private String adminId;
	private String adminName;
	private String adminPassword;
	private LocalDate dateOfBirth;
	private int adminContact;
}