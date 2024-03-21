package ex02;

import java.util.Date;

public class Produto<T> {
  private T id;
  private float valor;
  private Date dataFabricação;
  private Date dataVencimento;
  public Produto(T id, float valor, Date dataFabricação, Date dataVencimento) {
    this.id = id;
    this.valor = valor;
    this.dataFabricação = dataFabricação;
    this.dataVencimento = dataVencimento;
  }
  public T getId() {
    return id;
  }
  public void setId(T id) {
    this.id = id;
  }
  public float getValor() {
    return valor;
  }
  public void setValor(float valor) {
    this.valor = valor;
  }
  public Date getDataFabricação() {
    return dataFabricação;
  }
  public void setDataFabricação(Date dataFabricação) {
    this.dataFabricação = dataFabricação;
  }
  public Date getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }
  @Override
  public String toString() {
    return "Produto [id=" + id + ", valor=" + valor + ", dataFabricação=" + dataFabricação + ", dataVencimento="
        + dataVencimento + "]";
  }
}
