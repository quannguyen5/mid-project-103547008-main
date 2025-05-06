package nhom4.position.domain.core.vo;

import lombok.Data;

import jakarta.persistence.Embeddable;

@Embeddable
@Data
public class Driver {
    private int id;
    private String userName;
    private String mobile;
    private String type;
}

