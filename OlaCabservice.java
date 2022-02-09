
public class OlaCabservice implements CabService {

	@Override
	public void bookCab() {
		System.out.println("cab is booked");

	}

	@Override
	public void searchCab() {
		System.out.println("Searching your cab..");

	}

	@Override
	public void cancelCab() {
		System.out.println("cab is cancelled");

	}

}
