package pl.tojek.marcin.form3.cucumber.helper;

import pl.tojek.marcin.form3.model.Attributes;
import pl.tojek.marcin.form3.model.Organisation;

import java.util.UUID;

/**
 * Payment is a helper class used by the API client.
 * The Original class {@link pl.tojek.marcin.form3.model.Payment} contains READ_ONLY annotated "Id" field
 * (UUID would be altered accidentally).
 */
public class Payment {

    private UUID id;

    private String type;

    private String version;

    private Organisation organisation;

    private Attributes attributes;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}