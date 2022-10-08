package polymorphisimDemo;



public class Main {

	public static void main(String[] args) {
		
//		BaseLogger[] loggers = new BaseLogger[] {new DataBaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
//		for(BaseLogger logger:loggers) {
//			logger.log("Log mesajı" );
//		}
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();

	}

}
