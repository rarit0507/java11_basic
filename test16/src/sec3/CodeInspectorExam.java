package sec3;
//�ڵ� �ν���� => ���� ����, �ڵ� �ۼ� ��Ģ �ؼ�, ���� �߻� ���ɼ� �ּ�ȭ ���� �۾�.
//PMD : �ڵ� �ν���� ����(�ҽ� �ڵ� ����)
//Code Inspection Level
//name		Symbol	Level		Comment
//Blocker	������	High		�ʼ�, ���� �߻� ���ɼ��� �ſ� ���ų� �޸� ���� �߻��Ǵ� �ڵ�
//Critical	�þ�		Medium High	�ǰ� ��, ���� �߻� ���ɼ��� ���ų� �Ϲ���
//Urgent	�ʷ�		Medium		(Major) �ǰ� ��, ���� �߻��� �ְų� ��
//Important	����Ÿ	Medium Low	(Mino) �ҽ��ڵ��� ������, ���� ������
//Warning	�Ķ�		Low			(Info) ���������� �����Ǵ� ���� ��������
public class CodeInspectorExam {

	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"http://www.naver.com","���̹� ����Ʈ",1);
 		r1.def = "���� ������";
		//System.out.println(r2.toString());
		//System.out.println(r2.def);	//������ ����� �� sysout���� ���X(��ŷ���ɼ�)
	}

}
