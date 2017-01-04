package zhongqiu.designpattern.create;

//���󹤳�ģʽ
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}

	public interface Provider {
		public Sender produce();
	}

	public static class SendMailFactory implements Provider {

		@Override
		public Sender produce() {
			return new MailSender();
		}
	}

	public static class SendSmsFactory implements Provider {

		@Override
		public Sender produce() {
			return new SmsSender();
		}
	}
}
