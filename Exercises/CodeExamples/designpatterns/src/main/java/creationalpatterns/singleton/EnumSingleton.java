package creationalpatterns.singleton;

/**
 * Metodo alternativo e thread safe. Non supporta ereditarieta'
 * @author claudio menghi
 *
 */
public enum EnumSingleton {
	INSTANCE;
	public static EnumSingleton getInstance(){
		return INSTANCE;
	}
}