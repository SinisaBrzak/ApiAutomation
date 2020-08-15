package models;

public class Data {

  public int id;
  public String email;
  public String first_name;
  public String last_name;
  public String avatar;

  public Data() {
  }

  public Data(int id, String email, String first_name, String last_name, String avatar) {
    this.id = id;
    this.email = email;
    this.first_name = first_name;
    this.last_name = last_name;
    this.avatar = avatar;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public static class DataBuilder {

    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;

    public DataBuilder id(int id) {
      this.id = id;
      return this;
    }

    public DataBuilder email(String email) {
      this.email = email;
      return this;
    }

    public DataBuilder first_name(String first_name) {
      this.first_name = first_name;
      return this;
    }

    public DataBuilder last_name(String last_name) {
      this.last_name = last_name;
      return this;
    }

    public DataBuilder avatar(String avatar) {
      this.avatar = avatar;
      return this;
    }

    public Data build() {
      return new Data(id, email, first_name, last_name, avatar);
    }
  }
}
