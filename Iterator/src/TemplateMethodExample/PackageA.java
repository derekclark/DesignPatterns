package TemplateMethodExample;

public class PackageA extends Trip{

	@Override
	public void doComingTransport() {
		System.out.println("The tourists are coming by Air...");
	}

	@Override
	public void doDayA() {
		System.out.println("The tourists are visiting the acquarium...");
		
	}

	@Override
	public void doDayB() {
		System.out.println("The tourists are visiting the zoo...");
		
	}

	@Override
	public void doDayC() {
		System.out.println("The tourists are visiting the gallery...");
	}

	@Override
	public void doReturningTransport() {
		System.out.println("The tourists are returning by air...");
		
	}

}
