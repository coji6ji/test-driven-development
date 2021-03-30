package money;

class Pair {
  private String from;
  private String to;

  Pair(String from, String to) {
    this.from = from;
    this.to = to;
  }

  protected boolean equals(Object object) {
    Pair pair = (Pair) object;
    return from.equals(pair.form) && to.equals(pair.to);
  }

  public hashCode() {
    return 0;
  }
}