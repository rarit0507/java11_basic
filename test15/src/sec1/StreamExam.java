package sec1;
//����/Ű����/������ �Է� : FileInputStream, BufferedInputStream, FileReader, BeffuredReader
//����/�����/������ ��� : FileOutputStream, BufferedInputStream, FileWriter, BefferedWriter
//Stream���� ������ Ŭ������ ������ ������� >>>����Ʈ<<< ������ : FileInputStream, BufferedInputStream, FileOutputStream, BufferedOutputStream
//Stream���� ������ �ʴ� Ŭ������ ������ ������� >>>����<<< ������ : FileReader, BeffuredReader, FileWriter, BefferedWriter
public class StreamExam {
	public static void main(String[] args) {
		String fileInputStream = "FileInputStream => ����Ʈ ������ �Է��ϱ� ���� ��Ʈ��";
		String bufferedInputStream = "BuffuredInputStream => ����Ʈ ������ �Է��ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";
		String fileReader = "FileReader => ���� ������ �Է��ϱ� ���� ��Ʈ��";
		String bufferedReader = "BuffuredReader => ���� ������ �Է��ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";
		String fileIOutputStream = "FileOutputStream => ����Ʈ ������ ����ϱ� ���� ��Ʈ��";
		String bufferedOutputStream = "BuffuredOutputStream => ����Ʈ ������ ����ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";
		String fileWriter = "FileWriter => ���� ������ ����ϱ� ���� ��Ʈ��";
		String bufferedWriter = "BufferedWriter => ���� ������ ����ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";
		
		System.out.println(fileInputStream);
		System.out.println(bufferedInputStream);
		System.out.println(fileReader);
		System.out.println(bufferedReader);
		System.out.println(fileIOutputStream);
		System.out.println(bufferedOutputStream);
		System.out.println(fileWriter);
		System.out.println(bufferedWriter);
	}

}
