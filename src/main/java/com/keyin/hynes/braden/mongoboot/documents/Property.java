package com.keyin.hynes.braden.mongoboot.documents;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import com.keyin.hynes.braden.mongoboot.abstracts.DocumentBase;
import com.keyin.hynes.braden.mongoboot.fields.PropertyContact;
import com.keyin.hynes.braden.mongoboot.fields.PropertyLocation;
import com.keyin.hynes.braden.mongoboot.fields.PropertyRates;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Document
public final class Property extends DocumentBase {
  private final ObjectId owner;
  private String name;
  private String type;
  private String description;
  private PropertyLocation location;
  private Integer beds;
  private Integer baths;
  private Integer square_feet;
  private String[] amenities;
  private PropertyRates rates;
  private PropertyContact seller_info;
  private String[] images;
  private String[] imageIds;
  private Boolean is_featured;
}