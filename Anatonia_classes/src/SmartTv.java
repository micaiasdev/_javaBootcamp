

/**
 * <h1>Classe SmartTv</h1>
 * <p>
 * A classe SmartTv possui métodos e atributos que representam uma SmartTv
 * </p>
 * <p>
 * <b>Note:</b> Leia Atentamente a documentação dessa classe para desfrutar dos
 * seus
 * 
 * @author Micaias Carvalho
 * @version 1.0
 * @since 18/06/2024
 * 
 */
public class SmartTv {
  private boolean ligada;
  private int canal;
  private int volume;

  public SmartTv() {
    this.canal = 0;
    this.ligada = false;
    this.volume = 50;
  }

  /**
   * Mostra o estado dos atributos da SmartTv.
   * O método exibe o estado atual dos atributos ligada, canal e volume da
   * SmartTv.
   * 
   * @return void
   */
  public void statusSmartTv() {
    System.out.println("Estado da SmartTv:");
    System.out.println("Ligada: " + isLigada());
    System.out.println("Canal: " + getCanal());
    System.out.println("Volume: " + getVolume());
  }

  /**
   * Liga a SmartTv.
   * o método altera o estado do atributo ligada para false
   * 
   * @return void
   * 
   */

  public void ligar() {
    if (!ligada)
      this.setLigada(true);
  }

  /**
   * Desliga a SmartTv.
   * o método altera o estado do atributo ligada para true.
   * 
   * @return void
   * 
   */

  public void desligar() {
    if (ligada)
      this.setLigada(false);
  }

  /**
   * Aumenta o volume.
   * O método acrescenta 1 unidade ao atributo inteiro volume até volume chegar ao
   * valor 100.
   * 
   * @return void
   */

  public void maisVolume() {
    if (this.getVolume() <= 100)
      this.setVolume(this.getVolume() + 1);
  }

  /**
   * Diminui o volume.
   * O método decrementa 1 unidade ao atributo inteiro volume até volume chegar ao
   * valor 0.
   * 
   * @return void
   */
  public void menosVolume() {
    if (this.getVolume() >= 0)
      this.setVolume(this.getVolume() - 1);
  }

  /**
   * Altera o canal para o próximo valor.
   * O método acrescenta 1 unidade ao atributo inteiro canal até atingir o valor
   * 120.
   * 
   * @return void
   */

  public void proximoCanal() {
    if (this.getCanal() <= 120)
      this.setCanal(getCanal() + 1);
  }

  /**
   * Altera o canal para o valor anterior.
   * O método decrementa 1 unidade ao atributo inteiro canal até atingir o valor
   * 0.
   * 
   * @return void
   */

  public void anteriorCanal() {
    if (this.getCanal() > 0)
      this.setCanal(getCanal() - 1);
  }

  /**
   * Altera o canal para o valor passado como argumento.
   * O método altera o valor do atributo canal para o valor passado como argumento
   * se o valor
   * estiver entre 0 e 120.
   * 
   * @param canal : valor para qual o atributo canal deve ser alterado
   * @return void
   */

  public void mudarCanal(int canal) {
    if (canal > 0 && canal <= 120)
      this.setCanal(canal);
  }

  public boolean isLigada() {
    return ligada;
  }

  public void setLigada(boolean ligada) {
    this.ligada = ligada;
  }

  public int getCanal() {
    return canal;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

}
