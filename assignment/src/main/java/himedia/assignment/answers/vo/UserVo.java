package himedia.assignment.answers.vo;

/*
 * Caution!: 이 파일은 변경하지 마십시오
 */
public class UserVo {
	private String userId;
	private final String name = "사용자";
	private String userPassword;

	public UserVo() {

	}

	public UserVo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", name=" + name + ", userPassword=" + userPassword + "]";
	}

}
