package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : Ư�� �����Ͱ� ������ �´��� ���Ϸ��� �� ��� ������ ������ �����ϴ� Ŭ����
//Matcher : Ư�� ������ ���°� �´��� ���ϴ� Ŭ����
//=���Խ�(Reg Expression) => regex
public class PatternExam1 {
	public static void main(String[] args) {	//���̵��� �� ������ ��� ����
		String[] data = {"bag","rarit0507","9to6","8to5","single","Mom","ABC","Ű�ƴ����꽺","-_-"}; 
		//������ �����
		Pattern p = Pattern.compile("[a-z]*");	//���� �ҹ��ڷθ� ������ ������
		//Pattern p = Pattern.compile("[0-9a-z]*");	//���ڿ� ���� �ҹ��ڷθ� ������ ������
		//Pattern p = Pattern.compile("[A-Za-z]*");	//���� �빮�� �Ǵ� �ҹ��ڷθ� ������ ������
		//Pattern p = Pattern.compile("s[A-Za-z]*");		//s�� �����ϸ鼭 ���� �빮�� �Ǵ� �ҹ��ڷθ� ������ ������
		//Pattern p = Pattern.compile("[��-�R]*");	//�ѱ۷θ� ������ ������
		//Pattern p = Pattern.compile("e$");		//Ư�� ���ڷ� ������ ��� ���� �ڿ� $
		//Pattern p = Pattern.compile("^b");		//Ư�� ���ڷ� �����ϴ� ��� ���� �տ� ^
		//Pattern p = Pattern.compile("^[0-9]*");	//��� ���� ������ ������
		
		for(int i=0;i<data.length;i++) {
			Matcher m = p.matcher(data[i]);	//ctrlShiftO - util
			if(m.matches()) {
				System.out.println("���� ��ġ : "+data[i]);
			}
		}
	}

}
