package com.keyin.hynes.braden.mongoboot.documents;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import com.keyin.hynes.braden.mongoboot.abstracts.DocumentBase;
import com.keyin.hynes.braden.mongoboot.fields.PropertyContact;
import com.keyin.hynes.braden.mongoboot.fields.PropertyLocation;
import com.keyin.hynes.braden.mongoboot.fields.PropertyRates;
import com.mongodb.lang.NonNull;
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
  @NonNull
  private ObjectId owner;
  @NonNull
  private String name;
  @NonNull
  private String type;
  @NonNull
  private String description;
  @NonNull
  private PropertyLocation location;
  @NonNull
  private Integer beds;
  @NonNull
  private Integer baths;
  @NonNull
  private Integer square_feet;
  @NonNull
  private List<String> amenities;
  @NonNull
  private PropertyRates rates;
  @NonNull
  private PropertyContact seller_info;
  @NonNull
  private List<String> images;
  @NonNull
  private List<String> imageIds;
  @NonNull
  private Boolean is_featured = false;
}