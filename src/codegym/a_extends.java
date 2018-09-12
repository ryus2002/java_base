package codegym;

public class a_extends {

	@Override
	public String toString() {
		return "a_extends [fileName=" + fileName + "]";
	}

	public a_extends() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private String fileName;

	protected final String getFileName() {
		return fileName;
	}

	protected final void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String trim() {
		return fileName.trim();
	}




}
