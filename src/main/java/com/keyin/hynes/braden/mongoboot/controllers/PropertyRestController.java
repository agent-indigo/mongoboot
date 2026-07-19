package com.keyin.hynes.braden.mongoboot.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.keyin.hynes.braden.mongoboot.documents.Property;
import com.keyin.hynes.braden.mongoboot.services.PropertyService;
@RestController
@CrossOrigin
@RequestMapping("/api/properties")
public final class PropertyRestController {
  private final PropertyService propertyService;
  @Autowired
  public PropertyRestController(final PropertyService propertyService) {
    this.propertyService = propertyService;
  }
  @GetMapping
  public List<Property> findAll() {
    return propertyService.findAll();
  }
}