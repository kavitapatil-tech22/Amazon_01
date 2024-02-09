package encapsulation;

class Amazon{
	
	private int otp=1234;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}

public class Prgm1 {

	public static void main(String[] args) {
		
		Amazon am=new Amazon();
		
		am.setOtp(5678);
		System.out.println(am.getOtp());
		
	}

}
