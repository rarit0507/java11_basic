package behavioral.observer;
//Observer Pattern : ��ü�� ���°� ������Ʈ�Ǹ� ��ü�� �����ϴ� �ٸ� ��ü�� �˸��� �ڵ����� ������ �����ϴ� ����
public class ObserverPattern {
	public static void main(String[] args) {
		DashBoard dashBoard = new DashBoard(); //Subject Ŭ���� ����
        new Subscriber(dashBoard);
        new Subscriber2(dashBoard);

        dashBoard.setMessage("some event"); //���ο� �޽���
	}
}