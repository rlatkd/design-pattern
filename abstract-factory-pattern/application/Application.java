package application;

public class Application {
	private GUIFactory factory;
	private Button button;
	private Checkbox checkbox;
	
	public Application(String os) {
		this.factory = GUIFactory.getFactory(os);
	}
	
	public void createUI() {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
