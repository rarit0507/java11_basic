package structural.proxy;
//Proxy Pattern : ���� ��ü�� �ƴ� ���� ��ü�� ���� ����� ó���ϴ� ����
public class ProxyPattern {
	public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("ReadyKim", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
	}
}