package fr.api.service;

import fr.api.bean.Version;
import fr.api.config.BackApiProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiVersionService {

    @Autowired
    private BackApiProperties backApiProperties;

    public Version getVersion() {
        Version version = new Version();
        version.setVersion(backApiProperties.getVersion());
        version.setArtifactId(backApiProperties.getArtifactId());
        version.setGroupId(backApiProperties.getGroupId());
        return version;
    }
}
