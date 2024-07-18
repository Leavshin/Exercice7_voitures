package org.example.exercice7.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exercice7.service.VoitureService;

@Path("/voitures")
@Produces(MediaType.APPLICATION_JSON)
public class VoitureResource {

    private final VoitureService voitureService;

    @Inject
    public VoitureResource(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GET
    public List<Voiture> getVoitures() {
        return voitureService.getVoitures();
    }
    @GET
    @Path("{id}")
    public Voiture getVoiture(@PathParam("id") int id) {
        return voitureService.getVoiture(id);
    }

}