package overriding;

public class TarımKrediManager extends BaseKrediManager {
	
	@Override
	public double hesapla(double tutar) {
		return tutar * 1.13;
				
	}
	
	

}
