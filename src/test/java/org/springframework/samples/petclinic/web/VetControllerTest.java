package org.springframework.samples.petclinic.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VetControllerTest {

  @Mock
  private ClinicService service;

  @Mock
  Map<String, Object> model;

  @InjectMocks
  private VetController controller;

  private List<Vet> vetList = new ArrayList<>();

  @BeforeEach
  void setUp() {
    vetList.add(new Vet());

    when(service.findVets()).thenReturn(vetList);
  }

  @Test
  void showVetList() {

    String viewName = controller.showVetList(model);

    verify(service).findVets();

    assertEquals("vets/vetList", viewName);
  }

  @Test
  void showResourcesVetList() {
    Vets vets = controller.showResourcesVetList();

    verify(service).findVets();
    assertNotNull(vets);
    assertIterableEquals(vets.getVetList(), vetList);
  }
}