package com.keyin.hynes.braden.mongoboot.controllers;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.keyin.hynes.braden.mongoboot.documents.Property;
import com.keyin.hynes.braden.mongoboot.interfaces.repositories.PropertyRepository;
@CrossOrigin
@RequestMapping("/properties")
@RestController
public final class PropertyRestController {
  private final PropertyRepository propertyRepository;
  private Property target;
  public PropertyRestController(@Autowired final PropertyRepository propertyRepository) {
    this.propertyRepository = propertyRepository;
  }
  @GetMapping
  public List<Property> getAll() {
    return propertyRepository.findAll();
  }
  @GetMapping("/{id}")
  public Property getOne(@PathVariable final ObjectId id) {
    return propertyRepository.findById(id).get();
  }
  @PostMapping
  public Property add(@RequestBody final Property property) {
    return propertyRepository.save(property);
  }
  @PatchMapping("/{id}")
  public Property edit(
    @PathVariable("id") final ObjectId id,
    @RequestBody final Property changes
  ) {
    target = propertyRepository.findById(id).get();
    if (changes.getOwner() != null) target.setOwner(changes.getOwner());
    if (changes.getName() != null) target.setName(changes.getName());
    if (changes.getType() != null) target.setType(changes.getType());
    if (changes.getDescription() != null) target.setDescription(changes.getDescription());
    if (changes.getLocation().getStreet() != null) target.getLocation().setStreet(changes.getLocation().getStreet());
    if (changes.getLocation().getCity() != null) target.getLocation().setCity(changes.getLocation().getCity());
    if (changes.getLocation().getState() != null) target.getLocation().setState(changes.getLocation().getState());
    if (changes.getLocation().getZipcode() != null) target.getLocation().setZipcode(changes.getLocation().getZipcode());
    if (changes.getBeds() != null) target.setBeds(changes.getBeds());
    if (changes.getBaths() != null) target.setBaths(changes.getBaths());
    if (changes.getSquare_feet() != null) target.setSquare_feet(changes.getSquare_feet());
    if (changes.getAmenities() != null) target.setAmenities(changes.getAmenities());
    if (changes.getRates().getNightly() != null) target.getRates().setNightly(changes.getRates().getNightly());
    if (changes.getRates().getWeekly() != null) target.getRates().setWeekly(changes.getRates().getWeekly());
    if (changes.getRates().getMonthly() != null) target.getRates().setMonthly(changes.getRates().getMonthly());
    if (changes.getSeller_info().getName() != null) target.getSeller_info().setName(changes.getSeller_info().getName());
    if (changes.getSeller_info().getEmail() != null) target.getSeller_info().setEmail(changes.getSeller_info().getEmail());
    if (changes.getSeller_info().getPhone() != null) target.getSeller_info().setPhone(changes.getSeller_info().getPhone());
    if (changes.getImages() != null) target.setImages(changes.getImages());
    if (changes.getImageIds() != null) target.setImageIds(changes.getImageIds());
    if (changes.getIs_featured() != null) target.setIs_featured(changes.getIs_featured());
    return propertyRepository.save(target);
  }
  @DeleteMapping("/{id}")
  public void delete(@PathVariable final ObjectId id) {
    propertyRepository.deleteById(id);
  }
}