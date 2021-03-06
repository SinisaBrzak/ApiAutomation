package models;

public class Ad {

  public String company;
  public String url;
  public String text;

  public Ad() {
  }

  public Ad(String company, String url, String text) {
    this.company = company;
    this.url = url;
    this.text = text;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public static class AdBuilder {

    public String company;
    public String url;
    public String text;

    public AdBuilder company(String company) {
      this.company = company;
      return this;
    }

    public AdBuilder url(String url) {
      this.url = url;
      return this;
    }

    public AdBuilder text(String text) {
      this.text = text;
      return this;
    }

    public Ad build() {
      return new Ad(company, url, text);
    }
  }
}
