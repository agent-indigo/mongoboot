package com.keyin.hynes.braden.mongoboot.documents;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import com.keyin.hynes.braden.mongoboot.abstracts.DocumentBase;
import com.keyin.hynes.braden.mongoboot.fields.PropertyContact;
import com.keyin.hynes.braden.mongoboot.fields.PropertyLocation;
import com.keyin.hynes.braden.mongoboot.fields.PropertyRates;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@Data
@Document(collection = "properties")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true)
public final class Property extends DocumentBase {
  private ObjectId owner;
  private String name;
  private String type;
  private String description;
  private PropertyLocation location;
  private Integer beds;
  private Integer baths;
  private Integer square_feet;
  private List<String> amenities;
  private PropertyRates rates;
  private PropertyContact seller_info;
  private List<String> images;
  private List<String> imageIds;
  private Boolean is_featured;
}