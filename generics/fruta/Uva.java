public class Uva {
  private String cor;

	public Uva(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

  @Override
  public String toString() {
    return "Uva [cor=" + cor + "]";
  }
}
