package configuration;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {

  private RequestSpecBuilder spec;

  public RequestSpecificationBuilder() {
    this.spec = new RequestSpecBuilder();
  }

  public RequestSpecificationBuilder acceptHeader() {
    spec.setAccept(ContentType.JSON.getContentTypeStrings()[0]);
    return this;
  }

  public RequestSpecificationBuilder contentTypeHeader() {
    spec.setContentType(ContentType.JSON.getContentTypeStrings()[0]);
    return this;
  }

  public RequestSpecificationBuilder contentTypeHeader(ContentType type) {
    spec.setContentType(type.getContentTypeStrings()[0]);
    return this;
  }

  public RequestSpecificationBuilder contentTypeHeader(String withCharset) {
    spec.setContentType(withCharset);
    return this;
  }

  public RequestSpecificationBuilder baseUri(String uri) {
    spec.setBaseUri(uri);
    return this;
  }

  public RequestSpecification build() {
    return spec.build();
  }
}
