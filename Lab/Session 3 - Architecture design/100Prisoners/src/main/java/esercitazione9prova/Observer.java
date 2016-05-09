package esercitazione9prova;

public interface Observer {

	public void update();
	public <C> void update(C change);
}