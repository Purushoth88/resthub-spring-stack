package org.resthub.web.controller;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;

import org.resthub.core.service.GenericResourceService;
import org.resthub.web.model.WebSampleResource;

@Path("/resources")
@Named("webSampleResourceController")
public class WebSampleResourceController extends GenericResourceController<WebSampleResource> {
	
	@Inject
    @Named("webSampleResourceService")
    @Override
	public void setResourceService(GenericResourceService<WebSampleResource> resourceService) {
		this.resourceService = resourceService;
	}
	
}