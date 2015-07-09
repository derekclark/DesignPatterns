package TemplateMethodExample;

public class PackageB extends Trip{

	@Override
	public void doComingTransport() {
		System.out.println("The tourists are coming by boat...");
	}

	@Override
	public void doDayA() {
		System.out.println("The tourists are visiting the stadium...");
		
	}

	@Override
	public void doDayB() {
		System.out.println("The tourists are visiting the beach...");
		
	}

	@Override
	public void doDayC() {
		System.out.println("The tourists are visiting the restaurant...");
	}

	@Override
	public void doReturningTransport() {
		System.out.println("The tourists are returning by train...");
		
	}

}
