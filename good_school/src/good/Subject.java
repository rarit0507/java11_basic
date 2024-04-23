package good;

public class Subject {
	private int code;	//�����ڵ�
	private String style;	//�򰡹��
	private String subjectName;	//�����
	public Subject() {}
	public Subject(int code, String style, String subjectName) {
		super();
		this.code = code;
		this.style = style;
		this.subjectName = subjectName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Subject [code=" + code + ", style=" + style + ", subjectName=" + subjectName + "]";
	}
	
	
}
