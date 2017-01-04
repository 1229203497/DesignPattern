package zhongqiu.designpattern.create;

//��̬����ģʽ
public class StaticFactoryDemo {

	public static class SendFactory {

		public static Sender produceMail() {
			return new MailSender();
		}

		public static Sender produceSms() {
			return new SmsSender();
		}
	}

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
