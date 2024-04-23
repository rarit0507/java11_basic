package behavioral.mediator;
//Mediator Pattern : ��ü�� ���� ��ȣ�ۿ� ������ ĸ��ȭ�Ͽ� �����ϴ� ����
public class MediatorPattern {
	public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        ChatUser kim = new ChatUser(mediator,"kim");

        mediator.addUser(new ChatUser(mediator,"lee"))
                .addUser(new ChatUser(mediator,"park"))
                .addUser(kim);

        kim.send("����~! �氡�氡~!");
	}
}