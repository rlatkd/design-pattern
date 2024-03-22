package factory;

public interface GUIFactory {	
	Button createButton();
	Checkbox createCheckbox();
	
	public static GUIFactory getFactory(String os) {		
		switch(os) {
			case "Windows" : 
				return new WinFactory();
			case "Mac" :
				return new MacFactory();
			default : System.out.println("Unknown OS");
		}
		return null;		
	}
}
