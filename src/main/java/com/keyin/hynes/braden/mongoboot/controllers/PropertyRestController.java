package com.keyin.hynes.braden.mongoboot.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.keyin.hynes.braden.mongoboot.documents.Property;
import com.keyin.hynes.braden.mongoboot.interfaces.repositories.PropertyRepository;
@CrossOrigin
@RequestMapping("/properties")
@RestController
public final class PropertyRestController {
  private final PropertyRepository propertyRepository;
  public PropertyRestController(@Autowired final PropertyRepository propertyRepository) {
    this.propertyRepository = propertyRepository;
  }
  @GetMapping
  public List<Property> getAll() {
    return propertyRepository.findAll();
  }
}