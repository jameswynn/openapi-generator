/*
 * test
 * test
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * MySchemaNameCharactersAllOf
 */
@JsonPropertyOrder({
  MySchemaNameCharactersAllOf.JSON_PROPERTY_PROP2
})
@JsonTypeName("MySchemaName___Characters_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MySchemaNameCharactersAllOf {
  public static final String JSON_PROPERTY_PROP2 = "prop2";
  private String prop2;

  public MySchemaNameCharactersAllOf() { 
  }

  public MySchemaNameCharactersAllOf prop2(String prop2) {
    this.prop2 = prop2;
    return this;
  }

   /**
   * Get prop2
   * @return prop2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROP2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProp2() {
    return prop2;
  }


  @JsonProperty(JSON_PROPERTY_PROP2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProp2(String prop2) {
    this.prop2 = prop2;
  }


  /**
   * Return true if this MySchemaName___Characters_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MySchemaNameCharactersAllOf mySchemaNameCharactersAllOf = (MySchemaNameCharactersAllOf) o;
    return Objects.equals(this.prop2, mySchemaNameCharactersAllOf.prop2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prop2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MySchemaNameCharactersAllOf {\n");
    sb.append("    prop2: ").append(toIndentedString(prop2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

