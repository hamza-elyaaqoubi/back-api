package fr.api.controller;

import fr.api.bean.Version;
import fr.api.config.BackApiProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/back-api")
@RestController
public class ApiVersion {

    @Autowired
    private BackApiProperties backApiProperties;

    @GetMapping(value = "/version", produces = "application/json")
    public Version getHomePage() {
        Version version = new Version();
        version.setVersion(backApiProperties.getVersion());
        version.setArtifactId(backApiProperties.getArtifactId());
        version.setGroupId(backApiProperties.getGroupId());
        return version;
    }
}
