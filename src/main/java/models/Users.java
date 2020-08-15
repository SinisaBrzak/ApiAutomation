package models;

import java.util.List;

public class Users {

  public int page;
  public int per_page;
  public int total;
  public int total_pages;
  public List<Data> data;
  public Ad ad;

  public Users() {
  }

  public Users(int page, int per_page, int total, int total_pages, List<Data> data, Ad ad) {
    this.page = page;
    this.per_page = per_page;
    this.total = total;
    this.total_pages = total_pages;
    this.data = data;
    this.ad = ad;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getPer_page() {
    return per_page;
  }

  public void setPer_page(int per_page) {
    this.per_page = per_page;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getTotal_pages() {
    return total_pages;
  }

  public void setTotal_pages(int total_pages) {
    this.total_pages = total_pages;
  }

  public List<Data> getData() {
    return data;
  }

  public void setData(List<Data> data) {
    this.data = data;
  }

  public Ad getAd() {
    return ad;
  }

  public void setAd(Ad ad) {
    this.ad = ad;
  }

  public static class UsersBuilder {

    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public List<Data> data;
    public Ad ad;

    public UsersBuilder page(int page) {
      this.page = page;
      return this;
    }

    public UsersBuilder per_page(int per_page) {
      this.per_page = per_page;
      return this;
    }

    public UsersBuilder total(int total) {
      this.total = total;
      return this;
    }

    public UsersBuilder total_pages(int total_pages) {
      this.total_pages = total_pages;
      return this;
    }

    public UsersBuilder data(List<Data> data) {
      this.data = data;
      return this;
    }

    public UsersBuilder ad(Ad ad) {
      this.ad = ad;
      return this;
    }

    public Users build() {
      return new Users(page, per_page, total, total_pages, data, ad);
    }
  }
}
